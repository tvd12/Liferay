<%@ include file="/init.jsp"%>

<portlet:renderURL var="loginURL">
	<portlet:param name="jspPage" value="/html/student-login/init.jsp" />
</portlet:renderURL>

<%
	TYStudent student = (TYStudent)request.getAttribute(WebKeys.TY_STUDENT);
	if(student != null && student.getStudentId() != 0) {
		session.setAttribute(WebKeys.TY_STUDENT, student);
	}
	int endSession = (Integer)request.getAttribute("endSession");
	if(endSession > 0) {
		session.removeAttribute(WebKeys.TY_STUDENT);
		response.sendRedirect(loginURL.toString());
	}
%>