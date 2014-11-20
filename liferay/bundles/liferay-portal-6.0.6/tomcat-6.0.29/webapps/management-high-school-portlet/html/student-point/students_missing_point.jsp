<%@ include file="/init.jsp"%>

<style>
<!--
table#table-students-missing-point tr {
	height: 30px;
}

table#table-students-missing-point tr:hover {
	background-color: #F69;
	font-weight: bold;
}

table#table-students-missing-point th {
	height: 30px;
}

table#table-students-missing-point th, td {
	vertical-align: middle;
}
-->
</style>

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = ActionUtil.getMaxSemester(courses, companyId, groupId);
	
	List<TYSubjectClassUserRole> subjectClasses = TYServiceUtil.getSubjectsClassesByUserRole(
		courses, user.getUserId(), RoleKeys.TYPE_POINT);
		
	String semsterStr = LanguageUtil.format(pageContext, "semester-x", String.valueOf(semester));
	
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;	
		
	int i = 0;
	int k = 0;
	int index = 1;
	TYStudent student = null;
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
	String title = LanguageUtil.get(pageContext, "list-students-missing-point");
%>
<div id="div-header-tvd-custom"><liferay-ui:header title='<%=title%>' /></div>	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<c:if test="<%=(subjectClasses != null && subjectClasses.size() > 0)%>">

<table class="student-point-table" id="table-students-missing-point">
	<tr class="student-point-table-fist-row">
		<th width="30px"><liferay-ui:message key="index" /></th>
		<th width="100px"><liferay-ui:message key="student-id" /></th>
		<th width="180px"><liferay-ui:message key="student" /></th>
		<th width="80px"><liferay-ui:message key="class" /></th>
		<th width="180px"><liferay-ui:message key="missing-point" /></th>
		<th width="150px"><liferay-ui:message key="subject" /></th>
		<th width="180px"><liferay-ui:message key="teacher-input-point" /></th>
	</tr>
	<c:forEach begin="1" end="<%=subjectClasses.size()%>">
	<%
		long subjectId = subjectClasses.get(k).getSubjectId();
		long classId = subjectClasses.get(k).getClassId();
		
		TYSubject subject = ActionUtil.getSubjectById(subjectId);
		
		List<TYStudentPoint> studentPoints = ActionUtil.getStudentMissPointBy_C_S_S(courses, 
			semester, subjectId, classId);
	%>
	
	<c:if test="<%=studentPoints != null && studentPoints.size() > 0%>">
	
	<%
			i = 0;
		%>
	<c:forEach begin="1" end="<%=studentPoints.size()%>">
	<tr>
		<%
			student = ActionUtil.getStudentById(studentPoints.get(i).getStudentId());
		%>
		 <c:if test="<%=student != null%>">
		 	<td width="30px"><c:out value="<%=index%>" /></td>
		 	<td width="100px"><c:out value="<%=student.getStudentId()%>" /></td>
		 	<td width="180px"><c:out value="<%=student.getFullName()%>" /></td>
		 	<%
		 		TYClass classStudent = TYServiceUtil.getClassOfStudent(courses, student.getStudentId());
		 			 		int pointFactor = studentPoints.get(i).getPointFactor();
		 			int pointType = studentPoints.get(i).getPointType();
		 			String pointTypeMissing = ConvertorUtil.getString(pointFactor, pointType);
		 	%>
		 	<td width="80px"><c:out value="<%=classStudent.getClassFullName() %>" /></td>
		 	<td width="180px"><liferay-ui:message key="<%=pointTypeMissing %>" /></td>
		 	<td width="150px"><c:out value="<%=subject.getSubjectName() %>" /></td>
		 	<td width="180px"><liferay-ui:message key="me" /></td>
		 </c:if>
		 <%i++; index++; %>
	</tr>
	</c:forEach>
	
	</c:if>
	<%k++; %>
	</c:forEach>
</table>
</c:if>