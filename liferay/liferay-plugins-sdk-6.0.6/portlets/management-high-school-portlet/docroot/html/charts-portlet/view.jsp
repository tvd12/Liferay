<%@ include file="/init.jsp"%>

<%
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getScopeGroupId();
	int courses = TYServiceUtil.getCurrentCourse();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	int totalStudentsPoints = TYServiceUtil.countStudentsPointsByC_S(
			courses, semester, companyId, groupId, 0, 10);
	
	int goodStudents = TYServiceUtil.countStudentsPointsByC_S(
			courses, semester, companyId, groupId, (float)8, (float)10.01);
	int quiteStudents = TYServiceUtil.countStudentsPointsByC_S(
			courses, semester, companyId, groupId, (float)6.5, 8);
	int meanStudents = TYServiceUtil.countStudentsPointsByC_S(
			courses, semester, companyId, groupId, (float)3.5, (float)6.5);
	int weakStudents = TYServiceUtil.countStudentsPointsByC_S(
			courses, semester, companyId, groupId, 2, (float)3.5);
	
	int lessStudents = totalStudentsPoints - goodStudents -
			quiteStudents - meanStudents - weakStudents;
%>

<style type="text/css" media="screen">

#wrapper {
	
}

#demo {
	overflow: hidden;
}

.aui-piechart {
	float: left;
}
.aui-loancalculator {
	float: left;
	margin-right: 25px;
}
</style>

<div id="wrapper">
	<div id="demo">
		<h3><liferay-ui:message key="pie-char" /></h3>
	</div>

	<div id="demoLineChart">
		<h3><liferay-ui:message key="line-char" /></h3>
	</div>

	<div id="demoStackedBarChart">
		<h3><liferay-ui:message key="stacked-bar-char" /></h3>
	</div>

</div>

<script type="text/javascript" charset="utf-8">
AUI().ready(
	'aui-chart',
	'datatype',
	'substitute',
	'aui-delayed-task',
	function(A) {
		
/**/
		var Lang = A.Lang;		
		var generalWidth = 600;

		var _total = <%=totalStudentsPoints%>;
		var _good = <%=goodStudents%>;
		var _quite = <%=quiteStudents%>;
		var _mean = <%=meanStudents%>;
		var _weak = <%=weakStudents%>;
		var _less = <%=lessStudents%>;

		Examples = {};

		/*
			Basic Pie Chart
		*/
		
		var goodString = "<%=LanguageUtil.get(pageContext, "good-students")%>";
		var quiteString = "<%=LanguageUtil.get(pageContext, "quite-students")%>";
		var meanString = "<%=LanguageUtil.get(pageContext, "mean-students")%>";
		var weakString = "<%=LanguageUtil.get(pageContext, "weak-students")%>";
		var lessString = "<%=LanguageUtil.get(pageContext, "less-students")%>";

		Examples.PieChart = {
			theData: [
		        { response: goodString, count: _good },
		        { response: quiteString, count: _quite },
		        { response: meanString, count: _mean },
		        { response: weakString, count: _weak },
		        { response: lessString, count: _less }
		    ],
			updateChart: function(event) {
				Examples.PieChart.theData[0].count = _good;
				Examples.PieChart.theData[1].count = _quite;
				Examples.PieChart.theData[2].count = _mean;
				Examples.PieChart.theData[3].count = _weak;
				Examples.PieChart.theData[4].count = _less;

				Examples.PieChart.chart.refreshData();
			},
			getLegendLabelText: function(value) {
				var instance = this;

				return 'yay?' + value;
			}
		};

		Examples.PieChart.dataSource = new A.DataSource.Local(
			{
				source: Examples.PieChart.theData
			}
		).plug(
			{
				fn: A.DataSourceJSONSchema,
				cfg: {
					resultFields: ['response', 'count']
				}
			}
		);
		
		var DEFAULT_SWF_PATH = "<%=contextPathImg%>" + '/flash/aui-chart/assets/chart.swf?t=' + Lang.now();

		Examples.PieChart.chart = new A.PieChart(
			{
		        dataField: 'count',
				dataSource: Examples.PieChart.dataSource,
				swfURL: DEFAULT_SWF_PATH,
		        categoryField: 'response',
				width: generalWidth,
				height: 300,
				legendLabelFunction: Examples.PieChart.getLegendLabelText,
				dataTipFunction: function(item, index, series) {
					var instance = this;

					var data = series.data;

					var total = 0;
					var current = item.count;

					for (var i = 0; i < data.length; i++) {
						total += data[i].count;
					}
					
				

					var percentage = (current / total) * 100;

					return item.response + ':\n' + A.DataType.Number.format(
						current,
						{
							thousandsSeparator: ',',
							suffix: ' hs',
							decimalPlaces: 0
						}
					) + '\n' + A.DataType.Number.format(
						percentage,
						{
							decimalPlaces: 2,
							suffix: '%'
						}
					);
				},
				style: {
					legend: {
						display: 'right',
						padding: 10,
						spacing: 5,
						font: {
							family: 'Arial',
							size: 13
						}
					}
				}
		    }
		   ).render('#demo');
			/*
				Basic Line Chart
			*/
			
		var percentGoodString = "<%=LanguageUtil.get(pageContext, "percent-good-students")%>";
		var percentQuiteString = "<%=LanguageUtil.get(pageContext, "percent-quite-students")%>";
		var percentMeanString = "<%=LanguageUtil.get(pageContext, "percent-mean-students")%>";
		var percentWeakString = "<%=LanguageUtil.get(pageContext, "percent-weak-students")%>";
		var percentLessString = "<%=LanguageUtil.get(pageContext, "percent-less-students")%>";
		var yearString = "<%=LanguageUtil.get(pageContext, "year")%>";

		Examples.LineChart = {
			expenses: [
				{ year: '2008', goodPer: 20, quitePer: 63, meanPer: 15, weakPer: 2, lessPer: 0 },
				{ year: '2009', goodPer: 25, quitePer: 56, meanPer: 18, weakPer: 1, lessPer: 0  },
				{ year: '2010', goodPer: 35, quitePer: 43, meanPer: 20, weakPer: 3, lessPer: 0  },
				{ year: '2011', goodPer: 23, quitePer: 55, meanPer: 17, weakPer: 5, lessPer: 0  },
				{ year: '2012', goodPer: 18, quitePer: 65, meanPer: 10, weakPer: 7, lessPer: 0  },
				{ year: '2013', goodPer: 27, quitePer: 63, meanPer: 8, weakPer: 2, lessPer: 0  }
			],
			series: [
				{displayName: percentGoodString, yField: 'goodPer'},
				{displayName: percentQuiteString, yField: 'quitePer'},
				{displayName: percentMeanString, yField: 'meanPer'},
				{displayName: percentWeakString, yField: 'weakPer'},
				{displayName: percentLessString, yField: 'lessPer'}
			],
			formatCurrencyAxisLabel: function(value) {
				return A.DataType.Number.format(
					value,
					{
						suffix: '%',
						thousandsSeparator: ',',
						decimalPlaces: 0
					}
				);
			},

			getDataTipText: function(item, index, series) {
				var toolTipText = series.displayName + ' ' + yearString + ' ' + item.year;

				toolTipText += '\n' + Examples.LineChart.formatCurrencyAxisLabel(item[series.yField]);

				return toolTipText;
			},
			currencyAxis: (new A.Chart.NumericAxis())
		};

		Examples.LineChart.dataSource = new A.DataSource.Local(
			{
				source: Examples.LineChart.expenses
			}
		).plug(
			{
				fn: A.DataSourceJSONSchema,
				cfg: {
					resultFields: ['year', 'goodPer', 'quitePer', 'meanPer', 'weakPer', 'lessPer']
				}
			}
		);

		Examples.LineChart.currencyAxis.minimum = 0;
		Examples.LineChart.currencyAxis.labelFunction = Examples.LineChart.formatCurrencyAxisLabel;

		Examples.LineChart.chart = new A.LineChart(
			{
				dataSource: Examples.LineChart.dataSource,
				swfURL: DEFAULT_SWF_PATH,
				series: Examples.LineChart.series,
				xField: 'year',
				yAxis: Examples.LineChart.currencyAxis,
				width: generalWidth,
				height: 300,
				dataTipFunction: Examples.LineChart.getDataTipText
			}
		).render('#demoLineChart');

		/*
			Stacked Bar Chart
		*/
		
		var counGoodString = "<%=LanguageUtil.get(pageContext, "count-good-students")%>";
		var countQuiteString = "<%=LanguageUtil.get(pageContext, "count-quite-students")%>";
		var countMeanString = "<%=LanguageUtil.get(pageContext, "count-mean-students")%>";
		var countWeakString = "<%=LanguageUtil.get(pageContext, "count-weak-students")%>";
		var countLessString = "<%=LanguageUtil.get(pageContext, "count-less-students")%>";

		Examples.StackedBarChart = {
			data: [
				{ year: '2008', goodCount: 400, quiteCount: 1260, meanCount: 300, weakCount: 40, lessCount: 0 },
				{ year: '2009', goodCount: 500, quiteCount: 1180, meanCount: 360, weakCount: 20, lessCount: 0  },
				{ year: '2010', goodCount: 700, quiteCount: 890, meanCount: 400, weakCount: 60, lessCount: 0  },
				{ year: '2011', goodCount: 460, quiteCount: 1170, meanCount: 340, weakCount: 100, lessCount: 0  },
				{ year: '2012', goodCount: 360, quiteCount: 1360, meanCount: 200, weakCount: 140, lessCount: 0  },
				{ year: '2013', goodCount: 540, quiteCount: 1290, meanCount: 160, weakCount: 40, lessCount: 0  }
			],
			series: [
				{
					xField: 'goodCount',
					displayName: counGoodString
				},
				{
					xField: 'quiteCount',
					displayName: countQuiteString
				},
				{
					xField: 'meanCount',
					displayName: countMeanString
				},
				{
					xField: 'weakCount',
					displayName: countWeakString
				},
				{
					xField: 'lessCount',
					displayName: countLessString
				}
			],
			numberToCurrency: function(value) {
				return A.DataType.Number.format(
					value,
					{
						suffix: '',
						thousandsSeparator: ','
					}
				);
			},
			currencyAxis: (new A.Chart.NumericAxis())
		};

		Examples.StackedBarChart.currencyAxis.stackingEnabled = true;
		Examples.StackedBarChart.currencyAxis.labelFunction = Examples.StackedBarChart.numberToCurrency;

		Examples.StackedBarChart.dataSource = new A.DataSource.Local(
			{
				source: Examples.StackedBarChart.data
			}
		).plug(
			{
				fn: A.DataSourceJSONSchema,
				cfg: {
					resultFields: ['year', 'goodCount', 'quiteCount', 'meanCount', 'weakCount', 'lessCount']
				}
			}
		);

		Examples.StackedBarChart.chart = new A.StackedBarChart(
			{
				series: Examples.StackedBarChart.series,
				yField: 'year',
				dataSource: Examples.StackedBarChart.dataSource,
				swfURL: DEFAULT_SWF_PATH,
				xAxis: Examples.StackedBarChart.currencyAxis,
				width: generalWidth,
				height: 350
			}
		).render('#demoStackedBarChart');

	}
);

</script>