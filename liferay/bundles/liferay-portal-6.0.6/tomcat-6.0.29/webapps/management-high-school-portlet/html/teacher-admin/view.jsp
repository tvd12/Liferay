<%@ include file="/init.jsp" %>

<liferay-ui:success key="have-unlocked-time" message="have-unlocked-time" />
<liferay-ui:success key="have-locked-time" message="have-locked-time" />
<liferay-ui:success key="updated-new-course" message="updated-new-course" />
<liferay-ui:search-container emptyResultsMessage="there-are-no-teacher" delta="5">
	<liferay-ui:search-container-results>
		<%
			List<TeacherTemp> teachers = 
				ActionUtil.getAllTeachers(themeDisplay.getScopeGroupId());
			
			for(int i = 0 ; i < teachers.size() ; i++) {
				if(teachers.get(i).getTeacherId() == user.getUserId()) {
					TeacherTemp temp = teachers.get(0);
					teachers.set(0, teachers.get(i));
					teachers.set(i, temp);
					break;
				}
			}
					
			results = ListUtil.subList(
			teachers, searchContainer.getStart(), searchContainer.getEnd());
			total = teachers.size();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.management.temporary.TeacherTemp"
		keyProperty="teacherId"
		modelVar="teacher">
		
	<liferay-ui:search-container-column-text 
		name="index" 
		property="index" />
				
	<liferay-ui:search-container-column-text 
		name="full-name" 
		property="fullName" />
		
	<liferay-ui:search-container-column-text 
		name="email" 
		property="emailAddress" />
	<liferay-ui:search-container-column-jsp path="/html/teacher-admin/teacher_action.jsp" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>