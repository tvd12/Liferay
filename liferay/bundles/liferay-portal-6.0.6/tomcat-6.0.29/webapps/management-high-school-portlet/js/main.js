AUI().ready('aui-dialog','node', function(A) {
	A.one("h3#type-point-role-title").on("click", function() {
		 A.one("div#type-point-role-slide").slideToggle("slow");
	});
	
	A.one("h3#manager-class-role-title").on("click", function() {
		 A.one("div#manager-class-role-slide").slideToggle("slow");
	});
});
