<%@include file="/init.jsp" %>

<portlet:actionURL name="addClass" var="addClassURL" />

<liferay-ui:success key="append-class-success" message="append-class-success" />
<liferay-ui:success key="delete-class-success" message="delete-class-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	int pointFactor = (Integer)request.getAttribute("pointFactor");
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
%>

<div align="center">
	<font size="4px" color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
	</font>
</div>

<%
	String args[] = {user.getFullName()};
	String title = LanguageUtil.format(pageContext, "hello-teacher-conduct", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<liferay-ui:header title="<%=title %>" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYClass> classes = 
			ActionUtil.getAllClassFromSchool(companyId, groupId);
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
		modelVar="tyClass">
		
	<liferay-ui:search-container-column-text 
		name="class-code" 
		property="classCode" />
		
	<liferay-ui:search-container-column-text 
		name="class-name" 
		property="classFullName" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-conduct/class_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>