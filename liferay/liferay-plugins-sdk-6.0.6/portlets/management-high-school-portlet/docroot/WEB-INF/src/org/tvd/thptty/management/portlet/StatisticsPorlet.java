package org.tvd.thptty.management.portlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.tvd.thptty.management.temporary.WebKeys;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class StatisticsPorlet extends MVCPortlet {
	
	public void render(RenderRequest request, RenderResponse response) 
			throws PortletException, IOException {
		int semester = ParamUtil.getInteger(request, "semester");
		
		request.setAttribute(WebKeys.TY_SEMESTER, semester);
		super.render(request, response);
	}
}
