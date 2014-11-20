<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TeacherTemp tyTeacher = (TeacherTemp)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	long companyId = themeDisplay.getCompanyId();
	String name = TYTeacher.class.getName();
	String primKey = String.valueOf(tyTeacher.getTeacherId());
%>

<liferay-ui:icon-menu>

	<c:if test='<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.PERMISSIONS) %>'>
		<portlet:renderURL var="permissionTeacherURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/teacher-admin/permission_teacher.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="permissions" message="assign-roles" url="<%=permissionTeacherURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.VIEW) %>">
		<portlet:renderURL var="viewTeacherURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/teacher-admin/view_teacher.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view" message="View" url="<%=viewTeacherURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=tyTeacher.getTeacherId() == user.getUserId() %>">		
		<portlet:renderURL var="downloadReportURL">
			<portlet:param name="jspPage" value="/html/teacher-admin/download_report.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="download" message="download-report" url="<%=downloadReportURL.toString() %>" />
		
		<portlet:renderURL var="viewPermissionURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/teacher-admin/view_permission.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view_tasks" message="view-roles" url="<%=viewPermissionURL.toString() %>" />
		
		<portlet:renderURL var="studentsMissPointURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/student-point/students_missing_point.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="leave" message="students-missing-point" url="<%=studentsMissPointURL.toString() %>" />
	</c:if>
	
	<c:if test='<%=permissionChecker.hasPermission(groupId, name, primKey, "UPDATE_TIME") 
			&& tyTeacher.getTeacherId() == user.getUserId() %>'>
		<portlet:renderURL var="unlockTimeURL">
			<portlet:param name="jspPage" value="/html/teacher-time/time_unlock.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="unlock" message="unlock-time" url="<%=unlockTimeURL.toString() %>" />
		
		<portlet:renderURL var="lockTimeURL">
			<portlet:param name="jspPage" value="/html/teacher-time/time_lock.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="lock" message="lock-time" url="<%=lockTimeURL.toString() %>" />
		
		<portlet:renderURL var="viewSystemDiaryURL" windowState="maximized">
			<portlet:param name="jspPage" value="/html/teacher-diary/system_diary.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view_articles" message="system-diary" url="<%=viewSystemDiaryURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>