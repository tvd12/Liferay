package com.ms.internet.message.action.portlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ms.internet.message.model.MSMReceiver;
import com.ms.internet.message.model.MSMSender;
import com.ms.internet.message.model.MSMessage;
import com.ms.internet.message.model.impl.MSMReceiverImpl;
import com.ms.internet.message.model.impl.MSMSenderImpl;
import com.ms.internet.message.service.MSMReceiverLocalServiceUtil;
import com.ms.internet.message.service.MSMSenderLocalServiceUtil;
import com.ms.internet.message.service.MSMessageLocalServiceUtil;

public class MessageAdminPortlet extends MVCPortlet {
		
	public void addMessage(ActionRequest request, ActionResponse response) 
			throws SystemException {
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		User userSended = themeDisplay.getUser();
		long userIdSended= userSended.getUserId();
		
		long userIdReceive = Long.parseLong(
				ParamUtil.getString(request, "userIdRecieve"));
		MSMessage message = ActionUtil.messageFromRequest(request);
		message = MSMessageLocalServiceUtil.addNewMessage(message);
		
		MSMSender sender = new MSMSenderImpl();
		sender.setUserId(userIdSended);
		sender.setMessageId(message.getMessageId());
		sender.setDateSend(new Date());
		MSMSenderLocalServiceUtil.addMSMSender(sender);
		
		MSMReceiver receiver = new MSMReceiverImpl();
		receiver.setUserId(userIdReceive);
		receiver.setMessageId(message.getMessageId());
		MSMReceiverLocalServiceUtil.addMSMReceiver(receiver);
	}
	
	public void viewMessages(ActionRequest request, ActionResponse response) {
		SessionMessages.add(request, "");
		response.setRenderParameter("jspPage", viewMessages);
	}
	
	protected String viewMessages = "/html/view_messages.jsp";
}
