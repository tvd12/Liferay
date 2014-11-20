package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchEntry;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.service.permission.PortalPermissionUtil;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.util.PortalUtil;
import org.tvd.thptty.slogan.model.Slogan;
import org.tvd.thptty.slogan.util.ActionUtil;
import org.tvd.thptty.slogan.util.WebKeys;
import org.tvd.thptty.slogan.service.SloganLocalServiceUtil;
import javax.portlet.PortletURL;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(9);
    _jspx_dependants.add("/html/init.jsp");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet.tld");
    _jspx_dependants.add("/WEB-INF/tld/c-rt.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-aui.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet-ext.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-security.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-theme.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-ui.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-util.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dtheme_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl.release();
    _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dresults.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.release();
    _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_0026_005fpath_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002diterator_005fnobody.release();
    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody.release();
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


/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/

      out.write('\n');
      out.write('\n');

/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write('\n');
      out.write('\n');
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
      out.write('\n');
      out.write('\n');

String currentURL = PortalUtil.getCurrentURL(request);

      out.write('\n');
      out.write('\n');
      //  portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f0 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
      _jspx_th_portlet_005frenderURL_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005frenderURL_005f0.setParent(null);
      // /html/view.jsp(19,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_portlet_005frenderURL_005f0.setVar("addSloganURL");
      int _jspx_eval_portlet_005frenderURL_005f0 = _jspx_th_portlet_005frenderURL_005f0.doStartTag();
      if (_jspx_eval_portlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_portlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_portlet_005frenderURL_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_portlet_005frenderURL_005f0.doInitBody();
        }
        do {
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_portlet_005fparam_005f0(_jspx_th_portlet_005frenderURL_005f0, _jspx_page_context))
            return;
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
      java.lang.String addSloganURL = null;
      addSloganURL = (java.lang.String) _jspx_page_context.findAttribute("addSloganURL");
      out.write('\n');
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /html/view.jsp(23,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest( PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), "ADD_SLOGAN") );
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("  <input type=\"button\" value=\"");
          if (_jspx_meth_liferay_002dui_005fmessage_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return;
          out.write("\" onClick=\"location.href = '");
          out.print( addSloganURL.toString() );
          out.write("';\" />\n");
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
      out.write('\n');
      out.write('\n');

String tabs1 = ParamUtil.getString(request, "tabs1", "by-rating");

String tabs1Values = "by-rating,by-date";

PortletURL tabsURL = renderResponse.createRenderURL();
tabsURL.setParameter("jspPage", "/html/view.jsp");
tabsURL.setParameter("tabs1", tabs1);

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("tabs1", tabs1);


      out.write('\n');
      out.write('\n');
      //  liferay-portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay_002dportlet_005frenderURL_005f0 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl.get(com.liferay.taglib.portlet.RenderURLTag.class);
      _jspx_th_liferay_002dportlet_005frenderURL_005f0.setPageContext(_jspx_page_context);
      _jspx_th_liferay_002dportlet_005frenderURL_005f0.setParent(null);
      // /html/view.jsp(41,0) name = varImpl type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_liferay_002dportlet_005frenderURL_005f0.setVarImpl("searchURL");
      int _jspx_eval_liferay_002dportlet_005frenderURL_005f0 = _jspx_th_liferay_002dportlet_005frenderURL_005f0.doStartTag();
      if (_jspx_eval_liferay_002dportlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay_002dportlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay_002dportlet_005frenderURL_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay_002dportlet_005frenderURL_005f0.doInitBody();
        }
        do {
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_portlet_005fparam_005f1(_jspx_th_liferay_002dportlet_005frenderURL_005f0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay_002dportlet_005frenderURL_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay_002dportlet_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_liferay_002dportlet_005frenderURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl.reuse(_jspx_th_liferay_002dportlet_005frenderURL_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURL_0026_005fvarImpl.reuse(_jspx_th_liferay_002dportlet_005frenderURL_005f0);
      javax.portlet.PortletURL searchURL = null;
      searchURL = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("searchURL");
      out.write('\n');
      out.write('\n');
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_005fform_005f0 = (com.liferay.taglib.aui.FormTag) _005fjspx_005ftagPool_005faui_005fform_0026_005fname_005fmethod_005faction.get(com.liferay.taglib.aui.FormTag.class);
      _jspx_th_aui_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_aui_005fform_005f0.setParent(null);
      // /html/view.jsp(45,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_aui_005fform_005f0.setAction( searchURL );
      // /html/view.jsp(45,0) null
      _jspx_th_aui_005fform_005f0.setDynamicAttribute(null, "method", new String("get"));
      // /html/view.jsp(45,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_aui_005fform_005f0.setName("fm0");
      int _jspx_eval_aui_005fform_005f0 = _jspx_th_aui_005fform_005f0.doStartTag();
      if (_jspx_eval_aui_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_005fform_005f0.doInitBody();
        }
        do {
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_liferay_002dportlet_005frenderURLParams_005f0(_jspx_th_aui_005fform_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write(' ');
          out.write(' ');
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f0 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
          _jspx_th_aui_005finput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_aui_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
          // /html/view.jsp(47,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f0.setName("redirect");
          // /html/view.jsp(47,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f0.setType("hidden");
          // /html/view.jsp(47,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f0.setValue( currentURL );
          int _jspx_eval_aui_005finput_005f0 = _jspx_th_aui_005finput_005f0.doStartTag();
          if (_jspx_th_aui_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
            return;
          }
          _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f0);
          out.write('\n');
          out.write(' ');
          out.write(' ');
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f1 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
          _jspx_th_aui_005finput_005f1.setPageContext(_jspx_page_context);
          _jspx_th_aui_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
          // /html/view.jsp(48,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f1.setName("groupId");
          // /html/view.jsp(48,2) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f1.setType("hidden");
          // /html/view.jsp(48,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f1.setValue( String.valueOf(scopeGroupId) );
          int _jspx_eval_aui_005finput_005f1 = _jspx_th_aui_005finput_005f1.doStartTag();
          if (_jspx_th_aui_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
            return;
          }
          _005fjspx_005ftagPool_005faui_005finput_0026_005fvalue_005ftype_005fname_005fnobody.reuse(_jspx_th_aui_005finput_005f1);
          out.write("\n");
          out.write("\n");
          out.write("  <div class=\"portlet-toolbar search-form\">\n");
          out.write("    <span class=\"aui-search-bar\">\n");
          out.write("       ");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_005finput_005f2 = (com.liferay.taglib.aui.InputTag) _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody.get(com.liferay.taglib.aui.InputTag.class);
          _jspx_th_aui_005finput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_aui_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
          // /html/view.jsp(52,7) name = inlineField type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f2.setInlineField( true );
          // /html/view.jsp(52,7) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f2.setLabel("");
          // /html/view.jsp(52,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f2.setName("keywords");
          // /html/view.jsp(52,7) null
          _jspx_th_aui_005finput_005f2.setDynamicAttribute(null, "size", new String("30"));
          // /html/view.jsp(52,7) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f2.setTitle("search-entries");
          // /html/view.jsp(52,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_aui_005finput_005f2.setType("text");
          int _jspx_eval_aui_005finput_005f2 = _jspx_th_aui_005finput_005f2.doStartTag();
          if (_jspx_th_aui_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005faui_005finput_0026_005ftype_005ftitle_005fsize_005fname_005flabel_005finlineField_005fnobody.reuse(_jspx_th_aui_005finput_005f2);
          out.write("\n");
          out.write("\n");
          out.write("       ");
          if (_jspx_meth_aui_005fbutton_005f0(_jspx_th_aui_005fform_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </span>\n");
          out.write("  </div>\n");
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
      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_005fform_005f1 = (com.liferay.taglib.aui.FormTag) _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction.get(com.liferay.taglib.aui.FormTag.class);
      _jspx_th_aui_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_aui_005fform_005f1.setParent(null);
      // /html/view.jsp(60,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_aui_005fform_005f1.setAction( tabsURL );
      // /html/view.jsp(60,0) null
      _jspx_th_aui_005fform_005f1.setDynamicAttribute(null, "method", new String("get"));
      // /html/view.jsp(60,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_aui_005fform_005f1.setName("fm1");
      // /html/view.jsp(60,0) name = onSubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_aui_005fform_005f1.setOnSubmit("submitForm(this); return false;");
      int _jspx_eval_aui_005fform_005f1 = _jspx_th_aui_005fform_005f1.doStartTag();
      if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_005fform_005f1.doInitBody();
        }
        do {
          out.write('\n');
          if (_jspx_meth_liferay_002dportlet_005frenderURLParams_005f1(_jspx_th_aui_005fform_005f1, _jspx_page_context))
            return;
          out.write('\n');
          out.write('\n');
          //  liferay-ui:tabs
          com.liferay.taglib.ui.TabsTag _jspx_th_liferay_002dui_005ftabs_005f0 = (com.liferay.taglib.ui.TabsTag) _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody.get(com.liferay.taglib.ui.TabsTag.class);
          _jspx_th_liferay_002dui_005ftabs_005f0.setPageContext(_jspx_page_context);
          _jspx_th_liferay_002dui_005ftabs_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
          // /html/view.jsp(63,0) name = names type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ftabs_005f0.setNames( tabs1Values );
          // /html/view.jsp(63,0) name = tabsValues type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ftabs_005f0.setTabsValues( tabs1Values );
          // /html/view.jsp(63,0) name = portletURL type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_liferay_002dui_005ftabs_005f0.setPortletURL( tabsURL );
          int _jspx_eval_liferay_002dui_005ftabs_005f0 = _jspx_th_liferay_002dui_005ftabs_005f0.doStartTag();
          if (_jspx_th_liferay_002dui_005ftabs_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody.reuse(_jspx_th_liferay_002dui_005ftabs_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fliferay_002dui_005ftabs_0026_005ftabsValues_005fportletURL_005fnames_005fnobody.reuse(_jspx_th_liferay_002dui_005ftabs_005f0);
          out.write('\n');
          out.write('\n');
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
          int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
          if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              out.write(' ');
              out.write(' ');
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /html/view.jsp(70,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fwhen_005f0.setTest( tabs1.equals("by-rating") );
              int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
              if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("    ");
                  //  liferay-ui:search-container
                  com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                  // /html/view.jsp(71,4) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setEmptyResultsMessage("there-are-no-slogans");
                  // /html/view.jsp(71,4) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setDelta(20);
                  // /html/view.jsp(71,4) name = iteratorURL type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0.setIteratorURL( iteratorURL );
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
                      out.write("\n");
                      out.write("      ");
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
                          out.write("\n");
                          out.write("      ");

      results = ActionUtil.getSlogans(renderRequest, searchContainer.getStart(), searchContainer.getEnd());
      total = ActionUtil.getSlogansCount(renderRequest);
    
      pageContext.setAttribute("results", results);
      pageContext.setAttribute("total", total);
      
                          out.write("\n");
                          out.write("      ");
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
                      out.write("\n");
                      out.write("\n");
                      out.write("      ");
                      //  liferay-ui:search-container-row
                      com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = (com.liferay.taglib.ui.SearchContainerRowTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.get(com.liferay.taglib.ui.SearchContainerRowTag.class);
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
                      // /html/view.jsp(82,6) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setClassName("org.tvd.thptty.slogan.model.Slogan");
                      // /html/view.jsp(82,6) name = keyProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setKeyProperty("sloganId");
                      // /html/view.jsp(82,6) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setModelVar("slogan");
                      int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doStartTag();
                      if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        java.lang.Integer index = null;
                        org.tvd.thptty.slogan.model.Slogan slogan = null;
                        com.liferay.portal.kernel.dao.search.ResultRow row = null;
                        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doInitBody();
                        }
                        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
                        slogan = (org.tvd.thptty.slogan.model.Slogan) _jspx_page_context.findAttribute("slogan");
                        row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
                        do {
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          //  portlet:renderURL
                          com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f1 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
                          _jspx_th_portlet_005frenderURL_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_portlet_005frenderURL_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
                          // /html/view.jsp(87,8) name = windowState type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_portlet_005frenderURL_005f1.setWindowState("maximized");
                          // /html/view.jsp(87,8) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_portlet_005frenderURL_005f1.setVar("rowURL");
                          int _jspx_eval_portlet_005frenderURL_005f1 = _jspx_th_portlet_005frenderURL_005f1.doStartTag();
                          if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_portlet_005frenderURL_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_portlet_005frenderURL_005f1.doInitBody();
                            }
                            do {
                              out.write("\n");
                              out.write("          ");
                              if (_jspx_meth_portlet_005fparam_005f2(_jspx_th_portlet_005frenderURL_005f1, _jspx_page_context))
                              return;
                              out.write("\n");
                              out.write("          ");
                              //  portlet:param
                              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f3 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                              _jspx_th_portlet_005fparam_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_portlet_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f1);
                              // /html/view.jsp(89,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f3.setName("resourcePrimKey");
                              // /html/view.jsp(89,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f3.setValue( String.valueOf(slogan.getSloganId()) );
                              int _jspx_eval_portlet_005fparam_005f3 = _jspx_th_portlet_005fparam_005f3.doStartTag();
                              if (_jspx_th_portlet_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
                              out.write("\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_portlet_005frenderURL_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_portlet_005frenderURL_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_portlet_005frenderURL_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f1);
                          java.lang.String rowURL = null;
                          rowURL = (java.lang.String) _jspx_page_context.findAttribute("rowURL");
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          //  liferay-ui:search-container-column-text
                          com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
                          // /html/view.jsp(92,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setName("rating");
                          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doStartTag();
                          if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doInitBody();
                            }
                            do {
                              out.write("\n");
                              out.write("          ");
                              //  liferay-ui:ratings-score
                              com.liferay.taglib.ui.RatingsScoreTag _jspx_th_liferay_002dui_005fratings_002dscore_005f0 = (com.liferay.taglib.ui.RatingsScoreTag) _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody.get(com.liferay.taglib.ui.RatingsScoreTag.class);
                              _jspx_th_liferay_002dui_005fratings_002dscore_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_liferay_002dui_005fratings_002dscore_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0);
                              // /html/view.jsp(93,10) name = score type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_liferay_002dui_005fratings_002dscore_005f0.setScore( slogan.getAverageScore() );
                              int _jspx_eval_liferay_002dui_005fratings_002dscore_005f0 = _jspx_th_liferay_002dui_005fratings_002dscore_005f0.doStartTag();
                              if (_jspx_th_liferay_002dui_005fratings_002dscore_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody.reuse(_jspx_th_liferay_002dui_005fratings_002dscore_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fliferay_002dui_005fratings_002dscore_0026_005fscore_005fnobody.reuse(_jspx_th_liferay_002dui_005fratings_002dscore_005f0);
                              out.write("\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fname.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f0);
                          out.write("\n");
                          out.write("        ");
                          //  liferay-ui:search-container-column-text
                          com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0);
                          // /html/view.jsp(96,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setHref( rowURL );
                          // /html/view.jsp(96,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setName("slogan-text");
                          // /html/view.jsp(96,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setProperty("sloganText");
                          // /html/view.jsp(96,8) name = orderable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.setOrderable( true );
                          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.doStartTag();
                          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f1);
                          out.write("\n");
                          out.write("        ");
                          if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\n");
                          out.write("      ");
                          int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f0.doAfterBody();
                          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
                          slogan = (org.tvd.thptty.slogan.model.Slogan) _jspx_page_context.findAttribute("slogan");
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
                      out.write("\n");
                      out.write("\n");
                      out.write("      ");
                      if (_jspx_meth_liferay_002dui_005fsearch_002diterator_005f0(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0, _jspx_page_context))
                        return;
                      out.write("\n");
                      out.write("\n");
                      out.write("    ");
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
                    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f0);
                  out.write('\n');
                  out.write(' ');
                  out.write(' ');
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
              out.write("\n");
              out.write("\n");
              out.write("  ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /html/view.jsp(114,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fwhen_005f1.setTest( tabs1.equals("by-date") );
              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("    ");
                  //  liferay-ui:search-container
                  com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1 = (com.liferay.taglib.ui.SearchContainerTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.get(com.liferay.taglib.ui.SearchContainerTag.class);
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                  // /html/view.jsp(115,4) name = emptyResultsMessage type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setEmptyResultsMessage("there-are-no-slogans");
                  // /html/view.jsp(115,4) name = delta type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setDelta(20);
                  // /html/view.jsp(115,4) name = iteratorURL type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1.setIteratorURL( iteratorURL );
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
                      out.write("\n");
                      out.write("      ");
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
                          out.write("\n");
                          out.write("      ");

      //List<Slogan> tempResults = ActionUtil.getSlogans(renderRequest);

      results = ActionUtil.getSlogans(renderRequest, searchContainer.getStart(), 
      		searchContainer.getEnd(), searchContainer.getOrderByComparator());
      total = ActionUtil.getSlogansCount(renderRequest);

      pageContext.setAttribute("results", results);
      pageContext.setAttribute("total", total);
      
                          out.write("\n");
                          out.write("      ");
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
                      out.write("\n");
                      out.write("\n");
                      out.write("      ");
                      //  liferay-ui:search-container-row
                      com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 = (com.liferay.taglib.ui.SearchContainerRowTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.get(com.liferay.taglib.ui.SearchContainerRowTag.class);
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
                      // /html/view.jsp(129,6) name = className type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setClassName("org.tvd.thptty.slogan.model.Slogan");
                      // /html/view.jsp(129,6) name = keyProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setKeyProperty("sloganId");
                      // /html/view.jsp(129,6) name = modelVar type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setModelVar("slogan");
                      int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doStartTag();
                      if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        java.lang.Integer index = null;
                        org.tvd.thptty.slogan.model.Slogan slogan = null;
                        com.liferay.portal.kernel.dao.search.ResultRow row = null;
                        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doInitBody();
                        }
                        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
                        slogan = (org.tvd.thptty.slogan.model.Slogan) _jspx_page_context.findAttribute("slogan");
                        row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
                        do {
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          //  portlet:renderURL
                          com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_005frenderURL_005f2 = (com.liferay.taglib.portlet.RenderURLTag) _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.get(com.liferay.taglib.portlet.RenderURLTag.class);
                          _jspx_th_portlet_005frenderURL_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_portlet_005frenderURL_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
                          // /html/view.jsp(134,8) name = windowState type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_portlet_005frenderURL_005f2.setWindowState("maximized");
                          // /html/view.jsp(134,8) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_portlet_005frenderURL_005f2.setVar("rowURL");
                          int _jspx_eval_portlet_005frenderURL_005f2 = _jspx_th_portlet_005frenderURL_005f2.doStartTag();
                          if (_jspx_eval_portlet_005frenderURL_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_portlet_005frenderURL_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_portlet_005frenderURL_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_portlet_005frenderURL_005f2.doInitBody();
                            }
                            do {
                              out.write("\n");
                              out.write("          ");
                              if (_jspx_meth_portlet_005fparam_005f4(_jspx_th_portlet_005frenderURL_005f2, _jspx_page_context))
                              return;
                              out.write("\n");
                              out.write("          ");
                              //  portlet:param
                              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f5 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                              _jspx_th_portlet_005fparam_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_portlet_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f2);
                              // /html/view.jsp(136,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f5.setName("resourcePrimKey");
                              // /html/view.jsp(136,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f5.setValue( String.valueOf(slogan.getSloganId()) );
                              int _jspx_eval_portlet_005fparam_005f5 = _jspx_th_portlet_005fparam_005f5.doStartTag();
                              if (_jspx_th_portlet_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
                              out.write("\n");
                              out.write("          ");
                              //  portlet:param
                              com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f6 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
                              _jspx_th_portlet_005fparam_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_portlet_005fparam_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f2);
                              // /html/view.jsp(137,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f6.setName("redirect");
                              // /html/view.jsp(137,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_portlet_005fparam_005f6.setValue( currentURL );
                              int _jspx_eval_portlet_005fparam_005f6 = _jspx_th_portlet_005fparam_005f6.doStartTag();
                              if (_jspx_th_portlet_005fparam_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f6);
                              out.write("\n");
                              out.write("        ");
                              int evalDoAfterBody = _jspx_th_portlet_005frenderURL_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_portlet_005frenderURL_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_portlet_005frenderURL_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fportlet_005frenderURL_0026_005fwindowState_005fvar.reuse(_jspx_th_portlet_005frenderURL_005f2);
                          java.lang.String rowURL = null;
                          rowURL = (java.lang.String) _jspx_page_context.findAttribute("rowURL");
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          //  liferay-ui:search-container-column-text
                          com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
                          // /html/view.jsp(140,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setName("slogan-date");
                          // /html/view.jsp(140,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setProperty("sloganDate");
                          // /html/view.jsp(140,8) name = orderable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.setOrderable( true );
                          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doStartTag();
                          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f2);
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          //  liferay-ui:search-container-column-text
                          com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3 = (com.liferay.taglib.ui.SearchContainerColumnTextTag) _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.get(com.liferay.taglib.ui.SearchContainerColumnTextTag.class);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
                          // /html/view.jsp(145,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setHref( rowURL );
                          // /html/view.jsp(145,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setName("slogan-text");
                          // /html/view.jsp(145,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setProperty("sloganText");
                          // /html/view.jsp(145,8) name = orderable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.setOrderable( true );
                          int _jspx_eval_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3 = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.doStartTag();
                          if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_0026_005fproperty_005forderable_005fname_005fhref_005fnobody.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002dtext_005f3);
                          out.write("\n");
                          out.write("\n");
                          out.write("        ");
                          if (_jspx_meth_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1, _jspx_page_context))
                            return;
                          out.write("\n");
                          out.write("\n");
                          out.write("      ");
                          int evalDoAfterBody = _jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doAfterBody();
                          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
                          slogan = (org.tvd.thptty.slogan.model.Slogan) _jspx_page_context.findAttribute("slogan");
                          row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_liferay_002dui_005fsearch_002dcontainer_002drow_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_002drow_0026_005fmodelVar_005fkeyProperty_005fclassName.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_002drow_005f1);
                      out.write("\n");
                      out.write("\n");
                      out.write("      ");
                      if (_jspx_meth_liferay_002dui_005fsearch_002diterator_005f1(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1, _jspx_page_context))
                        return;
                      out.write("\n");
                      out.write("\n");
                      out.write("    ");
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
                    _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fliferay_002dui_005fsearch_002dcontainer_0026_005fiteratorURL_005femptyResultsMessage_005fdelta.reuse(_jspx_th_liferay_002dui_005fsearch_002dcontainer_005f1);
                  out.write("\n");
                  out.write("\n");
                  out.write("  ");
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_aui_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_aui_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f1);
        return;
      }
      _005fjspx_005ftagPool_005faui_005fform_0026_005fonSubmit_005fname_005fmethod_005faction.reuse(_jspx_th_aui_005fform_005f1);
      out.write('\n');
      out.write('\n');
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

  private boolean _jspx_meth_portlet_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f0 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f0);
    // /html/view.jsp(20,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("jspPage");
    // /html/view.jsp(20,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("/html/edit_slogan.jsp");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dui_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay_002dui_005fmessage_005f0 = (com.liferay.taglib.ui.MessageTag) _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay_002dui_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dui_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /html/view.jsp(24,30) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fmessage_005f0.setKey("add-slogan");
    int _jspx_eval_liferay_002dui_005fmessage_005f0 = _jspx_th_liferay_002dui_005fmessage_005f0.doStartTag();
    if (_jspx_th_liferay_002dui_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dui_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_liferay_002dui_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay_002dportlet_005frenderURL_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f1 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay_002dportlet_005frenderURL_005f0);
    // /html/view.jsp(42,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f1.setName("jspPage");
    // /html/view.jsp(42,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f1.setValue("/html/search.jsp");
    int _jspx_eval_portlet_005fparam_005f1 = _jspx_th_portlet_005fparam_005f1.doStartTag();
    if (_jspx_th_portlet_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_liferay_002dportlet_005frenderURLParams_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-portlet:renderURLParams
    com.liferay.taglib.portlet.RenderURLParamsTag _jspx_th_liferay_002dportlet_005frenderURLParams_005f0 = (com.liferay.taglib.portlet.RenderURLParamsTag) _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.get(com.liferay.taglib.portlet.RenderURLParamsTag.class);
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f0.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
    // /html/view.jsp(46,2) name = varImpl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f0.setVarImpl("searchURL");
    int _jspx_eval_liferay_002dportlet_005frenderURLParams_005f0 = _jspx_th_liferay_002dportlet_005frenderURLParams_005f0.doStartTag();
    if (_jspx_th_liferay_002dportlet_005frenderURLParams_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.reuse(_jspx_th_liferay_002dportlet_005frenderURLParams_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.reuse(_jspx_th_liferay_002dportlet_005frenderURLParams_005f0);
    return false;
  }

  private boolean _jspx_meth_aui_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_005fbutton_005f0 = (com.liferay.taglib.aui.ButtonTag) _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.get(com.liferay.taglib.aui.ButtonTag.class);
    _jspx_th_aui_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_aui_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f0);
    // /html/view.jsp(54,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setType("submit");
    // /html/view.jsp(54,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_aui_005fbutton_005f0.setValue("search");
    int _jspx_eval_aui_005fbutton_005f0 = _jspx_th_aui_005fbutton_005f0.doStartTag();
    if (_jspx_th_aui_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005faui_005fbutton_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_aui_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_liferay_002dportlet_005frenderURLParams_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-portlet:renderURLParams
    com.liferay.taglib.portlet.RenderURLParamsTag _jspx_th_liferay_002dportlet_005frenderURLParams_005f1 = (com.liferay.taglib.portlet.RenderURLParamsTag) _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.get(com.liferay.taglib.portlet.RenderURLParamsTag.class);
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f1.setPageContext(_jspx_page_context);
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_005fform_005f1);
    // /html/view.jsp(61,0) name = varImpl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dportlet_005frenderURLParams_005f1.setVarImpl("tabsURL");
    int _jspx_eval_liferay_002dportlet_005frenderURLParams_005f1 = _jspx_th_liferay_002dportlet_005frenderURLParams_005f1.doStartTag();
    if (_jspx_th_liferay_002dportlet_005frenderURLParams_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.reuse(_jspx_th_liferay_002dportlet_005frenderURLParams_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fliferay_002dportlet_005frenderURLParams_0026_005fvarImpl_005fnobody.reuse(_jspx_th_liferay_002dportlet_005frenderURLParams_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f2 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f1);
    // /html/view.jsp(88,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setName("jspPage");
    // /html/view.jsp(88,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setValue("/html/view_slogan.jsp");
    int _jspx_eval_portlet_005fparam_005f2 = _jspx_th_portlet_005fparam_005f2.doStartTag();
    if (_jspx_th_portlet_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
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
    // /html/view.jsp(102,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f0.setPath("/html/slogan_actions.jsp");
    // /html/view.jsp(102,8) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_portlet_005fparam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005frenderURL_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_005fparam_005f4 = (com.liferay.taglib.util.ParamTag) _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.get(com.liferay.taglib.util.ParamTag.class);
    _jspx_th_portlet_005fparam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005frenderURL_005f2);
    // /html/view.jsp(135,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f4.setName("jspPage");
    // /html/view.jsp(135,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f4.setValue("/html/view_slogan.jsp");
    int _jspx_eval_portlet_005fparam_005f4 = _jspx_th_portlet_005fparam_005f4.doStartTag();
    if (_jspx_th_portlet_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
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
    // /html/view.jsp(151,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_liferay_002dui_005fsearch_002dcontainer_002dcolumn_002djsp_005f1.setPath("/html/slogan_actions.jsp");
    // /html/view.jsp(151,8) name = align type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
