package org.tvd.thptty.management.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.tvd.thptty.management.temporary.WebKeys;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.management.util.TYServiceUtil;
import org.tvd.thptty.management.util.ValidationInput;
import org.tvd.thptty.model.TYPrioritySubject;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.model.impl.TYPrioritySubjectImpl;
import org.tvd.thptty.model.impl.TYSubjectImpl;
import org.tvd.thptty.service.TYPrioritySubjectLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class AdminSubjectPortlet extends MVCPortlet {
	public void addSubject(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		TYSubject subject = ActionUtil.subjectFromRequest(request);
		
		List<String> errors = new ArrayList<String>();
		if(ValidationInput.validSubject(subject, errors)) {
			subject = TYSubjectLocalServiceUtil.addSubject(subject);
			SessionMessages.add(request, "add-subject-success");
			response.setRenderParameter("jspPage", viewJSP);
		} else {
			for(String error : errors) {
				SessionErrors.add(request, error);
			}
		}
	}
	
	public void updateSubject(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		TYSubject subject = ActionUtil.subjectFromRequest(request);
		long subjectId = ParamUtil.getLong(request, "resourcePrimKey");
		subject.setSubjectId(subjectId);
		
		List<String> errors = new ArrayList<String>();
		if(ValidationInput.validSubject(subject, errors)) {
			subject = TYSubjectLocalServiceUtil.updateTYSubject(subject);
			SessionMessages.add(request, "update-success");
			response.setRenderParameter("jspPage", viewJSP);
		} else {
			for(String error : errors) {
				SessionErrors.add(request, error);
				response.setRenderParameter("resourcePrimKey", String.valueOf(subjectId));
				response.setRenderParameter("jspPage", editJSP);
			}
		}
	}
	
	public void deleteSubject(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long resourcePrimKey = ParamUtil.getLong(request, "resourcePrimKey");
		TYSubjectLocalServiceUtil.deleteTYSubject(resourcePrimKey);
		SessionMessages.add(request, "delete-subject-success");
		response.setRenderParameter("jspPage", viewJSP);
	}
	
	public void updateFactor(ActionRequest request, ActionResponse response) 
		throws PortalException, SystemException{
		long subjectId = ParamUtil.getLong(request, "resourcePrimKey");
		String classId = ParamUtil.getString(request, "classId");
		int xFactor = ParamUtil.getInteger(request, "xFactor");
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		int courses = TYServiceUtil.getCurrentCourse();
		
		List<TYStudent> students = null;
		
		if(classId.equals("all")) {
			students = ActionUtil.getAllStudentsByGroup(companyId, groupId);
		} else {
			long classIdLong = Long.parseLong(classId);
			students = ActionUtil.getStudentsInClass(courses, classIdLong);
		}
		
		if(students != null && students.size() > 0) {
			for(TYStudent student : students) {
				TYPrioritySubject pSubject = new TYPrioritySubjectImpl();
				pSubject.setCourses(courses);
				pSubject.setSubjectId(subjectId);
				pSubject.setStudentId(student.getStudentId());
				pSubject.setExtra(xFactor);
				
				TYPrioritySubjectLocalServiceUtil.addPrioritySubject(pSubject);	
			}
			response.setRenderParameter("resourcePrimKey", String.valueOf(subjectId));
			response.setRenderParameter("jspPage", updateFactorJSP);
		} else {
			
		}
		
	}
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException{
		long resourcePrimKey = ParamUtil.getLong(renderRequest, "resourcePrimKey");
		TYSubject subject = null;
		if(resourcePrimKey > 0) {
			try {
				subject = TYSubjectLocalServiceUtil.getTYSubject(resourcePrimKey);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			subject = new TYSubjectImpl();
		}
		renderRequest.setAttribute(WebKeys.TY_SUBJECT, subject);
		super.render(renderRequest, renderResponse);
	}
	
	protected String viewJSP = "/html/subject-admin/view.jsp";
	protected String editJSP = "/html/subject-admin/edit.jsp";
	protected String updateFactorJSP = "/html/subject-admin/update_factor.jsp";
}
