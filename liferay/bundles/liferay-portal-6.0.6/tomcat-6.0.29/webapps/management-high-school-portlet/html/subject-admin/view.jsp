<%@include file="/init.jsp" %>

<portlet:actionURL name="addSubject" var="addSubjectURL" />

<liferay-ui:success key="add-subject-success" message="add-subject-success" />
<liferay-ui:success key="delete-subject-success" message="delete-subject-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYSubject.class.getName();
	long primKey = user.getPrimaryKey();
	
	//int courses = TYServiceUtil.getCurrentCourse();
	
	//User subjectCapital = TYServiceUtil.getUserBySubjectRole(
			//courses, themeDisplay.getScopeGroupId(), subjectId, roleId);
%>

<c:if test='<%=permissionChecker.hasPermission(groupId, name, primKey, TYActionKeys.ADD_SUBJECT) %>'>
	<aui:form action="<%=addSubjectURL.toString() %>" name="fm" method="post">
		<aui:fieldset>
			<aui:input name="subjectCode" helpMessage="accept-null" />
			<liferay-ui:error key="subject-name-required" message="subject-name-required" />
			<aui:input name="subjectName" />
			<aui:input name="description" type="textarea" />
			<aui:button type="submit" value="save" />
		</aui:fieldset>
	</aui:form>
<br />
</c:if>
<liferay-ui:search-container emptyResultsMessage="there-are-no-subjects" delta="10">
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
		
	<liferay-ui:search-container-column-text 
		name="description" 
		property="description" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/subject-admin/subject_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>