<%@ include file="/init.jsp"%>
<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String smallImage = contextPathImg + "/images/first/teacher-small.png";
	String largeImage = contextPathImg + "/images/first/teacher-large.png";
%>

<portlet:renderURL var="viewURL" windowState="maximized">
	<portlet:param name="jspPage" value="/html/teacher-admin/view.jsp" />
</portlet:renderURL>

<div align="center">
	<a id="a-image-teacher" href="<%=viewURL.toString() %>">
		<img alt="Click To Into Class Managerment" src='<%=smallImage%>' width="190" height="240" id="one-teacher" />
		<img alt="Click To Into Class Managerment" src='<%=largeImage%>' width="200" height="250" id="two-teacher" style="display: none;" />
	</a>
</div>

<script type="text/javascript">
AUI().ready('aui-dialog','node', function(A) {
	A.one("a#a-image-teacher").on("mouseover", function() {
		A.one("img#one-teacher").setStyle("display", "none");
		A.one("img#two-teacher").setStyle("display", "block");
	});
	
	A.one("a#a-image-teacher").on("mouseout", function() {
		A.one("img#one-teacher").setStyle("display", "block");
		A.one("img#two-teacher").setStyle("display", "none");
	});
});
	
</script>