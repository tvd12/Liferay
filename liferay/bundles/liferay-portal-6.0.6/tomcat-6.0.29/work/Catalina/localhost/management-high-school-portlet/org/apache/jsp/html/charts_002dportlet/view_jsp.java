package org.apache.jsp.html.charts_002dportlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.ListUtil;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.model.TYClass;
import java.util.List;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.kernel.dao.search.ResultRow;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.TYStudent;
import java.util.Date;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collections;
import org.tvd.thptty.management.temporary.TeacherTemp;
import com.liferay.portal.model.User;
import java.util.Map;
import org.tvd.thptty.management.util.TYServiceUtil;
import org.tvd.thptty.management.temporary.RoleKeys;
import com.liferay.portal.model.Phone;
import org.tvd.thptty.management.temporary.WebKeys;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp;
import org.tvd.thptty.model.TYTeacher;
import org.tvd.thptty.management.temporary.TYActionKeys;
import org.tvd.thptty.management.util.PermissionChecker;
import com.liferay.portal.kernel.util.ParamUtil;
import java.io.File;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.management.report.Report;
import org.tvd.exel.service.impl.WriteExcelFileServiceImpl;
import org.tvd.exel.service.base.WriteExcelFileService;
import org.tvd.exel.util.DataExcelCreator;
import org.tvd.exel.model.TVDSheet;
import org.tvd.thptty.management.util.SessionUtil;
import org.tvd.thptty.management.util.TVDDate;
import org.tvd.thptty.management.util.ConvertorUtil;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYMessages;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.util.PortalUtil;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-theme.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-aui.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-ui.tld");
    _jspx_dependants.add("/WEB-INF/tld/c-rt.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay_002dtheme_005fdefineObjects_005f0 = (com.liferay.taglib.theme.DefineObjectsTag) _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.get(com.liferay.taglib.theme.DefineObjectsTag.class);
      _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_liferay_002dtheme_005fdefineObjects_005f0 = _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.reuse(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.reuse(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
      com.liferay.portal.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.model.Company company = null;
      com.liferay.portal.model.Account account = null;
      com.liferay.portal.model.User user = null;
      com.liferay.portal.model.User realUser = null;
      com.liferay.portal.model.Contact contact = null;
      com.liferay.portal.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.model.Theme theme = null;
      com.liferay.portal.model.ColorScheme colorScheme = null;
      com.liferay.portal.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.model.Company) _jspx_page_context.findAttribute("company");
      account = (com.liferay.portal.model.Account) _jspx_page_context.findAttribute("account");
      user = (com.liferay.portal.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\r');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_005fdefineObjects_005f0 = (com.liferay.taglib.portlet.DefineObjectsTag) _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.get(com.liferay.taglib.portlet.DefineObjectsTag.class);
      _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("#wrapper {\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#demo {\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".aui-piechart {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write(".aui-loancalculator {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 25px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"demo\">\r\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay_002dui_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"demoLineChart\">\r\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay_002dui_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"demoStackedBarChart\">\r\n");
      out.write("\t\t<h3>");
      if (_jspx_meth_liferay_002dui_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("AUI().ready(\r\n");
      out.write("\t'aui-chart',\r\n");
      out.write("\t'datatype',\r\n");
      out.write("\t'substitute',\r\n");
      out.write("\t'aui-delayed-task',\r\n");
      out.write("\tfunction(A) {\r\n");
      out.write("\t\t\r\n");
      out.write("/**/\r\n");
      out.write("\t\tvar Lang = A.Lang;\t\t\r\n");
      out.write("\t\tvar generalWidth = 600;\r\n");
      out.write("\r\n");
      out.write("\t\tvar _total = ");
      out.print(totalStudentsPoints);
      out.write(";\r\n");
      out.write("\t\tvar _good = ");
      out.print(goodStudents);
      out.write(";\r\n");
      out.write("\t\tvar _quite = ");
      out.print(quiteStudents);
      out.write(";\r\n");
      out.write("\t\tvar _mean = ");
      out.print(meanStudents);
      out.write(";\r\n");
      out.write("\t\tvar _weak = ");
      out.print(weakStudents);
      out.write(";\r\n");
      out.write("\t\tvar _less = ");
      out.print(lessStudents);
      out.write(";\r\n");
      out.write("\r\n");
      out.write("\t\tExamples = {};\r\n");
      out.write("\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t\tBasic Pie Chart\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar goodString = \"");
      out.print(LanguageUtil.get(pageContext, "good-students"));
      out.write("\";\r\n");
      out.write("\t\tvar quiteString = \"");
      out.print(LanguageUtil.get(pageContext, "quite-students"));
      out.write("\";\r\n");
      out.write("\t\tvar meanString = \"");
      out.print(LanguageUtil.get(pageContext, "mean-students"));
      out.write("\";\r\n");
      out.write("\t\tvar weakString = \"");
      out.print(LanguageUtil.get(pageContext, "weak-students"));
      out.write("\";\r\n");
      out.write("\t\tvar lessString = \"");
      out.print(LanguageUtil.get(pageContext, "less-students"));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.PieChart = {\r\n");
      out.write("\t\t\ttheData: [\r\n");
      out.write("\t\t        { response: goodString, count: _good },\r\n");
      out.write("\t\t        { response: quiteString, count: _quite },\r\n");
      out.write("\t\t        { response: meanString, count: _mean },\r\n");
      out.write("\t\t        { response: weakString, count: _weak },\r\n");
      out.write("\t\t        { response: lessString, count: _less }\r\n");
      out.write("\t\t    ],\r\n");
      out.write("\t\t\tupdateChart: function(event) {\r\n");
      out.write("\t\t\t\tExamples.PieChart.theData[0].count = _good;\r\n");
      out.write("\t\t\t\tExamples.PieChart.theData[1].count = _quite;\r\n");
      out.write("\t\t\t\tExamples.PieChart.theData[2].count = _mean;\r\n");
      out.write("\t\t\t\tExamples.PieChart.theData[3].count = _weak;\r\n");
      out.write("\t\t\t\tExamples.PieChart.theData[4].count = _less;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tExamples.PieChart.chart.refreshData();\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tgetLegendLabelText: function(value) {\r\n");
      out.write("\t\t\t\tvar instance = this;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn 'yay?' + value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.PieChart.dataSource = new A.DataSource.Local(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tsource: Examples.PieChart.theData\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t).plug(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfn: A.DataSourceJSONSchema,\r\n");
      out.write("\t\t\t\tcfg: {\r\n");
      out.write("\t\t\t\t\tresultFields: ['response', 'count']\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar DEFAULT_SWF_PATH = \"");
      out.print(contextPathImg);
      out.write("\" + '/flash/aui-chart/assets/chart.swf?t=' + Lang.now();\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.PieChart.chart = new A.PieChart(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t        dataField: 'count',\r\n");
      out.write("\t\t\t\tdataSource: Examples.PieChart.dataSource,\r\n");
      out.write("\t\t\t\tswfURL: DEFAULT_SWF_PATH,\r\n");
      out.write("\t\t        categoryField: 'response',\r\n");
      out.write("\t\t\t\twidth: generalWidth,\r\n");
      out.write("\t\t\t\theight: 300,\r\n");
      out.write("\t\t\t\tlegendLabelFunction: Examples.PieChart.getLegendLabelText,\r\n");
      out.write("\t\t\t\tdataTipFunction: function(item, index, series) {\r\n");
      out.write("\t\t\t\t\tvar instance = this;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar data = series.data;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar total = 0;\r\n");
      out.write("\t\t\t\t\tvar current = item.count;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\t\t\ttotal += data[i].count;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar percentage = (current / total) * 100;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treturn item.response + ':\\n' + A.DataType.Number.format(\r\n");
      out.write("\t\t\t\t\t\tcurrent,\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tthousandsSeparator: ',',\r\n");
      out.write("\t\t\t\t\t\t\tsuffix: ' hs',\r\n");
      out.write("\t\t\t\t\t\t\tdecimalPlaces: 0\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t) + '\\n' + A.DataType.Number.format(\r\n");
      out.write("\t\t\t\t\t\tpercentage,\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tdecimalPlaces: 2,\r\n");
      out.write("\t\t\t\t\t\t\tsuffix: '%'\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tstyle: {\r\n");
      out.write("\t\t\t\t\tlegend: {\r\n");
      out.write("\t\t\t\t\t\tdisplay: 'right',\r\n");
      out.write("\t\t\t\t\t\tpadding: 10,\r\n");
      out.write("\t\t\t\t\t\tspacing: 5,\r\n");
      out.write("\t\t\t\t\t\tfont: {\r\n");
      out.write("\t\t\t\t\t\t\tfamily: 'Arial',\r\n");
      out.write("\t\t\t\t\t\t\tsize: 13\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t   ).render('#demo');\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t\tBasic Line Chart\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar percentGoodString = \"");
      out.print(LanguageUtil.get(pageContext, "percent-good-students"));
      out.write("\";\r\n");
      out.write("\t\tvar percentQuiteString = \"");
      out.print(LanguageUtil.get(pageContext, "percent-quite-students"));
      out.write("\";\r\n");
      out.write("\t\tvar percentMeanString = \"");
      out.print(LanguageUtil.get(pageContext, "percent-mean-students"));
      out.write("\";\r\n");
      out.write("\t\tvar percentWeakString = \"");
      out.print(LanguageUtil.get(pageContext, "percent-weak-students"));
      out.write("\";\r\n");
      out.write("\t\tvar percentLessString = \"");
      out.print(LanguageUtil.get(pageContext, "percent-less-students"));
      out.write("\";\r\n");
      out.write("\t\tvar yearString = \"");
      out.print(LanguageUtil.get(pageContext, "year"));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.LineChart = {\r\n");
      out.write("\t\t\texpenses: [\r\n");
      out.write("\t\t\t\t{ year: '2008', goodPer: 20, quitePer: 63, meanPer: 15, weakPer: 2, lessPer: 0 },\r\n");
      out.write("\t\t\t\t{ year: '2009', goodPer: 25, quitePer: 56, meanPer: 18, weakPer: 1, lessPer: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2010', goodPer: 35, quitePer: 43, meanPer: 20, weakPer: 3, lessPer: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2011', goodPer: 23, quitePer: 55, meanPer: 17, weakPer: 5, lessPer: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2012', goodPer: 18, quitePer: 65, meanPer: 10, weakPer: 7, lessPer: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2013', goodPer: 27, quitePer: 63, meanPer: 8, weakPer: 2, lessPer: 0  }\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\tseries: [\r\n");
      out.write("\t\t\t\t{displayName: percentGoodString, yField: 'goodPer'},\r\n");
      out.write("\t\t\t\t{displayName: percentQuiteString, yField: 'quitePer'},\r\n");
      out.write("\t\t\t\t{displayName: percentMeanString, yField: 'meanPer'},\r\n");
      out.write("\t\t\t\t{displayName: percentWeakString, yField: 'weakPer'},\r\n");
      out.write("\t\t\t\t{displayName: percentLessString, yField: 'lessPer'}\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\tformatCurrencyAxisLabel: function(value) {\r\n");
      out.write("\t\t\t\treturn A.DataType.Number.format(\r\n");
      out.write("\t\t\t\t\tvalue,\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tsuffix: '%',\r\n");
      out.write("\t\t\t\t\t\tthousandsSeparator: ',',\r\n");
      out.write("\t\t\t\t\t\tdecimalPlaces: 0\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\tgetDataTipText: function(item, index, series) {\r\n");
      out.write("\t\t\t\tvar toolTipText = series.displayName + ' ' + yearString + ' ' + item.year;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\ttoolTipText += '\\n' + Examples.LineChart.formatCurrencyAxisLabel(item[series.yField]);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn toolTipText;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcurrencyAxis: (new A.Chart.NumericAxis())\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.LineChart.dataSource = new A.DataSource.Local(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tsource: Examples.LineChart.expenses\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t).plug(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfn: A.DataSourceJSONSchema,\r\n");
      out.write("\t\t\t\tcfg: {\r\n");
      out.write("\t\t\t\t\tresultFields: ['year', 'goodPer', 'quitePer', 'meanPer', 'weakPer', 'lessPer']\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.LineChart.currencyAxis.minimum = 0;\r\n");
      out.write("\t\tExamples.LineChart.currencyAxis.labelFunction = Examples.LineChart.formatCurrencyAxisLabel;\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.LineChart.chart = new A.LineChart(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdataSource: Examples.LineChart.dataSource,\r\n");
      out.write("\t\t\t\tswfURL: DEFAULT_SWF_PATH,\r\n");
      out.write("\t\t\t\tseries: Examples.LineChart.series,\r\n");
      out.write("\t\t\t\txField: 'year',\r\n");
      out.write("\t\t\t\tyAxis: Examples.LineChart.currencyAxis,\r\n");
      out.write("\t\t\t\twidth: generalWidth,\r\n");
      out.write("\t\t\t\theight: 300,\r\n");
      out.write("\t\t\t\tdataTipFunction: Examples.LineChart.getDataTipText\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t).render('#demoLineChart');\r\n");
      out.write("\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\t\tStacked Bar Chart\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar counGoodString = \"");
      out.print(LanguageUtil.get(pageContext, "count-good-students"));
      out.write("\";\r\n");
      out.write("\t\tvar countQuiteString = \"");
      out.print(LanguageUtil.get(pageContext, "count-quite-students"));
      out.write("\";\r\n");
      out.write("\t\tvar countMeanString = \"");
      out.print(LanguageUtil.get(pageContext, "count-mean-students"));
      out.write("\";\r\n");
      out.write("\t\tvar countWeakString = \"");
      out.print(LanguageUtil.get(pageContext, "count-weak-students"));
      out.write("\";\r\n");
      out.write("\t\tvar countLessString = \"");
      out.print(LanguageUtil.get(pageContext, "count-less-students"));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.StackedBarChart = {\r\n");
      out.write("\t\t\tdata: [\r\n");
      out.write("\t\t\t\t{ year: '2008', goodCount: 400, quiteCount: 1260, meanCount: 300, weakCount: 40, lessCount: 0 },\r\n");
      out.write("\t\t\t\t{ year: '2009', goodCount: 500, quiteCount: 1180, meanCount: 360, weakCount: 20, lessCount: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2010', goodCount: 700, quiteCount: 890, meanCount: 400, weakCount: 60, lessCount: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2011', goodCount: 460, quiteCount: 1170, meanCount: 340, weakCount: 100, lessCount: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2012', goodCount: 360, quiteCount: 1360, meanCount: 200, weakCount: 140, lessCount: 0  },\r\n");
      out.write("\t\t\t\t{ year: '2013', goodCount: 540, quiteCount: 1290, meanCount: 160, weakCount: 40, lessCount: 0  }\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\tseries: [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txField: 'goodCount',\r\n");
      out.write("\t\t\t\t\tdisplayName: counGoodString\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txField: 'quiteCount',\r\n");
      out.write("\t\t\t\t\tdisplayName: countQuiteString\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txField: 'meanCount',\r\n");
      out.write("\t\t\t\t\tdisplayName: countMeanString\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txField: 'weakCount',\r\n");
      out.write("\t\t\t\t\tdisplayName: countWeakString\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\txField: 'lessCount',\r\n");
      out.write("\t\t\t\t\tdisplayName: countLessString\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\tnumberToCurrency: function(value) {\r\n");
      out.write("\t\t\t\treturn A.DataType.Number.format(\r\n");
      out.write("\t\t\t\t\tvalue,\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tsuffix: '',\r\n");
      out.write("\t\t\t\t\t\tthousandsSeparator: ','\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcurrencyAxis: (new A.Chart.NumericAxis())\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.StackedBarChart.currencyAxis.stackingEnabled = true;\r\n");
      out.write("\t\tExamples.StackedBarChart.currencyAxis.labelFunction = Examples.StackedBarChart.numberToCurrency;\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.StackedBarChart.dataSource = new A.DataSource.Local(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tsource: Examples.StackedBarChart.data\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t).plug(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfn: A.DataSourceJSONSchema,\r\n");
      out.write("\t\t\t\tcfg: {\r\n");
      out.write("\t\t\t\t\tresultFields: ['year', 'goodCount', 'quiteCount', 'meanCount', 'weakCount', 'lessCount']\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\r\n");
      out.write("\t\tExamples.StackedBarChart.chart = new A.StackedBarChart(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tseries: Examples.StackedBarChart.series,\r\n");
      out.write("\t\t\t\tyField: 'year',\r\n");
      out.write("\t\t\t\tdataSource: Examples.StackedBarChart.dataSource,\r\n");
      out.write("\t\t\t\tswfURL: DEFAULT_SWF_PATH,\r\n");
      out.write("\t\t\t\txAxis: Examples.StackedBarChart.currencyAxis,\r\n");
      out.write("\t\t\t\twidth: generalWidth,\r\n");
      out.write("\t\t\t\theight: 350\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t).render('#demoStackedBarChart');\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f0 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f0.setParent(null);
    // /html/charts-portlet/view.jsp(47,6) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f0.setKey("pie-char");
    int _jspx_eval_liferay_002dui_005fmessage_005f0 = _jspx_th_liferay_002dui_005fmessage_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f1 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f1.setParent(null);
    // /html/charts-portlet/view.jsp(51,6) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f1.setKey("line-char");
    int _jspx_eval_liferay_002dui_005fmessage_005f1 = _jspx_th_liferay_002dui_005fmessage_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f2 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f2.setParent(null);
    // /html/charts-portlet/view.jsp(55,6) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f2.setKey("stacked-bar-char");
    int _jspx_eval_liferay_002dui_005fmessage_005f2 = _jspx_th_liferay_002dui_005fmessage_005f2.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
    return false;
  }
}
