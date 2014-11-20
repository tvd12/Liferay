<%@include file="/init.jsp" %>

<%
	TYStudent student = (TYStudent)request.getAttribute(WebKeys.TY_STUDENT);
	student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());

	TYClass tyClass = TYServiceUtil.getClassOfStudent(
			TYServiceUtil.getCurrentCourse(), student.getStudentId());
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
		
	Calendar bd = CalendarFactoryUtil.getCalendar();
	if(student.getBirthDay() != null) {
		bd.setTime(student.getBirthDay());
	} else {
		bd.set(Calendar.YEAR, 1992);
		bd.set(Calendar.MONTH, 5);
		bd.set(Calendar.DAY_OF_MONTH, 15);
	}
	
	String title = LanguageUtil.format(pageContext, "update-info-student", student.getFullName());
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId())%>" />
	<portlet:param name="jspPage" value="/html/class-admin/add_students.jsp" />
</portlet:renderURL>

<liferay-ui:header title="<%=title %>" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<liferay-ui:success key="update-success" message="update-success" />
<liferay-ui:error key="fields-required" message="fields-required" />

<portlet:actionURL name="updateStudent" var="updateStudentURL">
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getClassId())%>" />
	<portlet:param name="studentId" value="<%=String.valueOf(student.getStudentId()) %>" />
</portlet:actionURL>

<aui:form action="<%=updateStudentURL.toString() %>" name="fm" method="post">
	<aui:fieldset>
	
    <liferay-ui:error
        key="firstname-required"
        message="firstname-required" />

    <aui:input
        type="text"
        name="studentFirstName"
        size="25" value="<%=student.getStudentFirstName() %>" />

    <liferay-ui:error
        key="lastname-required"
        message="lastname-required" />

    <aui:input name="studentLastName"
        type="text"
        size="8" value="<%=student.getStudentLastName() %>" />
    
    <liferay-ui:error key="class-required"
    	message="class-required" />
    	    
	<liferay-ui:message key="class" />: <c:out value="<%=tyClass.getClassFullName() %>" />
	
	<table>
    <tr><td>
	<aui:select name="studentGroup1" label="select-k">
    	<aui:option value="1" selected="<%=student.getStudentGroup1() == 1 %>">A</aui:option>
    	<aui:option value="2" selected="<%=student.getStudentGroup1() == 2 %>">B</aui:option>
    	<aui:option value="3" selected="<%=student.getStudentGroup1() == 3 %>">C</aui:option>
    	<aui:option value="4" selected="<%=student.getStudentGroup1() == 4 %>">D</aui:option>
    </aui:select>
    </td>
    <td>
    <aui:select name="studentGroup2" label="select-h">
    	<aui:option value="1" selected="<%=student.getStudentGroup2() == 1 %>">A</aui:option>
    	<aui:option value="2" selected="<%=student.getStudentGroup2() == 2 %>">B</aui:option>
    </aui:select>
    </td>
    <td>
    <aui:select name="studentGroup3" label="select-b">
    	<aui:option value="1" selected="<%=student.getStudentGroup3() == 1 %>"><liferay-ui:message key="tn" /></aui:option>
    	<aui:option value="2" selected="<%=student.getStudentGroup3() == 2 %>"><liferay-ui:message key="xh" /></aui:option>
    	<aui:option value="3" selected="<%=student.getStudentGroup3() == 3 %>"><liferay-ui:message key="cb" /></aui:option>
    </aui:select>
    </td></tr>
    </table>
        
    <aui:select name="gender">
      <aui:option value="male" selected="<%=student.isMale() %>">
             <liferay-ui:message key="male" />
      </aui:option>
		
      <aui:option value="female" selected="<%=!student.isMale() %>">
             <liferay-ui:message key="female" />
       </aui:option>
    </aui:select>
    
    <liferay-ui:error
        key="birthdate-required"
        message="date-of-birth-required" />
    <liferay-ui:error
        key="enter-valid-date"
        message="enter-valid-date" />
    
    <aui:input
        name="birthDay"
        model="<%= TYStudent.class %>"
        bean="<%= student  %>"
        value="<%= bd %>" />
        
    <liferay-ui:error
        key="email-invalid"
        message="email-invalid" />
        
	<liferay-ui:error
    	key="email-exists"
    	message="email-exists" />

    <aui:input
        name="email"
        type="text" value="<%=student.getEmailAddress() %>" 
        size="25" helpMessage="accept-null" />

    <liferay-ui:error
        key="address-required"
        message="address-required" />

    <aui:input
        name="address"
        type="text"
        size="50" value="<%=student.getAddress() %>" />
        
    <liferay-ui:error
        key="father-name-required"
        message="father-name-required" />
    <aui:input
        type="text"
        name="fatherName"
        size="30" value="<%=student.getFatherName() %>" />

    <liferay-ui:error
        key="phone-number-required"
        message="phone-number-required" />

    <aui:input
        name="fatherPhone"
        type="text"
        size="15" value="<%=student.getFatherPhone() %>" />
        
    <liferay-ui:error
        key="mother-name-required"
        message="mother-name-required" />
        
    <aui:input
        type="text"
        name="motherName"
        size="30" value="<%=student.getMotherName() %>" />

    <liferay-ui:error
        key="phone-number-required"
        message="phone-number-required" />

    <aui:input
        name="motherPhone"
        type="text"
        size="15" value="<%=student.getMotherPhone() %>" />

    <aui:button
        type="submit"
        value="Save"
        name="saveRegistration" />

    <aui:button
        type="cancel"
        value="Cancel"
        onClick="<%= backURL.toString() %>" />

  </aui:fieldset>
</aui:form>