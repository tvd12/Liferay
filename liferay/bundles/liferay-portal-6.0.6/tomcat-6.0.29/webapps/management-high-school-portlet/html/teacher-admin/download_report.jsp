<%@ include file="/init.jsp" %>
<style>
<!--
h3 {
	font-size: 2em;
	font-weight: bold;
}
-->
</style>
<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	String filePath = application.getRealPath("/pdf");
	
	Report report = new Report();
	report.setFilePath(filePath);
	
	int courses = TYServiceUtil.getCurrentCourse();
	
	List<TYSubjectClassUserRole> subjectsClasses = ActionUtil.getSubjectsClassesByUserRole(
			courses, user.getUserId(), RoleKeys.TYPE_POINT);
	
	String cellTitles[] = new String[7];
	
	cellTitles[0] = LanguageUtil.format(pageContext, "index", "");
	cellTitles[1] = LanguageUtil.format(pageContext, "student", "");
	cellTitles[2] = LanguageUtil.format(pageContext, "point-speak", "");
	cellTitles[3] = LanguageUtil.format(pageContext, "point-15", "");
	cellTitles[4] = LanguageUtil.format(pageContext, "point-45", "");
	cellTitles[5] = LanguageUtil.format(pageContext, "point-90", "");
	cellTitles[6] = LanguageUtil.format(pageContext, "avg-point", "");
	
	report.setCellTitles(cellTitles);
	report.setTeacher(user);
	
	int semester = 1;
	
	report.setCourses(courses);
	report.setSemester(semester);
	
	String createdBy = LanguageUtil.format(pageContext, "created-by", user.getFullName());
	report.setCreatedBy(createdBy);
	
	int size = subjectsClasses.size();
	
	String fileNames[] = new String[size];
	TYClass[] tyClasses = new TYClass[size];
	TYSubject[] subjects = new TYSubject[size];
	
	int i = 0;
	for(i = 0 ; i < size ; i++) {
		TYClass tyClass = ActionUtil.getClassById(subjectsClasses.get(i).getClassId(), groupId, companyId);
		TYSubject subject = ActionUtil.getSubjectById(subjectsClasses.get(i).getSubjectId());
		
		report.setTyClass(tyClass);
		report.setTySubject(subject);
		
		tyClasses[i] = tyClass;
		subjects[i] = subject;
		
		tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
		
		
		String courseString = (courses - 1) + "-" + courses;
		String[] args = {String.valueOf(semester), courseString, 
				subject.getSubjectName(), tyClass.getClassFullName()};
		report.setTableTitle(LanguageUtil.format(pageContext, 
				"point-table-semester-courses-subject-class", args));
		
		String fileName = courses + "" + semester + "" + subject.getSubjectId() + 
				"" + tyClass.getClassId() + "" + user.getUserId() + ".pdf";
		report.setFileName(fileName);
		
		fileNames[i] = fileName;
		
		report.createFile(1);
	}
	
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
%>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />	

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<br />	

<c:if test="<%=size > 0 %>">
<table>
  <tr style="font-size: 12px; font-weight: bold; height: 50px">
   	<td width="200px"><liferay-ui:message key="class" /></td>
   	<td width="200px"><liferay-ui:message key="subject" /></td>
   	<td width="200px"><liferay-ui:message key="download" /></td>
  </tr>
  <%i = 0; %>
  <c:forEach begin="0" end="<%=size - 1 %>">
  	<%
  		
  	%>
	  <tr>
	    <td><c:out value="<%=tyClasses[i].getClassFullName() %>" /></td>
	    <td><c:out value="<%=subjects[i].getSubjectName() %>" /></td>
	    <td><a href='<%=contextPathImg + "/pdf/" + fileNames[i]%>'>Download</a></td>
	  </tr>
	 <%i++; %>
  </c:forEach>
</table>
</c:if>