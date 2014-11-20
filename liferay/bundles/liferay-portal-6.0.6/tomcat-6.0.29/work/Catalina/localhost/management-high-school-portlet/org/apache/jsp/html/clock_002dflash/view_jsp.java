package org.apache.jsp.html.clock_002dflash;

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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
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
	//contextPathImg + "/flash/free-flash-clock-124.swf"

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("<div align=\"center\" style=\"margin-top: -10px\">\r\n");
      out.write("<embed src=\r\n");
      out.write("\t\twidth=250 height=240 type=application/x-shockwave-flash></embed>\r\n");
      out.write("</div>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("<!--\r\n");
      out.write(".analog {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("  \tmargin: auto;\r\n");
      out.write("\tbackground: url(");
      out.print(contextPathImg + "/images/clockface.jpg" );
      out.write(");\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog,.analog .hour,.analog .min,.analog .sec {\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog .hour,.analog .min,.analog .sec {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 8px;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tleft: 70.5px;\r\n");
      out.write("  \tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog .sec {\r\n");
      out.write("\tbackground: url(");
      out.print(contextPathImg + "/images/sechand.png" );
      out.write(");\r\n");
      out.write("\tz-index: 3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog .min {\r\n");
      out.write("\tbackground: url(");
      out.print(contextPathImg + "/images/minhand.png" );
      out.write(");\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog .hour {\r\n");
      out.write("\tbackground: url(");
      out.print(contextPathImg + "/images/hourhand.png" );
      out.write(");\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".analog .meridiem {\r\n");
      out.write("\tmargin-top: 90px;\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #333333;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\" align=\"center\" style=\"margin-top: -10px;\">\r\n");
      out.write("\t<div style=\"text-align: center;\">\r\n");
      out.write("      \t<ul id=\"analog-clock\" class=\"analog\">\t\r\n");
      out.write("            <li class=\"hour\"></li>\r\n");
      out.write("            <li class=\"min\"></li>\r\n");
      out.write("            <li class=\"sec\"></li>\r\n");
      out.write("            <li class=\"meridiem\"></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("function extend(a, b){\r\n");
      out.write("    for(var key in b)\r\n");
      out.write("        if(b.hasOwnProperty(key))\r\n");
      out.write("            a[key] = b[key];\r\n");
      out.write("    return a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("AUI().ready(\"node\", \"datasource\", \"oop\", function(A) {\r\n");
      out.write("\tA.clock = function(options) {\r\n");
      out.write("\t\tvar defaults = {\r\n");
      out.write("\t\t\t\toffset: '+0',\r\n");
      out.write("\t\t\t\ttype: 'analog'\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\tvar opts = extend(defaults, options);\r\n");
      out.write("\r\n");
      out.write("\t\tsetInterval( function() {\r\n");
      out.write("\t\t\tvar seconds = A.calcTime(opts.offset).getSeconds();\r\n");
      out.write("\t\t\tif(opts.type=='analog') {\r\n");
      out.write("\t\t\t\tvar sdegree = seconds * 6;\r\n");
      out.write("\t\t\t\tvar srotate = \"rotate(\" + sdegree + \"deg)\";\r\n");
      out.write("\t\t\t\tA.one(\".sec\").setStyles({\"transform\" : srotate, \"-webkit-transform\" : srotate});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tA.one(\".sec\").html(seconds);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}, 1000);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsetInterval( function() {\r\n");
      out.write("\t\t\tvar hours = A.calcTime(opts.offset).getHours();\r\n");
      out.write("\t\t\tvar mins = A.calcTime(opts.offset).getMinutes();\r\n");
      out.write("\t\t\tif(opts.type=='analog') { \r\n");
      out.write("\t\t\t\tvar hdegree = hours * 30 + (mins / 2);\r\n");
      out.write("\t\t\t\tvar hrotate = \"rotate(\" + hdegree + \"deg)\";\r\n");
      out.write("\t\t\t\tA.one(\".hour\").setStyles({\"transform\" : hrotate, \"-webkit-transform\" : hrotate});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tA.one(\".hour\").html(hours+':');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar meridiem = hours<12?'AM':'PM';\r\n");
      out.write("\t\t\tA.one('.meridiem').html(meridiem);\r\n");
      out.write("\t\t}, 1000);\r\n");
      out.write("\t\r\n");
      out.write("\t\tsetInterval( function() {\r\n");
      out.write("\t\t\tvar mins = A.calcTime(opts.offset).getMinutes();\r\n");
      out.write("\t\t\tif(opts.type=='analog') {\r\n");
      out.write("\t\t\t\tvar mdegree = mins * 6;\r\n");
      out.write("\t\t\t\tvar mrotate = \"rotate(\" + mdegree + \"deg)\";        \r\n");
      out.write("\t\t\t\tA.one(\".min\").setStyles({\"transform\" : mrotate, \"-webkit-transform\" : mrotate}); \r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tA.one(\".min\").html(mins+':');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}, 1000);\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tA.calcTime = function(offset) {\r\n");
      out.write("\t\tnd = new Date();\r\n");
      out.write("\t\treturn nd;\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tA.clock({offset: '+5', type: 'analog'});\r\n");
      out.write("});\r\n");
      out.write("//-->\r\n");
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
}
