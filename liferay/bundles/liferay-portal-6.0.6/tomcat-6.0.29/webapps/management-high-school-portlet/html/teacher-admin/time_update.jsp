<%@ include file="/init.jsp" %>

<%
	TVDDate date = TYServiceUtil.getCurrentDate();
	int year = TYServiceUtil.getCurrentCourse();
	TVDDate o = new TVDDate(1, 6, year);
 %>

<portlet:actionURL name="unlockTime" var="unlockTimeURL">
	
</portlet:actionURL>

<aui:form action="<%=unlockTimeURL.toString() %>" method="post" name="fm" >
	<aui:select name="semesterId" label="semester">
		<aui:option value="1"><liferay-ui:message key="semester-x" arguments="<%=1 %>" /></aui:option>
		<c:if test="<%=date.compareTo(o) < 0 %>">
			<aui:option value="2"><liferay-ui:message key="semester-x" arguments="<%=2 %>" /></aui:option>
		</c:if>
		<aui:button-row>
			<aui:button type="submit" value="Start" name="start" />
		</aui:button-row>
	</aui:select>
</aui:form>