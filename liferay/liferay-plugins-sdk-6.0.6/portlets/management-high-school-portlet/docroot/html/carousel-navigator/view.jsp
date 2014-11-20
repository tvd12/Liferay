<%@ include file="/init.jsp"%>

<style type="text/css" media="screen">

#wrapper {
	
}

.aui-carousel-item {
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;

	text-indent: -9999em;
	
}

.div-carousel-class {
	width: 110%; 
	height: 100%;
}

</style>



<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
%>

<div id="wrapper" style="margin: 0px 0px 0px 0px; margin-left:-3px; ">
	<div id="demo">
		<div style="background: url(<%=contextPathImg +  "/images/article0.png"%>);" class="div-carousel-class">Article0</div>
		<div style="background: url(<%=contextPathImg +  "/images/article1.png"%>);" class="div-carousel-class">Article1</div>
		<div style="background: url(<%=contextPathImg +  "/images/article2.png"%>);" class="div-carousel-class">Article2</div>
		<div style="background: url(<%=contextPathImg +  "/images/article3.png"%>);" class="div-carousel-class">Article3</div>
		<div style="background: url(<%=contextPathImg +  "/images/article0.png"%>);" class="div-carousel-class">Article4</div>
		<div style="background: url(<%=contextPathImg +  "/images/article1.png"%>);" class="div-carousel-class">Article5</div>
		<div style="background: url(<%=contextPathImg +  "/images/article2.png"%>);" class="div-carousel-class">Article6</div>
		<div style="background: url(<%=contextPathImg +  "/images/article3.png"%>);" class="div-carousel-class">Article7</div>
	</div>
</div>

<script type="text/javascript" charset="utf-8">

AUI().ready('aui-carousel', function(A) {

	var component = new A.Carousel(
		{
			intervalTime: 3,
			contentBox: '#demo',
			activeIndex: 'rand',
			height: 254,
			width: 860
		}
	)
	.render();

});

</script>
