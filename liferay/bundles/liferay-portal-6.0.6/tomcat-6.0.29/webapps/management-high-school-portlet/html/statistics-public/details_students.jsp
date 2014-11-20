<%@ include file="/init.jsp"%>

<style type="text/css"> 
	table.table-id-statistics {
		border-color: black;
		border-collapse: collapse;
		border-style: solid;
		border-width: 2px;
	}
	
	table.table-id-statistics th, td {
		text-align: center;
		vertical-align: middle;
	}
	
	table.table-id-statistics tr, th, td {
		border-color: black;
		border-width: 1px;
		border-style: solid;
	} 
</style>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/statistics-public/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "Details-statistics");
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	int semester = (Integer)request.getAttribute(WebKeys.TY_SEMESTER);
	String semesterKey = LanguageUtil.format(pageContext, "semester-y", semester);
	if(semester > 2) {
		semesterKey = LanguageUtil.get(pageContext, "full-semester");
	}
%>

<div align="center">
	<h3>
		<font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="<%=semesterKey %>" /></label>
		</font>
	</h3>
</div>
<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<%
	String[] cellTitles = {
		"id", "class-group", "select-h", "ML", "TTL", "full-name", 
		"class"
	};

	cellTitles = ConvertorUtil.getStringsByKeys(pageContext, cellTitles);
	
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	List<TYSubject> subjects = ActionUtil.getAllSubjects(companyId, groupId);
%>

<table id="table-id-statistics">

<tr>
	<td><c:out value="<%=cellTitles[0] %>" /></td>
	<td><c:out value="<%=cellTitles[1] %>" /></td>
	<td><c:out value="<%=cellTitles[2] %>" /></td>
	<td><c:out value="<%=cellTitles[3] %>" /></td>
	<td><c:out value="<%=cellTitles[4] %>" /></td>
	<td><c:out value="<%=cellTitles[5] %>" /></td>
	<td><c:out value="<%=cellTitles[6] %>" /></td>
	
	<%int i = 0; %>
	<c:if test="<%=subjects != null && subjects.size() > 0 %>">
		<c:forEach begin="1" end="<%=subjects.size() %>">
			<td><c:out value="<%=subjects.get(i).getSubjectName() %>" /></td>
			<%i++; %>
		</c:forEach>
	</c:if>
	<td><liferay-ui:message key="TBHK-x" /></td>
	<td><liferay-ui:message key="HL" /></td>
	<td><liferay-ui:message key="HK" /></td>
	<td><liferay-ui:message key="TK" /></td>
</tr>

<%
	int c = 0;
	int sum = 0;
	List<TYClass> classes = ActionUtil.getAllClassFromSchool(companyId, groupId);
%>
<c:if test="<%=classes != null && classes.size() > 0 %>">
	
<c:forEach begin="1" end="<%=classes.size() %>">
	<%
		TYClass tyClass = classes.get(c);
		long classId = tyClass.getClassId();
		List<TYStudent> students = ActionUtil.getStudentsInClass(courses, classId);
		int r = 0;
	%>
	<c:if test="<%=students != null && students.size() > 0 %>">
	
	<%int s = 0; %>	
	<c:forEach begin="1" end="<%=students.size() %>">
	<%
		TYStudent student = students.get(s);
	%>
		
	<tr>
		
		<td><c:out value="<%=sum + 1%>" /></td>
		<td><c:out value="<%=tyClass.getClassGroup() %>" />
		<td><c:out value="<%=student.getStudentGroup1() %>" /></td>
		<td><c:out value="<%=tyClass.getClassCode() %>" /></td>
		<td><c:out value="<%=r + 1 %>"></c:out></td>	
		<td><c:out value="<%=student.getFullName() %>" /></td>
		<td><c:out value="<%=tyClass.getClassFullName() %>" /></td>
			
		<%i = 0; %>
		<c:if test="<%=subjects != null && subjects.size() > 0 %>">
			<c:forEach begin="1" end="<%=subjects.size() %>">
				<td><c:out value="8" /></td>
				<%i++; %>
			</c:forEach>
		</c:if>
		<td><liferay-ui:message key="TBHK-x" /></td>
		<td><liferay-ui:message key="HL" /></td>
		<td><liferay-ui:message key="HK" /></td>
		<td><liferay-ui:message key="TK" /></td>
		<%sum++; s++;%>
			
	</tr>
		
	</c:forEach>
		
	</c:if>
	<%c++; %>
</c:forEach>	
</c:if>

</table>