<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass tyClass = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	String primKey = String.valueOf(tyClass.getPrimaryKey());
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
	
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="addConductURL" >
			<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
			<portlet:param name="classId" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/student-conduct/type_conduct.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="add" message="type-conduct" url="<%=addConductURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>