<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYSubject subject = (TYSubject)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYSubject.class.getName();
	String primKey = String.valueOf(subject.getPrimaryKey());
%>

<liferay-ui:icon-menu>

	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.PERMISSIONS) %>">
		<portlet:renderURL var="permissionClassURL" windowState="maximized">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/subject-admin/permission.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="permissions" message="assign-roles" url="<%=permissionClassURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editSubjectURL" >
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/subject-admin/edit.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message="Edit" url="<%=editSubjectURL.toString() %>" />
		
		<portlet:renderURL var="updateFactorURL">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/subject-admin/update_factor.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="manage_task" message="update-factor" url="<%=updateFactorURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.DELETE) %>">
		<portlet:actionURL name="deleteSubject" var="deleteSubjectURL">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="delete" message="Delete" url="<%=deleteSubjectURL.toString() %>" />
	</c:if>
	
	<c:if test="<%=permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.VIEW) %>">
		<portlet:renderURL  var="viewSubjectURL">
			<portlet:param name="resourcePrimKey" value="<%=primKey %>" />
			<portlet:param name="jspPage" value="/html/subject-admin/view_subject.jsp" />
		</portlet:renderURL>
		<liferay-ui:icon image="view" message="View" url="<%=viewSubjectURL.toString() %>" />
	</c:if>
	
</liferay-ui:icon-menu>