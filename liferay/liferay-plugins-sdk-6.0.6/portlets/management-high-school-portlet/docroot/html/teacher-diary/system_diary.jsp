<%@ include file="/init.jsp"%>

<style>
<!--
table#table-system-message tr:hover {
	background-color: #F69;
	font-weight: bold;
}
-->
</style>

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	List<TYMessages> messages = ActionUtil.getMessagesByC_G(companyId, groupId);
	
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	int courses = TYServiceUtil.getCurrentCourse();
	
	String semsterStr = LanguageUtil.format(pageContext, "semester-x", String.valueOf(semester));
	
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	int i = 0;
%>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString%>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester%>" /></label>
	</font></h3>
</div>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "system-diary");
%>
<div id="div-header-tvd-custom"><liferay-ui:header title='<%=title%>' /></div>	

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<c:if test="<%=messages != null && messages.size() > 0 %>">

<table id="table-system-message">

<c:forEach begin="1" end="<%=messages.size() %>">
<tr>
	<td width="30px"><c:out value="<%=i + 1 %>" /></td>
	<td width="200px"><c:out value="<%=ConvertorUtil.getString(messages.get(i).getHappenDate()) %>" /></td>
	<td>
		<%
			long userId = messages.get(i).getUserId();
			long actionId = messages.get(i).getActionId();
			long classId = messages.get(i).getClassId();
			long subjectId = messages.get(i).getSubjectId();
			
			User teacher = ActionUtil.getUserById(userId);
			TYClass tyClass = ActionUtil.getTYClassById(classId);
			TYSubject subject = null;
			if(subjectId > 0) {
				subject = ActionUtil.getSubjectById(subjectId);
			} 
			
			String message = new String();
			message = LanguageUtil.format(pageContext, "teacher-x", teacher.getFullName());
			message += " " + LanguageUtil.get(pageContext, "had");
			message += " " + LanguageUtil.get(pageContext, ConvertorUtil.getString(actionId));
			
			if(subjectId > 0) {
				message += " " + LanguageUtil.format(pageContext, "subject-x", subject.getSubjectName()); 
			}
			
			if(tyClass != null) {
				message += " " + LanguageUtil.format(pageContext, "class-x", tyClass.getClassFullName());
			}
		%>
		<c:out value='<%=message%>' />
	</td>
</tr>
<%i++; %>
</c:forEach>

</table>
</c:if>