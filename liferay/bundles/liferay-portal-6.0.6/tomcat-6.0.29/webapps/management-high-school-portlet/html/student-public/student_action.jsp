<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYStudent tyStudent = (TYStudent)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = User.class.getName();
	String primKey = String.valueOf(tyStudent.getPrimaryKey());
%>

<liferay-ui:icon-menu>

	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.VIEW) %>">
		<portlet:renderURL var="viewStudentURL">
			<portlet:param name="studentId" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/student-public/view_student.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view" message="View" url="<%=viewStudentURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>