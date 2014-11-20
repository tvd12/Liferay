<%@ include file="/init.jsp"%>

<%
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
%>

<div>
	<h3>
		<font color="blue" style="text-align: center; margin-left: 150px;"><liferay-ui:message key="courses" /> 
		<c:out value="<%=courseString %>" /></font>
	</h3>
</div>

<portlet:renderURL var="backURL" windowState="normal">
	<portlet:param name="jspPage" value="/html/subject-admin/view.jsp" />
</portlet:renderURL>

<%
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");
	String title = LanguageUtil.format(pageContext, "Subject-x", subject.getSubjectName());
	
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	List<TYClass> classes = ActionUtil.getAllClassFromSchool(companyId, groupId);
%>
<liferay-ui:header title="<%=title %>" />
	
<div align="right">
	<a href="<%=backURL.toString()%>" style="text-decoration: none; font-weight: bold;"><%=backTitle%></a>
</div>

<portlet:actionURL name="updateFactor" var="updateFactorURL">
	<portlet:param name="resourcePrimKey" value="<%=String.valueOf(subject.getSubjectId()) %>" />
</portlet:actionURL>

<c:if test="<%=classes != null && classes.size() > 0 %>">

<table>

<aui:form action="<%=updateFactorURL.toString()%>" name="fm" method="post">
	<aui:fieldset>
	<tr>
		<td width="80px">
			<aui:select name="classId" label="class">
				<aui:option value="all"><liferay-ui:message key="all" /></aui:option>
				<%int i = 0;%>
				<c:forEach begin="1" end="<%=classes.size() %>">
					<aui:option value="<%=classes.get(i).getClassId() %>">
						<c:out value="<%=classes.get(i).getClassFullName() %>" />
					</aui:option>
				<%i++; %>
				</c:forEach>
			</aui:select>
		</td>
		<td>
			<aui:select name="xFactor">
				<aui:option value="1"><c:out value="x1" /></aui:option>
				<aui:option value="2"><c:out value="x2" /></aui:option>
			</aui:select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<aui:button-row>
				<aui:button type="submit" value="Submit" />
				<aui:button type="cancel" value="Cancel" onClick="<%=backURL.toString() %>"  />
			</aui:button-row>
		</td>
	</tr>
	</aui:fieldset>
</aui:form>

</table>
</c:if>