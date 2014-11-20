<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	int pointFactor = (Integer)request.getAttribute("pointFactor");
	int pointType = (Integer)request.getAttribute("pointType");
	
	List<String> pointTypes = new ArrayList<String>();
	pointTypes.add(0, new String("point-write"));
	pointTypes.add(1, new String("point-write"));
	pointTypes.add(2, new String("point-speak"));
	pointTypes.add(3, new String("point-speak"));
	
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYTeacher.class.getName();
	
	long companyId = themeDisplay.getCompanyId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	String semsterStr = LanguageUtil.format(pageContext, "semester-x", String.valueOf(semester));
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String guide = LanguageUtil.get(pageContext, "import-points-guide");
%>

<div id="id-addstudent-div" style="background-color: #CCCCCC; margin-top: 5px; 
	margin-bottom: 15px; line-height: 25px; color: red; font-size: 16px; font-weight: bold; ">
</div>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {user.getFullName(), String.valueOf(pointFactor) ,
		subject.getSubjectName(), tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-update-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
	<portlet:param name="jspPage" value="/html/student-point/view_edit_class_subject_point.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<%
	List<TYStudent> students = ActionUtil.getStudentsInClass(courses, tyClass.getClassId());
	int size = students.size();
	int i = 0;
%>

<style>
<!--
.semester-class {
	color: white;
}
-->
</style>

<script type="text/javascript">

AUI().ready('aui-dialog',"node", function(A){

	A.all("form#<portlet:namespace />fm :text").on( "blur", function() {
        	
	var size = this.size();
	var k = 0;
			
	for( k = 0 ; k < size ; k++ ) {
				
		var selectStr = "#<portlet:namespace />point" + k;
		var tagSelect = A.one(selectStr);
		var ch = tagSelect.val();
				
		var i = 0;
		for( i = 0 ; i < ch.length ; i++ ) {
			if(!((ch[i] >= '0' && ch[i] <= '9') || ch[i] == ' ' || ch[i] == '.')) {
				alert( ch + ' <liferay-ui:message key="invalid" />');
				tagSelect.val('');
				return false;
			}
		}
				
		var strs = ch.split(" ");
		for( i = 0 ; i < strs.length ; i++) {
			if(strs[i] < 0 || strs[i] > 10) {
				alert(parseInt(strs[i]) + ' <liferay-ui:message key="point" />' + ' <liferay-ui:message key="invalid" />');
				tagSelect.val('');
				return false;
			}
		}
	}
			
	return true;
	});
	
	A.all("form#<portlet:namespace />fm :text").on( "focus", function() {
		 var divShowSemester=A.one("div#show-semester");  
		 divShowSemester.html('<p align="center" class="semester-class">' + 
				 '<liferay-ui:message key="semester-x" arguments="<%=semester%>" />' + '</p>');
		divShowSemester.addClass("begin-anim-semster");
		divShowSemester.setStyle("left", "750px");
	});
	
	A.all("form#<portlet:namespace />fm :text").on( "focus", function() {
		var _this = this;
		this.each(function(value, index) {
			_this.item(index).on("keydown", function(event) {
				var keyCode = event.keyCode;
				if(keyCode == 40) {
					_this.item(index + 1).focus();
				}
				
				if(keyCode == 38) {
					_this.item(index - 1).focus();
				}
			});
		});
	});	
		
});

</script>

<%i=0; %>
<div style="background-color: green;">
	<c:if test="<%=size == 0 %>">
		<liferay-ui:icon image="activate" /> <liferay-ui:message key="there-are-no-students" />
	</c:if>
</div>
<c:if test="<%=size > 0 %>">
	<portlet:actionURL name="editStudentsPoints" var="editStudentsPointsURL">
		<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
		<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
		<portlet:param name="pointFactor" value="<%=String.valueOf(pointFactor) %>" />
		<portlet:param name="pointType" value="<%=String.valueOf(pointType) %>" />
	</portlet:actionURL>
	<aui:form action="<%=editStudentsPointsURL.toString() %>" method="post" name="fm">
		<liferay-ui:message key="point-factor-x" arguments="<%=pointFactor %>" />
		<div id="show-semester" align="center">
    	</div>
		<table class="student-point-table" id="tableinputpoint">
			<tr class="student-point-table-fist-row">
				<td width="30px"><liferay-ui:message key="index" /></td>
				<td width="200"><liferay-ui:message key="student" /></td>
				<td width="200"><liferay-ui:message key="point-type" /></td>
				<td width="200"><liferay-ui:message key="point" /><liferay-ui:icon-help message="type-point-help" /></td>
				<td width="250"><liferay-ui:message key="point-exist" /></td>
			</tr>
			
			<tr height="5px">
				<td width="30px"></td>
				<td width="200"></td>
				<td width="200"></td>
				<td width="200"></td>
				<td width="200"></td>
			</tr>
			
			<c:forEach begin="0" end="<%=size - 1 %>">
				<%
					TYStudent student = students.get(i);
					String selectName = "pointType" + i;
					String pointName = "point" + i;
					String studentIdx = "studentId" + i;
				%>
				<tr>
					<td width="30px"><c:out value="<%=(i+1) %>"></c:out></td>
					<td  width="200"><c:out value='<%=student.getStudentFirstName() + " " + student.getStudentLastName() %>' /></td>
					<aui:input name="<%=studentIdx %>" value="<%=student.getStudentId() %>" type="hidden" />
					<td  width="200">
						<liferay-ui:message key="<%=pointTypes.get(pointType) %>" />
					</td>
					<td width="200">
						<%
						float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								pointType, pointFactor);
						String pointString = TYServiceUtil.floatsToPointString(points);
						%>
						<aui:input name="<%=pointName %>" type="text" label=" " value="<%=pointString %>" />
					</td>
					
				</tr>
				<%i++; %>
			</c:forEach>
		</table>
		<aui:button-row>	
			<aui:button name="Save" type="submit" />
			<aui:button name="cancel" type="cancel" onClick="<%=backURL.toString() %>" />
		</aui:button-row>
	</aui:form>
	

<script type="text/javascript">

AUI().ready("aui-node", "Node", function(A) {
	A.one("input#<portlet:namespace />cancel").on("click", function() {
		document.location = "<%=backURL.toString()%>";
	});
});
</script>

</c:if>

<script type="text/javascript">
	AUI().ready('aui-dialog','node', function(A) {
		A.all("table.student-point-table").on("mouseover", function() {
			var trs = A.all("table.student-point-table tr");
			trs.each(function(value, index) {
				this.on("mouseover", function() {
					this.addClass("tr-mouse-over");
				});
				
				this.on("mouseout", function() {
					this.removeClass("tr-mouse-over");
				});
			});
		});
	});
</script>