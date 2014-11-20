<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass tyClass = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	String primKey = String.valueOf(tyClass.getPrimaryKey());
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	
%>

<liferay-ui:icon-menu>
	
	<portlet:renderURL var="addPointURL" >
		<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
		<portlet:param name="classId" value="<%=primKey %>" />
		<portlet:param name="jspPage" value="/html/student-point/type_point.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon image="add" message="type-point" url="<%=addPointURL.toString() %>" />
	
</liferay-ui:icon-menu>