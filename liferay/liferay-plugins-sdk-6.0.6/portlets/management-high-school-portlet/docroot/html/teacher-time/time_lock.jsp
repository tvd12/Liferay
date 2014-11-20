<%@ include file="/init.jsp" %>
 
<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int semesterId = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	int course = TYServiceUtil.getCurrentCourse();
	
	int statusClassUserRole = ActionUtil.getStatusOfClassUserRole(course, companyId, groupId);
	
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "lock-time");
%>
<liferay-ui:header title="<%=title %>" />	

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<portlet:actionURL name="lockTime" var="lockTimeURL" />

<portlet:actionURL name="lockActions" var="lockActionsURL" />

<portlet:actionURL name="lockTime" var="momentLockTimeURL">
	<portlet:param name="moment" value="2" />
</portlet:actionURL>

<c:if test="<%=semesterId != 0 %>">
<aui:form action="<%=lockTimeURL.toString() %>" method="post" name="fm" >
	<aui:select name="semesterId" label="semester">
		<aui:option value="<%=semesterId %>">
			<liferay-ui:message key="semester-x" arguments="<%=semesterId %>" />
		</aui:option>
	</aui:select>
	<aui:button-row>
		<aui:button type="button" value="monent-lock" name="moment-lock" 
			onClick="<%=momentLockTimeURL %>" />
		<aui:button type="submit" value="Lock" name="lock" />
	</aui:button-row>
	
</aui:form>
</c:if>

<c:if test="<%=statusClassUserRole == 2 %>">

<aui:form action="<%=lockActionsURL.toString() %>" method="post" name="fm1" >
	<aui:select name="actionId" label="Action">
		<aui:option value="1"><liferay-ui:message key="add-students" /></aui:option>
	</aui:select>
	<aui:button-row>
		<aui:button type="submit" value="Lock" name="lock" />
	</aui:button-row>
	
</aui:form>

</c:if>
