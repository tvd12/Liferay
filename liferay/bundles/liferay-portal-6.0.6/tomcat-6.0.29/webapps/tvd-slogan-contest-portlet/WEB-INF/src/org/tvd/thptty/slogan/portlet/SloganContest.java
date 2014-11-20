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

package org.tvd.thptty.slogan.portlet;

import org.tvd.thptty.slogan.NoSuchSloganException;
import org.tvd.thptty.slogan.model.Slogan;
import org.tvd.thptty.slogan.model.impl.SloganImpl;
import org.tvd.thptty.slogan.service.SloganLocalServiceUtil;
import org.tvd.thptty.slogan.util.ActionUtil;
import org.tvd.thptty.slogan.util.SloganValidator;
import org.tvd.thptty.slogan.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.NullWrapper;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portlet.messageboards.model.MBMessage;
import com.liferay.portlet.messageboards.service.MBMessageServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class SloganContest
 */
public class SloganContest extends MVCPortlet {

    /**
     * Called when a user is either adding or updating a statement. If the
     * primary key is greater than 0, an update is performed, because there's an
     * existing key. Otherwise, an add is performed.
     *
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     */
    public void updateSlogan(
        ActionRequest request, ActionResponse response)
        throws PortalException, SystemException {

        Slogan slogan = ActionUtil.sloganFromRequest(request);

        ArrayList<String> errors = new ArrayList<String>();
        ServiceContext serviceContext =
            ServiceContextFactory.getInstance(
                Slogan.class.getName(), request);

        if (SloganValidator.validateSlogan(slogan, errors)) {
            if (slogan.getSloganId() > 0) {
                // Updating

                try {
                    Slogan fromDB =
                        SloganLocalServiceUtil.getSlogan(slogan.getSloganId());

                    if (fromDB != null &&
                        (slogan.getSloganId() == fromDB.getSloganId())) {

                        fromDB =
                            SloganLocalServiceUtil.updateSlogan(
                                slogan, false);

                        SessionMessages.add(request, "slogan-added");
                    }
                }
                catch (PortalException e) {
                    errors.add("failed-to-update");
                }
                catch (SystemException e) {
                    errors.add("failed-to-update");
                }
            }
            else {
                // Adding

                try {
                    SloganLocalServiceUtil.addSlogan(
                        slogan, slogan.getUserId(), serviceContext);

                }
                catch (SystemException e) {
                    errors.add("failed-to-add");
                }
                catch (PortalException e) {
                    errors.add("failed-to-add");
                }
            }

            // response.setRenderParameter("jspPage", "/html/view.jsp");
        }
        else {
            for (String error : errors) {
                SessionErrors.add(request, error);
            }

            request.setAttribute(WebKeys.SLOGAN_ENTRY, slogan);
            response.setRenderParameter(
                "jspPage", "/html/edit_slogan.jsp");
        }
    }

    /**
     * Deletes the slogan from the database.
     *
     * @param request
     * @param response
     */
    public void deleteSlogan(
            ActionRequest request, ActionResponse response)
        throws Exception {

        long sloganKey = ParamUtil.getLong(request, "resourcePrimKey");

        if (Validator.isNotNull(sloganKey)) {
            SloganLocalServiceUtil.deleteSlogan(sloganKey);
            SessionMessages.add(request, "slogan-deleted");
        }
        else {
            SessionErrors.add(request, "error-deleting");

        }
    }
    
 	@SuppressWarnings("deprecation")
	public void invokeTaglibDiscussion(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
    	
    	String cmd = ParamUtil.getString(actionRequest, "cmd");
    	
    	System.out.println("/n" + cmd + "/n");
    	
    	long messageId = ParamUtil.getLong(actionRequest, "messageId");
    	String className = Slogan.class.getName();
    	long classPk = ParamUtil.getLong(actionRequest, "classPK");
    	String body = ParamUtil.getString(actionRequest, "body");
    	Slogan slogan = SloganLocalServiceUtil.getSlogan(classPk);
    	String subject = slogan.getSloganText();
    	
        //ServiceContext serviceContext =
                //ServiceContextFactory.getInstance(
                    //Slogan.class.getName(), actionRequest);
    	
    	if(cmd.equals(WebKeys.CMD_EDIT)) {
    		
    		updateDiscussionMessage(messageId, subject, body,  className, classPk, WorkflowConstants.STATUS_APPROVED);
    	} else {
    		Object[] args = new Object[] {
    	         	new NullWrapper("org.apache.struts.action.ActionMapping"),
    	         	new NullWrapper("org.apache.struts.action.ActionForm"),
    	         	getPortletConfig(), actionRequest, actionResponse
    	         };
    	         	
    	         PortalClassInvoker.invoke(
    	         	"com.liferay.portlet.messageboards.action.EditDiscussionAction",
    	         	"processAction", args);
    	}
    	
    	/*MBMessageServiceUtil.updateDiscussionMessage(
    			Slogan.class.getName(), classPk, Slogan.class.getName(), 
    			classPk, messageId, subject, body, serviceContext);*/
    	
    	//
    	
    	/*Object[] args = new Object[] {
         	new NullWrapper("org.apache.struts.action.ActionMapping"),
         	new NullWrapper("org.apache.struts.action.ActionForm"),
         	getPortletConfig(), actionRequest, actionResponse
         };
         	
         PortalClassInvoker.invoke(
         	"com.liferay.portlet.messageboards.action.EditDiscussionAction",
         	"processAction", args);*/
         
     }
    
	public MBMessage updateDiscussionMessage(
			long messageId, String subject, String body,
		String className, long classPK, int workflowAction)
		throws PortalException, SystemException {
		
		if (Validator.isNull(subject)) {
			subject = body.substring(0, Math.min(body.length(), 50)) + "...";
		}
		
		List<ObjectValuePair<String, byte[]>> files =
				new ArrayList<ObjectValuePair<String, byte[]>>();
		List<String> existingFiles = new ArrayList<String>();
		double priority = 0.0;
		boolean allowPingbacks = false;
		
		ServiceContext serviceContext = new ServiceContext();
		
		serviceContext.setAttribute("className", className);
		serviceContext.setAttribute("classPK", String.valueOf(classPK));
		
		serviceContext.setWorkflowAction(workflowAction);
		
		return MBMessageServiceUtil.updateMessage(messageId, subject, body, 
				files, existingFiles, priority, allowPingbacks, serviceContext);
		
		//return updateMessage(
				//userId, messageId, subject, body, files, existingFiles, priority,
					//allowPingbacks, serviceContext);
	}

    public void render(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException, IOException {
        try {
            Slogan slogan = null;

            long resourcePrimKey =
                ParamUtil.getLong(renderRequest, "resourcePrimKey");

            if (resourcePrimKey > 0) {
                slogan =
                    SloganLocalServiceUtil.getSlogan(resourcePrimKey);
            }
            else {
                slogan = new SloganImpl();
            }

            renderRequest.setAttribute(WebKeys.SLOGAN_ENTRY, slogan);
        }
        catch (Exception e) {
            if (e instanceof NoSuchSloganException) {
                SessionErrors.add(renderRequest, e.getClass().getName());
            }
            else {
                throw new PortletException(e);
            }
        }

        super.render(renderRequest, renderResponse);
    }
    
}
