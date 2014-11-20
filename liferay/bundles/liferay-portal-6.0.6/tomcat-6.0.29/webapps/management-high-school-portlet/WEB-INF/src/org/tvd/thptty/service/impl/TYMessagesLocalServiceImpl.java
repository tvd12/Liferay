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

package org.tvd.thptty.service.impl;

import java.util.List;

import org.tvd.thptty.model.TYMessages;
import org.tvd.thptty.service.base.TYMessagesLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y messages local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYMessagesLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYMessagesLocalServiceUtil} to access the t y messages local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYMessagesLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYMessagesLocalServiceUtil
 */
public class TYMessagesLocalServiceImpl extends TYMessagesLocalServiceBaseImpl {
	
	public TYMessages addMessage(TYMessages newMessage) 
			throws SystemException, PortalException {
		TYMessages message = tyMessagesPersistence.create(
				counterLocalService.increment(TYMessages.class.getName()));
		
		message.setCompanyId(newMessage.getCompanyId());
		message.setGroupId(newMessage.getGroupId());
		message.setActionId(newMessage.getActionId());
		message.setUserId(newMessage.getUserId());
		message.setClassId(newMessage.getClassId());
		message.setSubjectId(newMessage.getSubjectId());
		message.setHappenDate(newMessage.getHappenDate());
		
		resourceLocalService.addResources(newMessage.getCompanyId(),
				newMessage.getGroupId(), TYMessages.class.getName(), false);
		
		return tyMessagesPersistence.update(message, false);
	}
	
	public List<TYMessages> getMessagesByC_G(long companyId, long groupId) 
			throws SystemException {
		return tyMessagesPersistence.findByC_G(companyId, groupId);
	}
}