<%@ include file="/init.jsp" %>

<%
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
%>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>


<%
	String title = LanguageUtil.format(pageContext, "infor-teacher", teacher.getFullName());
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
%>
<liferay-ui:header title="<%=title.toString() %>" 
	backURL="<%=backURL.toString() %>" backLabel="<%=backTitle.toString() %>" />	
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<%
	List<Phone> phones = TYServiceUtil.getPhoneByUserId(teacher.getUserId());
	int i = 0;
%>

<p><liferay-ui:message key="full-name"/>: <c:out value="<%=teacher.getFullName() %>" /></p>
<p><liferay-ui:message key="birth-day" />: <c:out value="<%=teacher.getBirthday() %>" /></p>
<p><liferay-ui:message key="email" />: <c:out value="<%=teacher.getEmailAddress() %>" />
<p><liferay-ui:message key="phone-number" />: 
<c:if test="<%=(phones.size() == 0) %>">
	<liferay-ui:message key="have-not" />
</c:if>
<c:if test="<%=(phones.size() > 0) %>">
	<c:forEach begin="1"  end="<%=phones.size() %>" varStatus="status">
		<c:out value="<%=phones.get(i).getNumber() %>" />
		<%i++; %>
		<c:if test="${!status.last }">
			<c:out value=", " />
		</c:if>
	</c:forEach>
</c:if>
</p>
<p><liferay-ui:message key="last-login-date" />: <c:out value="<%=teacher.getLastLoginDate() %>" /></p>