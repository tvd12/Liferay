<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
%>


<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {user.getFullName(), 
		subject.getSubjectName(), tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-view-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<liferay-ui:success key="add-points-success" message="add-points-success" />

<portlet:renderURL var="backURL">
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="jspPage" value="/html/student-point/type_point.jsp" />
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

<liferay-ui:success key="update-success" message="update-success" />

<c:if test="<%=size == 0 %>">
	<liferay-ui:icon image="activate" message="there-are-no-student" />
</c:if>
<c:if test="<%=size > 0 %>">
	<table class="student-point-table" id="point-table" >
		<tr height="50px" class="student-point-table-fist-row">
			<td width="50px"><liferay-ui:message key="index" /></td>
			<td width="200px"><liferay-ui:message key="student" /></td>
			<td width="200px">
				<liferay-ui:message key="point-speak" />
				<portlet:renderURL var="editStudentsPointsByFactorURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="pointType" value="2" />
					<portlet:param name="pointFactor" value="1" />
					<portlet:param name="jspPage" value="/html/student-point/edit_students_points.jsp" />
				</portlet:renderURL>
				<liferay-ui:icon image="edit" url="<%=editStudentsPointsByFactorURL.toString() %>" />
			</td>
			<td width="200px">
				<liferay-ui:message key="point-15" />
				<portlet:renderURL var="editStudentsPoints15ByFactorURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="pointType" value="1" />
					<portlet:param name="pointFactor" value="1" />
					<portlet:param name="jspPage" value="/html/student-point/edit_students_points.jsp" />
				</portlet:renderURL>
				<liferay-ui:icon image="edit" url="<%=editStudentsPoints15ByFactorURL.toString() %>" />
			</td>
			<td width="200px">
				<liferay-ui:message key="point-45" />
				<portlet:renderURL var="editStudentsPoints45ByFactorURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="pointType" value="1" />
					<portlet:param name="pointFactor" value="2" />
					<portlet:param name="jspPage" value="/html/student-point/edit_students_points.jsp" />
				</portlet:renderURL>
				<liferay-ui:icon image="edit" url="<%=editStudentsPoints45ByFactorURL.toString() %>" />
			</td>
			<td width="200px">
				<liferay-ui:message key="point-90" />
				<portlet:renderURL var="editStudentsPoints90ByFactorURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="pointType" value="1" />
					<portlet:param name="pointFactor" value="3" />
					<portlet:param name="jspPage" value="/html/student-point/edit_students_points.jsp" />
				</portlet:renderURL>
				<liferay-ui:icon image="edit" url="<%=editStudentsPoints90ByFactorURL.toString() %>" />
			</td>
			<td width="100px">
				<liferay-ui:message key="Edit" />
			</td>
		</tr>
		<c:forEach begin="0" end="<%=size - 1 %>">
			<%
				TYStudent student = students.get(i);
			%>
			<tr height="25px">
				<td width="50"><c:out value="<%=i + 1 %>" /></td>
				<td  width="200"><c:out value='<%=student.getStudentFirstName() + " " + student.getStudentLastName() %>' /></td>
				<%
					float points[] = null;
					String pointString = null;
				%>
				<td width="200">
					<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
							semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.SPEAK_POINT, 1);
						pointString = TYServiceUtil.floatsToPointString(points);
					%>
					<c:out value="<%=pointString %>" />
				</td>
				
				<td width="200px">
					<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 1);
						pointString = TYServiceUtil.floatsToPointString(points);
					%>
					<c:out value="<%=pointString %>" />
				</td>
				
				<td width="200px">
					<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 2);
						pointString = TYServiceUtil.floatsToPointString(points);
					%>
					<c:out value="<%=pointString %>" />
				</td>
				<td width="200px">
					<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								1, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 3);
						if(points == null) {
							pointString = LanguageUtil.format(pageContext, "unknown", "");
						} else {
							pointString = TYServiceUtil.floatsToPointString(points);
						}
					%>
					<c:out value="<%=pointString %>" />
				</td>
				<portlet:renderURL var="updateStudentPointJSPURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="studentId" value="<%=String.valueOf(student.getStudentId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="jspPage" value="/html/student-point/update_student_point.jsp" />
				</portlet:renderURL>
				<td width="100px">
					<liferay-ui:icon image="edit" url="<%=updateStudentPointJSPURL.toString() %>" />
					<liferay-ui:message key="Edit" />
				</td>
			</tr>
			<%i++; %>
		</c:forEach>
	</table>
</c:if>

<%i = 0; %>

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

<script type="text/javascript">
/*
AUI().ready('aui-dialog',"node", function(A){
	A.one("table").on("click", function() {
		var images = A.all("table#point-table img[title='Edit']");
		var trs = A.all("table#point-table tr");
		images.each(function(value, index) {
			images.item(index).on("click", function() {
				alert(trs.get(index+1).text());
			});
		});
	});
});
*/

</script>

