package org.apache.jsp.summary.css;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Theme;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/css_init.jsp");
    _jspx_dependants.add("/WEB-INF/tld/liferay-util.tld");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

      out.write("\r\n");
      out.write("\r\n");

/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

long companyId = PortalUtil.getCompanyId(request);

String themeId = ParamUtil.getString(request, "themeId");

Theme theme = ThemeLocalServiceUtil.getTheme(companyId, themeId, false);

String themeContextPath = PortalUtil.getPathContext();

if (theme.isWARFile()) {
	themeContextPath = theme.getContextPath();
}

String cdnHost = PortalUtil.getCDNHost(request.isSecure());

String themeImagesPath = cdnHost + themeContextPath + theme.getImagesPath();

response.addHeader(HttpHeaders.CONTENT_TYPE, ContentTypes.TEXT_CSS);

      out.write("\r\n");
      out.write("\r\n");
      out.write(".ie .social-networking-portlet-summary .summary-container {\r\n");
      out.write("\theight: 1%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container:after {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tcontent: \".\";\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\theight: 0;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container h2 {\r\n");
      out.write("\tcolor: #3D536C;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tmargin-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container img {\r\n");
      out.write("\tmargin: 5px 0;\r\n");
      out.write("\tmax-width: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ie6 .social-networking-portlet-summary .summary-container img {\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container p {\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container span {\r\n");
      out.write("\tcolor: #3D536C;\r\n");
      out.write("\tfont-size: 10px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .user-profile-image {\r\n");
      out.write("\tmax-width: 180px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ie6 .social-networking-portlet-summary .summary-container .user-profile-image {\r\n");
      out.write("\twidth: expression(this.width > 180 : '180px' : 'auto');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .user-twitter-link {\r\n");
      out.write("\tbackground: url(../images/twitter.png) no-repeat 0 50%;\r\n");
      out.write("\tpadding-left: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .add-as-friend {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .add-as-friend.pending {\r\n");
      out.write("\tbackground-image: url(");
      out.print( themeImagesPath );
      out.write("/common/time.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .join-community {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .join-community.pending {\r\n");
      out.write("\tbackground-image: url(");
      out.print( themeImagesPath );
      out.write("/common/time.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .join-organization {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .join-organization.pending {\r\n");
      out.write("\tbackground-image: url(");
      out.print( themeImagesPath );
      out.write("/common/time.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .remove-community {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .remove-organization {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-networking-portlet-summary .summary-container .remove-friend {\r\n");
      out.write("\tmargin: 0.7em auto 1em;\r\n");
      out.write("}");
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
