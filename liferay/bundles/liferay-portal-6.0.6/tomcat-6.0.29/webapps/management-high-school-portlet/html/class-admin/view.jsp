<%@include file="/init.jsp" %>

<portlet:actionURL name="addClass" var="addClassURL" />

<liferay-ui:success key="append-class-success" message="append-class-success" />
<liferay-ui:success key="delete-class-success" message="delete-class-success" />

<%
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	long primKey = themeDisplay.getUser().getPrimaryKey();
%>
<c:if test='<%=permissionChecker.hasPermission(groupId, name, primKey, TYActionKeys.ADD_CLASS) %>'>
	<aui:form action="<%=addClassURL.toString() %>" name="fm" method="post">
		<aui:fieldset>
			<aui:input name="classCode" helpMessage="accept-null" />
			<liferay-ui:error key="class-group-required" message="class-group-required" />
			<aui:select name="classGroup">
				<aui:option value=""><liferay-ui:message key="select-class-group"/></aui:option>
				<aui:option value="10">10</aui:option>
				<aui:option value="11">11</aui:option>
				<aui:option value="12">12</aui:option>
			</aui:select>
			<liferay-ui:error key="class-name-required" message="class-name-required" />
			<aui:input name="className" />
			<aui:button type="submit" value="save" />
		</aui:fieldset>
	</aui:form>
<br />
</c:if>
<liferay-ui:search-container emptyResultsMessage="there-are-no-class" delta="10">
	<liferay-ui:search-container-results>
		<%
		List<TYClass> classes = 
			ActionUtil.getAllClassFromSchool(companyId, groupId);
		results = ListUtil.subList(
				classes, searchContainer.getStart(), searchContainer.getEnd());
		total = classes.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="org.tvd.thptty.model.TYClass"
		keyProperty="classId"
		modelVar="tyClass">
	<liferay-ui:search-container-column-text 
		name="index" 
		property="index" />
	
	<liferay-ui:search-container-column-text 
		name="class-code" 
		property="classCode" />
		
	<liferay-ui:search-container-column-text 
		name="class-name" 
		property="classFullName" />
		
	<liferay-ui:search-container-column-jsp
          path="/html/class-admin/class_action.jsp"
          align="right" />
          
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>