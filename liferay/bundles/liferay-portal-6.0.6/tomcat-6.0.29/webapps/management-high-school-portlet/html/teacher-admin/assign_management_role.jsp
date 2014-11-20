<%@ include file="/init.jsp" %>

<%
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
%>

<portlet:renderURL var="backURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>" />
	<portlet:param name="jspPage" value="/html/teacher-admin/permission_teacher.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.get(pageContext, "you-are-assigning-management-to-teacher");
	title += " " + teacher.getFullName();
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
	</font></h3>
</div>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<h3><liferay-ui:message key="list-classes" /></h3>
<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYClass> classes = 
			ActionUtil.getAllClassFromSchool(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId());
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = teacher.getUserId();
		
		List<TYClass> classAddeds = ActionUtil.getClassesByRole(courses, groupId, 
				companyId, RoleKeys.MANAGEMENT);

		classes.removeAll(classAddeds);
		
		for(int i = 0 ; i < classes.size() ; i++) {
			classes.get(i).setIndex(i + 1);
		}
		
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
		name="index" property="index" />
		
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
          path="/html/teacher-admin/teacher_management_class_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>