package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.inkwell.internet.productregistration.registration.portlet.ActionUtil;
import com.inkwell.internet.productregistration.model.TVDProduct;
import java.util.List;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.security.permission.ActionKeys;
import com.inkwell.internet.productregistration.model.TVDRegistration;
import com.inkwell.internet.productregistration.model.TVDUser;
import com.inkwell.internet.productregistration.service.TVDProductLocalServiceUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import java.util.Calendar;
import com.liferay.portal.model.User;

public final class display_005fregistrations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/WEB-INF/tld/c-1_0-rt.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet-ext.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-ui.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-aui.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-theme.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-security.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p><img src='");
      out.print(renderResponse.encodeURL(renderRequest.getContextPath()) + "/images/inkwell-pen-logo.jpg");
      out.write("' border=\"0\"></p>\r\n");
      //  liferay-ui:search-container
      com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setParent(null);
      // /admin/display_registrations.jsp(4,0) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setEmptyResultsMessage("there-are-no-registrations");
      // /admin/display_registrations.jsp(4,0) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setDelta(5);
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
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("\t");
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

			List<TVDRegistration> tempResults = ActionUtil.getRegistrations(renderRequest);
			results = ListUtil.subList(tempResults, 
					searchContainer.getStart(), searchContainer.getEnd());
			total = tempResults.size();
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
          // /admin/display_registrations.jsp(18,1) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setClassName("com.inkwell.internet.productregistration.model.TVDRegistration");
          // /admin/display_registrations.jsp(18,1) name = keyProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setKeyProperty("registrationId");
          // /admin/display_registrations.jsp(18,1) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setModelVar("registration");
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doStartTag();
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            com.inkwell.internet.productregistration.model.TVDRegistration registration = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            registration = (com.inkwell.internet.productregistration.model.TVDRegistration) _jspx_page_context.findAttribute("registration");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        \t\r\n");
              out.write("    \t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        \t\r\n");
              out.write("    \t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      \t\t\r\n");
              out.write("    \t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("      \t");
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              registration = (com.inkwell.internet.productregistration.model.TVDRegistration) _jspx_page_context.findAttribute("registration");
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

  private boolean _jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
    // /admin/display_registrations.jsp(23,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setName("date-purchased");
    // /admin/display_registrations.jsp(23,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setProperty("datePurchased");
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
    // /admin/display_registrations.jsp(27,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setName("product-serial-number");
    // /admin/display_registrations.jsp(27,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setProperty("serialNumber");
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
    // /admin/display_registrations.jsp(31,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setName("how-hear");
    // /admin/display_registrations.jsp(31,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setProperty("howHear");
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
    // /admin/display_registrations.jsp(35,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setName("where-purchase");
    // /admin/display_registrations.jsp(35,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setProperty("wherePurchased");
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
    // /admin/display_registrations.jsp(38,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setPath("/admin/display_actions.jsp");
    // /admin/display_registrations.jsp(38,7) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
}
