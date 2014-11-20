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

<portlet:actionURL name="updateSubject" var="updateSubjectURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(subject.getSubjectId()) %>" />
</portlet:actionURL>

<aui:form action="<%=updateSubjectURL.toString() %>" name="fm" method="post">
	<aui:fieldset>
		<aui:input name="subjectCode" value="<%=subject.getSubjectCode() %>" helpMessage="accept-null" />
		<liferay-ui:error key="subject-name-required" message="subject-name-required" />
		<aui:input name="subjectName" value="<%=subject.getSubjectName() %>" />
		<aui:input name="description" type="textarea" value="<%=subject.getDescription() %>" />
		<aui:button-row>
			<aui:button type="submit" value="save" />
			<aui:button type="cancel" value="Cancel" onClick="<%=backURL.toString() %>" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>