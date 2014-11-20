<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass temp = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	long companyId = themeDisplay.getCompanyId();
	String name = TYTeacher.class.getName();
	int courses = TYServiceUtil.getCurrentCourse();
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=PermissionChecker.isTeacherManagement(courses, temp.getClassId(), 
			user.getUserId(), RoleKeys.MANAGEMENT) %>">
		<portlet:renderURL var="addStudentsURL" windowState="maximized">
			<portlet:param name="classId" value="<%=String.valueOf(temp.getClassId()) %>" />
			<portlet:param name="jspPage" value="/html/class-admin/add_students.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="add_user" message="add-student" url="<%=addStudentsURL.toString() %>" />
		
		<portlet:renderURL var="selectClassURL" windowState="maximized">
			<portlet:param name="classId" value="<%=String.valueOf(temp.getClassId()) %>" />
			<portlet:param name="jspPage" value="/html/student-conduct/type_conduct.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="team_icon" message="input-conduct" url="<%=selectClassURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>