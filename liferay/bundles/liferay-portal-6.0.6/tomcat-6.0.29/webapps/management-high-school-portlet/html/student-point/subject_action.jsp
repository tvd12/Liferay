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
	
	<portlet:renderURL var="selectClassURL" >
		<portlet:param name="subjectId" value="<%=primKey %>" />
		<portlet:param name="jspPage" value="/html/student-point/select_class.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon image="add_location" message="select-class" url="<%=selectClassURL.toString() %>" />
	
</liferay-ui:icon-menu>