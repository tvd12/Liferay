<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	SubjectClassUserRoleTemp scurt = (SubjectClassUserRoleTemp)row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:actionURL name="deleteTypePointRoleAction" var="deleteTypePointRoleActionURL">
		<portlet:param name="subjectId" value="<%=String.valueOf(scurt.getSubjectId()) %>" />
		<portlet:param name="classId" value="<%=String.valueOf(scurt.getClassId()) %>" />
		<portlet:param name="teacherId" value="<%=String.valueOf(scurt.getUserId())%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message="recovery" url="<%=deleteTypePointRoleActionURL.toString() %>" />
</liferay-ui:icon-menu>