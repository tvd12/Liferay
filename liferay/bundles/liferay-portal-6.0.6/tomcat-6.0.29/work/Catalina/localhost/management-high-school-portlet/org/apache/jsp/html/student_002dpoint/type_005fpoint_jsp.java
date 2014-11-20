package org.apache.jsp.html.student_002dpoint;

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

public final class type_005fpoint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_002drow;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_002drow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fbutton_002drow.release();
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel.release();
    _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody.release();
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

	TYClass tyClass = (TYClass)request.getAttribute(WebKeys.TY_CLASS);
	tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
	User teacher = user;
	TYSubject subject = (TYSubject)request.getAttribute(WebKeys.TY_SUBJECT);
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYTeacher.class.getName();
	
	long companyId = themeDisplay.getCompanyId();
	int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
	
	String semsterStr = LanguageUtil.format(pageContext, "semester-x", String.valueOf(semester));
	
	int courses = TYServiceUtil.getCurrentCourse();
	String courseString = null;
	courseString = "" + (courses - 1) + "-" + courses;
	
	String contextPathImg = renderResponse.encodeURL(renderRequest.getContextPath());
	String guide = LanguageUtil.get(pageContext, "import-points-guide");

      out.write('\r');
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /html/student-point/type_point.jsp(23,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(semester != 0 );
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          //  portlet:actionURL
          com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_005factionURL_005f0 = (com.liferay.taglib.portlet.ActionURLTag) _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.get(com.liferay.taglib.portlet.ActionURLTag.class);
          _jspx_th_portlet_005factionURL_005f0.setPageContext(_jspx_page_context);
          _jspx_th_portlet_005factionURL_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(25,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_portlet_005factionURL_005f0.setName("importPointFromExcelFile");
          // /html/student-point/type_point.jsp(25,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_portlet_005factionURL_005f0.setVar("readFileURL");
          int _jspx_eval_portlet_005factionURL_005f0 = _jspx_th_portlet_005factionURL_005f0.doStartTag();
          if (_jspx_eval_portlet_005factionURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_portlet_005factionURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_portlet_005factionURL_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_portlet_005factionURL_005f0.doInitBody();
            }
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f0 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
              _jspx_th_portlet_005fparam_005f0.setPageContext(_jspx_page_context);
              _jspx_th_portlet_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f0);
              // /html/student-point/type_point.jsp(26,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f0.setName("classId");
              // /html/student-point/type_point.jsp(26,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f0.setValue(String.valueOf(tyClass.getClassId()) );
              int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
              if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f1 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
              _jspx_th_portlet_005fparam_005f1.setPageContext(_jspx_page_context);
              _jspx_th_portlet_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f0);
              // /html/student-point/type_point.jsp(27,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f1.setName("subjectId");
              // /html/student-point/type_point.jsp(27,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f1.setValue(String.valueOf(subject.getSubjectId()) );
              int _jspx_eval_portlet_005fparam_005f1 = _jspx_th_portlet_005fparam_005f1.doStartTag();
              if (_jspx_th_portlet_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_portlet_005factionURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_portlet_005factionURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.reuse(_jspx_th_portlet_005factionURL_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.reuse(_jspx_th_portlet_005factionURL_005f0);
          java.lang.String readFileURL = null;
          readFileURL = (java.lang.String) _jspx_page_context.findAttribute("readFileURL");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"div-dialog-file-upload\" hidden=\"hidden\">\r\n");
          out.write("\t");
          //  aui:form
          com.liferay.taglib.aui.FormTag _jspx_th_aui_005fform_005f0 = (com.liferay.taglib.aui.FormTag) _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction.get(com.liferay.taglib.aui.FormTag.class);
          _jspx_th_aui_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_aui_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(31,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005fform_005f0.setName("file");
          // /html/student-point/type_point.jsp(31,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005fform_005f0.setAction(readFileURL.toString() );
          // /html/student-point/type_point.jsp(31,1) null
          _jspx_th_aui_005fform_005f0.setDynamicAttribute(null, "method", new String("post"));
          // /html/student-point/type_point.jsp(31,1) null
          _jspx_th_aui_005fform_005f0.setDynamicAttribute(null, "enctype", new String("multipart/form-data"));
          int _jspx_eval_aui_005fform_005f0 = _jspx_th_aui_005fform_005f0.doStartTag();
          if (_jspx_eval_aui_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_005fform_005f0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_aui_005finput_005f0(_jspx_th_aui_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_aui_005fbutton_002drow_005f0(_jspx_th_aui_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_aui_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_aui_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction.reuse(_jspx_th_aui_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005fenctype_005faction.reuse(_jspx_th_aui_005fform_005f0);
          out.write("\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<div id=\"id-addstudent-div\" style=\"background-color: #CCCCCC; margin-top: 5px; \r\n");
          out.write("\tmargin-bottom: 15px; line-height: 25px; color: red; font-size: 16px; font-weight: bold; \">\r\n");
          out.write("\t");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(41,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fif_005f1.setTest(permissionChecker.hasPermission(groupId, name, teacher.getUserId(), "TYPE_POINT") );
          int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
          if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_liferay_002dui_005fmessage_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t<a id=\"fileUpload\" style=\"text-decoration: none; cursor: pointer;\">");
              if (_jspx_meth_liferay_002dui_005ficon_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
                return;
              out.write("</a>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
          out.write("\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<div align=\"center\">\r\n");
          out.write("\t<h3><font color=\"blue\" style=\"text-align: center; margin-left: 150px;\">\r\n");
          out.write("\t\t");
          if (_jspx_meth_liferay_002dui_005fmessage_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write(' ');
          //  c:out
          org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
          _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(49,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fout_005f0.setValue(courseString );
          int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
          if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
          out.write("\r\n");
          out.write("\t\t<label>");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f2 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
          _jspx_th_liferay_002dui_005fmessage_005f2.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(50,9) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fmessage_005f2.setKey("semester-y");
          // /html/student-point/type_point.jsp(50,9) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fmessage_005f2.setArguments(semester );
          int _jspx_eval_liferay_002dui_005fmessage_005f2 = _jspx_th_liferay_002dui_005fmessage_005f2.doStartTag();
          if (_jspx_th_liferay_002dui_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
          out.write("</label>\r\n");
          out.write("\t</font></h3>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");

	String args[] = {user.getFullName(), 
		subject.getSubjectName(), tyClass.getClassFullName()};
	String title = LanguageUtil.format(pageContext, 
			"hello-teacher-point-subject-class", args);
	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");

          out.write("\r\n");
          out.write("\r\n");
          //  portlet:renderURL
          com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f0 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
          _jspx_th_portlet_005frenderURL_005f0.setPageContext(_jspx_page_context);
          _jspx_th_portlet_005frenderURL_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(62,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_portlet_005frenderURL_005f0.setVar("backURL");
          int _jspx_eval_portlet_005frenderURL_005f0 = _jspx_th_portlet_005frenderURL_005f0.doStartTag();
          if (_jspx_eval_portlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_portlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_portlet_005frenderURL_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_portlet_005frenderURL_005f0.doInitBody();
            }
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_portlet_005fparam_005f2(_jspx_th_portlet_005frenderURL_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_portlet_005frenderURL_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_portlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_portlet_005frenderURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f0);
          java.lang.String backURL = null;
          backURL = (java.lang.String) _jspx_page_context.findAttribute("backURL");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"div-header-tvd-custom\">");
          //  liferay-ui:header
          com.liferay.taglib.ui.HeaderTag _jspx_th_liferay_002dui_005fheader_005f0 = (com.liferay.taglib.ui.HeaderTag) _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.get(com.liferay.taglib.ui.HeaderTag.class);
          _jspx_th_liferay_002dui_005fheader_005f0.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fheader_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(66,32) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fheader_005f0.setTitle(title );
          int _jspx_eval_liferay_002dui_005fheader_005f0 = _jspx_th_liferay_002dui_005fheader_005f0.doStartTag();
          if (_jspx_th_liferay_002dui_005fheader_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.reuse(_jspx_th_liferay_002dui_005fheader_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.reuse(_jspx_th_liferay_002dui_005fheader_005f0);
          out.write("</div>\r\n");
          out.write("\t\r\n");
          out.write("<div align=\"right\">\r\n");
          out.write("\t<a href=\"");
          out.print(backURL.toString());
          out.write("\" style=\"text-decoration: none; font-weight: bold;\">");
          out.print(backTitle);
          out.write("</a>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          //  portlet:renderURL
          com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f1 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
          _jspx_th_portlet_005frenderURL_005f1.setPageContext(_jspx_page_context);
          _jspx_th_portlet_005frenderURL_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(72,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_portlet_005frenderURL_005f1.setVar("viewEditStudentsPointsURL");
          int _jspx_eval_portlet_005frenderURL_005f1 = _jspx_th_portlet_005frenderURL_005f1.doStartTag();
          if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_portlet_005frenderURL_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_portlet_005frenderURL_005f1.doInitBody();
            }
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f3 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
              _jspx_th_portlet_005fparam_005f3.setPageContext(_jspx_page_context);
              _jspx_th_portlet_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f1);
              // /html/student-point/type_point.jsp(73,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f3.setName("subjectId");
              // /html/student-point/type_point.jsp(73,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f3.setValue(String.valueOf(subject.getSubjectId()) );
              int _jspx_eval_portlet_005fparam_005f3 = _jspx_th_portlet_005fparam_005f3.doStartTag();
              if (_jspx_th_portlet_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  portlet:param
              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f4 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
              _jspx_th_portlet_005fparam_005f4.setPageContext(_jspx_page_context);
              _jspx_th_portlet_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f1);
              // /html/student-point/type_point.jsp(74,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f4.setName("classId");
              // /html/student-point/type_point.jsp(74,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005fparam_005f4.setValue(String.valueOf(tyClass.getClassId()) );
              int _jspx_eval_portlet_005fparam_005f4 = _jspx_th_portlet_005fparam_005f4.doStartTag();
              if (_jspx_th_portlet_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_portlet_005fparam_005f5(_jspx_th_portlet_005frenderURL_005f1, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              int evalDoAfterBody = _jspx_th_portlet_005frenderURL_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_portlet_005frenderURL_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f1);
          java.lang.String viewEditStudentsPointsURL = null;
          viewEditStudentsPointsURL = (java.lang.String) _jspx_page_context.findAttribute("viewEditStudentsPointsURL");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<br />\r\n");
          out.write("<div align=\"right\">\r\n");
          out.write("\t<a href=\"");
          out.print(viewEditStudentsPointsURL.toString());
          out.write("\" style=\"text-decoration: none;\">\r\n");
          out.write("\t\t");
          if (_jspx_meth_liferay_002dui_005ficon_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_liferay_002dui_005fmessage_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t</a>\r\n");
          out.write("</div>\r\n");
          out.write("\t\r\n");

	List<TYStudent> students = ActionUtil.getStudentsInClass(courses, tyClass.getClassId());
	int size = students.size();
	int i = 0;

          out.write("\r\n");
          out.write("\r\n");
          out.write("<style>\r\n");
          out.write("<!--\r\n");
          out.write(".semester-class {\r\n");
          out.write("\tcolor: white;\r\n");
          out.write("}\r\n");
          out.write("-->\r\n");
          out.write("</style>\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("hiddenTags = function(a, b, c) {\r\n");
          out.write("\ta.setAttribute(\"hidden\", \"hidden\");\r\n");
          out.write("\tb.setAttribute(\"hidden\", \"hidden\");\r\n");
          out.write("\tc.setAttribute(\"hidden\", \"hidden\");\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("AUI().ready('aui-dialog',\"node\", function(A){\r\n");
          out.write("\r\n");
          out.write("\t\tA.one(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select#");
          if (_jspx_meth_portlet_005fnamespace_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointFactor\").on( \"change\", function() {\r\n");
          out.write("\t\tvar pointTypes = A.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select#");
          if (_jspx_meth_portlet_005fnamespace_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointType\");\r\n");
          out.write("\t\tvar td11 = A.all(\"table#tableinputpoint td.tdpoinfactor11\");\r\n");
          out.write("\t\tvar td12 = A.all(\"table#tableinputpoint td.tdpoinfactor12\");\r\n");
          out.write("\t\tvar td21 = A.all(\"table#tableinputpoint td.tdpoinfactor21\");\r\n");
          out.write("\t\tvar td31 = A.all(\"table#tableinputpoint td.tdpoinfactor31\");\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tvar options = A.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f4(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select#");
          if (_jspx_meth_portlet_005fnamespace_005f5(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointType option[value=2]\");\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tvar _this = this;\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tif(parseInt(_this.val()) > 1) {\r\n");
          out.write("\t\t\tpointTypes.each(function(value, index) {\r\n");
          out.write("\t\t\t\tpointTypes.item(index).val(1);\r\n");
          out.write("\t\t\t});\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\toptions.each(function(value, index) {\r\n");
          out.write("\t\t\t\toptions.item(index).setAttribute(\"hidden\", \"hidden\");\r\n");
          out.write("\t\t\t});\r\n");
          out.write("\t\t} else {\r\n");
          out.write("\t\t\toptions.each(function(value, index) {\r\n");
          out.write("\t\t\t\toptions.item(index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t});\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tpointTypes.each(function(value, index) {\r\n");
          out.write("\t\t\tvar pointType = pointTypes.item(index);\r\n");
          out.write("\t\t\tvar pointFactorVal = parseInt(_this.val()); \r\n");
          out.write("\t\t\tvar pointTypeVal = parseInt(pointType.val());\r\n");
          out.write("\t\t\tif( pointFactorVal == 1) {\r\n");
          out.write("\t\t\t\tif(pointTypeVal == 1) {\r\n");
          out.write("\t\t\t\t\ttd11.item(index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\t\thiddenTags(td12.item(index), td21.item(index), td31.item(index));\r\n");
          out.write("\t\t\t\t} else {\r\n");
          out.write("\t\t\t\t\ttd12.removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\t\thiddenTags(td11.item(index), td21.item(index), td31.item(index));\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t} else if(pointFactorVal == 2) {\r\n");
          out.write("\t\t\t\tif(pointTypeVal == 1) {\r\n");
          out.write("\t\t\t\t\ttd21.item(index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\t\thiddenTags(td11.item(index), td12.item(index), td31.item(index));\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t} else {\r\n");
          out.write("\t\t\t\tif(pointTypeVal == 1) {\r\n");
          out.write("\t\t\t\t\ttd31.item(index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\t\thiddenTags(td11.item(index), td12.item(index), td21.item(index));\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t});\r\n");
          out.write("\t});\r\n");
          out.write("\t\r\n");
          out.write("\tA.one(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f6(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select[name='");
          if (_jspx_meth_portlet_005fnamespace_005f7(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointType0']\").on(\"change\", function() {\r\n");
          out.write("\t\tvar pointTypes = A.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f8(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select#");
          if (_jspx_meth_portlet_005fnamespace_005f9(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointType\");\r\n");
          out.write("\t\tvar tmp = this.val();\r\n");
          out.write("\t\tpointTypes.each(function(value, index) {\r\n");
          out.write("\t\t\tthis.val(tmp);\r\n");
          out.write("\t\t});\r\n");
          out.write("\t});\r\n");
          out.write("\t\r\n");
          out.write("\tA.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f10(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm select#");
          if (_jspx_meth_portlet_005fnamespace_005f11(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("pointType\").on(\"change\", function() {\r\n");
          out.write("\t\tvar td11 = A.all(\"table#tableinputpoint td.tdpoinfactor11\");\r\n");
          out.write("\t\tvar td12 = A.all(\"table#tableinputpoint td.tdpoinfactor12\");\r\n");
          out.write("\t\tvar td21 = A.all(\"table#tableinputpoint td.tdpoinfactor21\");\r\n");
          out.write("\t\tvar td31 = A.all(\"table#tableinputpoint td.tdpoinfactor31\");\r\n");
          out.write("\t\r\n");
          out.write("\t\tvar _this = this;\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t_this.each(function(value, index) {\r\n");
          out.write("\t\t\tvar _index = index;\r\n");
          out.write("\t\t\tvar pointType = parseInt(this.val());\r\n");
          out.write("\t\t\tif(pointType == 1) {\r\n");
          out.write("\t\t\t\ttd11.item(_index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\thiddenTags(td12.item(_index), td21.item(_index), td31.item(_index));\r\n");
          out.write("\t\t\t} else {\r\n");
          out.write("\t\t\t\ttd12.item(_index).removeAttribute(\"hidden\");\r\n");
          out.write("\t\t\t\thiddenTags(td11.item(_index), td21.item(_index), td31.item(_index));\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t});\r\n");
          out.write("\t\t\r\n");
          out.write("\t});\r\n");
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("\tA.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f12(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm :text\").on( \"blur\", function() {\r\n");
          out.write("        \t\r\n");
          out.write("\tvar size = this.size();\r\n");
          out.write("\tvar k = 0;\r\n");
          out.write("\t\t\t\r\n");
          out.write("\tfor( k = 0 ; k < size ; k++ ) {\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\tvar selectStr = \"#");
          if (_jspx_meth_portlet_005fnamespace_005f13(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("point\" + k;\r\n");
          out.write("\t\tvar tagSelect = A.one(selectStr);\r\n");
          out.write("\t\tvar ch = tagSelect.val();\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\tvar i = 0;\r\n");
          out.write("\t\tfor( i = 0 ; i < ch.length ; i++ ) {\r\n");
          out.write("\t\t\tif(!((ch[i] >= '0' && ch[i] <= '9') || ch[i] == ' ' || ch[i] == '.')) {\r\n");
          out.write("\t\t\t\talert( ch + ' ");
          if (_jspx_meth_liferay_002dui_005fmessage_005f4(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("\t\t\t\ttagSelect.val('');\r\n");
          out.write("\t\t\t\treturn false;\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\tvar strs = ch.split(\" \");\r\n");
          out.write("\t\tfor( i = 0 ; i < strs.length ; i++) {\r\n");
          out.write("\t\t\tif(strs[i] < 0 || strs[i] > 10) {\r\n");
          out.write("\t\t\t\talert(parseInt(strs[i]) + ' ");
          if (_jspx_meth_liferay_002dui_005fmessage_005f5(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("' + ' ");
          if (_jspx_meth_liferay_002dui_005fmessage_005f6(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("\t\t\t\ttagSelect.val('');\r\n");
          out.write("\t\t\t\treturn false;\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t}\r\n");
          out.write("\t}\r\n");
          out.write("\t\t\t\r\n");
          out.write("\treturn true;\r\n");
          out.write("\t});\r\n");
          out.write("\t\r\n");
          out.write("\tA.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f14(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm :text\").on( \"focus\", function() {\r\n");
          out.write("\t\t var divShowSemester=A.one(\"div#show-semester\");  \r\n");
          out.write("\t\t divShowSemester.html('<p align=\"center\" class=\"semester-class\">' + \r\n");
          out.write("\t\t\t\t '");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f7 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
          _jspx_th_liferay_002dui_005fmessage_005f7.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(229,6) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fmessage_005f7.setKey("semester-x");
          // /html/student-point/type_point.jsp(229,6) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fmessage_005f7.setArguments(semester);
          int _jspx_eval_liferay_002dui_005fmessage_005f7 = _jspx_th_liferay_002dui_005fmessage_005f7.doStartTag();
          if (_jspx_th_liferay_002dui_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f7);
          out.write("' + '</p>');\r\n");
          out.write("\t\tdivShowSemester.addClass(\"begin-anim-semster\");\r\n");
          out.write("\t\tdivShowSemester.setStyle(\"left\", \"750px\");\r\n");
          out.write("\t});\r\n");
          out.write("\t\r\n");
          out.write("\tA.all(\"form#");
          if (_jspx_meth_portlet_005fnamespace_005f15(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("fm :text\").on( \"focus\", function() {\r\n");
          out.write("\t\tvar _this = this;\r\n");
          out.write("\t\tthis.each(function(value, index) {\r\n");
          out.write("\t\t\t_this.item(index).on(\"keydown\", function(event) {\r\n");
          out.write("\t\t\t\tvar keyCode = event.keyCode;\r\n");
          out.write("\t\t\t\tif(keyCode == 40) {\r\n");
          out.write("\t\t\t\t\t_this.item(index + 1).focus();\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\tif(keyCode == 38) {\r\n");
          out.write("\t\t\t\t\t_this.item(index - 1).focus();\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t});\r\n");
          out.write("\t\t});\r\n");
          out.write("\t});\t\r\n");
          out.write("\t\t\r\n");
          out.write("});\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f0 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f0.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(254,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f0.setKey("error-in-excel-file");
          // /html/student-point/type_point.jsp(254,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f0.setMessage("error-in-excel-file");
          int _jspx_eval_liferay_002dui_005ferror_005f0 = _jspx_th_liferay_002dui_005ferror_005f0.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f0);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f1 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f1.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(255,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f1.setKey("error-column-1");
          // /html/student-point/type_point.jsp(255,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f1.setMessage("error-column-1");
          int _jspx_eval_liferay_002dui_005ferror_005f1 = _jspx_th_liferay_002dui_005ferror_005f1.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f1);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f2 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f2.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(256,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f2.setKey("error-column-2");
          // /html/student-point/type_point.jsp(256,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f2.setMessage("error-column-2");
          int _jspx_eval_liferay_002dui_005ferror_005f2 = _jspx_th_liferay_002dui_005ferror_005f2.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f2);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f3 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f3.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(257,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f3.setKey("error-column-3");
          // /html/student-point/type_point.jsp(257,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f3.setMessage("error-column-3");
          int _jspx_eval_liferay_002dui_005ferror_005f3 = _jspx_th_liferay_002dui_005ferror_005f3.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f3);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f4 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f4.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(258,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f4.setKey("error-column-4");
          // /html/student-point/type_point.jsp(258,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f4.setMessage("error-column-4");
          int _jspx_eval_liferay_002dui_005ferror_005f4 = _jspx_th_liferay_002dui_005ferror_005f4.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f4);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f5 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f5.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(259,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f5.setKey("error-column-5");
          // /html/student-point/type_point.jsp(259,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f5.setMessage("error-column-5");
          int _jspx_eval_liferay_002dui_005ferror_005f5 = _jspx_th_liferay_002dui_005ferror_005f5.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f5);
          out.write('\r');
          out.write('\n');
          //  liferay-ui:error
          com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f6 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
          _jspx_th_liferay_002dui_005ferror_005f6.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ferror_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(260,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f6.setKey("error-file-size");
          // /html/student-point/type_point.jsp(260,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ferror_005f6.setMessage("error-file-size");
          int _jspx_eval_liferay_002dui_005ferror_005f6 = _jspx_th_liferay_002dui_005ferror_005f6.doStartTag();
          if (_jspx_th_liferay_002dui_005ferror_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f6);
          out.write("\r\n");
          out.write("\r\n");
i=0; 
          out.write("\r\n");
          out.write("<div style=\"background-color: green;\">\r\n");
          out.write("\t");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(264,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fif_005f2.setTest(size == 0 );
          int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
          if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_liferay_002dui_005ficon_005f2(_jspx_th_c_005fif_005f2, _jspx_page_context))
                return;
              out.write(' ');
              if (_jspx_meth_liferay_002dui_005fmessage_005f8(_jspx_th_c_005fif_005f2, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
          out.write("\r\n");
          out.write("</div>\r\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/student-point/type_point.jsp(268,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fif_005f3.setTest(size > 0 );
          int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
          if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  portlet:actionURL
              com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_005factionURL_005f1 = (com.liferay.taglib.portlet.ActionURLTag) _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.get(com.liferay.taglib.portlet.ActionURLTag.class);
              _jspx_th_portlet_005factionURL_005f1.setPageContext(_jspx_page_context);
              _jspx_th_portlet_005factionURL_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
              // /html/student-point/type_point.jsp(269,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005factionURL_005f1.setName("addStudentsPoints");
              // /html/student-point/type_point.jsp(269,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_portlet_005factionURL_005f1.setVar("addStudentsPointsURL");
              int _jspx_eval_portlet_005factionURL_005f1 = _jspx_th_portlet_005factionURL_005f1.doStartTag();
              if (_jspx_eval_portlet_005factionURL_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_portlet_005factionURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_portlet_005factionURL_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_portlet_005factionURL_005f1.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t");
                  //  portlet:param
                  com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f6 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                  _jspx_th_portlet_005fparam_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_portlet_005fparam_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f1);
                  // /html/student-point/type_point.jsp(270,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f6.setName("subjectId");
                  // /html/student-point/type_point.jsp(270,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f6.setValue(String.valueOf(subject.getSubjectId()) );
                  int _jspx_eval_portlet_005fparam_005f6 = _jspx_th_portlet_005fparam_005f6.doStartTag();
                  if (_jspx_th_portlet_005fparam_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f6);
                  out.write("\r\n");
                  out.write("\t\t");
                  //  portlet:param
                  com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f7 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                  _jspx_th_portlet_005fparam_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_portlet_005fparam_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f1);
                  // /html/student-point/type_point.jsp(271,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f7.setName("classId");
                  // /html/student-point/type_point.jsp(271,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f7.setValue(String.valueOf(tyClass.getClassId()) );
                  int _jspx_eval_portlet_005fparam_005f7 = _jspx_th_portlet_005fparam_005f7.doStartTag();
                  if (_jspx_th_portlet_005fparam_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f7);
                  out.write("\r\n");
                  out.write("\t\t");
                  //  portlet:param
                  com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f8 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                  _jspx_th_portlet_005fparam_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_portlet_005fparam_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f1);
                  // /html/student-point/type_point.jsp(272,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f8.setName("amountStudent");
                  // /html/student-point/type_point.jsp(272,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_portlet_005fparam_005f8.setValue(String.valueOf(students.size()) );
                  int _jspx_eval_portlet_005fparam_005f8 = _jspx_th_portlet_005fparam_005f8.doStartTag();
                  if (_jspx_th_portlet_005fparam_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f8);
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_portlet_005factionURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_portlet_005factionURL_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.reuse(_jspx_th_portlet_005factionURL_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname.reuse(_jspx_th_portlet_005factionURL_005f1);
              java.lang.String addStudentsPointsURL = null;
              addStudentsPointsURL = (java.lang.String) _jspx_page_context.findAttribute("addStudentsPointsURL");
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  aui:form
              com.liferay.taglib.aui.FormTag _jspx_th_aui_005fform_005f1 = (com.liferay.taglib.aui.FormTag) _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.get(com.liferay.taglib.aui.FormTag.class);
              _jspx_th_aui_005fform_005f1.setPageContext(_jspx_page_context);
              _jspx_th_aui_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
              // /html/student-point/type_point.jsp(274,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_aui_005fform_005f1.setAction(addStudentsPointsURL.toString() );
              // /html/student-point/type_point.jsp(274,1) null
              _jspx_th_aui_005fform_005f1.setDynamicAttribute(null, "method", new String("post"));
              // /html/student-point/type_point.jsp(274,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_aui_005fform_005f1.setName("fm");
              int _jspx_eval_aui_005fform_005f1 = _jspx_th_aui_005fform_005f1.doStartTag();
              if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_aui_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_aui_005fform_005f1.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t");
                  //  aui:select
                  com.liferay.taglib.aui.SelectTag _jspx_th_aui_005fselect_005f0 = (com.liferay.taglib.aui.SelectTag) _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel.get(com.liferay.taglib.aui.SelectTag.class);
                  _jspx_th_aui_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_aui_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
                  // /html/student-point/type_point.jsp(275,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_aui_005fselect_005f0.setName("pointFactor");
                  // /html/student-point/type_point.jsp(275,2) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_aui_005fselect_005f0.setLabel("point-factor");
                  int _jspx_eval_aui_005fselect_005f0 = _jspx_th_aui_005fselect_005f0.doStartTag();
                  if (_jspx_eval_aui_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_aui_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_aui_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_aui_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n");
                      out.write("\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_005foption_005f0 = (com.liferay.taglib.aui.OptionTag) _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.get(com.liferay.taglib.aui.OptionTag.class);
                      _jspx_th_aui_005foption_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_aui_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fselect_005f0);
                      // /html/student-point/type_point.jsp(276,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005foption_005f0.setValue(new String("1"));
                      int _jspx_eval_aui_005foption_005f0 = _jspx_th_aui_005foption_005f0.doStartTag();
                      if (_jspx_eval_aui_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_005foption_005f0.doInitBody();
                        }
                        do {
                          //  liferay-ui:message
                          com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f9 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
                          _jspx_th_liferay_002dui_005fmessage_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005foption_005f0);
                          // /html/student-point/type_point.jsp(276,25) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f9.setKey("point-factor-x");
                          // /html/student-point/type_point.jsp(276,25) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f9.setArguments(1 );
                          int _jspx_eval_liferay_002dui_005fmessage_005f9 = _jspx_th_liferay_002dui_005fmessage_005f9.doStartTag();
                          if (_jspx_th_liferay_002dui_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f9);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f9);
                          int evalDoAfterBody = _jspx_th_aui_005foption_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_aui_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f0);
                      out.write("\r\n");
                      out.write("\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_005foption_005f1 = (com.liferay.taglib.aui.OptionTag) _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.get(com.liferay.taglib.aui.OptionTag.class);
                      _jspx_th_aui_005foption_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_aui_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fselect_005f0);
                      // /html/student-point/type_point.jsp(277,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005foption_005f1.setValue(new String("2"));
                      int _jspx_eval_aui_005foption_005f1 = _jspx_th_aui_005foption_005f1.doStartTag();
                      if (_jspx_eval_aui_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_005foption_005f1.doInitBody();
                        }
                        do {
                          //  liferay-ui:message
                          com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f10 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
                          _jspx_th_liferay_002dui_005fmessage_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005foption_005f1);
                          // /html/student-point/type_point.jsp(277,25) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f10.setKey("point-factor-x");
                          // /html/student-point/type_point.jsp(277,25) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f10.setArguments(2 );
                          int _jspx_eval_liferay_002dui_005fmessage_005f10 = _jspx_th_liferay_002dui_005fmessage_005f10.doStartTag();
                          if (_jspx_th_liferay_002dui_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f10);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f10);
                          int evalDoAfterBody = _jspx_th_aui_005foption_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_aui_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f1);
                      out.write("\r\n");
                      out.write("\t\t\t");
                      //  aui:option
                      com.liferay.taglib.aui.OptionTag _jspx_th_aui_005foption_005f2 = (com.liferay.taglib.aui.OptionTag) _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.get(com.liferay.taglib.aui.OptionTag.class);
                      _jspx_th_aui_005foption_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_aui_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fselect_005f0);
                      // /html/student-point/type_point.jsp(278,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005foption_005f2.setValue(new String("3"));
                      int _jspx_eval_aui_005foption_005f2 = _jspx_th_aui_005foption_005f2.doStartTag();
                      if (_jspx_eval_aui_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_aui_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_aui_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_aui_005foption_005f2.doInitBody();
                        }
                        do {
                          //  liferay-ui:message
                          com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f11 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
                          _jspx_th_liferay_002dui_005fmessage_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005foption_005f2);
                          // /html/student-point/type_point.jsp(278,25) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f11.setKey("point-factor-x");
                          // /html/student-point/type_point.jsp(278,25) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fmessage_005f11.setArguments(3 );
                          int _jspx_eval_liferay_002dui_005fmessage_005f11 = _jspx_th_liferay_002dui_005fmessage_005f11.doStartTag();
                          if (_jspx_th_liferay_002dui_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f11);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005farguments_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f11);
                          int evalDoAfterBody = _jspx_th_aui_005foption_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_aui_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_aui_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f2);
                      out.write("\r\n");
                      out.write("\t\t");
                      int evalDoAfterBody = _jspx_th_aui_005fselect_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_aui_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_aui_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel.reuse(_jspx_th_aui_005fselect_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel.reuse(_jspx_th_aui_005fselect_005f0);
                  out.write("\r\n");
                  out.write("\t\t<div id=\"show-semester\" align=\"center\">\r\n");
                  out.write("    \t</div>\r\n");
                  out.write("\t\t<table class=\"student-point-table\" id=\"tableinputpoint\">\r\n");
                  out.write("\t\t\t<tr class=\"student-point-table-fist-row\">\r\n");
                  out.write("\t\t\t\t<td width=\"30px\">");
                  if (_jspx_meth_liferay_002dui_005fmessage_005f12(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  out.write("</td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\">");
                  if (_jspx_meth_liferay_002dui_005fmessage_005f13(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  out.write("</td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\">");
                  if (_jspx_meth_liferay_002dui_005fmessage_005f14(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  out.write("</td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\">");
                  if (_jspx_meth_liferay_002dui_005fmessage_005f15(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  if (_jspx_meth_liferay_002dui_005ficon_002dhelp_005f0(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  out.write("</td>\r\n");
                  out.write("\t\t\t\t<td width=\"250\">");
                  if (_jspx_meth_liferay_002dui_005fmessage_005f16(_jspx_th_aui_005fform_005f1, _jspx_page_context))
                    return;
                  out.write("</td>\r\n");
                  out.write("\t\t\t</tr>\r\n");
                  out.write("\t\t\t\r\n");
                  out.write("\t\t\t<tr height=\"5px\">\r\n");
                  out.write("\t\t\t\t<td width=\"30px\"></td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\"></td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\"></td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\"></td>\r\n");
                  out.write("\t\t\t\t<td width=\"200\"></td>\r\n");
                  out.write("\t\t\t</tr>\r\n");
                  out.write("\t\t\t\r\n");
                  out.write("\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
                  // /html/student-point/type_point.jsp(299,3) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f0.setBegin(0);
                  // /html/student-point/type_point.jsp(299,3) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f0.setEnd(size - 1 );
                  int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t");

					TYStudent student = students.get(i);
					String selectName = "pointType" + i;
					String pointName = "point" + i;
					String studentIdx = "studentId" + i;
				
                        out.write("\r\n");
                        out.write("\t\t\t\t<tr>\r\n");
                        out.write("\t\t\t\t\t<td width=\"30px\">");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(307,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f1.setValue((i+1) );
                        int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
                        if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
                        out.write("</td>\r\n");
                        out.write("\t\t\t\t\t<td  width=\"200\">");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(308,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f2.setValue(student.getStudentFirstName() + " " + student.getStudentLastName() );
                        int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
                        if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
                        out.write("</td>\r\n");
                        out.write("\t\t\t\t\t");
                        //  aui:input
                        com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f1 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
                        _jspx_th_aui_005finput_005f1.setPageContext(_jspx_page_context);
                        _jspx_th_aui_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(309,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f1.setName(studentIdx );
                        // /html/student-point/type_point.jsp(309,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f1.setValue(student.getStudentId() );
                        // /html/student-point/type_point.jsp(309,5) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f1.setType("hidden");
                        int _jspx_eval_aui_005finput_005f1 = _jspx_th_aui_005finput_005f1.doStartTag();
                        if (_jspx_th_aui_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
                          return;
                        }
                        _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t<td  width=\"200\">\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  aui:select
                        com.liferay.taglib.aui.SelectTag _jspx_th_aui_005fselect_005f1 = (com.liferay.taglib.aui.SelectTag) _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid.get(com.liferay.taglib.aui.SelectTag.class);
                        _jspx_th_aui_005fselect_005f1.setPageContext(_jspx_page_context);
                        _jspx_th_aui_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(311,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005fselect_005f1.setName(selectName );
                        // /html/student-point/type_point.jsp(311,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005fselect_005f1.setId("pointType");
                        // /html/student-point/type_point.jsp(311,6) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005fselect_005f1.setLabel(" ");
                        int _jspx_eval_aui_005fselect_005f1 = _jspx_th_aui_005fselect_005f1.doStartTag();
                        if (_jspx_eval_aui_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          if (_jspx_eval_aui_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.pushBody();
                            _jspx_push_body_count_c_005fforEach_005f0[0]++;
                            _jspx_th_aui_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                            _jspx_th_aui_005fselect_005f1.doInitBody();
                          }
                          do {
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t");
                            if (_jspx_meth_aui_005foption_005f3(_jspx_th_aui_005fselect_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                              return;
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t");
                            if (_jspx_meth_aui_005foption_005f4(_jspx_th_aui_005fselect_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                              return;
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t");
                            int evalDoAfterBody = _jspx_th_aui_005fselect_005f1.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                          if (_jspx_eval_aui_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                            out = _jspx_page_context.popBody();
                            _jspx_push_body_count_c_005fforEach_005f0[0]--;
                          }
                        }
                        if (_jspx_th_aui_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid.reuse(_jspx_th_aui_005fselect_005f1);
                          return;
                        }
                        _005fjspx_005ftagPool_005faui_005fselect_0026_005fname_005flabel_005fid.reuse(_jspx_th_aui_005fselect_005f1);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t</td>\r\n");
                        out.write("\t\t\t\t\t<td width=\"200\">");
                        //  aui:input
                        com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f2 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
                        _jspx_th_aui_005finput_005f2.setPageContext(_jspx_page_context);
                        _jspx_th_aui_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(316,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f2.setName(pointName );
                        // /html/student-point/type_point.jsp(316,21) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f2.setType("text");
                        // /html/student-point/type_point.jsp(316,21) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_aui_005finput_005f2.setLabel(" ");
                        int _jspx_eval_aui_005finput_005f2 = _jspx_th_aui_005finput_005f2.doStartTag();
                        if (_jspx_th_aui_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
                          return;
                        }
                        _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005flabel_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
                        out.write("</td>\r\n");
                        out.write("\t\t\t\t\t<td width=\"200px\" class=\"tdpoinfactor11\">\r\n");
                        out.write("\t\t\t\t\t\t");

						float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 1);
						String pointString = TYServiceUtil.floatsToPointString(points);
						
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(324,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f3.setValue(pointString );
                        int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
                        if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t</td>\r\n");
                        out.write("\t\t\t\t\t\r\n");
                        out.write("\t\t\t\t\t<td width=\"200px\" class=\"tdpoinfactor12\" hidden=\"hidden\">\r\n");
                        out.write("\t\t\t\t\t\t");

						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.SPEAK_POINT, 1);
						pointString = TYServiceUtil.floatsToPointString(points);
						
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(334,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f4.setValue(pointString );
                        int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
                        if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t</td>\r\n");
                        out.write("\t\t\t\t\t\r\n");
                        out.write("\t\t\t\t\t<td width=\"200px\" class=\"tdpoinfactor21\" hidden=\"hidden\">\r\n");
                        out.write("\t\t\t\t\t\t");

						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								semester, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 2);
						pointString = TYServiceUtil.floatsToPointString(points);
						
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(344,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f5.setValue(pointString );
                        int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
                        if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t</td>\r\n");
                        out.write("\t\t\t\t\t\r\n");
                        out.write("\t\t\t\t\t<td width=\"200px\" class=\"tdpoinfactor31\" hidden=\"hidden\">\r\n");
                        out.write("\t\t\t\t\t\t");

						points = TYServiceUtil.getPointStudentByPTPF(courses, 
								1, student.getStudentId(), subject.getSubjectId(), 
								WebKeys.WRITE_POINT, 3);
						if(points == null) {
							pointString = LanguageUtil.format(pageContext, "unknown", "");
						} else {
							pointString = TYServiceUtil.floatsToPointString(points);
						}
						
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:out
                        org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
                        _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /html/student-point/type_point.jsp(358,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fout_005f6.setValue(pointString );
                        int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
                        if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t</td>\r\n");
                        out.write("\t\t\t\t\t\r\n");
                        out.write("\t\t\t\t\t\r\n");
                        out.write("\t\t\t\t</tr>\r\n");
                        out.write("\t\t\t\t");
i++; 
                        out.write("\r\n");
                        out.write("\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f0.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
                  }
                  out.write("\r\n");
                  out.write("\t\t</table>\r\n");
                  out.write("\t\t");
                  //  aui:button-row
                  com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_005fbutton_002drow_005f1 = (com.liferay.taglib.aui.ButtonRowTag) _005fjspx_005ftagPool_005faui_005fbutton_002drow.get(com.liferay.taglib.aui.ButtonRowTag.class);
                  _jspx_th_aui_005fbutton_002drow_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_aui_005fbutton_002drow_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
                  int _jspx_eval_aui_005fbutton_002drow_005f1 = _jspx_th_aui_005fbutton_002drow_005f1.doStartTag();
                  if (_jspx_eval_aui_005fbutton_002drow_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_aui_005fbutton_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_aui_005fbutton_002drow_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_aui_005fbutton_002drow_005f1.doInitBody();
                    }
                    do {
                      out.write("\t\r\n");
                      out.write("\t\t\t");
                      if (_jspx_meth_aui_005fbutton_005f1(_jspx_th_aui_005fbutton_002drow_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\t\t\t");
                      //  aui:button
                      com.liferay.taglib.aui.ButtonTag _jspx_th_aui_005fbutton_005f2 = (com.liferay.taglib.aui.ButtonTag) _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody.get(com.liferay.taglib.aui.ButtonTag.class);
                      _jspx_th_aui_005fbutton_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_aui_005fbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fbutton_002drow_005f1);
                      // /html/student-point/type_point.jsp(368,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005fbutton_005f2.setName("cancel");
                      // /html/student-point/type_point.jsp(368,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005fbutton_005f2.setType("cancel");
                      // /html/student-point/type_point.jsp(368,3) name = onClick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_aui_005fbutton_005f2.setOnClick(backURL.toString() );
                      int _jspx_eval_aui_005fbutton_005f2 = _jspx_th_aui_005fbutton_005f2.doStartTag();
                      if (_jspx_th_aui_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody.reuse(_jspx_th_aui_005fbutton_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fonClick_005fname_005fnobody.reuse(_jspx_th_aui_005fbutton_005f2);
                      out.write("\r\n");
                      out.write("\t\t");
                      int evalDoAfterBody = _jspx_th_aui_005fbutton_002drow_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_aui_005fbutton_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_aui_005fbutton_002drow_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005faui_005fbutton_002drow.reuse(_jspx_th_aui_005fbutton_002drow_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005faui_005fbutton_002drow.reuse(_jspx_th_aui_005fbutton_002drow_005f1);
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_aui_005fform_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_aui_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f1);
                return;
              }
              _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f1);
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("<script type=\"text/javascript\">\r\n");
              out.write("\r\n");
              out.write("AUI().ready(\"aui-node\", \"Node\", function(A) {\r\n");
              out.write("\tA.one(\"input#");
              if (_jspx_meth_portlet_005fnamespace_005f16(_jspx_th_c_005fif_005f3, _jspx_page_context))
                return;
              out.write("cancel\").on(\"click\", function() {\r\n");
              out.write("\t\tdocument.location = \"");
              out.print(backURL.toString());
              out.write("\";\r\n");
              out.write("\t});\r\n");
              out.write("});\r\n");
              out.write("</script>\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("\tAUI().ready('aui-dialog','node', function(A) {\r\n");
          out.write("\t\tA.all(\"table.student-point-table\").on(\"mouseover\", function() {\r\n");
          out.write("\t\t\tvar trs = A.all(\"table.student-point-table tr\");\r\n");
          out.write("\t\t\ttrs.each(function(value, index) {\r\n");
          out.write("\t\t\t\tthis.on(\"mouseover\", function() {\r\n");
          out.write("\t\t\t\t\tthis.addClass(\"tr-mouse-over\");\r\n");
          out.write("\t\t\t\t});\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\tthis.on(\"mouseout\", function() {\r\n");
          out.write("\t\t\t\t\tthis.removeClass(\"tr-mouse-over\");\r\n");
          out.write("\t\t\t\t});\r\n");
          out.write("\t\t\t});\r\n");
          out.write("\t\t});\r\n");
          out.write("\t});\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("<!--\r\n");
          out.write("AUI().ready('aui-dialog','node', function(A) {\r\n");
          out.write("\t\r\n");
          out.write("\tvar options = {\r\n");
          out.write("\t\ttitle: 'Dialog',\r\n");
          out.write("\t\tbodyContent: 'Testing body',\r\n");
          out.write("\t\t// centered: true,\r\n");
          out.write("\t\tconstrain2view: true,\r\n");
          out.write("\t\tdraggable: true,\r\n");
          out.write("\t\t// resizable: false,\r\n");
          out.write("\t\tresizable: {\r\n");
          out.write("\t\t\t// proxy: false\r\n");
          out.write("\t\t},\r\n");
          out.write("\t\t// destroyOnClose: true,\r\n");
          out.write("\t\tgroup: 'default',\r\n");
          out.write("\t\theight: 250,\r\n");
          out.write("\t\tstack: true,\r\n");
          out.write("\t\t// shim: true,\r\n");
          out.write("\t\twidth: 500,\r\n");
          out.write("\t\t// zIndex: 0,\r\n");
          out.write("\t\tbuttons: [\r\n");
          out.write("\t\t\t{\r\n");
          out.write("\t\t\t\ttext: 'Refresh content',\r\n");
          out.write("\t\t\t\thandler: function() {\r\n");
          out.write("\t\t\t\t\tthis.io.start();\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t]\r\n");
          out.write("\t};\r\n");
          out.write("\t\r\n");
          out.write("\t\r\n");
          out.write("\tvar content = new A.Node(A.one(\"div#div-dialog-file-upload\"));\r\n");
          out.write("\t\r\n");
          out.write("\t\r\n");
          out.write("\tA.one(\"div#id-addstudent-div a#fileUpload\").on(\"click\", function() {\r\n");
          out.write("\t\tvar dialogHelp = new A.Dialog(\r\n");
          out.write("\t\t\tA.merge(options, {\r\n");
          out.write("\t\t\t\ttitle: '");
          out.print(guide);
          out.write("',\r\n");
          out.write("\t\t\t\txy: [260, 160],\r\n");
          out.write("\t\t\t\tmodal: true\r\n");
          out.write("\t\t\t})\r\n");
          out.write("\t\t)\r\n");
          out.write("\t\t.render();\r\n");
          out.write("\r\n");
          out.write("\t\tdialogHelp.plug(A.Plugin.IO, {\r\n");
          out.write("\t\t\tautoLoad: false,\r\n");
          out.write("\t\t\turi: '");
          out.print(contextPathImg + "/html/file-upload/help_add_points.html");
          out.write("'\r\n");
          out.write("\t\t});\r\n");
          out.write("\r\n");
          out.write("\t\t// manually refresh\r\n");
          out.write("\t\tdialogHelp.io.start();\r\n");
          out.write("\t\r\n");
          out.write("\t\tvar dialog = new A.Dialog(\r\n");
          out.write("\t\t\tA.merge(options, {\r\n");
          out.write("\t\t\t\ttitle: 'File upload dialog',\r\n");
          out.write("\t\t\t\txy: [300, 200],\r\n");
          out.write("\t\t\t\tbodyContent: content.removeAttribute(\"hidden\"),\r\n");
          out.write("\t\t\t})\r\n");
          out.write("\t\t)\r\n");
          out.write("\t\t.render();\r\n");
          out.write("\t}); \r\n");
          out.write("\t\r\n");
          out.write("});\r\n");
          out.write("//-->\r\n");
          out.write("</script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\r\n");
      out.write("\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /html/student-point/type_point.jsp(468,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(semester == 0 );
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<font color=\"red\">");
          if (_jspx_meth_liferay_002dui_005fmessage_005f19(_jspx_th_c_005fif_005f4, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
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

  private boolean _jspx_meth_aui_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f0 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
    _jspx_th_aui_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
    // /html/student-point/type_point.jsp(32,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f0.setName("filePath");
    // /html/student-point/type_point.jsp(32,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f0.setType("file");
    int _jspx_eval_aui_005finput_005f0 = _jspx_th_aui_005finput_005f0.doStartTag();
    if (_jspx_th_aui_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
    return false;
  }

  private boolean _jspx_meth_aui_005fbutton_002drow_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button-row
    com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_005fbutton_002drow_005f0 = (com.liferay.taglib.aui.ButtonRowTag) _005fjspx_005ftagPool_005faui_005fbutton_002drow.get(com.liferay.taglib.aui.ButtonRowTag.class);
    _jspx_th_aui_005fbutton_002drow_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005fbutton_002drow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
    int _jspx_eval_aui_005fbutton_002drow_005f0 = _jspx_th_aui_005fbutton_002drow_005f0.doStartTag();
    if (_jspx_eval_aui_005fbutton_002drow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_005fbutton_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_005fbutton_002drow_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_005fbutton_002drow_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_aui_005fbutton_005f0(_jspx_th_aui_005fbutton_002drow_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_aui_005fbutton_002drow_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_aui_005fbutton_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_aui_005fbutton_002drow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005fbutton_002drow.reuse(_jspx_th_aui_005fbutton_002drow_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005fbutton_002drow.reuse(_jspx_th_aui_005fbutton_002drow_005f0);
    return false;
  }

  private boolean _jspx_meth_aui_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fbutton_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_005fbutton_005f0 = (com.liferay.taglib.aui.ButtonTag) _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.get(com.liferay.taglib.aui.ButtonTag.class);
    _jspx_th_aui_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fbutton_002drow_005f0);
    // /html/student-point/type_point.jsp(34,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setType("submit");
    // /html/student-point/type_point.jsp(34,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setValue("Submit");
    int _jspx_eval_aui_005fbutton_005f0 = _jspx_th_aui_005fbutton_005f0.doStartTag();
    if (_jspx_th_aui_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f0 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /html/student-point/type_point.jsp(42,2) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f0.setKey("import-points-from-file");
    int _jspx_eval_liferay_002dui_005fmessage_005f0 = _jspx_th_liferay_002dui_005fmessage_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005ficon_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay_002dui_005ficon_005f0 = (com.liferay.taglib.ui.IconTag) _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.get(com.liferay.taglib.ui.IconTag.class);
    _jspx_th_liferay_002dui_005ficon_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005ficon_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /html/student-point/type_point.jsp(43,69) name = image type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005ficon_005f0.setImage("add_article");
    int _jspx_eval_liferay_002dui_005ficon_005f0 = _jspx_th_liferay_002dui_005ficon_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005ficon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f1 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(49,2) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f1.setKey("courses");
    int _jspx_eval_liferay_002dui_005fmessage_005f1 = _jspx_th_liferay_002dui_005fmessage_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f2 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f0);
    // /html/student-point/type_point.jsp(63,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setName("jspPage");
    // /html/student-point/type_point.jsp(63,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setValue("/html/teacher-admin/view_permission.jsp");
    int _jspx_eval_portlet_005fparam_005f2 = _jspx_th_portlet_005fparam_005f2.doStartTag();
    if (_jspx_th_portlet_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f5 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f1);
    // /html/student-point/type_point.jsp(75,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f5.setName("jspPage");
    // /html/student-point/type_point.jsp(75,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f5.setValue("/html/student-point/view_edit_class_subject_point.jsp");
    int _jspx_eval_portlet_005fparam_005f5 = _jspx_th_portlet_005fparam_005f5.doStartTag();
    if (_jspx_th_portlet_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005ficon_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay_002dui_005ficon_005f1 = (com.liferay.taglib.ui.IconTag) _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.get(com.liferay.taglib.ui.IconTag.class);
    _jspx_th_liferay_002dui_005ficon_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005ficon_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(81,2) name = image type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005ficon_005f1.setImage("edit");
    int _jspx_eval_liferay_002dui_005ficon_005f1 = _jspx_th_liferay_002dui_005ficon_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005ficon_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f3 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(82,2) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f3.setKey("edit-point");
    int _jspx_eval_liferay_002dui_005fmessage_005f3 = _jspx_th_liferay_002dui_005fmessage_005f3.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f0 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f0 = _jspx_th_portlet_005fnamespace_005f0.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f0);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f1 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f1 = _jspx_th_portlet_005fnamespace_005f1.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f2 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f2 = _jspx_th_portlet_005fnamespace_005f2.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f2);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f3 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f3 = _jspx_th_portlet_005fnamespace_005f3.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f3);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f4 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f4 = _jspx_th_portlet_005fnamespace_005f4.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f4);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f5 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f5 = _jspx_th_portlet_005fnamespace_005f5.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f5);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f6 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f6 = _jspx_th_portlet_005fnamespace_005f6.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f6);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f7 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f7 = _jspx_th_portlet_005fnamespace_005f7.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f7);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f8 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f8.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f8 = _jspx_th_portlet_005fnamespace_005f8.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f8);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f9 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f9.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f9 = _jspx_th_portlet_005fnamespace_005f9.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f9);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f10 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f10.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f10 = _jspx_th_portlet_005fnamespace_005f10.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f10);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f11 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f11.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f11 = _jspx_th_portlet_005fnamespace_005f11.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f11);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f12 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f12.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f12 = _jspx_th_portlet_005fnamespace_005f12.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f12);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f13 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f13.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f13 = _jspx_th_portlet_005fnamespace_005f13.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f13);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f4 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(207,18) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f4.setKey("invalid");
    int _jspx_eval_liferay_002dui_005fmessage_005f4 = _jspx_th_liferay_002dui_005fmessage_005f4.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f5 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(216,32) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f5.setKey("point");
    int _jspx_eval_liferay_002dui_005fmessage_005f5 = _jspx_th_liferay_002dui_005fmessage_005f5.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f6 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/student-point/type_point.jsp(216,72) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f6.setKey("invalid");
    int _jspx_eval_liferay_002dui_005fmessage_005f6 = _jspx_th_liferay_002dui_005fmessage_005f6.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f14 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f14.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f14 = _jspx_th_portlet_005fnamespace_005f14.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f14);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f15 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f15.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    int _jspx_eval_portlet_005fnamespace_005f15 = _jspx_th_portlet_005fnamespace_005f15.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f15);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005ficon_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay_002dui_005ficon_005f2 = (com.liferay.taglib.ui.IconTag) _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.get(com.liferay.taglib.ui.IconTag.class);
    _jspx_th_liferay_002dui_005ficon_005f2.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005ficon_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /html/student-point/type_point.jsp(265,2) name = image type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005ficon_005f2.setImage("activate");
    int _jspx_eval_liferay_002dui_005ficon_005f2 = _jspx_th_liferay_002dui_005ficon_005f2.doStartTag();
    if (_jspx_th_liferay_002dui_005ficon_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_0026_005fimage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_005f2);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f8 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /html/student-point/type_point.jsp(265,39) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f8.setKey("there-are-no-students");
    int _jspx_eval_liferay_002dui_005fmessage_005f8 = _jspx_th_liferay_002dui_005fmessage_005f8.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f8);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f12 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f12.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(284,21) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f12.setKey("index");
    int _jspx_eval_liferay_002dui_005fmessage_005f12 = _jspx_th_liferay_002dui_005fmessage_005f12.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f12);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f13 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f13.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(285,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f13.setKey("student");
    int _jspx_eval_liferay_002dui_005fmessage_005f13 = _jspx_th_liferay_002dui_005fmessage_005f13.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f13);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f14 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(286,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f14.setKey("point-type");
    int _jspx_eval_liferay_002dui_005fmessage_005f14 = _jspx_th_liferay_002dui_005fmessage_005f14.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f14);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f15 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f15.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(287,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f15.setKey("point");
    int _jspx_eval_liferay_002dui_005fmessage_005f15 = _jspx_th_liferay_002dui_005fmessage_005f15.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f15);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005ficon_002dhelp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay_002dui_005ficon_002dhelp_005f0 = (com.liferay.taglib.ui.IconHelpTag) _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody.get(com.liferay.taglib.ui.IconHelpTag.class);
    _jspx_th_liferay_002dui_005ficon_002dhelp_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005ficon_002dhelp_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(287,54) name = message type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005ficon_002dhelp_005f0.setMessage("type-point-help");
    int _jspx_eval_liferay_002dui_005ficon_002dhelp_005f0 = _jspx_th_liferay_002dui_005ficon_002dhelp_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005ficon_002dhelp_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_002dhelp_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005ficon_002dhelp_0026_005fmessage_005fnobody.reuse(_jspx_th_liferay_002dui_005ficon_002dhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f16 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f16.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/student-point/type_point.jsp(288,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f16.setKey("point-exist");
    int _jspx_eval_liferay_002dui_005fmessage_005f16 = _jspx_th_liferay_002dui_005fmessage_005f16.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f16);
    return false;
  }

  private boolean _jspx_meth_aui_005foption_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fselect_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_005foption_005f3 = (com.liferay.taglib.aui.OptionTag) _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_005foption_005f3.setPageContext(_jspx_page_context);
    _jspx_th_aui_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fselect_005f1);
    // /html/student-point/type_point.jsp(312,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005foption_005f3.setValue(new String("1"));
    int _jspx_eval_aui_005foption_005f3 = _jspx_th_aui_005foption_005f3.doStartTag();
    if (_jspx_eval_aui_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_aui_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_005foption_005f3.doInitBody();
      }
      do {
        if (_jspx_meth_liferay_002dui_005fmessage_005f17(_jspx_th_aui_005foption_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        int evalDoAfterBody = _jspx_th_aui_005foption_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_aui_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_aui_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f3);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005foption_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f17 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f17.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005foption_005f3);
    // /html/student-point/type_point.jsp(312,29) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f17.setKey("point-write");
    int _jspx_eval_liferay_002dui_005fmessage_005f17 = _jspx_th_liferay_002dui_005fmessage_005f17.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f17);
    return false;
  }

  private boolean _jspx_meth_aui_005foption_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fselect_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_005foption_005f4 = (com.liferay.taglib.aui.OptionTag) _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_005foption_005f4.setPageContext(_jspx_page_context);
    _jspx_th_aui_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fselect_005f1);
    // /html/student-point/type_point.jsp(313,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005foption_005f4.setValue(new String("2"));
    int _jspx_eval_aui_005foption_005f4 = _jspx_th_aui_005foption_005f4.doStartTag();
    if (_jspx_eval_aui_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_aui_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_005foption_005f4.doInitBody();
      }
      do {
        if (_jspx_meth_liferay_002dui_005fmessage_005f18(_jspx_th_aui_005foption_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        int evalDoAfterBody = _jspx_th_aui_005foption_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_aui_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_aui_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005foption_0026_005fvalue.reuse(_jspx_th_aui_005foption_005f4);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005foption_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f18 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f18.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005foption_005f4);
    // /html/student-point/type_point.jsp(313,29) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f18.setKey("point-speak");
    int _jspx_eval_liferay_002dui_005fmessage_005f18 = _jspx_th_liferay_002dui_005fmessage_005f18.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f18);
    return false;
  }

  private boolean _jspx_meth_aui_005fbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fbutton_002drow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_005fbutton_005f1 = (com.liferay.taglib.aui.ButtonTag) _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.ButtonTag.class);
    _jspx_th_aui_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_aui_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fbutton_002drow_005f1);
    // /html/student-point/type_point.jsp(367,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f1.setName("Save");
    // /html/student-point/type_point.jsp(367,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f1.setType("submit");
    int _jspx_eval_aui_005fbutton_005f1 = _jspx_th_aui_005fbutton_005f1.doStartTag();
    if (_jspx_th_aui_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005fbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005fbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005fnamespace_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_005fnamespace_005f16 = (com.liferay.taglib.portlet.NamespaceTag) _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_005fnamespace_005f16.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fnamespace_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    int _jspx_eval_portlet_005fnamespace_005f16 = _jspx_th_portlet_005fnamespace_005f16.doStartTag();
    if (_jspx_th_portlet_005fnamespace_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fnamespace_005fnobody.reuse(_jspx_th_portlet_005fnamespace_005f16);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f19 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f19.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /html/student-point/type_point.jsp(469,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f19.setKey("cannot-type-point");
    int _jspx_eval_liferay_002dui_005fmessage_005f19 = _jspx_th_liferay_002dui_005fmessage_005f19.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f19);
    return false;
  }
}
