<%@include file="/init.jsp" %>

<portlet:actionURL name="addClass" var="addClassURL" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
%>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
	</font></h3>
</div>

<%
	String args[] = {subject.getSubjectName(), teacher.getFullName()};
	String title = LanguageUtil.format(pageContext, "hello-teacher-role-subject", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>"/>
	<portlet:param name="jspPage" value="/html/teacher-subject/select_subject.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:success key="append-class-success" message="append-class-success" />

<%int kh = 10; %>
<c:forEach begin="0" end="2">
<h3 id="type-point-role-title" class='<%="h3-class-group-" + kh%>'><liferay-ui:message key="class-group-x" arguments="<%=kh %>" /></h3>
<div id='<%="class-group-id-" + kh%>'>
<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="100">
	<liferay-ui:search-container-results>
		<%
		List<TYClass> classes = 
			ActionUtil.getClassesByGroup(companyId, groupId, kh);
		
		List<TYClass> oldClasses =
				TYServiceUtil.getClassByUserSubjectRole(courses,
						teacher.getUserId(), RoleKeys.TYPE_POINT, subject.getSubjectId());
		List<TYClass> tempClasses =  new ArrayList<TYClass>(oldClasses);
		List<TYClass> classesRemove = new ArrayList<TYClass>(classes);
		classesRemove.removeAll(tempClasses);
		
		for(int i = 0 ; i < classesRemove.size() ; i++) {
			classesRemove.get(i).setIndex(i + 1);
		}
		
		results = ListUtil.subList(
				classesRemove, searchContainer.getStart(), searchContainer.getEnd());
		total = classesRemove.size();
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
          path="/html/teacher-class/class_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>

<%kh++; %>
</div>
</c:forEach>

<script type="text/javascript">

AUI().ready('aui-dialog','node', function(A) {
	
	A.one("h3.h3-class-group-10").on("click", function() {
		A.one("div#class-group-id-10").slideToggle("slow");
	});
	
	A.one("h3.h3-class-group-11").on("click", function() {
		A.one("div#class-group-id-11").slideToggle("slow");
	});
	
	A.one("h3.h3-class-group-12").on("click", function() {
		A.one("div#class-group-id-12").slideToggle("slow");
	});
});
	
</script>