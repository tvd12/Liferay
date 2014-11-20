<%@include file="/init.jsp" %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	long primKey = tyClass.getPrimaryKey();
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String guide = LanguageUtil.get(pageContext, "add-student-guide");
	int courses = TYServiceUtil.getCurrentCourse();
	long groupId = themeDisplay.getScopeGroupId();
	long companyId = themeDisplay.getCompanyId();
	long classId = tyClass.getClassId();
	long userId = user.getUserId();
	int status = ActionUtil.getStatusByClassUserRole(courses, 
			classId, userId, RoleKeys.MANAGEMENT);
%>

<c:if test="<%=status == 2 %>">

<portlet:renderURL var="addStudentsURL">
	<portlet:param name="classId" value="<%=String.valueOf(primKey) %>" />
	<portlet:param name="jspPage" value="/html/student-admin/add_students.jsp" />
</portlet:renderURL>

<portlet:actionURL name="readExcelFile" var="readFileURL">
	<portlet:param name="classId" value="<%=String.valueOf(primKey) %>" />
</portlet:actionURL>

<div id="div-dialog-file-upload" hidden="hidden">
	<aui:form name="file" action="<%=readFileURL.toString() %>" method="post" enctype="multipart/form-data">
		<aui:input name="filePath" type="file" />
		<aui:button-row>
			<aui:button type="submit" value="Submit" />
		</aui:button-row>
	</aui:form>
</div>

<div id="id-addstudent-div" style="background-color: #CCCCCC; margin-top: 5px; margin-bottom: 15px; line-height: 25px; 
		color: red; font-size: 16px; font-weight: bold;">
	<liferay-ui:message key="add-students" /><liferay-ui:icon image="add" url="<%=addStudentsURL.toString() %>"/>
	<liferay-ui:message key="add-students-from-file" />
	<a id="fileUpload" style="text-decoration: none; cursor: pointer;"><liferay-ui:icon image="add_article" /></a>
</div>

<script type="text/javascript">
<!--
AUI().ready('aui-dialog','node', function(A) {
	
	var options = {
		title: 'Dialog',
		bodyContent: 'Testing body',
		// centered: true,
		constrain2view: true,
		draggable: true,
		// resizable: false,
		resizable: {
			// proxy: false
		},
		// destroyOnClose: true,
		group: 'default',
		height: 250,
		stack: true,
		// shim: true,
		width: 500,
		// zIndex: 0,
		buttons: [
			{
				text: 'Refresh content',
				handler: function() {
					this.io.start();
				}
			}
		]
	};
	
	
	var content = new A.Node(A.one("div#div-dialog-file-upload"));
	
	
	A.one("div#id-addstudent-div a#fileUpload").on("click", function() {
		var dialogHelp = new A.Dialog(
			A.merge(options, {
				title: '<%=guide%>',
				xy: [260, 160],
				modal: true
			})
		)
		.render();

		dialogHelp.plug(A.Plugin.IO, {
			autoLoad: false,
			uri: '<%=contextPathImg + "/html/file-upload/help_add_students.html"%>'
		});

		// manually refresh
		dialogHelp.io.start();
	
		var dialog = new A.Dialog(
			A.merge(options, {
				title: 'File upload dialog',
				xy: [300, 200],
				bodyContent: content.removeAttribute("hidden"),
			})
		)
		.render();
	}); 
	
});
//-->
</script>
	
<%
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>

<div>
	<h3><liferay-ui:message key="class" /> <c:out value="<%=tyClass.getClassFullName() %>" />
		<font color="blue" style="text-align: center; margin-left: 150px;"><liferay-ui:message key="courses" /> 
		<c:out value="<%=courseString %>" /></font>
	</h3>
</div>
<p><font size="1px"><liferay-ui:message key="date-modified" /> <c:out value="<%=tyClass.getModifiedDate() %>" /></font></p>

<portlet:renderURL var="backURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/teacher-admin/view_permission.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<%
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
</p> <br />

<liferay-ui:success key="append-student-sucess" message="append-student-sucess" />
<liferay-ui:success key="delete-student-success" message="delete-student-success" />
<liferay-ui:error key="error-file-size" message="error-file-size" />

<liferay-ui:search-container emptyResultsMessage="there-are-no-student" 
		delta="100" >
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
		name="student-first-name" property="studentFirstName" />
		
	<liferay-ui:search-container-column-text
		name="student-last-name" property="studentLastName" />
	
	<liferay-ui:search-container-column-text
		name="birth-day" property="birthDay" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/student-admin/student_action.jsp"
          align="right" />
	
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>
</c:if>

<c:if test="<%=status != 2 %>">

<portlet:renderURL var="backURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/teacher-admin/view_permission.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
<font color="red"><liferay-ui:message key="cannot-add-students" /></font>

</c:if>

<script type="text/javascript">
AUI().ready('aui-node', 'Node', function(A) {
	A.all("a#<portlet:namespace />id-delete-ty-student").each(function(value, index) {
		this.on('click', function(event) {
			var ok = confirm("Are you sure?");
			if(!ok) {
				event.preventDefault();
			}
		});
	});
});
</script>