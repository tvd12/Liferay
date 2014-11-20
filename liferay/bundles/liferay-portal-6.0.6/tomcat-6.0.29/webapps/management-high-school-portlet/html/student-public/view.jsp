<%@ include file="/init.jsp"%>

<liferay-ui:success key="studentAdded" message="class-added" />
<liferay-ui:error key="fields-required" message="fields-required" />

<portlet:actionURL name="addStudent" var="addStudentURL" />

<%
	Calendar bd = CalendarFactoryUtil.getCalendar();
	TYStudent student = (TYStudent)session.getAttribute(WebKeys.TY_STUDENT);
	if(student == null) { 
		student = new TYStudentImpl();
	}
	
	if(student.getBirthDay() != null) {
		student.setBirthDay(student.getBirthDay());
		bd.setTime(student.getBirthDay());
	} else {
		bd.set(Calendar.YEAR, 1992);
		bd.set(Calendar.MONTH, 5);
		bd.set(Calendar.DAY_OF_MONTH, 15);
		student.setBirthDay(bd.getTime());
	}
	
	List<TYClass> classes = ActionUtil.getAllClassFromSchool(
			themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId());
	int i = 0;
	
%>

<aui:form action="<%=addStudentURL.toString() %>" name="fm" method="post">
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
    <table>
    <tr><td>
    <liferay-ui:error key="class-required"
    	message="class-required" />
    	    
    <aui:select name="class">
    	<aui:option value=""><liferay-ui:message key="select-class" /></aui:option>
    	<c:if test="<%=(classes.size() > 0) %>">
	    	<c:forEach begin="0" end="<%=classes.size() - 1 %>">
	    		<aui:option value="<%=classes.get(i).getClassId() %>">
	    			<c:out value="<%=classes.get(i).getClassFullName() %>" />
	    		</aui:option>
	    		<%i++; %>
	    	</c:forEach>
    	</c:if>
    </aui:select>
    </td>
    <td style="margin-left: 10px;">
    <aui:select name="studentGroup1" label="select-k">
    	<aui:option value="1" selected="true">A</aui:option>
    	<aui:option value="2">B</aui:option>
    	<aui:option value="3">C</aui:option>
    	<aui:option value="4">D</aui:option>
    </aui:select>
    </td>
    <td style="margin-left: 10px;">
    <aui:select name="studentGroup2" label="select-h">
    	<aui:option value="1" selected="true">A</aui:option>
    	<aui:option value="2">B</aui:option>
    </aui:select>
    </td>
    <td style="margin-left: 10px;">
    <aui:select name="studentGroup3" label="select-b">
    	<aui:option value="1" selected="true"><liferay-ui:message key="tn" /></aui:option>
    	<aui:option value="2"><liferay-ui:message key="xh" /></aui:option>
    	<aui:option value="3"><liferay-ui:message key="cb" /></aui:option>
    </aui:select>
    </td></tr>
    </table>
        
    <aui:select name="gender">
      <aui:option value="male" selected="true">
             <liferay-ui:message key="male" />
      </aui:option>

      <aui:option value="female">
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
        type="text"
        size="25" helpMessage="accept-null" />

    <liferay-ui:error
        key="address-required"
        message="address-required" />

    <aui:input
        name="address"
        type="text"
        size="50" />
        
    <liferay-ui:error
        key="father-name-required"
        message="father-name-required" />
    <aui:input
        type="text"
        name="fatherName"
        size="30" />

    <liferay-ui:error
        key="phone-number-required"
        message="phone-number-required" />

    <aui:input
        name="fatherPhone"
        type="text"
        size="15" />
        
    <liferay-ui:error
        key="mother-name-required"
        message="mother-name-required" />
        
    <aui:input
        type="text"
        name="motherName"
        size="30" />

    <liferay-ui:error
        key="phone-number-required"
        message="phone-number-required" />

    <aui:input
        name="motherPhone"
        type="text"
        size="15" />

    <aui:button
        type="submit"
        value="Save"
        name="saveRegistration" />

    <portlet:renderURL var="cancelURL" windowState="normal">
      <portlet:param name="jspPage" value="/html/student-public/view.jsp" />
    </portlet:renderURL>

    <aui:button
        type="cancel"
        value="Cancel"
        onClick="<%= cancelURL.toString() %>" />

  </aui:fieldset>
</aui:form>