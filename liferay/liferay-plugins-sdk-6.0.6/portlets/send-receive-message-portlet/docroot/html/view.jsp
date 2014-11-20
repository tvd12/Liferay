<%@include file="/init.jsp" %>

This is the <b>Send Receive Message</b> portlet.
<%
	List<User> userList = ActionUtil.getAllUser(renderRequest);
	List<MSMessage> messagesReceived = ActionUtil.getMsgSendToUser(renderRequest);
%>

<portlet:actionURL name="viewMessages" var="viewMessagesURL"></portlet:actionURL>
<c:set var="messagesCount" value="<%=messagesReceived.size() %>" />

<p><font color="blue"><c:out value="You have ${messagesCount } new messages" /></font> 
	<liferay-ui:icon image="view" message="View" url="<%=viewMessagesURL.toString() %>" />
</p>

<portlet:actionURL name="addMessage" var="addMessageURL" />
<aui:form action="<%=addMessageURL.toString() %>" name="fm" method="post">
	<aui:fieldset>
		<aui:select name="userIdRecieve">
			<c:forEach items="<%=userList %>" var="msUser">
				<aui:option value="${msUser.userId }">
					<c:out value="${msUser.emailAddress }" />
				</aui:option>
			</c:forEach>
		</aui:select>
		<aui:input name="message" type="textarea"  />
		<aui:button-row>
			<aui:button type="submit" value="Save" />
			<portlet:renderURL var="cancelURL" windowState="normal">
				<portlet:param name="jspPage" value="/html/view.jsp" />
			</portlet:renderURL>
			<aui:button type="cancel" value="Cancel" onClick="<%=cancelURL.toString() %>" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>