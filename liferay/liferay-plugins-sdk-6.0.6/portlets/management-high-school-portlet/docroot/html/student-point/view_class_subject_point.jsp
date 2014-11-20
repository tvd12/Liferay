<%@include file="/init.jsp"  %>

<style>
<!--
h3 {
	font-size: 2em;
	font-weight: bold;
}
-->
</style>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	int pointFactor = (Integer)request.getAttribute("pointFactor");
	if(pointFactor == 0) {
		pointFactor = 1;
	}
	
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
			"hello-teacher-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<liferay-ui:success key="add-points-success" message="add-points-success" />

<portlet:renderURL var="backURL">
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="jspPage" value="/html/student-point/type_point.jsp" />
</portlet:renderURL>

<liferay-ui:header title="<%=title %>" />
	
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
			<td width="200"><liferay-ui:message key="student" /></td>
			<td  width="200"><liferay-ui:message key="point-write" /></td>
			<c:if test="<%=pointFactor == 1 %>">
				<td  width="200"><liferay-ui:message key="point-speak" /></td>
			</c:if>
			<td width="100px"><liferay-ui:message key="Edit" /></td>
		</tr>
		<c:forEach begin="0" end="<%=size - 1 %>">
			<%
				TYStudent student = students.get(i);
			%>
			<tr height="25px">
				<td width="50"><c:out value="<%=i + 1 %>" /></td>
				<td  width="200"><c:out value='<%=student.getStudentFirstName() + " " + student.getStudentLastName() %>' /></td>
				<td  width="200">
					<%
						float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, pointFactor);
						String pointString = TYServiceUtil.floatsToPointString(points);
					%>
					<c:out value="<%=pointString %>" />
				</td>
				<c:if test="<%=pointFactor == 1 %>">
					<td  width="200">
						<%
							points = TYServiceUtil.getPointStudentByPTPF(courses, 
									semester, student.getStudentId(), subject.getSubjectId(), 
									WebKeys.SPEAK_POINT, pointFactor);
							pointString = TYServiceUtil.floatsToPointString(points);
						%>
						<c:out value="<%=pointString %>" />
					</td>
				</c:if>
				<portlet:renderURL var="updateStudentPointJSPURL">
					<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
					<portlet:param name="studentId" value="<%=String.valueOf(student.getStudentId()) %>" />
					<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
					<portlet:param name="pointFactor" value="<%=String.valueOf(pointFactor) %>" />
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
