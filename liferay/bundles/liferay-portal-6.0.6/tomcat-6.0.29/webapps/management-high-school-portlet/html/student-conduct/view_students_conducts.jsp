<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	
	int courses = TYServiceUtil.getCurrentCourse();
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>


<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<liferay-ui:success key="add-conduct-success" message="add-conduct-success" />

<%
	String args[] = {tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"list-student-conduct-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/teacher-admin/view_permission.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<%
	List<TYStudent> students = ActionUtil.getStudentsInClass(courses, tyClass.getClassId());
	int size = students.size();
	int i = 0;
%>

<c:if test="<%=size == 0 %>">
	<liferay-ui:icon image="activate" message="there-are-no-student" />
</c:if>
<c:if test="<%=size > 0 %>">
	<table class="student-point-table">
		<tr height="50px" class="student-point-table-fist-row">
			<td width="50px"><liferay-ui:message key="index" /></td>
			<td width="200px"><liferay-ui:message key="student" /></td>
			<td  width="200px"><liferay-ui:message key="conduct" /></td>
		</tr>
		<c:forEach begin="0" end="<%=size - 1 %>">
			<%
				TYStudent student = students.get(i);
				TYStudentConduct studentConduct = TYServiceUtil.getConductOfStudent
						(courses, semester, student.getStudentId());
			%>
			<tr height="25px">
				<td><c:out value="<%=(i + 1) %>" /></td>
				<td  width="200px"><c:out value='<%=student.getStudentFirstName() + " " + student.getStudentLastName() %>' /></td>
				<td  width="200px">
					<c:if test="<%=studentConduct.getConduct() == 1 %>"><liferay-ui:message key="good" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 2 %>"><liferay-ui:message key="quite" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 3 %>"><liferay-ui:message key="mean" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 4 %>"><liferay-ui:message key="weak" /></c:if>
				</td>
			</tr>
			<%i++; %>
		</c:forEach>
	</table>
</c:if>

<script type="text/javascript">
	AUI().ready('aui-dialog','node', function(A) {
		A.all("table.student-point-table").on("mouseover", function() {
			var trs = A.all("table.student-point-table tr");
			trs.each(function(value, index) {
				this.on("mouseover", function() {
					this.addClass("tr-mouse-over");
				});
				
				this.on("mouseout", function() {
					this.removeClass("tr-mouse-over");
				});
			});
		});
	});
</script>

