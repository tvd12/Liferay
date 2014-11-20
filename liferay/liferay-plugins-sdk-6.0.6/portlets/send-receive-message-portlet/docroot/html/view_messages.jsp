<%@include file="/init.jsp" %>

<%
	List<MSMessage> messagesReceived = ActionUtil.getMsgSendToUser(renderRequest);
%>

<p>View Messages</p>

<table>
	<%
	for(int i = 0 ; i < messagesReceived.size() ; i++) {
		long messageId = messagesReceived.get(0).getMessageId();
		User userSended = ActionUtil.getSenderMS(messageId);
	%>
	<tr>
		<td width="100px"><c:out value="<%=userSended.getEmailAddress() %>" /></td>
		<td><c:out value="<%=messagesReceived.get(i).getMessage() %>" /></td>
	</tr>
	<%} %>
</table>