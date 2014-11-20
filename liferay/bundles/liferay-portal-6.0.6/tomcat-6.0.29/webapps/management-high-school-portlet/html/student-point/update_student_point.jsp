<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	TYStudent student = (TYStudent)request.getAttribute(WebKeys.TY_STUDENT);
	student.setFullName(student.getStudentFirstName() + student.getStudentLastName());
	
	int pointFactor = (Integer)request.getAttribute("pointFactor");
	
	student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());
	
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	String semsterStr = LanguageUtil.format(pageContext, "semester-x", String.valueOf(semester));
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
%>


<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {user.getFullName(), 
		subject.getSubjectName(), student.getFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-update-point-subject-student", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(teacher.getUserId()) %>"/>
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="jspPage" value="/html/student-point/view_edit_class_subject_point.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<%
	int i = 0;
%>

<script type="text/javascript">

AUI().ready('aui-dialog',"node", function(A){

	A.all("form#<portlet:namespace />fm :text").on( "blur", function() {
    var _this = this;
	_this.each(function(value, index) {
		var tagSelect = _this.item(index);
		var ch = tagSelect.val();
		if(ch == '') {
			tagSelect.val('');
			return false;
		}
		var i = 0;
		for( i = 0 ; i < ch.length ; i++ ) {
			if(!((ch[i] >= '0' && ch[i] <= '9') || ch[i] == ' ' || ch[i] == '.')) {
				alert( ch + ' <liferay-ui:message key="invalid" />');
				tagSelect.val('0');
				return false;
			}
		}
				
		var strs = ch.split(" ");
		if(strs.length > 1 || parseInt(ch) > 10) {
			alert(ch + ' <liferay-ui:message key="point" />' + ' <liferay-ui:message key="invalid" />');
			tagSelect.val('0');
			return false;
		}
	});
			
	return true;
	});
	
	A.all("form#<portlet:namespace />fm :text").on( "focus", function() {
		 var divShowSemester=A.one("div#show-semester");  
		 divShowSemester.html('<p align="center">' + 
				 '<liferay-ui:message key="semester-x" arguments="<%=semester%>" />' + '</p>');
		divShowSemester.addClass("begin-anim-semster");
		divShowSemester.setStyle("left", "750px");
	});
	
	A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointType").on( "change", function() {
		var pointFactor = A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointFactorx");
		var subtableTrs = new Array();
		subtableTrs[2] = A.one("table#subtable tr#pw1");
		subtableTrs[1] = A.one("table#subtable tr#pr1");
		subtableTrs[3] = A.one("table#subtable tr#pw2");
		subtableTrs[4] = A.one("table#subtable tr#pw3");
		
		if(this.val() == 2) {
			pointFactor.val(1);
		}
		
		if(this.val() == 2 && pointFactor.val() == 1) {
			subtableTrs[1].removeAttribute("hidden");
			for(var i = 2 ; i < 5 ; i++) {
				subtableTrs[i].setAttribute("hidden", "hidden");
			}
			return;
		}
		
		for(var i = 2 ; i < 5 ; i++) {
			subtableTrs[i].setAttribute("hidden", "hidden");
		}
		subtableTrs[1].setAttribute("hidden", "hidden");
		var sum = parseInt(this.val()) + parseInt(pointFactor.val());
		subtableTrs[sum].removeAttribute("hidden");
	});
	
	A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointFactorx").on( "change", function() {
		var pointType = A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointType");
		var subtableTrs = new Array();
		subtableTrs[2] = A.one("table#subtable tr#pw1");
		subtableTrs[1] = A.one("table#subtable tr#pr1");
		subtableTrs[3] = A.one("table#subtable tr#pw2");
		subtableTrs[4] = A.one("table#subtable tr#pw3");
		
		if(this.val() > 1) {
			pointType.val(1);
		}
		
		if(this.val() == 1 && pointType.val() == 2) {
			subtableTrs[1].removeAttribute("hidden");
			for(var i = 2 ; i < 5 ; i++) {
				subtableTrs[i].setAttribute("hidden", "hidden");
			}
			return;
		}
		
		for(var i = 2 ; i < 5 ; i++) {
			subtableTrs[i].setAttribute("hidden", "hidden");
		}
		subtableTrs[1].setAttribute("hidden", "hidden");
		var sum = parseInt(this.val()) + parseInt(pointType.val());
		subtableTrs[sum].removeAttribute("hidden");
	});
	
	A.one("form#<portlet:namespace />fm input#<portlet:namespace />Save").on("click", function() {
		var subtableTrs = new Array();
		subtableTrs[2] = A.one("table#subtable tr#pw1");
		subtableTrs[1] = A.one("table#subtable tr#pr1");
		subtableTrs[3] = A.one("table#subtable tr#pw2");
		subtableTrs[4] = A.one("table#subtable tr#pw3");
		var pointType = A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointType");
		var pointFactor = A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointFactorx");
		if(pointType.val() == 2 && pointFactor.val() == 1) {
			for(var i = 2 ; i < 5 ; i++) {
				subtableTrs[i].remove();
			}
			return;
		}
		
		var sum = parseInt(pointFactor.val()) + parseInt(pointType.val());
		for(var i = 2 ; i < 5 ; i++) {
			if(i != sum) {
				subtableTrs[i].remove();
			}
		}
		subtableTrs[1].remove();
		
		var _this = A.all("form#<portlet:namespace />fm :text");
		_this.each(function(value, index) {
			var tagSelect = _this.item(index);
			var ch = tagSelect.val();
			if(ch == '') {
				tagSelect.val('');
				return false;
			}
			var i = 0;
			for( i = 0 ; i < ch.length ; i++ ) {
				if(!((ch[i] >= '0' && ch[i] <= '9') || ch[i] == ' ' || ch[i] == '.')) {
					alert( ch + ' <liferay-ui:message key="invalid" />');
					tagSelect.val('0');
					return false;
				}
			}
				
			var strs = ch.split(" ");
			if(strs.length > 1 || parseInt(ch) > 10) {
				alert(ch + ' <liferay-ui:message key="point" />' + ' <liferay-ui:message key="invalid" />');
				tagSelect.val('0');
				return false;
			}
					
			return true;
		});
	});
	
});

</script>

<%
float points1[] = TYServiceUtil.getPointStudentByPTPF(courses, 
		semester, student.getStudentId(), subject.getSubjectId(), 
			WebKeys.SPEAK_POINT, 1);

float points2[] = TYServiceUtil.getPointStudentByPTPF(courses, 
	semester, student.getStudentId(), subject.getSubjectId(), 
		WebKeys.WRITE_POINT, 1);

float points3[] = TYServiceUtil.getPointStudentByPTPF(courses, 
		semester, student.getStudentId(), subject.getSubjectId(), 
			WebKeys.WRITE_POINT, 2);

float points4[] = TYServiceUtil.getPointStudentByPTPF(courses, 
		semester, student.getStudentId(), subject.getSubjectId(), 
			WebKeys.WRITE_POINT, 3);
%>
	<portlet:actionURL name="updateStudentPoints" var="updateStudentPointsURL">
		<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
		<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
		<portlet:param name="pointFactor" value="<%=String.valueOf(pointFactor) %>" />
		<portlet:param name="studentId" value="<%=String.valueOf(student.getStudentId()) %>" />
	</portlet:actionURL>
	<aui:form action="<%=updateStudentPointsURL.toString() %>" method="post" name="fm">
		<div id="show-semester" align="center">
    	</div>
		<table class="student-point-table">
			<tr class="student-point-table-fist-row">
				<td width="200"><liferay-ui:message key="student" /></td>
				<td width="200"><liferay-ui:message key="point-type" /></td>
				<td width="200"><liferay-ui:message key="point-factor" /></td>
				<td width="200" id="tdpoint"><liferay-ui:message key="point" /></td>
			</tr>
			
			<tr height="5px">
				<td width="200"></td>
				<td width="200"></td>
				<td width="200"></td>
				<td width="200"></td>
			</tr>
			
			<tr>
				<td><c:out value="<%=student.getFullName() %>" /></td>
				<td width="200">
					<aui:select name="pointType" label=" ">
						<aui:option value="1"><liferay-ui:message key="point-write" /></aui:option>
						<aui:option value="2" selected="selected"><liferay-ui:message key="point-speak" /></aui:option>
					</aui:select>
				</td>
				<td>
				<aui:select name="pointFactorx" label=" ">
						<aui:option value="1" selected="selected">
							<liferay-ui:message key="point-factor-x" arguments="<%=1 %>" />
						</aui:option>
						<aui:option value="2"><liferay-ui:message key="point-factor-x" arguments="<%=2 %>" /></aui:option>
						<aui:option value="3"><liferay-ui:message key="point-factor-x" arguments="<%=3 %>" /></aui:option>
					</aui:select>
				</td>
				<td>
					<table id="subtable">
						<%i=0; %>
						<tr id="pw1">
							<c:if test="<%=points2.length > 0 %>">
								<c:forEach begin="0" end="<%=points2.length - 1 %>">
									<td><aui:input name='<%="point" + i %>' type="text" size="2" value="<%=points2[i] %>"  label=" "/></td>
									<%i++;%>
								</c:forEach>
							</c:if>
						</tr>
						
						<%i=0; %>
						<tr id="pr1" hidden="hidden">
							<c:if test="<%=points1.length > 0 %>">
								<c:forEach begin="0" end="<%=points1.length - 1 %>">
									<td><aui:input name='<%="point" + i %>' type="text" size="2" value="<%=points1[i] %>"  label=" "/></td>
									<%i++;%>
								</c:forEach>
							</c:if>
						</tr>
						
						<%i=0; %>
						<tr id="pw2" hidden="hidden">
							<c:if test="<%=points3.length > 0 %>">
								<c:forEach begin="0" end="<%=points3.length - 1 %>">
									<td><aui:input name='<%="point" + i %>' type="text" size="2" value="<%=points3[i] %>"  label=" "/></td>
									<%i++;%>
								</c:forEach>
							</c:if>
						</tr>
						
						<%i=0; %>
						<tr id="pw3" hidden="hidden">
							<c:if test="<%=points4.length > 0 %>">
								<c:forEach begin="0" end="<%=points4.length - 1 %>">
									<td><aui:input name='<%="point" + i %>' type="text" size="2" value="<%=points4[i] %>"  label=" "/></td>
									<%i++;%>
								</c:forEach>
							</c:if>	
						</tr>
					</table>
				</td>
			</tr>

		</table>
		<aui:button-row>	
			<aui:button name="Save" type="submit" />
			<aui:button name="cancel" type="cancel" onClick="<%=backURL.toString() %>" />
		</aui:button-row>
	</aui:form>



