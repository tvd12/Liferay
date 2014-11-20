<%@ include file="/init.jsp"%>
<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String smallImage = contextPathImg + "/images/first/subject-small-one.png";
	String largeImage = contextPathImg + "/images/first/subject-large-one.png";
%>

<portlet:renderURL var="viewURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/subject-admin/view.jsp" />
</portlet:renderURL>

<div align="center">
	<a id="a-image-subject" href="<%=viewURL.toString() %>">
		<img alt="Click To Into Class Managerment" src='<%=smallImage%>' width="490" height="300" id="one-subject" />
		<img alt="Click To Into Class Managerment" src='<%=largeImage%>' width="500" height="310" id="two-subject" style="display: none;" />
	</a>
</div>

<script type="text/javascript">
AUI().ready('aui-dialog','node', function(A) {
	A.one("a#a-image-subject").on("mouseover", function() {
		A.one("img#one-subject").setStyle("display", "none");
		A.one("img#two-subject").setStyle("display", "block");
	});
	
	A.one("a#a-image-subject").on("mouseout", function() {
		A.one("img#one-subject").setStyle("display", "block");
		A.one("img#two-subject").setStyle("display", "none");
	});
});
	
</script>