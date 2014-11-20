<%@ include file="/init.jsp" %>

<%
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
%>

<portlet:renderURL var="addManagementRoleURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
	<portlet:param name="jspPage" value="/html/teacher-admin/assign_management_role.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addTypePointRoleURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
	<portlet:param name="jspPage" value="/html/teacher-subject/select_subject.jsp" />
</portlet:renderURL>

<div style="background-color: #CCCCCC; margin-top: 5px; margin-bottom: 15px; line-height: 25px; color: red; ">
	<liferay-ui:message key="assign-management-role" /><liferay-ui:icon image="group" url="<%=addManagementRoleURL.toString() %>"/>
	<liferay-ui:message key="assign-type-point-role" /><liferay-ui:icon image="assign" url="<%=addTypePointRoleURL.toString() %>"/>
</div>

<h3><liferay-ui:message key="you-are-assigning-to-teacher" /> <i><c:out value="<%=teacher.getFullName() %>" /></i></h3>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:success key="recovery-role-success" message="recovery-role-success" />
<h3 id="manager-class-role-title"><liferay-ui:message key="manager-class" /></h3>

<div id="manager-class-role-slide">
<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100">
	<liferay-ui:search-container-results>
		<%
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		int courses = TYServiceUtil.getCurrentCourse();
		long userId = teacher.getUserId();
		List<TYClass> classes = 
			ActionUtil.getClassesByTeacherRole(courses, groupId, companyId, userId, RoleKeys.MANAGEMENT);
		results = ListUtil.subList(
				classes, searchContainer.getStart(), searchContainer.getEnd());
		total = classes.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.model.TYClass"
		keyProperty="classId"
		modelVar="tyClass" >
		
	<liferay-ui:search-container-column-text 
		name="class-code" 
		property="classCode" />
		
	<liferay-ui:search-container-column-text 
		name="class-name" 
		property="classFullName" />
		
	<liferay-ui:search-container-column-text 
		name="modified-date" 
		property="modifiedDate" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/teacher-admin/teacher_management_delete_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>
</div>

<h3 id="type-point-role-title"><liferay-ui:message key="type-point" /></h3>	
<div id="type-point-role-slide">
<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100" >
	<liferay-ui:search-container-results>
	<%
		int courses = TYServiceUtil.getCurrentCourse();
		long userId = teacher.getUserId();
		List<SubjectClassUserRoleTemp> scur = TYServiceUtil.getAllClassSubjectByUserRole(
				courses, userId, RoleKeys.TYPE_POINT);
		results = ListUtil.subList(scur, searchContainer.getStart(), 
				searchContainer.getEnd());
		total = scur.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
	%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp"
		modelVar="scurt" >
		
	<liferay-ui:search-container-column-text 
		name="subject-name" 
		property="subjectName" />
		
	<liferay-ui:search-container-column-text 
		name="class-name" 
		property="className"  />
		
	<liferay-ui:search-container-column-jsp
          path="/html/teacher-admin/teacher_type_point_delete.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</div>
