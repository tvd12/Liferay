<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYSubject subject = (TYSubject)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYSubject.class.getName();
	String primKey = String.valueOf(subject.getPrimaryKey());
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="selectClassURL" >
			<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
			<portlet:param name="subjectId" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/teacher-class/select_class.jsp" />
			<portlet:param name="jspPage" value="/html/teacher-class/class_action.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="add_location" message="select-class" url="<%=selectClassURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>