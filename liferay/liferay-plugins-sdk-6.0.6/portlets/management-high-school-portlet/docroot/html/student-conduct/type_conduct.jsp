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
	long classId = tyClass.getClassId();
	long userId = user.getUserId();
	int status = ActionUtil.getStatusByClassUserRole(courses, 
			classId, userId, RoleKeys.MANAGEMENT);
%>

<c:if test="<%=status > 0 %>">

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {teacher.getFullName(), tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-conduct-class", args);
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
	<portlet:actionURL name="addStudentConducts" var="addStudentConductsURL">
		<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>"/>
	</portlet:actionURL>
	<aui:form action="<%=addStudentConductsURL.toString() %>" method="post" name="fm">
		<table class="student-point-table">
			<tr class="student-point-table-fist-row">
				<td width="50px"><liferay-ui:message key="index" /></td>
				<td width="200"><liferay-ui:message key="student" /></td>
				<td width="200"><liferay-ui:message key="conduct" /></td>
			</tr>
			
			<tr height="5px">
				<td width="50px"></td>
				<td width="200"></td>
				<td width="200"></td>
			</tr>
			
			<c:forEach begin="0" end="<%=size - 1 %>">
				<%
					TYStudent student = students.get(i);
					String selectName = "conduct" + i;
					String studentIdx = "studentId" + i;
				%>
				<tr>
					<td><c:out value="<%=(i + 1) %>" /></td>
					<aui:input name="<%=studentIdx %>" value="<%=student.getStudentId() %>" type="hidden" />
					<td  width="200"><c:out value='<%=student.getStudentFirstName() + " " + student.getStudentLastName() %>' /></td>
					<td  width="200"><aui:select name="<%=selectName %>" label=" " >
						<aui:option value="1"><liferay-ui:message key="good" /></aui:option>
						<aui:option value="2"><liferay-ui:message key="quite" /></aui:option>
						<aui:option value="3"><liferay-ui:message key="mean" /></aui:option>
						<aui:option value="4"><liferay-ui:message key="weak" /></aui:option>
					</aui:select>
					</td>
				</tr>
				<%i++; %>
			</c:forEach>
		</table>
		<aui:button-row>	
			<aui:button name="Save" type="submit" />
			<aui:button name="cancel" type="cancel" />
		</aui:button-row>
	</aui:form>
	
<script type="text/javascript">

AUI().ready("aui-node", "Node", function(A) {
	A.one("input#<portlet:namespace />cancel").on("click", function() {
		document.location = "<%=backURL.toString()%>";
	});
});

</script>
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

</c:if>

<c:if test="<%=status == 0 %>">
	<font color="red"><liferay-ui:message key="cannot-type-conducts" /></font>
</c:if>


