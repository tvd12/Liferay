package org.tvd.thptty.management.portlet;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.tvd.exel.service.base.ReadExcelFileService;
import org.tvd.exel.service.impl.ReadExcelFileServiceImpl;
import org.tvd.exel.util.DateToStringConvertor;
import org.tvd.thptty.NoSuchSemesterException;
import org.tvd.thptty.management.temporary.Count;
import org.tvd.thptty.management.temporary.RoleKeys;
import org.tvd.thptty.management.temporary.TYActionKeys;
import org.tvd.thptty.management.temporary.WebKeys;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.management.util.ExcelActionUtil;
import org.tvd.thptty.management.util.TYServiceUtil;
import org.tvd.thptty.management.util.ValidationInput;
import org.tvd.thptty.model.Semester;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYClassUserRole;
import org.tvd.thptty.model.TYMessages;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.model.impl.SemesterImpl;
import org.tvd.thptty.model.impl.TYClassImpl;
import org.tvd.thptty.model.impl.TYClassStudentImpl;
import org.tvd.thptty.model.impl.TYClassUserRoleImpl;
import org.tvd.thptty.model.impl.TYMessagesImpl;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.model.impl.TYSubjectClassUserRoleImpl;
import org.tvd.thptty.model.impl.TYSubjectImpl;
import org.tvd.thptty.service.SemesterLocalServiceUtil;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYMessagesLocalServiceUtil;
import org.tvd.thptty.service.TYStudentConductLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointReserveLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;
import org.tvd.thptty.service.persistence.TYClassStudentPK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.tvd.thptty.notification.utils.GCMBroadcast;

public class AdminTeacherPortlet extends MVCPortlet {
	
	public void addManagementRoleAction(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long classId = ParamUtil.getLong(request, "classId");
		int courses = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long teacherId = ParamUtil.getLong(request, "teacherId");
		
		User teacherManager = ActionUtil.getTeacherManagementOfClass(
				courses, classId, RoleKeys.MANAGEMENT);
		if(teacherManager != null) {
			response.setRenderParameter("resourcePrimKey", String.valueOf(teacherId));
			response.setRenderParameter("jspPage", assignManagementRoleJSP);
			return;
		}
		
		TYClassUserRole newRole = new TYClassUserRoleImpl();
		newRole.setClassId(classId);
		newRole.setCourses(courses);
		newRole.setUserId(teacherId);
		newRole.setRoleId(RoleKeys.MANAGEMENT);
		newRole.setStatus(0);
		TYClassUserRoleLocalServiceUtil.addClassUserRole(newRole);
		
		TYClass tyClass = TYClassLocalServiceUtil.getClassById(classId, groupId, companyId);
		tyClass.setModifiedDate(new Date());
		TYClassLocalServiceUtil.updateTYClass(tyClass);
		
		SessionMessages.add(request, "add-success");
		response.setRenderParameter("resourcePrimKey", String.valueOf(teacherId));
		response.setRenderParameter("jspPage", assignManagementRoleJSP);
	}
	
	public void deleteManagementRoleAction(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long classId = ParamUtil.getLong(request, "classId");
		int courses = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long teacherId = ParamUtil.getLong(request, "teacherId");
		TYClassUserRole oldRole = new TYClassUserRoleImpl();
		oldRole.setClassId(classId);
		oldRole.setCourses(courses);
		oldRole.setUserId(teacherId);
		oldRole.setRoleId(RoleKeys.MANAGEMENT);
		TYClassUserRoleLocalServiceUtil.deleteClassUserRole(oldRole);
		
		TYClass tyClass = TYClassLocalServiceUtil.getClassById(classId, groupId, companyId);
		tyClass.setModifiedDate(new Date());
		TYClassLocalServiceUtil.updateTYClass(tyClass);
		
		SessionMessages.add(request, "recovery-role-success");
		response.setRenderParameter("resourcePrimKey", String.valueOf(teacherId));
		response.setRenderParameter("jspPage", permissionTeacherJSP);
	}
	
	public void deleteTypePointRoleAction(ActionRequest request, ActionResponse response) 
			throws SystemException {
		int courses = TYServiceUtil.getCurrentCourse();
		long subjectId = ParamUtil.getLong(request, "subjectId");
		long classId = ParamUtil.getLong(request, "classId");
		long teacherId = ParamUtil.getLong(request, "teacherId");
		
		TYSubjectClassUserRole oldSCUR = new TYSubjectClassUserRoleImpl();
		oldSCUR.setCourses(courses);
		oldSCUR.setSubjectId(subjectId);
		oldSCUR.setClassId(classId);
		oldSCUR.setUserId(teacherId);
		oldSCUR.setRoleId(RoleKeys.TYPE_POINT);
		
		TYSubjectClassUserRoleLocalServiceUtil.deleteSubjectClassUserRole(oldSCUR);
		SessionMessages.add(request, "recovery-role-success");
		
		response.setRenderParameter("resourcePrimKey", String.valueOf(teacherId));
		response.setRenderParameter("jspPage", permissionTeacherJSP);
	}
	
	public void addStudentsPoints(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		List<TYStudentPoint> studentPoints = ActionUtil.studentPointsFromRequest(request);
		for(int i = 0 ; i < studentPoints.size() ; i++) {
			TYStudentPointLocalServiceUtil.addStudentPoint(studentPoints.get(i));
			TYStudentPointReserveLocalServiceUtil.addStudentPoint(studentPoints.get(i));
			TYStudent student = TYStudentLocalServiceUtil.getTYStudent(studentPoints.get(i).getStudentId());
			if(student.getRegId() != null && !student.getRegId().equals("")) {
				GCMBroadcast.sSendMessage(student.getRegId(), ((TYStudentPointImpl)studentPoints.get(i)).toMobileMessage());
			}
		}
		
		long subjectId = ParamUtil.getLong(request, "subjectId");
		int pointFactor = ParamUtil.getInteger(request, "pointFactor");
		long classId = ParamUtil.getLong(request, "classId");
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_INPUT_POINT);
		message.setUserId(userId);
		message.setClassId(classId);
		message.setSubjectId(subjectId);
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		SessionMessages.add(request, "add-points-success");
		response.setRenderParameter("subjectId", String.valueOf(subjectId));
		response.setRenderParameter("pointFactor", String.valueOf(pointFactor));
		response.setRenderParameter("classId", String.valueOf(classId));
		response.setRenderParameter("jspPage", viewClassSubjectPoint);
	}
	
	public void editStudentsPoints(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		ActionUtil.editStudentsPoints(request);
		long subjectId = ParamUtil.getLong(request, "subjectId");
		long classId = ParamUtil.getLong(request, "classId");
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_EDIT_POINT);
		message.setUserId(userId);
		message.setClassId(classId);
		message.setSubjectId(subjectId);
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		SessionMessages.add(request, "update-success");
		response.setRenderParameter("subjectId", String.valueOf(subjectId));
		response.setRenderParameter("classId", String.valueOf(classId));
		response.setRenderParameter("jspPage", viewEditClassSubjectPoint);
	}
	
	public void addUserSubjectClassRole(ActionRequest request, ActionResponse response) 
			throws SystemException {
		long teacherId = ParamUtil.getLong(request, "resourcePrimKey");
		long subjectId = ParamUtil.getLong(request, "subjectId");
		long classId = ParamUtil.getLong(request, "classId");
		
		int courses = TYServiceUtil.getCurrentCourse();
		
		TYSubjectClassUserRole subjectUserRole = new TYSubjectClassUserRoleImpl();
		subjectUserRole.setCourses(courses);
		subjectUserRole.setSubjectId(subjectId);
		subjectUserRole.setClassId(classId);
		subjectUserRole.setUserId(teacherId);
		subjectUserRole.setRoleId(RoleKeys.TYPE_POINT);
		subjectUserRole.setStatus(0);
		TYSubjectClassUserRoleLocalServiceUtil.addSubjectClassUserRole(subjectUserRole);
		
		SessionMessages.add(request, "append-class-success");
		response.setRenderParameter("resourcePrimKey", String.valueOf(teacherId));
		response.setRenderParameter("subjectId", String.valueOf(subjectId));
		response.setRenderParameter("jspPage", selectClassJSP);
		
	}
	
	public void updateStudentPoints(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		long subjectId = ParamUtil.getLong(request, "subjectId");
		long classId = ParamUtil.getLong(request, "classId");
		long studentId = ParamUtil.getLong(request, "studentId");
		int pointType = ParamUtil.getInteger(request, "pointType");
		int pointFactorx = ParamUtil.getInteger(request, "pointFactorx");
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		int courses = TYServiceUtil.getCurrentCourse();
		
		float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
				semester, studentId, subjectId, 
					pointType, pointFactorx);
		List<TYStudentPoint> studentsPoints = TYServiceUtil.getPointsStudentsByPTPF(courses, 
				semester, studentId, subjectId, 
					pointType, pointFactorx);
		if(points != null) {
			float temp[] = new float[points.length];
			for(int i = 0 ; i < points.length ; i++) {
				temp[i] = ParamUtil.getFloat(request, "point" + i);
			}
			temp = TYServiceUtil.standardizedFloat(temp);
			for(int i = 0 ; i < temp.length ; i++) {
				float point = temp[i];
				TYStudentPoint studentPoint = new TYStudentPointImpl();
				studentPoint.setSemester(semester);
				studentPoint.setCourses(courses);
				studentPoint.setStudentId(studentId);
				studentPoint.setSubjectId(subjectId);
				studentPoint.setModifiedDate(new Date());
				studentPoint.setPointType(pointType);
				studentPoint.setPointFactor(pointFactorx);
				studentPoint.setPointIndex(i + 1);
				studentPoint.setPoint(point);
				studentPoint.setUserId(userId);
				studentPoint.setModifiedDate(new Date());
				TYStudentPointLocalServiceUtil.updateTYStudentPoint(studentPoint);
				
			}
			
			for(int i = temp.length ; i < points.length ; i++ ) {
				TYStudentPointLocalServiceUtil.deleteTYStudentPoint(studentsPoints.get(i));
			}
		}
		
		if(points != null) {
			SessionMessages.add(request, "update-success");
		} else {
			SessionMessages.add(request, "");
		}
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_EDIT_POINT);
		message.setUserId(userId);
		message.setClassId(classId);
		message.setSubjectId(subjectId);
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		response.setRenderParameter("subjectId", String.valueOf(subjectId));
		response.setRenderParameter("classId", String.valueOf(classId));
		response.setRenderParameter("jspPage", viewEditClassSubjectPoint);
	}
	
	public void addStudentsAction(ActionRequest request, ActionResponse response) 
			throws SystemException, Exception {
		
		int amount = ParamUtil.getInteger(request, "amountStudent");
		long classId = ParamUtil.getLong(request, "classId");
		
		int amoutAppended = 0;
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		long userId = themeDisplay.getUserId();
		
		for(int i = 0 ; i < amount ; i++ ) {
			String firstName = ParamUtil.getString(request, "studentFirstName" + i);
			String lastName = ParamUtil.getString(request, "studentLastName" + i);
			if(ValidationInput.validFullName(firstName, lastName)) {
				if(Validator.isNotNull(firstName + lastName)) {
					TYStudent newStudent = new TYStudentImpl();
						
					newStudent.setStudentFirstName(firstName);
					newStudent.setStudentLastName(lastName);
					newStudent.setCompanyId(companyId);
					newStudent.setGroupId(groupId);
						
					newStudent = TYStudentLocalServiceUtil.addStudent(newStudent);
						
					int courses = TYServiceUtil.getCurrentCourse();
						
					TYClassStudent temp = new TYClassStudentImpl();
					temp.setCourses(courses);
					temp.setStudentId(newStudent.getStudentId());
					temp.setClassId(classId);
						
					TYClassStudentLocalServiceUtil.addStudentIntoClass(temp);
					amoutAppended++;
				}
			} else {
				SessionErrors.add(request, "invalid-full-name");
				response.setRenderParameter("amountStudent", String.valueOf(amount));
				response.setRenderParameter("classId", String.valueOf(classId));
				response.setRenderParameter("jspPage", addStudentsSJSP);
				return;
			}
		}
		if(amoutAppended > 0) {
			TYClass tyClass = TYClassLocalServiceUtil.getTYClass(classId);
			tyClass.setModifiedDate(new Date());
			TYClassLocalServiceUtil.updateTYClass(tyClass);
			
			TYMessages message = new TYMessagesImpl();
			message.setCompanyId(companyId);
			message.setGroupId(groupId);
			message.setActionId(TYActionKeys.M_ADD_STUDENT);
			message.setUserId(userId);
			message.setClassId(classId);
			message.setHappenDate(new Date());
			
			TYMessagesLocalServiceUtil.addMessage(message);
			
			SessionMessages.add(request, "append-student-sucess");
			response.setRenderParameter("classId", String.valueOf(classId));
			response.setRenderParameter("jspPage", addStudentsJSP);
		}
	}
	
	public void addStudentConducts(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		long classId = ParamUtil.getLong(request, "classId");
		List<TYStudentConduct> studentConducts = 
				ActionUtil.studentConductsFromRequest(request);
		for(TYStudentConduct studentConduct : studentConducts) {
			TYStudentConductLocalServiceUtil.addStudentConduct(
					studentConduct);
		}
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_INPUT_CONDUCT);
		message.setUserId(userId);
		message.setClassId(classId);
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		SessionMessages.add(request, "add-conduct-success");
		response.setRenderParameter("classId", String.valueOf(classId));
		response.setRenderParameter("jspPage", viewStudentsConductsJSP);
		
	}
	
	public void deleteStudent(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long studentId = ParamUtil.getLong(request, "studentId");
		int courses = TYServiceUtil.getCurrentCourse();
		
		TYClass tyClass = TYServiceUtil.getClassOfStudent(courses, studentId);
		
		TYClassStudent classStudent = TYClassStudentLocalServiceUtil.
				getTYClassStudent(new TYClassStudentPK(courses, studentId));
		TYClassStudentLocalServiceUtil.deleteStudentClass(classStudent);
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_DELETE_STUDENT);
		message.setUserId(userId);
		message.setClassId(tyClass.getClassId());
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		
		SessionMessages.add(request, "delete-student-success");
		
		response.setRenderParameter("classId", 
				String.valueOf(tyClass.getPrimaryKey()));
		response.setRenderParameter("jspPage", addStudentsJSP);
		
	}
	
	public void updateStudent(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		long classId = ParamUtil.getLong(request, "classId");
		long studentId = ParamUtil.getLong(request, "studentId");
		TYStudent student = ActionUtil.studentFromRequest(request);
		
		TYStudent oldStudent = TYServiceUtil.getStudentById(studentId);
		
		if(student.getEmailAddress().equals("")) {
			student.setEmailAddress(oldStudent.getEmailAddress());
		}
		
		List<String> errors = new ArrayList<String>();
		
		student.setStudentId(studentId);
		List<TYStudent> students = TYServiceUtil.getAllStudents(student.getCompanyId(), student.getGroupId());
		
		boolean validEmail = true;
		
		if(!ValidationInput.validEmailStudent(student, students, errors)) {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
			student.setEmailAddress(oldStudent.getEmailAddress());
			validEmail = false;
		}
		
		boolean validInput = true;
		
		if(!ValidationInput.validateStudentPublic(student, errors)) {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
			validInput = false;
		}
		
		if(!validInput || !validEmail) {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
			response.setRenderParameter("studentId", String.valueOf(studentId));
			response.setRenderParameter("class", String.valueOf(classId));
			response.setRenderParameter("jspPage", editStudentJSP);
		}
		if(validEmail && validInput){
			student.setStudentId(studentId);
			TYStudentLocalServiceUtil.updateStudent(student);
			
			ThemeDisplay themeDisplay =
					(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
			long companyId = themeDisplay.getCompanyId();
			long groupId = themeDisplay.getScopeGroupId();
			long userId = themeDisplay.getUserId();
			
			TYMessages message = new TYMessagesImpl();
			message.setCompanyId(companyId);
			message.setGroupId(groupId);
			message.setActionId(TYActionKeys.M_EDIT_STUDENT);
			message.setUserId(userId);
			message.setClassId(classId);
			message.setHappenDate(new Date());
			
			TYMessagesLocalServiceUtil.addMessage(message);
			
			SessionMessages.add(request, "update-success");
			response.setRenderParameter("studentId", String.valueOf(studentId));
			response.setRenderParameter("resourcePrimKey", String.valueOf(classId));
			response.setRenderParameter("jspPage", viewStudentJSP);
		}
	}
	
	public void readExcelFile(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		String realPath = getPortletContext().getRealPath("/excel");
		String filePath = "/recieved/";
		byte[] bytes = null;
		long classId = ParamUtil.getLong(request, "classId");
		//PortletContext portletContext = request.getPortletSession().getPortletContext();
		try {
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
			String sourceFileName = uploadRequest.getFileName("filePath");
			System.out.println("SourceFileName..."+sourceFileName);
			File file = uploadRequest.getFile("filePath");
			System.out.println("File..." + file);
			try {
				bytes = FileUtil.getBytes(file);
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			File newFile=null;
			sourceFileName = DateToStringConvertor.converToTimeString(new Date()) + "_" + 
					(Count.COUNT++) + "_" + sourceFileName; 
					
			if ((bytes != null) && (bytes.length > 0)) {
					     
				try {
					newFile = new File(realPath + filePath + sourceFileName);
					System.out.println("NewFile::::::::" + newFile);
					FileInputStream fileInputStream = new FileInputStream(file);
					System.out.println("file size: " + fileInputStream.available() + "bytes");
					if(fileInputStream.available() > org.tvd.thptty.management.temporary.File.MAX_FILE_SIZE) {
						fileInputStream.close();
						SessionErrors.add(request, "error-file-size");
						response.setRenderParameter("classId", String.valueOf(classId));
						response.setRenderParameter("jspPage", addStudentsJSP);
						return;
					}
					ReadExcelFileService readExcelFileService = new ReadExcelFileServiceImpl();
					readExcelFileService.read(file.getAbsolutePath());
					ExcelActionUtil.addStudents(request, readExcelFileService.getSheets().get(0));
					FileOutputStream fileOutputStream = new FileOutputStream(newFile);
					fileInputStream.read(bytes);
					fileOutputStream.write(bytes, 0, bytes.length);
					fileOutputStream.close();
					fileInputStream.close();
				} catch (FileNotFoundException e) {
					System.out.println("File Not Found.");
					e.printStackTrace();
				} catch (IOException e1){
					System.out.println("Error Reading The File.");
					e1.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		TYMessages message = new TYMessagesImpl();
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setActionId(TYActionKeys.M_ADD_STUDENT);
		message.setUserId(userId);
		message.setClassId(classId);
		message.setHappenDate(new Date());
		
		TYMessagesLocalServiceUtil.addMessage(message);
		
		response.setRenderParameter("classId", String.valueOf(classId));
		response.setRenderParameter("jspPage", addStudentsJSP);
			
	}
	
	public void importPointFromExcelFile(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		String realPath = getPortletContext().getRealPath("/excel");
		String filePath = "/recieved/";
		byte[] bytes = null;
		boolean isNotError = true;
		List<String> errors = new ArrayList<String>();
		long classId = ParamUtil.getLong(request, "classId");
		long subjectId = ParamUtil.getLong(request, "subjectId");
		//PortletContext portletContext = request.getPortletSession().getPortletContext();
		try {
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
			String sourceFileName = uploadRequest.getFileName("filePath");
			System.out.println("SourceFileName..."+sourceFileName);
			File file = uploadRequest.getFile("filePath");
			System.out.println("File..." + file);
			try {
				bytes = FileUtil.getBytes(file);
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			File newFile=null;
			sourceFileName = DateToStringConvertor.converToTimeString(new Date()) + "_" + 
					(Count.COUNT++) + "_" + sourceFileName; 
					
			if ((bytes != null) && (bytes.length > 0)) {
					     
				try {
					newFile = new File(realPath + filePath + sourceFileName);
					System.out.println("NewFile::::::::" + newFile);
					FileInputStream fileInputStream = new FileInputStream(file);
					System.out.println("file size: " + fileInputStream.available() + "bytes");
					if(fileInputStream.available() > org.tvd.thptty.management.temporary.File.MAX_FILE_SIZE) {
						fileInputStream.close();
						SessionErrors.add(request, "error-file-size");
						response.setRenderParameter("classId", String.valueOf(classId));
						response.setRenderParameter("subjectId", String.valueOf(subjectId));
						response.setRenderParameter("jspPage", typePointJSP);
						return;
					}
					ReadExcelFileService readExcelFileService = new ReadExcelFileServiceImpl();
					readExcelFileService.read(file.getAbsolutePath());
					isNotError = ExcelActionUtil.importPoints(request, readExcelFileService.getSheets().get(0), errors);
					FileOutputStream fileOutputStream = new FileOutputStream(newFile);
					fileInputStream.read(bytes);
					fileOutputStream.write(bytes, 0, bytes.length);
					fileOutputStream.close();
					fileInputStream.close();
				} catch (FileNotFoundException e) {
					System.out.println("File Not Found.");
					e.printStackTrace();
				} catch (IOException e1){
					System.out.println("Error Reading The File.");
					e1.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(isNotError) {
			ThemeDisplay themeDisplay =
					(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
			long companyId = themeDisplay.getCompanyId();
			long groupId = themeDisplay.getScopeGroupId();
			long userId = themeDisplay.getUserId();
			
			TYMessages message = new TYMessagesImpl();
			message.setCompanyId(companyId);
			message.setGroupId(groupId);
			message.setActionId(TYActionKeys.M_INPUT_POINT);
			message.setUserId(userId);
			message.setClassId(classId);
			message.setSubjectId(subjectId);
			message.setHappenDate(new Date());
			
			TYMessagesLocalServiceUtil.addMessage(message);
			
			response.setRenderParameter("classId", String.valueOf(classId));
			response.setRenderParameter("subjectId", String.valueOf(subjectId));
			response.setRenderParameter("jspPage", viewEditClassSubjectPoint);
		} else {
			SessionErrors.add(request, "error-in-excel-file");
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
			response.setRenderParameter("classId", String.valueOf(classId));
			response.setRenderParameter("subjectId", String.valueOf(subjectId));
			response.setRenderParameter("jspPage", typePointJSP);
		}
			
	}
	
	public void updateAllStudents(ActionRequest request) 
			throws SystemException, PortalException {
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		int course = TYServiceUtil.getCurrentCourse();
		int maxClassGroup = TYClassLocalServiceUtil.getMaxClassGroup(companyId, groupId);
		
		int end = TYClassStudentLocalServiceUtil.countClassStudentByCourse_Group(
				course - 1, companyId, groupId, maxClassGroup);
		
		List<TYClassStudent> classStudents = 
				TYClassStudentLocalServiceUtil.getClassStudentsByCourse_Group(
						course - 1, companyId, groupId, maxClassGroup, 0, end);
		
		for(TYClassStudent classStudent : classStudents) {
			TYClass tyClass = TYClassLocalServiceUtil.getTYClass(
					classStudent.getClassId());
			int classGroup = tyClass.getClassGroup();
			String className = tyClass.getClassName();
			
			TYClass classUp = TYClassLocalServiceUtil.getClassByClassGroup_Name(
					companyId, groupId, classGroup + 1, className);
			if(classUp != null) {
				classStudent.setClassId(classUp.getClassId());
				classStudent.setCourses(course);
				TYClassStudentLocalServiceUtil.addStudentIntoClass(classStudent);
			}
			
		}
	}
	
	public void updateNewCourse(ActionRequest request, ActionResponse response) 
			throws SystemException, PortalException {
		updateAllStudents(request);
		SessionMessages.add(request, "updated-new-course");
	}
	
	public void unlockSemester(ActionRequest request, ActionResponse response) 
			throws SystemException {
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		int semesterId = ParamUtil.getInteger(request, "semesterId");
		
		List<Semester> semesters = ActionUtil.getSemesters(companyId, groupId);
		for(int i = 0 ; semesters != null && i < semesters.size() ; i++) {
			if(semesters.get(i).getStatus() != 0) {
				Semester sem = semesters.get(i);
				sem.setStatus(0);
				SemesterLocalServiceUtil.updateSemester(sem);
			}
		}
		
		Semester semester = new SemesterImpl();
		semester.setSemesterId(semesterId);
		semester.setCompanyId(companyId);
		semester.setGroupId(groupId);
		semester.setStatus(1);
		SemesterLocalServiceUtil.addSemester(semester);
	}
	
	public void unlockTime(ActionRequest request, ActionResponse response) 
			throws SystemException, NoSuchSemesterException {
		int semesterId = ParamUtil.getInteger(request, "semesterId");
		int course = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		List<TYClassUserRole> tyClassUserRoles = 
				TYClassUserRoleLocalServiceUtil.getClassUserRolesByCourse(course, companyId, groupId);
		for(TYClassUserRole tmp : tyClassUserRoles) {
			tmp.setCourses(course);
			tmp.setStatus(3 - semesterId);
			TYClassUserRoleLocalServiceUtil.updateTYClassUserRole(tmp);
		}
		
		List<TYSubjectClassUserRole> subjectClassUserRoles = 
				TYSubjectClassUserRoleLocalServiceUtil.getSubjectClassUserRolesByCourse(
						course, companyId, groupId);
		for(TYSubjectClassUserRole tmp : subjectClassUserRoles) {
			tmp.setStatus(1);
			tmp.setCourses(course);
			TYSubjectClassUserRoleLocalServiceUtil.updateTYSubjectClassUserRole(tmp);
		}
		
		unlockSemester(request, response);
		
		SessionMessages.add(request, "have-unlocked-time");
	}
	
	public void lockSemester(ActionRequest request, ActionResponse response) 
			throws SystemException {
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		int course = TYServiceUtil.getCurrentCourse();
		
		int moment = ParamUtil.getInteger(request, "moment");
		
		int currentSemester = TYServiceUtil.getCurrentSemester(
				companyId, groupId);
		
		int maxSemester = ActionUtil.getMaxSemester(course, companyId, groupId);
		
		if(moment == 0) {
			currentSemester += 1;
			if(currentSemester > maxSemester) {
				currentSemester = 1;
				moment = 2;
			}
		}
		
		for(int i = 1 ; i <= maxSemester ; i++) {
			int status = 0;
			if(i == currentSemester) {
				status = moment;
			}
			Semester semester = new SemesterImpl();
			semester.setSemesterId(i);
			semester.setCompanyId(companyId);
			semester.setGroupId(groupId);
			semester.setStatus(status);
			SemesterLocalServiceUtil.addSemester(semester);
		}
			
		
	}
	
	public void lockTime(ActionRequest request, ActionResponse response) 
			throws SystemException, NoSuchSemesterException {
		
		int course = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		List<TYClassUserRole> tyClassUserRoles = 
				TYClassUserRoleLocalServiceUtil.getClassUserRolesByCourse(
						course, companyId, groupId);
		
		for(TYClassUserRole tmp : tyClassUserRoles) {
			tmp.setStatus(0);
			tmp.setCourses(course);
			TYClassUserRoleLocalServiceUtil.updateTYClassUserRole(tmp);
		}
		
		List<TYSubjectClassUserRole> subjectClassUserRoles = 
				TYSubjectClassUserRoleLocalServiceUtil.getSubjectClassUserRolesByCourse(
						course, companyId, groupId);
		for(TYSubjectClassUserRole tmp : subjectClassUserRoles) {
			tmp.setStatus(0);
			tmp.setCourses(course);
			TYSubjectClassUserRoleLocalServiceUtil.updateTYSubjectClassUserRole(tmp);
		}
		
		lockActions(request, response);
		
		lockSemester(request, response);
		
		SessionMessages.add(request, "have-locked-time");
	}
	
	public void lockActions(ActionRequest request, ActionResponse response) 
			throws SystemException {
		int course = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		int actionId = ParamUtil.getInteger(request, "actionId");
		
		switch(actionId) {
		
		case 1:
			List<TYClassUserRole> tyClassUserRoles = 
					TYClassUserRoleLocalServiceUtil.getClassUserRolesByCourse(
							course, companyId, groupId);
			
			for(TYClassUserRole tmp : tyClassUserRoles) {
				tmp.setCourses(course);
				tmp.setStatus(1);
				TYClassUserRoleLocalServiceUtil.updateTYClassUserRole(tmp);
			}
			break;
		}
		
		SessionMessages.add(request, "have-locked-time");
	}
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException{
		User teacher = null;
		long resourcePrimKey =
	                ParamUtil.getLong(renderRequest, "resourcePrimKey");
		if(resourcePrimKey > 0) {
			 try {
				teacher = UserLocalServiceUtil.getUser(resourcePrimKey);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} 
		
		int pointFactor = ParamUtil.getInteger(renderRequest, "pointFactor");
		int pointType = ParamUtil.getInteger(renderRequest, "pointType");
		
		long subjectId = ParamUtil.getLong(renderRequest, "subjectId"); 
		
		TYSubject subject = null;
		if(subjectId > 0) {
			try {
				subject = TYSubjectLocalServiceUtil.getTYSubject(subjectId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			subject = new TYSubjectImpl();
		}
		
		long classId = ParamUtil.getLong(renderRequest, "classId");
		
		TYClass tyClass = null;
		if(classId > 0) {
			try {
				tyClass = TYClassLocalServiceUtil.getTYClass(classId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			tyClass = new TYClassImpl();
		}
		
		long studentId = ParamUtil.getLong(renderRequest, "studentId");
		
		TYStudent student = null;
		if(studentId > 0) {
			try {
				student = TYStudentLocalServiceUtil.getTYStudent(studentId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		
		renderRequest.setAttribute("pointFactor", pointFactor);
		renderRequest.setAttribute("pointType", pointType);
		renderRequest.setAttribute(WebKeys.TY_TEACHER, teacher);
		renderRequest.setAttribute(WebKeys.TY_SUBJECT, subject);
		renderRequest.setAttribute(WebKeys.TY_CLASS, tyClass);
		renderRequest.setAttribute(WebKeys.TY_STUDENT, student);
		
		int amountStudent = ParamUtil.getInteger(renderRequest, "amountStudent");
		renderRequest.setAttribute("amountStudent", amountStudent);
		
		super.render(renderRequest, renderResponse);
	}
	
	protected String viewTeacherJSP = "/html/teacher-admin/view_teacher.jsp";
	protected String permissionTeacherJSP = "/html/teacher-admin/permission_teacher.jsp";
	protected String assignManagementRoleJSP = "/html/teacher-admin/assign_management_role.jsp";
	protected String viewStudentsConductsJSP = "/html/student-conduct/view_students_conducts.jsp";
	protected String viewClassSubjectPoint = "/html/student-point/view_class_subject_point.jsp";
	protected String viewEditClassSubjectPoint = "/html/student-point/view_edit_class_subject_point.jsp";
	protected String selectClassJSP = "/html/teacher-class/select_class.jsp";
	protected String addStudentsJSP = "/html/class-admin/add_students.jsp";
	protected String addStudentsSJSP = "/html/student-admin/add_students.jsp";
	protected String editStudentJSP = "/html/student-admin/edit_student.jsp";
	protected String viewStudentJSP = "/html/student-public/view_student.jsp";
	protected String typePointJSP = "/html/student-point/type_point.jsp";
}
