<%@ include file="/init.jsp"%>

<%
	TYStudent student = (TYStudent)session.getAttribute(WebKeys.TY_STUDENT);
	if(student != null) {
		student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());
	}
%>

<script type="text/javascript">
<!--
getCookie = function (c_name) {
	var c_value = document.cookie;
	var c_start = c_value.indexOf(" " + c_name + "=");
	if (c_start == -1) {
	  c_start = c_value.indexOf(c_name + "=");
	}
	if (c_start == -1) {
	  c_value = null;
	} else {
	  c_start = c_value.indexOf("=", c_start) + 1;
	  var c_end = c_value.indexOf(";", c_start);
	  if (c_end == -1) {
		c_end = c_value.length;
	  }
	  c_value = unescape(c_value.substring(c_start,c_end));
	}
	return c_value;
}

setCookie = function(c_name , value , exdays) {
	var exdate=new Date();
	exdate.setDate(exdate.getDate() + exdays);
	var c_value=escape(value) + ((exdays==null) ? "" : "; expires="+exdate.toUTCString());
	document.cookie=c_name + "=" + c_value;
}

setEmailCookie = function(c_name , value , exdays) {
	var exdate=new Date();
	exdate.setDate(exdate.getDate() + exdays);
	var c_value=value + ((exdays==null) ? "" : "; expires="+exdate.toUTCString());
	document.cookie=c_name + "=" + c_value;
}

setPasswordCookie = function(c_name , value) {
	document.cookie=c_name + "=" + value;
}

//-->
</script>

<portlet:actionURL name="authenticateMobileDevice" var="authenticateMobileDeviceURL" />

<portlet:actionURL name="authenticationStudent" var="authenticationStudentURL">
	<portlet:param name="sessionId" value="<%=session.getId() %>" />
</portlet:actionURL>

<c:if test="<%=student == null || student.getStudentId() == 0 %>">

<aui:form action="<%=authenticationStudentURL.toString() %>" method="post" name="fm1">
	<table>
		<tr>
			<td>
				<liferay-ui:error key="email-used" message="email-used" />
				<liferay-ui:error key="email-invalid" message="email-invalid" />
				<aui:input name="emailAddress" label="Email" size="25" />
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:error key="password-invalid" message="password-invalid" />
				<aui:input name="password" type="password" size="25" />
			</td>
		</tr>
		<tr>
			<td>
				<aui:input name="rememberMe" type="checkbox" label="remember-me" value="true" />
			</td>
		</tr>
		<tr>
			<td>
				<aui:button-row>
					<aui:button type="submit" name="submit" value="Login" />
				</aui:button-row>
			</td>
		</tr>
	</table>
	<div style="background-color: #CCC; height: 20px;"><liferay-ui:icon image="help" /> <liferay-ui:message key="forgot-password" /></div>
</aui:form>

<%
	String[] agrs = {String.valueOf(3), String.valueOf(25)};
%>

<portlet:actionURL name="autoLogin" var="autoLoginURL" />

<aui:form action="<%=autoLoginURL.toString() %>" method="post" name="fm3" />

<script type="text/javascript">
<!--
AUI().ready('aui-form-validator', 'aui-overlay-context-panel', 'aui-node', 'Node', function(A) {
	
	var email = A.one("form#<portlet:namespace />fm1 input#<portlet:namespace />emailAddress").val();
	var pass = A.one("form#<portlet:namespace />fm1 input#<portlet:namespace />password").val();
	
	if(getCookie("TVD_STUDENT_REMEMBERME") == "true" && 
		getCookie("TVD_STUDENT_ID") != null && 
			getCookie("TVD_STUDENT_PASSWORD") != null) {
		A.one("form#<portlet:namespace />fm3").submit();
	}
	
	A.one("#<portlet:namespace />emailAddress").addClass("aui-field-required aui-field-email");
	
	A.mix(
		YUI.AUI.defaults.FormValidator.STRINGS,
		{
			customRule: 'Type the number 55.',
			anotherRule: 'Message for another rule'
		},
		true
	);

	A.mix(
		YUI.AUI.defaults.FormValidator.RULES,
		{
			customRule: function(val, fieldNode, ruleValue) {
				return (val == 55);
			},

			anotherRule: function(val, fieldNode, ruleValue) {
				return (val == 'another');
			}
		},
		true
	);
	
	var validator1 = new A.FormValidator({
		boundingBox: '#<portlet:namespace />fm1',
		fieldContainer: 'td',
		rules: {
			<portlet:namespace />emailAddress: {
				required: true,
				email: true
			},
			<portlet:namespace />password: {
				required: true,
				rangeLength: [3, 25]
			}
		},
		fieldStrings: {
		 	<portlet:namespace />emailAddress: {
		 		required: '<%=LanguageUtil.get(pageContext, "please-input-valid-email")%>'
		 	},
		 	<portlet:namespace />password: {
		 		required: '<%=LanguageUtil.format(pageContext, "please-input-valid-password", agrs)%>'
		 	}
		 },
		 
		 on: {
		 	submitError: function(event) {
				var formEvent = event.validator.formEvent;
				var errors = event.validator.errors;
				//console.log('submitError', event, formEvent, errors);
				//return false;
			},
			submit: function(event) {
				var formEvent = event.validator.formEvent;
				//return false;
				// console.log('user submit', event);

				// formEvent.halt();
			}
		}
	});
	
	A.one("form#<portlet:namespace />fm1").on("submit", function(){
		var rememberMe = A.one("form#<portlet:namespace />fm1 input#<portlet:namespace />rememberMe").val();
		if(rememberMe == "true") {
			setCookie("TVD_STUDENT_REMEMBERME", "true");
		}
	});
	
	
});
//-->
</script>

</c:if>

<c:if test="<%=(student != null && student.getLoginCount() > 0) %>">
	<liferay-ui:message key="hello-s" arguments="<%=student.getFullName() %>" />
	<portlet:actionURL name="logout" var="logoutURL">
	<portlet:param name="sessionId" value="<%=session.getId() %>" />
	</portlet:actionURL>
	<aui:a href="<%=logoutURL.toString() %>" id="a-logout"><liferay-ui:message key="logout" /></aui:a>
	
	<script type="text/javascript">
	AUI().ready("aui-node", "Node", function(A) {
		if(<%=student != null%>) {
			if(getCookie("TVD_STUDENT_REMEMBERME") == "true") {
				setCookie("TVD_STUDENT_ID", <%=student.getStudentId()%>);
				setPasswordCookie("TVD_STUDENT_PASSWORD", "<%=student.getEmailPassword()%>");
			}
		}
		
		A.one("a#<portlet:namespace />a-logout").on("click", function() {
			setCookie("TVD_STUDENT_REMEMBERME", "false");
			setCookie("TVD_STUDENT_ID", null);
			setPasswordCookie("TVD_STUDENT_PASSWORD", null);
		});
	});
		
	</script>
</c:if>

<c:if test="<%=(student != null && student.getStudentId() > 0 && student.getLoginCount() == 0) %>">

<portlet:actionURL name="answerSystemQuestion" var="answerURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(student.getStudentId()) %>" />
</portlet:actionURL>

<%
	String title = LanguageUtil.format(pageContext, "hello-s", student.getFullName());
%>

<liferay-ui:header title="<%=title %>" />

<aui:form action="<%=answerURL.toString() %>" method="post" name="fm">
	<aui:fieldset>
		<liferay-ui:error key="please-input-valid-email" message="please-input-valid-email" />
		<aui:input name="newEmail" type="text" size="30" />
		
		<liferay-ui:error key="please-input-valid-password" message="please-input-valid-password" />
		<aui:input name="newPassword" type="password" size="20" label="new-password" />
		
		<liferay-ui:error key="password-not-dulicate" message="password-not-dulicate" />
		<aui:input name="reNewPassword" type="password" size="20" label="re-new-password" />
		<aui:select name="question">
			<aui:option value='<%=LanguageUtil.get(pageContext, "question-one") %>'>
				<liferay-ui:message key="question-one" />
			</aui:option>
			<aui:option value='<%=LanguageUtil.get(pageContext, "question-two") %>'>
				<liferay-ui:message key="question-two" />
			</aui:option>
			<aui:option value='<%=LanguageUtil.get(pageContext, "question-three") %>'>
				<liferay-ui:message key="question-three" />
			</aui:option>
			<aui:option value='<%=LanguageUtil.get(pageContext, "question-for") %>'>
				<liferay-ui:message key="question-for" />
			</aui:option>
			<aui:option value='<%=LanguageUtil.get(pageContext, "question-five") %>'>
				<liferay-ui:message key="question-five" />
			</aui:option>
		</aui:select>
		
		<liferay-ui:error key="please-enter-answer-valid" message="please-enter-answer-valid" />
		<aui:input name="answer" type="text" size="25" />
		<aui:button-row>
			<aui:button type="submit" value="Save" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>

<%
	String[] agrs1 = {String.valueOf(3), String.valueOf(25)};
%>

<script type="text/javascript">
<!--
AUI().ready('aui-form-validator', 'aui-overlay-context-panel', function(A) {

	A.one("#<portlet:namespace />newEmail").addClass("aui-field-required aui-field-email");
	
	A.mix(
		YUI.AUI.defaults.FormValidator.STRINGS,
		{
			customRule: 'Type the number 55.',
			anotherRule: 'Message for another rule'
		},
		true
	);

	A.mix(
		YUI.AUI.defaults.FormValidator.RULES,
		{
			customRule: function(val, fieldNode, ruleValue) {
				return (val == 55);
			},

			anotherRule: function(val, fieldNode, ruleValue) {
				return (val == 'another');
			}
		},
		true
	);
	
	var validator = new A.FormValidator({
		boundingBox: '#<portlet:namespace />fm',
		fieldContainer: 'td',
		rules: {
			<portlet:namespace />newEmail: {
				required: true,
				email: true,
				rangeLength: [15, 50]
			},
			<portlet:namespace />newPassword: {
				required: true,
				rangeLength: [6, 20]
			},
			<portlet:namespace />reNewPassword: {
				required: true,
				rangeLength: [6, 20],
				equalTo: "#<portlet:namespace />newPassword"
			},
			<portlet:namespace />answer: {
				required: true,
				rangeLength: [3, 20]
			}
		},
		fieldStrings: {
		 	<portlet:namespace />emailAddress: {
		 		required: '<%=LanguageUtil.get(pageContext, "please-input-valid-email")%>'
		 	},
		 	<portlet:namespace />password: {
		 		required: '<%=LanguageUtil.format(pageContext, "please-input-valid-password", agrs1)%>'
		 	}
		 },
		 
		 on: {
		 	submitError: function(event) {
				var formEvent = event.validator.formEvent;
				var errors = event.validator.errors;
				//console.log('submitError', event, formEvent, errors);
				//return false;
			},
			submit: function(event) {
				var formEvent = event.validator.formEvent;
				//return false;
				// console.log('user submit', event);

				// formEvent.halt();
			}
		}
	});
	
});
//-->
</script>
</c:if>