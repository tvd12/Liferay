<%@include file="/init.jsp" %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	long primKey = tyClass.getPrimaryKey();
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>

<div>
	<font size="5px"><liferay-ui:message key="class" /> <c:out value="<%=tyClass.getClassFullName() %>" /></font>
	<font size="4px" color="blue" style="text-align: center; margin-left: 150px;"><liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" /></font>
</div>
<p><font size="1px"><liferay-ui:message key="date-modified" /> <c:out value="<%=tyClass.getModifiedDate() %>" /></font></p>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/class-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<%
	long groupId = themeDisplay.getScopeGroupId();
	long classId = tyClass.getClassId();
	User teacherManager = ActionUtil.getTeacherManagementOfClass(
			courses, classId, RoleKeys.MANAGEMENT);
	String teacherName = null;
	if(teacherManager != null) {
		teacherName = teacherManager.getFullName();
	}
%>
<p><liferay-ui:message key="teacher-management" />: 
	<font color="blue"><i>
		<c:if test="<%=(teacherName == null) %>">
			<liferay-ui:message key="unknow" />
		</c:if>
		<c:out value="<%=teacherName %>" />
	</i></font>
</p>

<liferay-ui:success key="append-student-sucess" message="append-student-sucess" />
<liferay-ui:success key="delete-student-success" message="delete-student-success" />

<liferay-ui:search-container emptyResultsMessage="there-are-no-student" 
		delta="100" >
	<liferay-ui:search-container-results>
		<%	
		int currentCourses = TYServiceUtil.getCurrentCourse();
		List<TYStudent> students = ActionUtil.getStudentsInClass(currentCourses, tyClass.getClassId());
		total = students.size();
		results = ListUtil.subList(students, searchContainer.getStart(), searchContainer.getEnd());
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>	
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.model.TYStudent"
		keyProperty="studentId"
		modelVar="student">
		
	<liferay-ui:search-container-column-text 
		name="index" property="index" />	
		
	<liferay-ui:search-container-column-text 
		name="student-first-name" property="studentFirstName" />
		
	<liferay-ui:search-container-column-text
		name="student-last-name" property="studentLastName" />
	
	<liferay-ui:search-container-column-text
		name="birth-day" property="birthDay" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-admin/student_action.jsp"
          align="right" />
	
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>