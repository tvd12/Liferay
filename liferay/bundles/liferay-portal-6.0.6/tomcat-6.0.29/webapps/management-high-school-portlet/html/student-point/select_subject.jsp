<%@include file="/init.jsp" %>

<portlet:actionURL name="addSubject" var="addSubjectURL" />

<liferay-ui:success key="add-subject-success" message="add-subject-success" />
<liferay-ui:success key="delete-subject-success" message="delete-subject-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = TYServiceUtil.getCurrentSemester();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
%>

<div align="center">
	<font size="4px" color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font>
</div>

<%
	String args[] = {user.getFullName()};
	String title = LanguageUtil.format(pageContext, "hello-teacher-point", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<liferay-ui:header title="<%=title %>" />

<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:search-container emptyResultsMessage="there-are-no-subjects" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYSubject> subjects = 
				ActionUtil.getSubjectsOfClassByUserRole(courses, user.getUserId(), RoleKeys.TYPE_POINT);
		results = ListUtil.subList(
				subjects, searchContainer.getStart(), searchContainer.getEnd());
		total = subjects.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.model.TYSubject"
		keyProperty="subjectId"
		modelVar="subject">
		
	<liferay-ui:search-container-column-text 
		name="index" 
		property="index" />
		
	<liferay-ui:search-container-column-text 
		name="subject-name" 
		property="subjectName" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-point/subject_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>