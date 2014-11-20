<%@ include file="/init.jsp" %>

<aui:form name="file" action="" method="post">
	<aui:input name="filePath" type="file" />
	<aui:button-row>
		<aui:button type="submit" value="Submit" />
		<aui:button type="cancel" value="Cancel" />
	</aui:button-row>
</aui:form>