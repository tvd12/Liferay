<%@include file="/init.jsp" %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	int start = 2010;
	Map<Integer, String> listCourses = TYServiceUtil.getListCourses(start);
	int end = start + listCourses.size() - 1;
	String courseString = listCourses.get(end);
%>

<div>
	<h3><liferay-ui:message key="class" /> <c:out value="<%=tyClass.getClassFullName() %>" />
	<font color="blue" style="text-align: center; margin-left: 150px;"><liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" /></font></h3>
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

<portlet:actionURL name="viewClass" var="viewClassURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(tyClass.getClassId()) %>" />
</portlet:actionURL>

<aui:form action="<%=viewClassURL.toString() %>" method="get" name="fm">
	<aui:select name="coursesView">
		<%int i = start; %>
	 	<c:forEach begin="<%=start %>" end="<%=end %>">
	 		<aui:option value="<%=i %>"><c:out value="<%=listCourses.get(i).toString() %>" /></aui:option>
	 		<%i++; %>
	 	</c:forEach>
	</aui:select>
</aui:form>
<br />

<%
	int courses = TYServiceUtil.getCurrentCourse();
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

<liferay-ui:search-container emptyResultsMessage="there-are-no-student" delta="100">
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
		name="student_id" property="studentId" />
	
	<liferay-ui:search-container-column-text 
		name="student-first-name" property="studentFirstName" />
		
	<liferay-ui:search-container-column-text
		name="student-last-name" property="studentLastName" />
	
	<liferay-ui:search-container-column-text
		name="birth-day" property="birthDay" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-public/student_action.jsp"
          align="right" />
		
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>