<%@ include file="/init.jsp" %>

<%
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/subject-admin/view.jsp" />
</portlet:renderURL>

<%
	String title = LanguageUtil.format(pageContext, "info-subject", "");
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<liferay-ui:header title="<%=title %>" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<p><liferay-ui:message key="subject-code" />: <c:out value="<%=subject.getSubjectCode() %>" />
<p><liferay-ui:message key="subject-name" />: <c:out value="<%=subject.getSubjectName() %>" />
<p><liferay-ui:message key="description" />: <c:out value="<%=subject.getDescription() %>" />