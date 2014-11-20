<%@page import="org.tvd.thptty.management.temporary.Count"%>
<%@page import="org.tvd.exel.model.TVDCell"%>
<%@page import="org.tvd.exel.model.TVDRow"%>
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
	
	div#div-id-statistics-sides {
		margin-top: 20px;
	}
</style>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/statistics-public/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "Educational-statistics-sides");
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	int semester = (Integer)request.getAttribute(WebKeys.TY_SEMESTER);
	String semesterKey = LanguageUtil.format(pageContext, "semester-y", semester);
	if(semester > 2) {
		semesterKey = LanguageUtil.get(pageContext, "full-semester");
	}
	
	List<TVDRow> rows = new ArrayList<TVDRow>();
	List<TVDCell> cells = new ArrayList<TVDCell>();
	
	String filePath = application.getRealPath("/pdf");
	String fileName = "report_" + ConvertorUtil.getDateString(new Date()) + Count.COUNT++ + ".pdf";
	
	Report report = new Report();
	report.setFilePath(filePath + "/statistics");
	report.setFileName(fileName);
	
	String cellTitles[] = new String[23];
	
	cellTitles[0] = LanguageUtil.get(pageContext, "index");
	cellTitles[1] = LanguageUtil.get(pageContext, "class");
	cellTitles[2] = LanguageUtil.get(pageContext, "Amount");
	cellTitles[3] = LanguageUtil.get(pageContext, "capacity-learning");
	cellTitles[4] = LanguageUtil.get(pageContext, "conduct");
	cellTitles[5] = LanguageUtil.get(pageContext, "Excellent");
	cellTitles[6] = LanguageUtil.get(pageContext, "Quite");
	cellTitles[7] = LanguageUtil.get(pageContext, "Mean");
	cellTitles[8] = LanguageUtil.get(pageContext, "Good");
	cellTitles[9] = LanguageUtil.get(pageContext, "Quite");
	cellTitles[10] = LanguageUtil.get(pageContext, "Mean");
	for(int x = 0 ; x < 12 ; x++) {
		if(x % 2 == 0) {
			cellTitles[11 + x] = LanguageUtil.get(pageContext, "Amount");
		} else {
			cellTitles[11 + x] = LanguageUtil.get(pageContext, "%");
		}
	}
	report.setCellTitles(cellTitles);
	
	report.setTableTitle(LanguageUtil.format(pageContext, 
			"Educational-statistics-sides", ""));
	report.setTitle("Statistics");
	
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	
%>

<div id="id-addstudent-div" style="background-color: #CCCCCC; margin-top: 5px; margin-bottom: 15px; line-height: 25px; 
		color: blue; font-size: 16px; font-weight: bold;">
	<a style="text-decoration: none; cursor: pointer;" id="a-id-down-rep-st">
		<liferay-ui:icon image="tvd_download" /><liferay-ui:message key="download-report" />
	</a>
</div>

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
 
<div id="div-id-statistics-sides" align="center">
	<table border="1" class="table-id-statistics">
		<tr>
			<th rowspan="3" width="50px"><liferay-ui:message key="index" /></th>
			<th rowspan="3" width="50px"><liferay-ui:message key="class" /></th>
			<th rowspan="3" width="50px"><liferay-ui:message key="Amount" /></th>
			<th colspan="6" width="360px"><liferay-ui:message key="capacity-learning" /></th>
			<th colspan="6" width="360px"><liferay-ui:message key="conduct" /></th>
		</tr>
	
		<tr>
			<th width="120px" colspan="2"><liferay-ui:message key="Excellent" /></th>
			<th width="120px" colspan="2"><liferay-ui:message key="Quite" /></th>
			<th width="120px" colspan="2"><liferay-ui:message key="Mean" /></th>
			<th width="120px" colspan="2"><liferay-ui:message key="Good" /></th>
			<th width="120px" colspan="2"><liferay-ui:message key="Quite" /></th>
			<th width="120px" colspan="2"><liferay-ui:message key="Mean" /></th>
		</tr>
		<tr>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
			<th width="60px"><liferay-ui:message key="Amount" /></th>
			<th width="60px"><liferay-ui:message key="%" /></th>
		</tr>
		
		<%
			long companyId = themeDisplay.getCompanyId();
			long groupId = themeDisplay.getScopeGroupId();
			List<TYClass> classes = ActionUtil.getClassesByGroup(companyId, groupId, 10);
			int i = 0;
		%>
		<c:if test="<%=classes != null && classes.size() > 0 %>">
		
		<c:forEach begin="1" end="<%=classes.size() %>">
		
		<%
			TYClass tyClass = classes.get(i);
			long classId = tyClass.getClassId();
			List<TYStudent> classStudents = ActionUtil.getStudentsInClass(
				courses, tyClass.getClassId());
			int amoutStudent = 0;
			if(classStudents != null) {
					amoutStudent = classStudents.size();
			}
				
			int  countTotalPoints = 0;
			int  countGoodPoints = 0;
			int  countQuitePoints = 0;
			int  countMeanPoints = 0;
			
			int semesterConduct  = semester;
			
			if(semester == 3) {
				countTotalPoints = TYServiceUtil.countStudentsPointsByCourse_Class(
						courses, semester, companyId, groupId, classId, 0, (float)10.1);
						
				countGoodPoints = TYServiceUtil.countStudentsPointsByCourse_Class(
						courses, semester, companyId, groupId, classId, 8, (float)10.1);
						
				countQuitePoints = TYServiceUtil.countStudentsPointsByCourse_Class(
						courses, semester, companyId, groupId, classId, (float)6.5, 8);
						
				countMeanPoints = TYServiceUtil.countStudentsPointsByCourse_Class(
						courses, semester, companyId, groupId, classId, (float)3.5, (float)6.5);
				
				semesterConduct = 2;
			} else {
					countTotalPoints = TYServiceUtil.countStudentsPointsByC_S_Class(
						courses, semester, companyId, groupId, classId, 0, (float)10.1);
						
					countGoodPoints = TYServiceUtil.countStudentsPointsByC_S_Class(
						courses, semester, companyId, groupId, classId, 8, (float)10.1);
						
					countQuitePoints = TYServiceUtil.countStudentsPointsByC_S_Class(
						courses, semester, companyId, groupId, classId, (float)6.5, 8);
						
					countMeanPoints = TYServiceUtil.countStudentsPointsByC_S_Class(
						courses, semester, companyId, groupId, classId, (float)3.5, (float)6.5);
			}
				
			double percentGoodPoints = ((countGoodPoints * 1.0)/countTotalPoints) * 100;
				
			double percentQuitePoints = ((countQuitePoints * 1.0)/countTotalPoints) * 100;
				
			double percentMeanPoints = ((countMeanPoints * 1.0)/countTotalPoints) * 100;
			
			int countGoodConduct = TYServiceUtil.countStudentsConductByS_C_C(
					courses, semesterConduct, companyId, groupId, 1, classId);
			int countQuiteConduct = TYServiceUtil.countStudentsConductByS_C_C(
					courses, semesterConduct, companyId, groupId, 2, classId);
			int countMeanConduct = TYServiceUtil.countStudentsConductByS_C_C(
					courses, semesterConduct, companyId, groupId, 3, classId);
			int countWeakConduct = TYServiceUtil.countStudentsConductByS_C_C(
					courses, semester, companyId, groupId, 4, classId);
			
			int totalCountConduct = countGoodConduct + countQuiteConduct + 
					countMeanConduct + countWeakConduct;
			
			double percentGoodConduct = ((countGoodConduct * 1.0)/totalCountConduct) * 100;
			
			double percentQuiteConduct = ((countQuiteConduct * 1.0)/totalCountConduct) * 100;
			
			double percentMeanConduct = ((countMeanConduct * 1.0)/totalCountConduct) * 100;
			
		%>
		
		<c:if test="<%=countTotalPoints > 0 %>">
		
		<tr>
			<td><c:out value="<%=i + 1 %>" /></td>
			
			<td><c:out value="<%=tyClass.getClassFullName() %>" /></td>
			<td><c:out value="<%=amoutStudent %>" /></td>
		
			<td><c:out value='<%=countGoodPoints %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentGoodPoints, 2) + "%" %>' /></td>
			<td><c:out value='<%=countQuitePoints %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentQuitePoints, 2) + "%" %>' /></td>
			<td><c:out value='<%=countMeanPoints %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentMeanPoints, 2) + "%" %>' /></td>
			
			<td><c:out value='<%=countGoodConduct %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentGoodConduct, 2) + "%" %>' /></td>
			<td><c:out value='<%=countQuiteConduct %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentQuiteConduct, 2) + "%" %>' /></td>
			<td><c:out value='<%=countMeanConduct %>' /></td>
			<td><c:out value='<%=TYServiceUtil.getCutFloat(percentMeanConduct, 2) + "%" %>' /></td>
			
			<%i++;
				cells = new ArrayList<TVDCell>();
				cells.add(new TVDCell(String.valueOf(i)));
				cells.add(new TVDCell(tyClass.getClassFullName()));
				cells.add(new TVDCell(String.valueOf(amoutStudent)));
				cells.add(new TVDCell(String.valueOf(countGoodPoints)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentGoodPoints, 1) + "%"));
				cells.add(new TVDCell(String.valueOf(countQuitePoints)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentQuitePoints, 1) + "%"));
				cells.add(new TVDCell(String.valueOf(countMeanPoints)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentMeanPoints, 1) + "%"));
				cells.add(new TVDCell(String.valueOf(countGoodConduct)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentGoodConduct, 1) + "%"));
				cells.add(new TVDCell(String.valueOf(countQuiteConduct)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentQuiteConduct, 1) + "%"));
				cells.add(new TVDCell(String.valueOf(countMeanConduct)));
				cells.add(new TVDCell(TYServiceUtil.getCutFloat(percentMeanConduct, 1) + "%"));
				rows.add(new TVDRow(cells));
			%>
			
		</tr>
		
		</c:if>
		</c:forEach>
		</c:if>
		
		</table>
		
</div>

<%
report.setRows(rows);
report.createFile(2);
%>

<script type="text/javascript">


AUI().ready("Node", "aui-node", function(A) {
	A.one("a#a-id-down-rep-st").on("click", function() {
		this.setAttribute("href", '<%=contextPathImg + "/pdf/statistics/" + fileName%>');
	});
});

</script>