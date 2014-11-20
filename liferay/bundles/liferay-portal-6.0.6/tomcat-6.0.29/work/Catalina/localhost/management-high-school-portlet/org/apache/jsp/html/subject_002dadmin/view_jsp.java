package org.apache.jsp.html.subject_002dadmin;

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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005ffieldset;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody;
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
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005ffieldset = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005faui_005ffieldset.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.release();
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
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_005factionURL_005f0 = (com.liferay.taglib.portlet.ActionURLTag) _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody.get(com.liferay.taglib.portlet.ActionURLTag.class);
      _jspx_th_portlet_005factionURL_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005factionURL_005f0.setParent(null);
      // /html/subject-admin/view.jsp(3,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_portlet_005factionURL_005f0.setName("addSubject");
      // /html/subject-admin/view.jsp(3,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_portlet_005factionURL_005f0.setVar("addSubjectURL");
      int _jspx_eval_portlet_005factionURL_005f0 = _jspx_th_portlet_005factionURL_005f0.doStartTag();
      if (_jspx_th_portlet_005factionURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fportlet_005factionURL_0026_005fvar_005fname_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f0);
      java.lang.String addSubjectURL = null;
      addSubjectURL = (java.lang.String) _jspx_page_context.findAttribute("addSubjectURL");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_liferay_002dui_005fsuccess_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_liferay_002dui_005fsuccess_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");

	long companyId = themeDisplay.getCompanyId();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYSubject.class.getName();
	long primKey = user.getPrimaryKey();
	
	//int courses = TYServiceUtil.getCurrentCourse();
	
	//User subjectCapital = TYServiceUtil.getUserBySubjectRole(
			//courses, themeDisplay.getScopeGroupId(), subjectId, roleId);

      out.write("\r\n");
      out.write("\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /html/subject-admin/view.jsp(20,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(permissionChecker.hasPermission(groupId, name, primKey, TYActionKeys.ADD_SUBJECT) );
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          //  aui:form
          com.liferay.taglib.aui.FormTag _jspx_th_aui_005fform_005f0 = (com.liferay.taglib.aui.FormTag) _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.get(com.liferay.taglib.aui.FormTag.class);
          _jspx_th_aui_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_aui_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /html/subject-admin/view.jsp(21,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005fform_005f0.setAction(addSubjectURL.toString() );
          // /html/subject-admin/view.jsp(21,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005fform_005f0.setName("fm");
          // /html/subject-admin/view.jsp(21,1) null
          _jspx_th_aui_005fform_005f0.setDynamicAttribute(null, "method", new String("post"));
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
              //  aui:fieldset
              com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_005ffieldset_005f0 = (com.liferay.taglib.aui.FieldsetTag) _005fjspx_005ftagPool_005faui_005ffieldset.get(com.liferay.taglib.aui.FieldsetTag.class);
              _jspx_th_aui_005ffieldset_005f0.setPageContext(_jspx_page_context);
              _jspx_th_aui_005ffieldset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
              int _jspx_eval_aui_005ffieldset_005f0 = _jspx_th_aui_005ffieldset_005f0.doStartTag();
              if (_jspx_eval_aui_005ffieldset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_aui_005ffieldset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_aui_005ffieldset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_aui_005ffieldset_005f0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_aui_005finput_005f0(_jspx_th_aui_005ffieldset_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  //  liferay-ui:error
                  com.liferay.taglib.ui.ErrorTag _jspx_th_liferay_002dui_005ferror_005f0 = (com.liferay.taglib.ui.ErrorTag) _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.ErrorTag.class);
                  _jspx_th_liferay_002dui_005ferror_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay_002dui_005ferror_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005ffieldset_005f0);
                  // /html/subject-admin/view.jsp(24,3) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005ferror_005f0.setKey("subject-name-required");
                  // /html/subject-admin/view.jsp(24,3) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005ferror_005f0.setMessage("subject-name-required");
                  int _jspx_eval_liferay_002dui_005ferror_005f0 = _jspx_th_liferay_002dui_005ferror_005f0.doStartTag();
                  if (_jspx_th_liferay_002dui_005ferror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fliferay_002dui_005ferror_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005ferror_005f0);
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_aui_005finput_005f1(_jspx_th_aui_005ffieldset_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_aui_005finput_005f2(_jspx_th_aui_005ffieldset_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_aui_005fbutton_005f0(_jspx_th_aui_005ffieldset_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t");
                  int evalDoAfterBody = _jspx_th_aui_005ffieldset_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_aui_005ffieldset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_aui_005ffieldset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005faui_005ffieldset.reuse(_jspx_th_aui_005ffieldset_005f0);
                return;
              }
              _005fjspx_005ftagPool_005faui_005ffieldset.reuse(_jspx_th_aui_005ffieldset_005f0);
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
            _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f0);
          out.write("\r\n");
          out.write("<br />\r\n");
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
      out.write('\r');
      out.write('\n');
      //  liferay-ui:search-container
      com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setParent(null);
      // /html/subject-admin/view.jsp(32,0) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setEmptyResultsMessage("there-are-no-subjects");
      // /html/subject-admin/view.jsp(32,0) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setDelta(10);
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

		List<TYSubject> subjects = 
			ActionUtil.getAllSubjects(companyId, groupId);
		results = ListUtil.subList(
				subjects, searchContainer.getStart(), searchContainer.getEnd());
		total = subjects.size();
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
          // /html/subject-admin/view.jsp(45,1) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setClassName("org.tvd.thptty.model.TYSubject");
          // /html/subject-admin/view.jsp(45,1) name = keyProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setKeyProperty("subjectId");
          // /html/subject-admin/view.jsp(45,1) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setModelVar("subject");
          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doStartTag();
          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            org.tvd.thptty.model.TYSubject subject = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            subject = (org.tvd.thptty.model.TYSubject) _jspx_page_context.findAttribute("subject");
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
              if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          \r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              subject = (org.tvd.thptty.model.TYSubject) _jspx_page_context.findAttribute("subject");
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

  private boolean _jspx_meth_liferay_002dui_005fsuccess_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay_002dui_005fsuccess_005f0 = (com.liferay.taglib.ui.SuccessTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.SuccessTag.class);
    _jspx_th_liferay_002dui_005fsuccess_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsuccess_005f0.setParent(null);
    // /html/subject-admin/view.jsp(5,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f0.setKey("add-subject-success");
    // /html/subject-admin/view.jsp(5,0) name = message type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f0.setMessage("add-subject-success");
    int _jspx_eval_liferay_002dui_005fsuccess_005f0 = _jspx_th_liferay_002dui_005fsuccess_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fsuccess_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fsuccess_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay_002dui_005fsuccess_005f1 = (com.liferay.taglib.ui.SuccessTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.get(com.liferay.taglib.ui.SuccessTag.class);
    _jspx_th_liferay_002dui_005fsuccess_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fsuccess_005f1.setParent(null);
    // /html/subject-admin/view.jsp(6,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f1.setKey("delete-subject-success");
    // /html/subject-admin/view.jsp(6,0) name = message type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsuccess_005f1.setMessage("delete-subject-success");
    int _jspx_eval_liferay_002dui_005fsuccess_005f1 = _jspx_th_liferay_002dui_005fsuccess_005f1.doStartTag();
    if (_jspx_th_liferay_002dui_005fsuccess_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsuccess_0026_005fmessage_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fsuccess_005f1);
    return false;
  }

  private boolean _jspx_meth_aui_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005ffieldset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f0 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
    _jspx_th_aui_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005ffieldset_005f0);
    // /html/subject-admin/view.jsp(23,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f0.setName("subjectCode");
    // /html/subject-admin/view.jsp(23,3) name = helpMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f0.setHelpMessage("accept-null");
    int _jspx_eval_aui_005finput_005f0 = _jspx_th_aui_005finput_005f0.doStartTag();
    if (_jspx_th_aui_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fhelpMessage_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
    return false;
  }

  private boolean _jspx_meth_aui_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005ffieldset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f1 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
    _jspx_th_aui_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_aui_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005ffieldset_005f0);
    // /html/subject-admin/view.jsp(25,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f1.setName("subjectName");
    int _jspx_eval_aui_005finput_005f1 = _jspx_th_aui_005finput_005f1.doStartTag();
    if (_jspx_th_aui_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005finput_0026_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
    return false;
  }

  private boolean _jspx_meth_aui_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005ffieldset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f2 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
    _jspx_th_aui_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_aui_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005ffieldset_005f0);
    // /html/subject-admin/view.jsp(26,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f2.setName("description");
    // /html/subject-admin/view.jsp(26,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005finput_005f2.setType("textarea");
    int _jspx_eval_aui_005finput_005f2 = _jspx_th_aui_005finput_005f2.doStartTag();
    if (_jspx_th_aui_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
    return false;
  }

  private boolean _jspx_meth_aui_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005ffieldset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_005fbutton_005f0 = (com.liferay.taglib.aui.ButtonTag) _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.get(com.liferay.taglib.aui.ButtonTag.class);
    _jspx_th_aui_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005ffieldset_005f0);
    // /html/subject-admin/view.jsp(27,3) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setType("submit");
    // /html/subject-admin/view.jsp(27,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setValue("save");
    int _jspx_eval_aui_005fbutton_005f0 = _jspx_th_aui_005fbutton_005f0.doStartTag();
    if (_jspx_th_aui_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
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
    // /html/subject-admin/view.jsp(50,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setName("index");
    // /html/subject-admin/view.jsp(50,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /html/subject-admin/view.jsp(54,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setName("subject-name");
    // /html/subject-admin/view.jsp(54,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setProperty("subjectName");
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
    // /html/subject-admin/view.jsp(58,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setName("description");
    // /html/subject-admin/view.jsp(58,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setProperty("description");
    int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doStartTag();
    if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
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
    // /html/subject-admin/view.jsp(62,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setPath("/html/subject-admin/subject_action.jsp");
    // /html/subject-admin/view.jsp(62,1) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
