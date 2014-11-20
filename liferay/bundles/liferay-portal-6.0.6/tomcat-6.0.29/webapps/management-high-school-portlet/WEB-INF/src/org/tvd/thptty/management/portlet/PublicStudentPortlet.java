package org.tvd.thptty.management.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.tvd.thptty.management.temporary.WebKeys;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.management.util.TYServiceUtil;
import org.tvd.thptty.management.util.ValidationInput;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.impl.TYClassStudentImpl;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.util.EncryptUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.tvd.thptty.notification.utils.GCMBroadcast;

public class PublicStudentPortlet extends MVCPortlet {
	
	public void authenticateMobileDevice(ActionRequest request, ActionResponse response) 
		throws SystemException, PortalException {
		long studentId = ParamUtil.getLong(request, "studentId");
		String regId = ParamUtil.getString(request, "regId");
		System.out.println(regId);
		TYStudent student = TYStudentLocalServiceUtil.getTYStudent(studentId);
		if(student == null) {
			GCMBroadcast.sSendMessage(regId, 
					"Khong ton tai hoc sinh co ma " + studentId + " trong he thong");
		} else {
			student.setRegId(regId);
			TYStudentLocalServiceUtil.updateStudent(student);
			GCMBroadcast.sSendMessage(regId, 
					"Xin chao phu huynh cua hoc sinh " 
					+ student.getStudentFirstName() + " " + student.getStudentLastName() 
					+ " chung toi se cap nhat diem cho ong/ba ngay khi co the.");
		}
	}
	
	public void addStudent(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		TYStudent student = ActionUtil.studentFromRequest(request);
		
		List<String> errors = new ArrayList<String>();
		
		long classId = ParamUtil.getLong(request, "class");
		
		boolean ok = true;
		if(Validator.isNull(classId)) {
			SessionErrors.add(request, "class-required");
		}
		
		List<TYStudent> students = TYServiceUtil.getAllStudents(student.getCompanyId(), student.getGroupId());
		
		if(!ValidationInput.validEmailStudent(student, students, errors)) {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
		}
		
		if(!ValidationInput.validateStudentPublic(student, errors)) {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
		} else {
			if(ok == true) {	
				student = TYStudentLocalServiceUtil.addStudent(student);
				int courses = TYServiceUtil.getCurrentCourse();
				TYClassStudent newStudent = new TYClassStudentImpl();
				newStudent.setCourses(courses);
				newStudent.setClassId(classId);
				newStudent.setStudentId(student.getStudentId());
				TYClassStudentLocalServiceUtil.addStudentIntoClass(newStudent);
				
				response.setRenderParameter("resourcePrimKey", String.valueOf(student.getStudentId()));
				
				SessionMessages.add(request, "thank-you-regis-message");
				response.setRenderParameter("jspPage", viewThankYou);
			}
		}
	}
	
	public void authenticationStudent(ActionRequest request, ActionResponse response) 
			throws WindowStateException {
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		String emailAddress = ParamUtil.getString(request, "emailAddress");
		String password = ParamUtil.getString(request, "password");
		
		TYStudent student = ActionUtil.getStudentByEmail(
				companyId, groupId, emailAddress);
		
		if(student == null) {
			SessionErrors.add(request, "email-invalid");
			response.setRenderParameter("jspPage", loginJSP);
			return;
		}
		
		String passAuthor = student.getEmailPassword();
		passAuthor = EncryptUtils.base64decode(passAuthor);
		
		if(password.equals(passAuthor)) {
			SessionMessages.add(request, "login-success");
			
			HttpSession session = PortalUtil.getHttpServletRequest(request).getSession();
			session.setAttribute(WebKeys.TY_STUDENT, student);
			
			if(student.getLoginCount() == 0) {
				response.setWindowState(new WindowState("maximized"));
				response.setRenderParameter("jspPage", loginJSP);
			} else {
				response.setRenderParameter("jspPage", loginJSP);
			}
		} else {
			SessionErrors.add(request, "password-invalid");
			response.setRenderParameter("jspPage", loginJSP);
		}
	}
	
	public void autoLogin(ActionRequest request, ActionResponse response) {
		String rememberMe = getCookie("TVD_STUDENT_REMEMBERME", request);
		
		if(rememberMe.equals("true")) {
			String studentId = getCookie("TVD_STUDENT_ID", request);
			if(!studentId.equals("")) {
				TYStudent student = ActionUtil.getStudentById(Long.parseLong(studentId));
				if(student != null) {
					String pass = getCookie("TVD_STUDENT_PASSWORD", request);
					if(student.getEmailPassword().equals(pass)) {
						HttpSession session = PortalUtil.getHttpServletRequest(request).getSession();
						session.setAttribute(WebKeys.TY_STUDENT, student);
						SessionMessages.add(request, "");
						response.setRenderParameter("jspPage", loginJSP);
						return;
					}
				}
			}
		}
		setCookie("TVD_STUDENT_REMEMBERME", "false", request);
	}
	
	public void answerSystemQuestion(ActionRequest request, ActionResponse response) 
			throws SystemException, WindowStateException {
		long studentId =
                ParamUtil.getLong(request, "resourcePrimKey");
		String newEmail = ParamUtil.getString(request, "newEmail");
		String newPassword = ParamUtil.getString(request, "newPassword");
		String reNewPassword = ParamUtil.getString(request, "reNewPassword");
		String question = ParamUtil.getString(request, "question");
		String answer = ParamUtil.getString(request, "answer");
		
		boolean valid = true;
		
		if(!Validator.isEmailAddress(newEmail) || newEmail.length() < 15) {
			valid = false;
			SessionErrors.add(request, "please-input-valid-email");
		}
		
		if(!Validator.isPassword(newPassword) || newPassword.length() < 6 || 
				newPassword.length() > 25) {
			valid = false;
			SessionErrors.add(request, "please-input-valid-password");
		}
		
		if(!newPassword.equals(reNewPassword)) {
			valid = false;
			SessionErrors.add(request, "password-not-dulicate");
		}
		
		if(answer.length() < 6 || answer.length() > 30) {
			valid = false;
			SessionErrors.add(request, "please-enter-answer-valid");
		}
		
		if(valid == false ) {
			response.setRenderParameter("jspPage", loginJSP);
			return;
		}
		
		TYStudent student = ActionUtil.getStudentById(studentId);
		student.setEmailAddress(newEmail);
		student.setEmailPassword(newPassword);
		student.setQuestion(question);
		student.setAnswer(answer);
		student.setLoginCount(student.getLoginCount() + 1);
		
		TYStudentLocalServiceUtil.updateStudent(student);
		
		SessionMessages.add(request, "");
		
		HttpSession session = PortalUtil.getHttpServletRequest(request).getSession();
		session.setAttribute(WebKeys.TY_STUDENT, student);
		
		response.setWindowState(new WindowState("normal"));
		response.setRenderParameter("jspPage", loginJSP);
	}
	
	public void logout(ActionRequest request, ActionResponse response) {
		SessionMessages.add(request, "");
		HttpSession session = PortalUtil.getHttpServletRequest(request).getSession();
		session.removeAttribute(WebKeys.TY_STUDENT);
		response.setRenderParameter("jspPage", loginJSP);
	}
	
	public String getCookie(String cookieName, ActionRequest request) {
		Cookie[] cookies = request.getCookies();
		String cookieValue = "";
		for(int i = 0 ; i < cookies.length ; i++) {
			//System.out.println(cookies[i].getName() + " " +cookies[i].getValue());
			if(cookies[i].getName().equals(cookieName)) {
				cookieValue = cookies[i].getValue();
				break;
			}
		}
		
		return cookieValue;
	}
	
	public void setCookie(String cookieName, String cookieValue, ActionRequest request) {
		Cookie[] cookies = request.getCookies();
		for(int i = 0 ; i < cookies.length ; i++) {
			if(cookies[i].getName().equals(cookieName)) {
				cookies[i].setValue(cookieValue);
				break;
			}
		}
	}
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException {
		long resourcePrimKey =
                ParamUtil.getLong(renderRequest, "resourcePrimKey");
		TYStudent student = null;
		if(resourcePrimKey > 0) {
			try {
				student = TYStudentLocalServiceUtil.getTYStudent(resourcePrimKey);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			student = null;
		}
		
		renderRequest.setAttribute(WebKeys.TY_STUDENT, student);
		
		super.render(renderRequest, renderResponse);
	}
	
	protected String viewThankYou = "/html/student-public/thank_you.jsp";
	protected String loginJSP = "/html/student-login/view.jsp";
	protected String loginSuccessJSP = "/html/student-login/login_success.jsp";
	protected String answerQuestionJSP = "/html/student-login/answer_system_question.jsp";
	protected String initJSP = "/html/student-login/init.jsp";
}
