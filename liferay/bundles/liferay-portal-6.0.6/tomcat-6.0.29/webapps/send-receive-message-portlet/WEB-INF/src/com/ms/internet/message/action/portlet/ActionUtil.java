package com.ms.internet.message.action.portlet;

import java.util.List;


import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.ms.internet.message.NoSuchMSenderException;
import com.ms.internet.message.model.MSMSender;
import com.ms.internet.message.model.MSMessage;
import com.ms.internet.message.model.impl.MSMessageImpl;
import com.ms.internet.message.service.MSMReceiverLocalServiceUtil;
import com.ms.internet.message.service.MSMSenderLocalServiceUtil;

public class ActionUtil {
	
	public static List<User> getAllUser(RenderRequest request) {
		List<User> users = null;
		try {
			users = 
					UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	public static MSMessage messageFromRequest(ActionRequest request) {
		
		String messageString = ParamUtil.getString(request, "message");
		MSMessage message = new MSMessageImpl();
		message.setMessage(messageString);
		return message;
		
	}
	
	public static List<MSMessage> getMsgSendToUser(RenderRequest request) {
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		
		List<MSMessage> messages = null;
		
		try {
			messages = MSMReceiverLocalServiceUtil.getAllMessagesByUser(userId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		if(messages == null)
			System.out.println("fdsfsfsdfds");
		return messages;
	}
	
	public static User getSenderMS(long messageId) {
		MSMSender sender = null;
		User userSended = null;
		try {
			sender = MSMSenderLocalServiceUtil.getSenderByMsgId(messageId);
			userSended = UserLocalServiceUtil.getUser(sender.getUserId());
		} catch (NoSuchMSenderException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
		return userSended;
	}
}
