<%@page import="org.tvd.thptty.management.util.PermissionChecker"%>
<%@include file="/init.jsp" %>

<portlet:actionURL name="addClass" var="addClassURL" />

<liferay-ui:success key="append-class-success" message="append-class-success" />
<liferay-ui:success key="delete-class-success" message="delete-class-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	User teacher = user;
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = TYServiceUtil.getCurrentSemester();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
%>

<div align="center">
	<font size="4px" color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font>
</div>

<%
	String args[] = {user.getFullName(), subject.getSubjectName()};
	String title = LanguageUtil.format(pageContext, "hello-teacher-point-subject", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>"/>
	<portlet:param name="jspPage" value="/html/student-point/select_subject.jsp" />
</portlet:renderURL>

<liferay-ui:header title="<%=title %>" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYClass> classList = 
			ActionUtil.getAllClassFromSchool(companyId, groupId);
		List<TYClass> classes = new ArrayList<TYClass>();
		int idTemp = 1;
		for(int i = 0 ; i < classList.size() ; i++) {
			TYClass tyClass = classList.get(i);
			if(PermissionChecker.hasSubjectClassRole(
					courses, subject.getSubjectId(), tyClass.getClassId(), 
					teacher.getUserId(), RoleKeys.TYPE_POINT)) {
				tyClass.setIndex(idTemp++);
				classes.add(tyClass);
			}
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
		modelVar="tyClass">
	
	<liferay-ui:search-container-column-text 
		name="index" property="index" />
		
	<liferay-ui:search-container-column-text 
		name="class-code" 
		property="classCode" />
		
	<liferay-ui:search-container-column-text 
		name="class-name" 
		property="classFullName" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-point/class_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>