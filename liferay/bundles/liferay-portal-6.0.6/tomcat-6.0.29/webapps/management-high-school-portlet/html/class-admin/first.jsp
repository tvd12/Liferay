<%@ include file="/init.jsp"%>
<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String smallImage = contextPathImg + "/images/first/class-small.png";
	String largeImage = contextPathImg + "/images/first/class-large.png";
%>

<portlet:renderURL var="viewURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/class-admin/view.jsp" />
</portlet:renderURL>

<div align="center">
	<a id="a-image-class" href="<%=viewURL.toString() %>">
		<img alt="Click To Into Class Managerment" src='<%=smallImage%>' width="550" height="300" id="one" />
		<img alt="Click To Into Class Managerment" src='<%=largeImage%>' width="560" height="310" id="two" style="display: none;" />
	</a>
</div>

<script type="text/javascript">
AUI().ready('aui-dialog','node', function(A) {
	A.one("a#a-image-class").on("mouseover", function() {
		A.one("img#one").setStyle("display", "none");
		A.one("img#two").setStyle("display", "block");
	});
	
	A.one("a#a-image-class").on("mouseout", function() {
		A.one("img#one").setStyle("display", "block");
		A.one("img#two").setStyle("display", "none");
	});
});
	
</script>