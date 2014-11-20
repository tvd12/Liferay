/*AUI().ready('aui-dialog','node', function(A) {
	var myTvdNavigatorUlLis = A.all("nav#main_navigation ul li");
	myTvdNavigatorUlLis.each(function(value, index) {
		this.on("mouseover", function() {
			this.addClass("my-hover");
		});
		
		this.on("mouseout", function() {
			this.removeClass("my-hover");
		});
	});
});*/


AUI().ready(
	'liferay-hudcrumbs', 'node',
	function(A) {
		if (Liferay.Browser.isIe() && Liferay.Browser.getMajorVersion() < 7) {
			var navigation = A.one('#navigation > ul');

			if (navigation) {
				navigation.delegate(
					'mouseenter',
					function(event) {
						event.currentTarget.addClass('hover');
					},
					'> li'
				);

				navigation.delegate(
					'mouseleave',
					function(event) {
						event.currentTarget.removeClass('hover');
					},
					'> li'
				);
			}
		}

		var siteBreadcrumbs = A.one('.site-breadcrumbs');

		if (siteBreadcrumbs) {
			siteBreadcrumbs.plug(A.Hudcrumbs);
		}
	}
);