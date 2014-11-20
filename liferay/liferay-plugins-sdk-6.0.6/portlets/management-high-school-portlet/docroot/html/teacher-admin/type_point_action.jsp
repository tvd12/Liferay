<%@page import="org.tvd.thptty.model.impl.TYSubjectImpl"%>
<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	SubjectClassUserRoleTemp temp = (SubjectClassUserRoleTemp)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	long companyId = themeDisplay.getCompanyId();
	long classId = temp.getClassId();
	long subjectId = temp.getSubjectId();
	String name = TYTeacher.class.getName();
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	TYClass tyClass = ActionUtil.getTYClassById(classId);
	TYSubject subject = ActionUtil.getSubjectById(subjectId);
	
	String filePath = application.getRealPath("/excel");
	TVDSheet sheet = DataExcelCreator.createByC_S(tyClass.getClassId(), subject);
	List<TVDSheet> sheets = new ArrayList<TVDSheet>();
	sheets.add(sheet);
	
	WriteExcelFileService writeExcel = new WriteExcelFileServiceImpl();
	writeExcel.setSheets(sheets);
	String fileName = "Lop_" + tyClass.getClassCode() + "_Mon_" + subject.getSubjectCode() + 
		"_" + user.getUserId() + "_" + courses + "_hk" + semester + ".xls";
	filePath = filePath + "/" + fileName;
	writeExcel.write(filePath);
	

	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=PermissionChecker.hasSubjectClassRole(courses, subjectId, classId, 
			user.getUserId(), RoleKeys.TYPE_POINT) %>">
		<portlet:renderURL var="selectSubjectURL" windowState="maximized">
			<portlet:param name="classId" value="<%=String.valueOf(classId) %>" />
			<portlet:param name="subjectId" value="<%=String.valueOf(subjectId) %>" />
			<portlet:param name="jspPage" value="/html/student-point/type_point.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="submit" message="type-point" url="<%=selectSubjectURL.toString() %>" />
		
		<portlet:renderURL var="downloadReportURL">
			<portlet:param name="jspPage" value="/html/teacher-admin/download_report.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="download" message="download-report" url="<%=downloadReportURL.toString() %>" />
		
		<liferay-ui:icon image="undo" message="download-excel-form" url='<%= contextPathImg + "/excel/" +  fileName  %>' />
	</c:if>
	
</liferay-ui:icon-menu>