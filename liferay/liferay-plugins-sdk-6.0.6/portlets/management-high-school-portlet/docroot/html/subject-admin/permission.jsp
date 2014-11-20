<%@ include file="/init.jsp" %>

<style>

.begin {
	background:blue;
}

.end {
	background-color: #6C6;
}

</style>

<script type="text/javascript">

AUI().ready('aui-dialog',"node", "aui-component", "Anim", "aui-drawing", function(A){
	A.one("form#<portlet:namespace />fm select#<portlet:namespace />semester").on("change", function() {
		var selectTmp = A.one("form#<portlet:namespace />fm select#<portlet:namespace />semester option:selected");
		var divShowSemester=A.one("div#show-semester");  
		divShowSemester.html('<p>' + selectTmp.text() + '</p>');
		var aniSemester = new A.Anim({
			node:divShowSemester,
			duration: 3,
			from:{width: '50px', height: '19px', fontSize: '1em', backgroundColor: 'blue'},
			to:{left: '750px', width: '110px', height: '30px', fontSize: '2em', backgroundColor: 'blue'}
		});
		aniSemester.run();
	});
});

</script>

<div id="show-semester" style="position:absolute; text-align: center; line-height: 25px">
</div>

<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String themeContext = themeDisplay.getPathThemeImages();
%>

<a href="<%= themeContext + "/file_system/large/folder_full_document.png"%>">click me</a>
<c:out value="<%=themeContext %>" />

<aui:form>
	<aui:select name="semester">
		<aui:option value="1">hk1</aui:option>
		<aui:option value="2">hk2</aui:option>
	</aui:select>
</aui:form>

<%
	String path = application.getRealPath("/pdf");
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = 1;
	float from = 0;
	float to = 10;
	long classId = 1;
	List<TYStudentPoint> studentspoints = TYServiceUtil.getStudentsPointsByC_S(2013, 1, 
			companyId, groupId, (float)8.0, (float)10.0);
	studentspoints = TYServiceUtil.getStudentsPointByC_S_Class(courses, semester, 
			companyId, groupId, classId, from, to);
	
	int countStudentspoints = TYServiceUtil.countStudentsPointsByC_S(2013, 1,
			companyId, groupId, (float)8.0, (float)10.0);
	countStudentspoints = TYServiceUtil.countStudentsPointsByC_S_Class(
			courses, semester, companyId, groupId, classId, from, to);
	
	int i = 0;
%>

<c:out value='<%="count: " + countStudentspoints%>' />

<c:forEach begin="0" end="<%=studentspoints.size() - 1 %>">
	<%
		TYStudent student = TYServiceUtil.getStudentById(studentspoints.get(i).getStudentId());
		student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());
		float point = (float)studentspoints.get(i).getPoint();
		
	%>
	<c:out value="<%=student.getFullName() %>" /> <c:out value="<%=point %>" />
	<br />
	<%i++; %>
</c:forEach>

