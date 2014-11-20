<%@ include file="/init.jsp"%>
<%
	TYStudent student = (TYStudent)request.getAttribute(WebKeys.TY_STUDENT);	
%>
<portlet:actionURL name="answerSystemQuestion" var="answerURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(student.getStudentId()) %>" />
</portlet:actionURL>

<aui:form action="<%=answerURL.toString() %>" method="post" name="fm">
	<aui:fieldset>
		<aui:select name="question">
			<aui:option><liferay-ui:message key="question-one" /></aui:option>
			<aui:option><liferay-ui:message key="question-two" /></aui:option>
			<aui:option><liferay-ui:message key="question-three" /></aui:option>
			<aui:option><liferay-ui:message key="question-for" /></aui:option>
			<aui:option><liferay-ui:message key="question-five" /></aui:option>
		</aui:select>
		<aui:input name="answer" type="text" size="30" />
		<aui:button-row>
			<aui:button type="submit" value="Save" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>