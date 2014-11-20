<%@include file="/init.jsp" %>

<%
	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	int amount = (Integer)request.getAttribute("amountStudent");
%>

<portlet:renderURL var="backURL" >
	<portlet:param name="classId" value="<%=String.valueOf(tyClass.getPrimaryKey()) %>" />
	<portlet:param name="jspPage" value="/html/class-admin/add_students.jsp" />
</portlet:renderURL>

<h3><liferay-ui:message key="class" /> <c:out value="<%=tyClass.getClassFullName() %>" /></h3>
<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>
	
<c:if test="<%=(amount == 0) %>">	

	<portlet:renderURL var="addStudentsURL">
		<portlet:param name="classId" value="<%=String.valueOf(tyClass.getPrimaryKey()) %>" />
		<portlet:param name="jspPage" value="/html/student-admin/add_students.jsp" />
	</portlet:renderURL>
	
		<liferay-ui:error key="amount-student-required" message="amount-student-required" />
		<aui:form action="<%=addStudentsURL.toString() %>" name="fm1" method="post">
			<aui:input name="amountStudent" type="text" />
			<aui:button-row>
				<aui:button type="submit" value="Submit" />
				<aui:button type="cancel" value="Cancel" onClick="<%=backURL.toString() %>"/>
			</aui:button-row>
		</aui:form>
</c:if>


<c:if test="<%=(amount != 0) %>">
	<portlet:actionURL name="addStudentsAction" var="addStudentsActionURL" />
	
	<liferay-ui:error key="invalid-full-name" message="invalid-full-name" />
	
	<aui:form action="<%=addStudentsActionURL.toString() %>" name="fm" method="post">
		<%int i = 0; %>
		<aui:input name="amountStudent" value="<%=amount %>" type="hidden"/>
		<aui:input name="classId" value="<%=tyClass.getClassId() %>" type="hidden" />
		<table>
		<c:forEach begin="0" end="<%=amount - 1 %>" var="index">
			<tr>
				<td width="30px"><font color="blue" size="2em"><c:out value='<%=(i + 1)%>' /></font></td>
				<td><aui:input name='<%=("studentFirstName" + i) %>' type="text" label="student-first-name" /></td>
				<td><aui:input name='<%= ("studentLastName" + i)%>' type="text" label="student-last-name" size="10" /></td>
			<%i++; %>
			</tr>
		</c:forEach>
		<tr>
			<td width="30px"></td>
			<td>
				<aui:button-row>
					<aui:button type="submit" value="Save" />
					<aui:button type="cancel" value="Cancel" onClick="<%=backURL.toString() %>"/>
				</aui:button-row>
			</td>
			<td></td>
		</tr>
		</table>
	</aui:form>
</c:if>