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
	
	<portlet:renderURL var="editStudentURL" >
		<portlet:param name="studentId" value="<%=primKey %>" />
		<portlet:param name="jspPage" value="/html/student-admin/edit_student.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon image="edit" message="Edit" url="<%=editStudentURL.toString() %>" />
	
	<portlet:actionURL name="deleteStudent" var="deleteStudentURL">
		<portlet:param name="studentId" value="<%=primKey %>" />
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message="Delete" url="<%=deleteStudentURL.toString() %>" id="id-delete-ty-student" />
	
	<portlet:renderURL var="viewStudentURL">
		<portlet:param name="studentId" value="<%=primKey %>" />
		<portlet:param name="jspPage" value="/html/student-public/view_student.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon image="view" message="View" url="<%=viewStudentURL.toString() %>" />
	
</liferay-ui:icon-menu>