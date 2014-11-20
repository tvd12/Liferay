<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass tyClass = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	String primKey = String.valueOf(tyClass.getPrimaryKey());
	int courses = TYServiceUtil.getCurrentCourse();
	
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editClassURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/class-admin/edit.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message="Edit" url="<%=editClassURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.DELETE) %>">
		<portlet:actionURL name="deleteClass" var="deleteClassURL">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="delete" message="Delete" url="<%=deleteClassURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.VIEW) %>">
		<portlet:renderURL  var="viewClassURL"  windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/class-admin/view_class.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view" message="View" url="<%=viewClassURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.VIEW) %>">
		<portlet:renderURL  var="viewClassPointURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/student-point/view_subject_avg_point.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="desktop" message="view-point" url="<%=viewClassPointURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>