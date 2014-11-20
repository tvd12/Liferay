<%@ include file="/init.jsp"%>

<%
	TYStudent student = SessionUtil.get(session.getId());
	student.setFullName(student.getStudentFirstName() + " " +  student.getStudentLastName());
	session.setAttribute(WebKeys.TY_STUDENT, student);
%>
<liferay-ui:success key="login-success" message="login-success" />
<liferay-ui:message key="hello-s" arguments="<%=student.getFullName() %>" />

<portlet:actionURL name="logout" var="logoutURL">
	<portlet:param name="sessionId" value="<%=session.getId() %>" />
</portlet:actionURL>
<aui:a href="<%=logoutURL.toString() %>"><liferay-ui:message key="logout" /></aui:a>