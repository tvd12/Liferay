<%@include file="/init.jsp"  %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
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
<c:if test="<%=semester != 0 %>">

<portlet:actionURL name="importPointFromExcelFile" var="readFileURL">
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
</portlet:actionURL>

<div id="div-dialog-file-upload" hidden="hidden">
	<aui:form name="file" action="<%=readFileURL.toString() %>" method="post" enctype="multipart/form-data">
		<aui:input name="filePath" type="file" />
		<aui:button-row>
			<aui:button type="submit" value="Submit" />
		</aui:button-row>
	</aui:form>
</div>

<div id="id-addstudent-div" style="background-color: #CCCCCC; margin-top: 5px; 
	margin-bottom: 15px; line-height: 25px; color: red; font-size: 16px; font-weight: bold; ">
	<c:if test='<%=permissionChecker.hasPermission(groupId, name, teacher.getUserId(), "TYPE_POINT") %>'>
		<liferay-ui:message key="import-points-from-file" />
		<a id="fileUpload" style="text-decoration: none; cursor: pointer;"><liferay-ui:icon image="add_article" /></a>
	</c:if>
</div>

<div align="center">
	<h3><font color="blue" style="text-align: center; margin-left: 150px;">
		<liferay-ui:message key="courses" /> <c:out value="<%=courseString %>" />
		<label><liferay-ui:message key="semester-y" arguments="<%=semester %>" /></label>
	</font></h3>
</div>

<%
	String args[] = {user.getFullName(), 
		subject.getSubjectName(), tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/teacher-admin/view_permission.jsp" />
</portlet:renderURL>

<div id="div-header-tvd-custom"><liferay-ui:header title="<%=title %>" /></div>
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<portlet:renderURL var="viewEditStudentsPointsURL">
	<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
	<portlet:param name="jspPage" value="/html/student-point/view_edit_class_subject_point.jsp" />
</portlet:renderURL>

<br />
<div align="right">
	<a href="<%=viewEditStudentsPointsURL.toString()%>" style="text-decoration: none;">
		<liferay-ui:icon image="edit" />
		<liferay-ui:message key="edit-point" />
	</a>
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

hiddenTags = function(a, b, c) {
	a.setAttribute("hidden", "hidden");
	b.setAttribute("hidden", "hidden");
	c.setAttribute("hidden", "hidden");
}


AUI().ready('aui-dialog',"node", function(A){

		A.one("form#<portlet:namespace />fm select#<portlet:namespace />pointFactor").on( "change", function() {
		var pointTypes = A.all("form#<portlet:namespace />fm select#<portlet:namespace />pointType");
		var td11 = A.all("table#tableinputpoint td.tdpoinfactor11");
		var td12 = A.all("table#tableinputpoint td.tdpoinfactor12");
		var td21 = A.all("table#tableinputpoint td.tdpoinfactor21");
		var td31 = A.all("table#tableinputpoint td.tdpoinfactor31");
		
		var options = A.all("form#<portlet:namespace />fm select#<portlet:namespace />pointType option[value=2]");
		
		var _this = this;
		
		if(parseInt(_this.val()) > 1) {
			pointTypes.each(function(value, index) {
				pointTypes.item(index).val(1);
			});
			
			options.each(function(value, index) {
				options.item(index).setAttribute("hidden", "hidden");
			});
		} else {
			options.each(function(value, index) {
				options.item(index).removeAttribute("hidden");
			});
		}
		
		pointTypes.each(function(value, index) {
			var pointType = pointTypes.item(index);
			var pointFactorVal = parseInt(_this.val()); 
			var pointTypeVal = parseInt(pointType.val());
			if( pointFactorVal == 1) {
				if(pointTypeVal == 1) {
					td11.item(index).removeAttribute("hidden");
					hiddenTags(td12.item(index), td21.item(index), td31.item(index));
				} else {
					td12.removeAttribute("hidden");
					hiddenTags(td11.item(index), td21.item(index), td31.item(index));
				}
			} else if(pointFactorVal == 2) {
				if(pointTypeVal == 1) {
					td21.item(index).removeAttribute("hidden");
					hiddenTags(td11.item(index), td12.item(index), td31.item(index));
				}
			} else {
				if(pointTypeVal == 1) {
					td31.item(index).removeAttribute("hidden");
					hiddenTags(td11.item(index), td12.item(index), td21.item(index));
				}
			}
		});
	});
	
	A.one("form#<portlet:namespace />fm select[name='<portlet:namespace />pointType0']").on("change", function() {
		var pointTypes = A.all("form#<portlet:namespace />fm select#<portlet:namespace />pointType");
		var tmp = this.val();
		pointTypes.each(function(value, index) {
			this.val(tmp);
		});
	});
	
	A.all("form#<portlet:namespace />fm select#<portlet:namespace />pointType").on("change", function() {
		var td11 = A.all("table#tableinputpoint td.tdpoinfactor11");
		var td12 = A.all("table#tableinputpoint td.tdpoinfactor12");
		var td21 = A.all("table#tableinputpoint td.tdpoinfactor21");
		var td31 = A.all("table#tableinputpoint td.tdpoinfactor31");
	
		var _this = this;
		
		_this.each(function(value, index) {
			var _index = index;
			var pointType = parseInt(this.val());
			if(pointType == 1) {
				td11.item(_index).removeAttribute("hidden");
				hiddenTags(td12.item(_index), td21.item(_index), td31.item(_index));
			} else {
				td12.item(_index).removeAttribute("hidden");
				hiddenTags(td11.item(_index), td21.item(_index), td31.item(_index));
			}
		});
		
	});
	

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

<liferay-ui:error key="error-in-excel-file" message="error-in-excel-file" />
<liferay-ui:error key="error-column-1" message="error-column-1" />
<liferay-ui:error key="error-column-2" message="error-column-2" />
<liferay-ui:error key="error-column-3" message="error-column-3" />
<liferay-ui:error key="error-column-4" message="error-column-4" />
<liferay-ui:error key="error-column-5" message="error-column-5" />
<liferay-ui:error key="error-file-size" message="error-file-size" />

<%i=0; %>
<div style="background-color: green;">
	<c:if test="<%=size == 0 %>">
		<liferay-ui:icon image="activate" /> <liferay-ui:message key="there-are-no-students" />
	</c:if>
</div>
<c:if test="<%=size > 0 %>">
	<portlet:actionURL name="addStudentsPoints" var="addStudentsPointsURL">
		<portlet:param name="subjectId" value="<%=String.valueOf(subject.getSubjectId()) %>" />
		<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId()) %>" />
		<portlet:param name="amountStudent" value="<%=String.valueOf(students.size()) %>" />
	</portlet:actionURL>
	<aui:form action="<%=addStudentsPointsURL.toString() %>" method="post" name="fm">
		<aui:select name="pointFactor" label="point-factor">
			<aui:option value="1"><liferay-ui:message key="point-factor-x" arguments="<%=1 %>" /></aui:option>
			<aui:option value="2"><liferay-ui:message key="point-factor-x" arguments="<%=2 %>" /></aui:option>
			<aui:option value="3"><liferay-ui:message key="point-factor-x" arguments="<%=3 %>" /></aui:option>
		</aui:select>
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
						<aui:select name="<%=selectName %>" id="pointType" label=" ">
							<aui:option value="1"><liferay-ui:message key="point-write" /></aui:option>
							<aui:option value="2"><liferay-ui:message key="point-speak" /></aui:option>
						</aui:select>
					</td>
					<td width="200"><aui:input name="<%=pointName %>" type="text" label=" " /></td>
					<td width="200px" class="tdpoinfactor11">
						<%
						float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 1);
						String pointString = TYServiceUtil.floatsToPointString(points);
						%>
						<c:out value="<%=pointString %>" />
					</td>
					
					<td width="200px" class="tdpoinfactor12" hidden="hidden">
						<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.SPEAK_POINT, 1);
						pointString = TYServiceUtil.floatsToPointString(points);
						%>
						<c:out value="<%=pointString %>" />
					</td>
					
					<td width="200px" class="tdpoinfactor21" hidden="hidden">
						<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 2);
						pointString = TYServiceUtil.floatsToPointString(points);
						%>
						<c:out value="<%=pointString %>" />
					</td>
					
					<td width="200px" class="tdpoinfactor31" hidden="hidden">
						<%
						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								1, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 3);
						if(points == null) {
							pointString = LanguageUtil.format(pageContext, "unknown", "");
						} else {
							pointString = TYServiceUtil.floatsToPointString(points);
						}
						%>
						<c:out value="<%=pointString %>" />
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
			uri: '<%=contextPathImg + "/html/file-upload/help_add_points.html"%>'
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
</c:if>

<c:if test="<%=semester == 0 %>">
	<font color="red"><liferay-ui:message key="cannot-type-point" /></font>
</c:if>