<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass tyClass = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	String primKey = String.valueOf(tyClass.getPrimaryKey());
	int pointFactor = (Integer)request.getAttribute("pointFactor");
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
		<portlet:actionURL name="addUserSubjectClassRole" var="addUserSubjectClassRoleURL" >
			<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
			<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
			<portlet:param name="classId" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/student-point/type_point.jsp" />
		</portlet:actionURL>
		<liferay-ui:icon image="add" message="select-class" url="<%=addUserSubjectClassRoleURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>