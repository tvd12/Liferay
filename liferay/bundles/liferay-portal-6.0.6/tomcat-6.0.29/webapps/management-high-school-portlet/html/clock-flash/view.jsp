<%@ include file="/init.jsp" %>

<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	//contextPathImg + "/flash/free-flash-clock-124.swf"
%>

<!--
<div align="center" style="margin-top: -10px">
<embed src=
		width=250 height=240 type=application/x-shockwave-flash></embed>
</div>
-->

<style>
<!--
.analog {
	position: relative;
	width: 150px;
  	margin: auto;
	background: url(<%=contextPathImg + "/images/clockface.jpg" %>);
	list-style: none;

}

.analog,.analog .hour,.analog .min,.analog .sec {
	height: 150px;
}

.analog .hour,.analog .min,.analog .sec {
	position: absolute;
	width: 8px;
	top: 0;
	left: 70.5px;
  	padding: 0;
}

.analog .sec {
	background: url(<%=contextPathImg + "/images/sechand.png" %>);
	z-index: 3;
}

.analog .min {
	background: url(<%=contextPathImg + "/images/minhand.png" %>);
	z-index: 2;
}

.analog .hour {
	background: url(<%=contextPathImg + "/images/hourhand.png" %>);
	z-index: 1;
}

.title {
	font-size: 11px;
	font-weight: bold;
	color: #333;
}

.analog .meridiem {
	margin-top: 90px;
	font-size: 11px;
	font-weight: bold;
	color: #333333;
  display: inline-block;
}
-->
</style>

<div id="main" align="center" style="margin-top: -10px;">
	<div style="text-align: center;">
      	<ul id="analog-clock" class="analog">	
            <li class="hour"></li>
            <li class="min"></li>
            <li class="sec"></li>
            <li class="meridiem"></li>
        </ul>
     </div>
</div>

<script type="text/javascript">
<!--

function extend(a, b){
    for(var key in b)
        if(b.hasOwnProperty(key))
            a[key] = b[key];
    return a;
}

AUI().ready("node", "datasource", "oop", function(A) {
	A.clock = function(options) {
		var defaults = {
				offset: '+0',
				type: 'analog'
			};
		var opts = extend(defaults, options);

		setInterval( function() {
			var seconds = A.calcTime(opts.offset).getSeconds();
			if(opts.type=='analog') {
				var sdegree = seconds * 6;
				var srotate = "rotate(" + sdegree + "deg)";
				A.one(".sec").setStyles({"transform" : srotate, "-webkit-transform" : srotate});
			} else {
				A.one(".sec").html(seconds);
			}
		}, 1000);
		
		setInterval( function() {
			var hours = A.calcTime(opts.offset).getHours();
			var mins = A.calcTime(opts.offset).getMinutes();
			if(opts.type=='analog') { 
				var hdegree = hours * 30 + (mins / 2);
				var hrotate = "rotate(" + hdegree + "deg)";
				A.one(".hour").setStyles({"transform" : hrotate, "-webkit-transform" : hrotate});
			} else {
				A.one(".hour").html(hours+':');
			}
			var meridiem = hours<12?'AM':'PM';
			A.one('.meridiem').html(meridiem);
		}, 1000);
	
		setInterval( function() {
			var mins = A.calcTime(opts.offset).getMinutes();
			if(opts.type=='analog') {
				var mdegree = mins * 6;
				var mrotate = "rotate(" + mdegree + "deg)";        
				A.one(".min").setStyles({"transform" : mrotate, "-webkit-transform" : mrotate}); 
			} else {
				A.one(".min").html(mins+':');
			}
		}, 1000);
	};

	A.calcTime = function(offset) {
		nd = new Date();
		return nd;
	};
	
	A.clock({offset: '+5', type: 'analog'});
});
//-->
</script>