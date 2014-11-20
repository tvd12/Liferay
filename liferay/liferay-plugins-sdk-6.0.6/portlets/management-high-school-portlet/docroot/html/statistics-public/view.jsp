<%@ include file="/init.jsp"%>

<script type="text/javascript"> 
$(document).ready(function(){
	$("li#flip").each(function(index, value) {
		$(this).mouseenter(function(){
			//$("#panel").slideToggle("slow");
			$("ul#panel").eq(index).slideDown("fast");
		});
		
		$(this).mouseleave(function(){
			//$("#panel").slideToggle("slow");
			$("ul#panel").eq(index).slideUp("fast");
		});
	});
  	
});
</script>
 
<style type="text/css"> 
	#flip {
		cursor: pointer;
		padding: 5px;
		background-color:blue;
		border:solid 1px white;
		font-size: 14px;
		font-weight: bold;
	}

	#panel, #flip {
		text-align:left;
	}
	#panel {
		border: none;
		list-style: none;
		color: white;
		padding: 5px;
		font-size: 13px;
		display:none;
	}
	
	span#tvd-span-st {
		color: white;
		text-decoration: none;
	}
	
	span#tvd-span-st:hover {
		color: navy;
	}
	
	#ul-id-statistics-sides-wrapper {
		color: white;
		list-style: none;
		margin-left: -5px;
	}
	
	li#ul-panel-li {
		border:solid 1px white;
		background-color: #4775FF;
	}
	
	ul#panel li a {
		text-decoration: none;
	}
</style>

<%
	String contextPathImg = renderResponse.encodeURL(
			renderRequest.getContextPath()) + "/images";
	String statisticsPathImg = contextPathImg + "/statistics";
	List<String> menuTitles = new ArrayList<String>();
	menuTitles.add("Educational-statistics-sides");
	menuTitles.add("Class-statistics");
	menuTitles.add("School-statistics");
	menuTitles.add("Courses-statistics");
%>

<ul id="ul-id-statistics-sides-wrapper">

<%int k = 0; %>
<c:forEach begin="1" end="<%=menuTitles.size() %>">

	<li id="flip">
		<div>
			<img alt="v" src='<%=statisticsPathImg + "/play-white.png" %>' />
			<liferay-ui:message key="<%=menuTitles.get(k) %>" />
		</div>
		<ul id="panel">
			<%
				int i = 1;
				String renderStatisJSP = null;
				if(k == 2) {
					renderStatisJSP = "/html/statistics-public/details_students.jsp";
				} else {
					renderStatisJSP = "/html/statistics-public/statistics_sides.jsp";
				}
			%>
			<c:forEach begin="0" end="2">
				<portlet:renderURL var="statisticsSidesURL" windowState="maximized">
					<portlet:param name="jspPage" value="<%=renderStatisJSP %>" />
					<portlet:param name="semester" value="<%=String.valueOf(i) %>" />
				</portlet:renderURL>
				
				<li id="ul-panel-li">
					<img alt="o" src='<%=statisticsPathImg + "/zoom.png"%>'>
					<aui:a href="<%=statisticsSidesURL.toString() %>">
						<span id="tvd-span-st">
							<c:if test="<%=i < 3 %>">
								<liferay-ui:message key="statistics-semester-x" arguments="<%=i %>" />
							</c:if>
							<c:if test="<%=i == 3 %>">
								<liferay-ui:message key="statistics-course" />
							</c:if>
						</span>
					</aui:a>
				</li>
			<%i++; %>
			</c:forEach>
		</ul>
	</li>
	<%k++; %>
	</c:forEach>
</ul>

