<%@ include file="/init.jsp" %>

<h2><liferay-ui:message key="thank-you-regis-message" /></h2>
<h2><liferay-ui:message key="info-current-student" /></h2>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/student-public/view.jsp" />
</portlet:renderURL>

<liferay-ui:header title="" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<%
	TYStudent student = (TYStudent)request.getAttribute(WebKeys.TY_STUDENT);
	student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());
	
	TYClass tyClass = TYServiceUtil.getClassOfStudent(
			TYServiceUtil.getCurrentCourse(), student.getStudentId());
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	
	char k = (char)('A'  + student.getStudentGroup1() - 1);
	char h = (char)('A'  + student.getStudentGroup1() - 1);
%>

<p><liferay-ui:message key="full-name" />: <c:out value="<%=student.getFullName() %>" /></p>
<p><liferay-ui:message key="class" />: <c:out value="<%=tyClass.getClassFullName() %>" />
<p>
	<liferay-ui:message key="select-k" />: <c:out value="<%=k %>" />
</p>
<p>
	<liferay-ui:message key="select-h" />: <c:out value="<%=k %>" />
</p>
<p>
	<liferay-ui:message key="select-b" />: 
	<c:choose>
		<c:when test="<%=student.getStudentGroup3() == 1 %>">
			<liferay-ui:message key="tn" />
		</c:when>
		<c:when test="<%=student.getStudentGroup3() == 2 %>">
			<liferay-ui:message key="xh" />
		</c:when>
		<c:when test="<%=student.getStudentGroup3() == 3 %>">
			<liferay-ui:message key="cb" />
		</c:when>
	</c:choose>
</p>
<p>
	<liferay-ui:message key="gender" />: 
	<c:choose>
		<c:when test="<%=student.getMale() %>">
			<liferay-ui:message key="male" />
		</c:when>
		<c:otherwise>
			<liferay-ui:message key="female" />
		</c:otherwise>
	</c:choose>
</p>

<p><liferay-ui:message key="birth-day" />:  <c:out value="<%=student.getBirthDay() %>" /></p>

<p><liferay-ui:message  key="email-address" />: <c:out value="<%=student.getEmailAddress() %>" /></p>

<p><liferay-ui:message key="address" />: <c:out value="<%=student.getAddress() %>" /></p>
<p><liferay-ui:message key="father-name" />: <c:out value="<%=student.getFatherName() %>" /></p>
<p><liferay-ui:message key="father-phone" />: <c:out value="<%=student.getFatherPhone() %>" /></p>
<p><liferay-ui:message key="mother-name" />: <c:out value="<%=student.getMotherName() %>" /></p>
<p><liferay-ui:message key="mother-phone" />: <c:out value="<%=student.getMotherPhone() %>" /></p>