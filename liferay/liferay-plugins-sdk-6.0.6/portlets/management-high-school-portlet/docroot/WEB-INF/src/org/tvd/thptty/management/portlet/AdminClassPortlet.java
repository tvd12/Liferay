package org.tvd.thptty.management.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.tvd.thptty.management.temporary.TYActionKeys;
import org.tvd.thptty.management.temporary.WebKeys;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.management.util.ValidationInput;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYMessages;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.impl.TYClassImpl;
import org.tvd.thptty.model.impl.TYMessagesImpl;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYMessagesLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class AdminClassPortlet extends MVCPortlet {
	
	public void addClass(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		TYClass tyClass = ActionUtil.classFromRequest(request);
		
		List<String> errors = new ArrayList<String>();
		
		if(ValidationInput.validateClass(tyClass, errors)) {
			SessionMessages.add(request, "append-class-success");
			tyClass = TYClassLocalServiceUtil.addClass(tyClass);
			
			ThemeDisplay themeDisplay =
					(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
			long groupId = themeDisplay.getScopeGroupId();
			long companyId = themeDisplay.getCompanyId();
			long userId = themeDisplay.getUserId();
			
			TYMessages message = new TYMessagesImpl();
			message.setCompanyId(companyId);
			message.setGroupId(groupId);
			message.setActionId(TYActionKeys.M_ADD_CLASS);
			message.setUserId(userId);
			message.setClassId(tyClass.getClassId());
			message.setHappenDate(new Date());
			
			TYMessagesLocalServiceUtil.addMessage(message);
		} else {
			 for(String error : errors) {
				 SessionErrors.add(request, error);
			 }
		}
	}
	
	public void deleteClass(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long classId = ParamUtil.getLong(request, "resourcePrimKey");
		TYClass tyClass = TYClassLocalServiceUtil.getTYClass(classId);
		TYClassLocalServiceUtil.deleteTYClass(tyClass);
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_DELETE_CLASS);
		message.setUserId(userId);
		message.setClassId(tyClass.getClassId());
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		SessionMessages.add(request, "delete-class-success");
		response.setRenderParameter("jspPage", viewJSP);
	}
	
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException {
		TYClass tyClass = null;
		TYStudent student = null;
		int semester = 0;
		long resourcePrimKey =
                ParamUtil.getLong(renderRequest, "resourcePrimKey");
		long studentId = 
				ParamUtil.getLong(renderRequest, "studentId");
		
		semester = ParamUtil.getInteger(renderRequest, WebKeys.TY_SEMESTER);
		
		if(resourcePrimKey > 0) {
			try {
				tyClass = TYClassLocalServiceUtil.getTYClass(resourcePrimKey);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			tyClass = new TYClassImpl();
		}
		
		if(studentId > 0) {
			try {
				student = TYStudentLocalServiceUtil.getTYStudent(studentId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			student = new TYStudentImpl();
		}
		
		renderRequest.setAttribute(WebKeys.TY_CLASS, tyClass);
		renderRequest.setAttribute(WebKeys.TY_STUDENT, student);
		renderRequest.setAttribute(WebKeys.TY_SEMESTER, semester);
		
		int amountStudent = ParamUtil.getInteger(renderRequest, "amountStudent");
		renderRequest.setAttribute("amountStudent", amountStudent);
		
		super.render(renderRequest, renderResponse);
	}
	
	protected String viewClassJSP = "/html/class-admin/view_class.jsp";
	protected String editJSP = "/html/class-admin/edit.jsp";
	protected String viewStudentsConductsJSP = "/html/student-conduct/view_students_conducts.jsp";
}
