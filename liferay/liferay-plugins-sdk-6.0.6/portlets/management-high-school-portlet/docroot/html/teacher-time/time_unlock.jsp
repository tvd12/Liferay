<%@page import="org.tvd.thptty.model.Semester"%>
<%@ include file="/init.jsp" %>

<%
	TVDDate date = TYServiceUtil.getCurrentDate();
	int year = TYServiceUtil.getCurrentCourse();
	TVDDate o = new TVDDate(1, 6, year);
	TVDDate o1 = new TVDDate(15, 1, year);
	TVDDate o2 = new TVDDate(1, 7, year);
	
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	
	int currentSemes = TYServiceUtil.getCurrentSemester(companyId, groupId);
	Semester semester = TYServiceUtil.getSemesterByC_G_Status(
			companyId, groupId, 2);
	int semesterId = 0;
	if(semester != null) {
		semesterId = semester.getSemesterId();
	} else {
		semesterId = 1;
	}
 %>
 
<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "unlock-time");
%>
<liferay-ui:header title="<%=title %>" />	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<portlet:actionURL name="unlockTime" var="unlockTimeURL" />
<portlet:actionURL name="updateNewCourse" var="updateNewCourseURL" />
<table>
<tr>

<aui:form action="<%=unlockTimeURL.toString() %>" method="post" name="fm" >
	<td>
		<aui:select name="semesterId" label="semester">
			<aui:option value="<%=semesterId %>">
				<liferay-ui:message key="semester-x" arguments="<%=semesterId %>" />
			</aui:option>
		</aui:select>
	</td>
	<td>
		<aui:button-row>
			<aui:button type="submit" value="Unlock" name="unlock" />
		</aui:button-row>
	</td>
	
</aui:form>

</tr>

<tr>

<%
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>

<aui:form action="<%=updateNewCourseURL.toString() %>" method="post" name="fm1" >
	<td>
		<aui:select name="courses" label="courses">
			<aui:option value="1"><c:out value="<%=courseString %>" /></aui:option>
		</aui:select>
	</td>
	<td>
		<aui:button-row>
			<aui:button type="submit" value="Unlock" name="unlock" />
		</aui:button-row>
	</td>
	
</aui:form>

</tr>
</table>