<%@include file="/init.jsp" %>

<portlet:actionURL name="addSubject" var="addSubjectURL" />

<liferay-ui:success key="add-subject-success" message="add-subject-success" />
<liferay-ui:success key="delete-subject-success" message="delete-subject-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
%>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
	</font></h3>
</div>

<%
	String args[] = {teacher.getFullName()};
	String title = LanguageUtil.format(pageContext, "assign-type-role-to", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
	<portlet:param name="jspPage" value="/html/teacher-admin/permission_teacher.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:search-container emptyResultsMessage="there-are-no-subjects" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYSubject> subjects = 
			ActionUtil.getAllSubjects(companyId, groupId);
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
          path="/html/teacher-subject/subject_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>