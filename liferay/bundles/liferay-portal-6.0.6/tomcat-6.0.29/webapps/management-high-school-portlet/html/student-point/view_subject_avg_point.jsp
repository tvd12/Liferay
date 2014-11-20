<%@ include file="/init.jsp" %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int semester = (Integer)request.getAttribute(WebKeys.TY_SEMESTER);
	if(semester == 0) {
		semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		if(semester == 0) {
			semester = 1;
		}
	}
	int semes = 2;
	if(semester == 2) {
		semes = 1;
	}
	
	List<TYStudent> students = ActionUtil.getStudentsInClass(courses, tyClass.getClassId());
	int i = 0, j = 0;
	
	List<TYSubject> subjects = ActionUtil.getAllSubjects(companyId, groupId);
	int cutFloat = 1;
%>


<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	
%>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/class-admin/view.jsp" />
</portlet:renderURL>

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<c:if test="<%=subjects.size() == 0 %>">
	<div style="background-color: #00FF66;">
		<liferay-ui:icon image="activate"/> <liferay-ui:message key="there-are-no-subjects" />
	</div>
</c:if>
<c:if test="<%=students.size() == 0 %>">
	<div style="background-color: #00FF66;">
		<liferay-ui:icon image="activate" /> <liferay-ui:message key="there-are-no-students" />
	</div>
</c:if>

<c:if test="<%=subjects.size() > 0 %>">
<c:if test="<%=students.size() > 0 %>">

<script type="text/javascript" charset="utf-8">
 
AUI().ready(
	'aui-tabs', 'substitute',
	function(A) {
		var tabs1 = new A.TabView({
		boundingBox: '#markupTabs',
		listNode: '#test',
		contentNode: '#testContent'
	});
	tabs1.render();
	}
);
 
</script>

<portlet:renderURL var="viewPointSemesterURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="semester" value="<%=String.valueOf(semes) %>" />
	<portlet:param name="jspPage" value="/html/student-point/view_subject_avg_point.jsp" />
</portlet:renderURL>
 
<div id="markupTabs">
	<ul id="test">
	<%i=0; %>
	<c:forEach begin="0" end="<%=subjects.size() - 1 %>">
		<li><a href="javascript:;"><%=subjects.get(i).getSubjectName() %></a></li>
		<%i++; %>
	</c:forEach>
	<li><a href="javascript:;"><liferay-ui:message key="semester-x" arguments="<%=semester %>" /></a></li>
	</ul>
 	
	<div id="testContent">
	
	<%i=0; %>
	<c:forEach begin="0" end="<%=subjects.size() - 1 %>">
		<%
			TYSubject subject = subjects.get(i);
		%>
		<div>
			<div style="color: red; margin-bottom: 25px;" id="div-header-tvd-custom">
				<liferay-ui:message key="table-subject-point" arguments="<%=subjects.get(i).getSubjectName() %>" />
			 	<liferay-ui:message key="class-lower" /> <c:out value="<%=tyClass.getClassFullName() %>" />
			</div>
			 <div style="font-size: 12px; margin-top: -20px;" align="right">
			 	<a href="<%=viewPointSemesterURL.toString()%>">
			 		<liferay-ui:message key="semester-x" arguments="<%=semes %>" /><liferay-ui:icon image="forward" />
			 	</a>
			 </div>
			<table class="student-point-table">
				<tr height="50px" class="student-point-table-fist-row">
					<td width="50px"><liferay-ui:message key="index" /></td>
					<td width="200px"><liferay-ui:message key="student" /></td>
					<td width="200px"><liferay-ui:message key="point-speak" /></td>
					<td width="200px"><liferay-ui:message key="point-15" /></td>
					<td width="200px"><liferay-ui:message key="point-45" /></td>
					<td width="200px"><liferay-ui:message key="point-90" /></td>
					<td width="200px"><liferay-ui:message key="avg-point" /></td>
				</tr>
				<%j=0; %>
				<c:forEach begin="0" end="<%=students.size() - 1 %>">
				<tr height="25px">
					<td width="50px"><c:out value="<%=j+1 %>" /></td>
					<%
						TYStudent student = students.get(j);
						student.setFullName(student.getStudentFirstName() + " " 
							+ student.getStudentLastName());
					%>
					<td width="200px"><c:out value="<%=student.getFullName() %>" /></td>
					<td width="200px">
						<%
						float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.SPEAK_POINT, 1);
						String pointString = TYServiceUtil.floatsToPointString(points);
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
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 3);
						if(points == null) {
							pointString = LanguageUtil.format(pageContext, "unknown", "");
						} else {
							pointString = TYServiceUtil.floatsToPointString(points);
						}
						%>
						<c:out value="<%=pointString %>" />
					</td>
					<td width="200px">
						<%
						TYStudentPoint studentPointSubject = TYServiceUtil.getStudentAVGPointBySubject(
								courses, semester, student.getStudentId(), subject.getSubjectId());
						float avgPointSubject = 0;
						if(studentPointSubject != null) {
							avgPointSubject = TYServiceUtil.getCutFloat(studentPointSubject.getPoint(), cutFloat);
						}
						
						if(points == null || points.length == 0) {
							pointString = LanguageUtil.format(pageContext, "unknown", "");
						} else {
							pointString = "" + avgPointSubject;
						}
						%>
						<c:out value="<%=pointString %>" />
					</td>
				<tr>
				<%j++; %>
				</c:forEach>
			</table>
		</div>
		<%i++; %>
	</c:forEach>
	<div>
		<div id="div-header-tvd-custom" style="color: red; margin-bottom: 25px;">
			<liferay-ui:message key="table-semester-point-x" arguments="<%=semester %>" />
		</div>
		<div style="font-size: 12px; margin-top: -20px;" align="right">
			<a href="<%=viewPointSemesterURL.toString()%>">
			 	<liferay-ui:message key="semester-x" arguments="<%=semes %>" /><liferay-ui:icon image="forward" />
			 </a>
		</div>
		<table class="student-point-table">
			<tr height="50px" class="student-point-table-fist-row">
				<td width="50px"><liferay-ui:message key="index" /></td>
				<td width="200px"><liferay-ui:message key="student" /></td>
				<c:if test="<%=semester == 2 %>">
					<td width="200px"><liferay-ui:message key="avg-point-x" arguments="<%=1 %>" /></td>
				</c:if>
				<td width="200px"><liferay-ui:message key="avg-point-x" arguments="<%=semester %>" /></td>
				<c:if test="<%=semester == 2 %>">
					<td width="200px"><liferay-ui:message key="avg-point-sum" /></td>
				</c:if>
				<td width="200px"><liferay-ui:message key="conduct" /></td>
			</tr>
			<%i=0; %>
			<c:forEach begin="0" end="<%=students.size() - 1 %>">
				<tr height="25px">
				<td width="50px"><c:out value="<%=i+1 %>" /></td>
				<%
					TYStudent student = students.get(i);
					student.setFullName(student.getStudentFirstName() + " " 
						+ student.getStudentLastName());
				%>
				<td width="200px"><c:out value="<%=student.getFullName() %>" /></td>
				<c:if test="<%=semester > 1 %>">
					<%
						TYStudentPoint studentPoint = TYServiceUtil.getStudentAVGPoint(
							courses, semester - 1, student.getStudentId());
						String avgString = LanguageUtil.format(pageContext, "unknow", "");
						if(studentPoint != null) {
							float avgPoint = TYServiceUtil.getCutFloat(studentPoint.getPoint(), 1);
							avgString = "" + avgPoint;
						}
					%>
					<td width="200px"><c:out value="<%=avgString %>" /></td>
				</c:if>
				<%
					TYStudentPoint studentPoint = TYServiceUtil.getStudentAVGPoint(
						courses, semester, student.getStudentId());
					String avgString = LanguageUtil.format(pageContext, "unknow", "");
					if(studentPoint != null) {
						float avgPoint = TYServiceUtil.getCutFloat(studentPoint.getPoint(), 1);
						avgString = "" + avgPoint;
					}
				%>
				<td width="200px"><c:out value="<%=avgString %>" /></td>
				<c:if test="<%=semester > 1 %>">
					<%
					TYStudentPoint studentPoint1 = TYServiceUtil.getStudentAVGPoint(
							courses, semester - 1, student.getStudentId());
					avgString = LanguageUtil.format(pageContext, "unknow", "");
					if(studentPoint != null && studentPoint1 != null) {
						float avgPoint = (float)(studentPoint1.getPoint() + 2*(studentPoint.getPoint()))/3; 
						avgPoint = TYServiceUtil.getCutFloat(avgPoint, 1);
						avgString = "" + avgPoint;
					}
					%>
					<td><c:out value="<%=avgString %>" /></td>
				</c:if>
				<%
					TYStudentConduct studentConduct = TYServiceUtil.getConductOfStudent(courses, 
						semester, student.getStudentId());
				%>
				<td width="200px">
					<c:if test="<%=studentConduct.getConduct() == 1 %>"><liferay-ui:message key="good" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 2 %>"><liferay-ui:message key="quite" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 3 %>"><liferay-ui:message key="mean" /></c:if>
					<c:if test="<%=studentConduct.getConduct() == 4 %>"><liferay-ui:message key="weak" /></c:if>
				</td>
			<tr>
			<%i++; %>
			</c:forEach>
		</table>
					
		</div>
	</div>
</div>

</c:if>
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
