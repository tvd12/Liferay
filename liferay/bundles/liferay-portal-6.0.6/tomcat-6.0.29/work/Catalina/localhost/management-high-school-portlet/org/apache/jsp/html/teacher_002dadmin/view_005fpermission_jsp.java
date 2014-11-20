package org.apache.jsp.html.teacher_002dadmin;

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

public final class view_005fpermission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName.release();
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

	User teacher = user;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>");
      if (_jspx_meth_liferay_002dui_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\r\n");
      //  portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f0 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
      _jspx_th_portlet_005frenderURL_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005frenderURL_005f0.setParent(null);
      // /html/teacher-admin/view_permission.jsp(9,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_portlet_005frenderURL_005f0.setVar("backURL");
      // /html/teacher-admin/view_permission.jsp(9,0) name = windowState type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_portlet_005frenderURL_005f0.setWindowState("normal");
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
          if (_jspx_meth_portlet_005fparam_005f0(_jspx_th_portlet_005frenderURL_005f0, _jspx_page_context))
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
        _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f0);
      java.lang.String backURL = null;
      backURL = (java.lang.String) _jspx_page_context.findAttribute("backURL");
      out.write("\r\n");
      out.write("\r\n");

	String backTitle = LanguageUtil.format(pageContext, "return-to-page", "");

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_liferay_002dui_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\t<a href=\"");
      out.print(backURL.toString());
      out.write("\" style=\"text-decoration: none; font-weight: bold;\">");
      out.print(backTitle);
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      if (_jspx_meth_liferay_002dui_005fsuccess_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<h3 id=\"manager-class-role-title\">");
      if (_jspx_meth_liferay_002dui_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<div id=\"manager-class-role-slide\">\r\n");
      //  liferay-ui:search-container
      com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setParent(null);
      // /html/teacher-admin/view_permission.jsp(26,0) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setEmptyResultsMessage("there-are-no-class");
      // /html/teacher-admin/view_permission.jsp(26,0) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setDelta(100);
      int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.doStartTag();
      if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.doInitBody();
        }
        searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  liferay-ui:search-container-results
          java.util.List results = null;
          java.lang.Integer total = null;
          com.liferay.taglib.ui.SearchContainerResultsTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0 = (com.liferay.taglib.ui.SearchContainerResultsTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.get(com.liferay.taglib.ui.SearchContainerResultsTag.class);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0.doStartTag();
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t");

		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		int courses = TYServiceUtil.getCurrentCourse();
		long userId = teacher.getUserId();
		List<TYClass> classes = 
			ActionUtil.getClassesByTeacherRole(courses, groupId, companyId, userId, RoleKeys.MANAGEMENT);
		results = ListUtil.subList(
				classes, searchContainer.getStart(), searchContainer.getEnd());
		total = classes.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0.doAfterBody();
              results = (java.util.List) _jspx_page_context.findAttribute("results");
              total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0);
            return;
          }
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f0);
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t");
          //  liferay-ui:search-container-row
          com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = (com.liferay.taglib.ui.SearchContainerRowTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.get(com.liferay.taglib.ui.SearchContainerRowTag.class);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
          // /html/teacher-admin/view_permission.jsp(43,1) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setClassName("org.tvd.thptty.model.TYClass");
          // /html/teacher-admin/view_permission.jsp(43,1) name = keyProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setKeyProperty("classId");
          // /html/teacher-admin/view_permission.jsp(43,1) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setModelVar("tyClass");
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doStartTag();
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            org.tvd.thptty.model.TYClass tyClass = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            tyClass = (org.tvd.thptty.model.TYClass) _jspx_page_context.findAttribute("tyClass");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          \r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              tyClass = (org.tvd.thptty.model.TYClass) _jspx_page_context.findAttribute("tyClass");
              row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t");
          if (_jspx_meth_liferay_002dui_005fsearch_002diterator_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\r\n");
          int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.doAfterBody();
          searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<h3 id=\"type-point-role-title\">");
      if (_jspx_meth_liferay_002dui_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</h3>\t\r\n");
      out.write("<div id=\"type-point-role-slide\">\r\n");
      //  liferay-ui:search-container
      com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setParent(null);
      // /html/teacher-admin/view_permission.jsp(76,0) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setEmptyResultsMessage("there-are-no-class");
      // /html/teacher-admin/view_permission.jsp(76,0) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setDelta(100);
      int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.doStartTag();
      if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.doInitBody();
        }
        searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  liferay-ui:search-container-results
          java.util.List results = null;
          java.lang.Integer total = null;
          com.liferay.taglib.ui.SearchContainerResultsTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1 = (com.liferay.taglib.ui.SearchContainerResultsTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.get(com.liferay.taglib.ui.SearchContainerResultsTag.class);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1.doStartTag();
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');

		int courses = TYServiceUtil.getCurrentCourse();
		long userId = teacher.getUserId();
		List<SubjectClassUserRoleTemp> scur = TYServiceUtil.getAllClassSubjectByUserRole(
				courses, userId, RoleKeys.TYPE_POINT);
		results = ListUtil.subList(scur, searchContainer.getStart(), 
				searchContainer.getEnd());
		total = scur.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
	
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1.doAfterBody();
              results = (java.util.List) _jspx_page_context.findAttribute("results");
              total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1);
            return;
          }
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dresults_005f1);
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  liferay-ui:search-container-row
          com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 = (com.liferay.taglib.ui.SearchContainerRowTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName.get(com.liferay.taglib.ui.SearchContainerRowTag.class);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
          // /html/teacher-admin/view_permission.jsp(90,1) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setClassName("org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp");
          // /html/teacher-admin/view_permission.jsp(90,1) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setModelVar("scurt");
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doStartTag();
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp scurt = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            scurt = (org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp) _jspx_page_context.findAttribute("scurt");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\r\n");
              out.write("\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          \r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              scurt = (org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp) _jspx_page_context.findAttribute("scurt");
              row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t");
          if (_jspx_meth_liferay_002dui_005fsearch_002diterator_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.doAfterBody();
          searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tAUI().ready('aui-dialog','node', function(A) {\r\n");
      out.write("\t\tvar trs = A.all(\"tr\");\r\n");
      out.write("\t\ttrs.each(function(value, index) {\r\n");
      out.write("\t\t\tthis.on(\"mouseover\", function() {\r\n");
      out.write("\t\t\t\tthis.addClass(\"tr-mouse-over\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tthis.on(\"mouseout\", function() {\r\n");
      out.write("\t\t\t\tthis.removeClass(\"tr-mouse-over\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
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
    // /html/teacher-admin/view_permission.jsp(7,4) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f0.setKey("list-of-permission");
    int _jspx_eval_liferay_002dui_005fmessage_005f0 = _jspx_th_liferay_002dui_005fmessage_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f0 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f0);
    // /html/teacher-admin/view_permission.jsp(10,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("jspPage");
    // /html/teacher-admin/view_permission.jsp(10,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("/html/teacher-admin/view.jsp");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fheader_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:header
    com.liferay.taglib.ui.HeaderTag _jspx_th_liferay_002dui_005fheader_005f0 = (com.liferay.taglib.ui.HeaderTag) _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.get(com.liferay.taglib.ui.HeaderTag.class);
    _jspx_th_liferay_002dui_005fheader_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fheader_005f0.setParent(null);
    // /html/teacher-admin/view_permission.jsp(16,0) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fheader_005f0.setTitle("");
    int _jspx_eval_liferay_002dui_005fheader_005f0 = _jspx_th_liferay_002dui_005fheader_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fheader_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.reuse(_jspx_th_liferay_002dui_005fheader_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fheader_0026_005ftitle_005fnobody.reuse(_jspx_th_liferay_002dui_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsuccess_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay_002dui_005fsuccess_005f0 = (com.liferay.taglib.ui.SuccessTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.SuccessTag.class);
    _jspx_th_liferay_002dui_005fsuccess_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsuccess_005f0.setParent(null);
    // /html/teacher-admin/view_permission.jsp(22,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f0.setKey("recovery-role-success");
    // /html/teacher-admin/view_permission.jsp(22,0) name = message type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f0.setMessage("recovery-role-success");
    int _jspx_eval_liferay_002dui_005fsuccess_005f0 = _jspx_th_liferay_002dui_005fsuccess_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fsuccess_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f0);
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
    // /html/teacher-admin/view_permission.jsp(23,34) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f1.setKey("manager-class");
    int _jspx_eval_liferay_002dui_005fmessage_005f1 = _jspx_th_liferay_002dui_005fmessage_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /html/teacher-admin/view_permission.jsp(48,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setName("index");
    // /html/teacher-admin/view_permission.jsp(48,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setProperty("index");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /html/teacher-admin/view_permission.jsp(51,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setName("class-code");
    // /html/teacher-admin/view_permission.jsp(51,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setProperty("classCode");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /html/teacher-admin/view_permission.jsp(55,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setName("class-name");
    // /html/teacher-admin/view_permission.jsp(55,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setProperty("classFullName");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /html/teacher-admin/view_permission.jsp(59,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setName("modified-date");
    // /html/teacher-admin/view_permission.jsp(59,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setProperty("modifiedDate");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-jsp
    com.liferay.taglib.ui.SearchContainerColumnJSPTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0 = (com.liferay.taglib.ui.SearchContainerColumnJSPTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnJSPTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /html/teacher-admin/view_permission.jsp(63,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setPath("/html/teacher-admin/managerment_role_action.jsp");
    // /html/teacher-admin/view_permission.jsp(63,1) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setAlign("right");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002diterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-iterator
    com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay_002dui_005fsearch_002diterator_005f0 = (com.liferay.taglib.ui.SearchIteratorTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.get(com.liferay.taglib.ui.SearchIteratorTag.class);
    _jspx_th_liferay_002dui_005fsearch_002diterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002diterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
    int _jspx_eval_liferay_002dui_005fsearch_002diterator_005f0 = _jspx_th_liferay_002dui_005fsearch_002diterator_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002diterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002diterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002diterator_005f0);
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
    // /html/teacher-admin/view_permission.jsp(74,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f2.setKey("type-point");
    int _jspx_eval_liferay_002dui_005fmessage_005f2 = _jspx_th_liferay_002dui_005fmessage_005f2.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
    // /html/teacher-admin/view_permission.jsp(94,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.setName("index");
    // /html/teacher-admin/view_permission.jsp(94,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.setProperty("index");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f4);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
    // /html/teacher-admin/view_permission.jsp(97,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.setName("subject-name");
    // /html/teacher-admin/view_permission.jsp(97,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.setProperty("subjectName");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f5);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
    // /html/teacher-admin/view_permission.jsp(101,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.setName("class-name");
    // /html/teacher-admin/view_permission.jsp(101,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.setProperty("className");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f6);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-jsp
    com.liferay.taglib.ui.SearchContainerColumnJSPTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1 = (com.liferay.taglib.ui.SearchContainerColumnJSPTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnJSPTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
    // /html/teacher-admin/view_permission.jsp(105,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.setPath("/html/teacher-admin/type_point_action.jsp");
    // /html/teacher-admin/view_permission.jsp(105,1) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.setAlign("right");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsearch_002diterator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-iterator
    com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay_002dui_005fsearch_002diterator_005f1 = (com.liferay.taglib.ui.SearchIteratorTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.get(com.liferay.taglib.ui.SearchIteratorTag.class);
    _jspx_th_liferay_002dui_005fsearch_002diterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002diterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
    int _jspx_eval_liferay_002dui_005fsearch_002diterator_005f1 = _jspx_th_liferay_002dui_005fsearch_002diterator_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002diterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002diterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002diterator_005f1);
    return false;
  }
}
