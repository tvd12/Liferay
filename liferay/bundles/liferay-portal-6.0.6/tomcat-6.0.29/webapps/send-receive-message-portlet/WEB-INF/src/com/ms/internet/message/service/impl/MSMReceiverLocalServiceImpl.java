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

package com.ms.internet.message.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.ms.internet.message.model.MSMReceiver;
import com.ms.internet.message.model.MSMessage;
import com.ms.internet.message.service.MSMessageLocalServiceUtil;
import com.ms.internet.message.service.base.MSMReceiverLocalServiceBaseImpl;

/**
 * The implementation of the m s m receiver local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ms.internet.message.service.MSMReceiverLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.ms.internet.message.service.MSMReceiverLocalServiceUtil} to access the m s m receiver local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author I Am Dung
 * @see com.ms.internet.message.service.base.MSMReceiverLocalServiceBaseImpl
 * @see com.ms.internet.message.service.MSMReceiverLocalServiceUtil
 */
public class MSMReceiverLocalServiceImpl extends MSMReceiverLocalServiceBaseImpl {
	
	public MSMReceiver addMSMReceiver(MSMReceiver newMsmReceiver) 
			throws SystemException {
		return msmReceiverPersistence.update(newMsmReceiver, false);
	}
	
	public List<MSMessage> getAllMessagesByUser(long userId) 
			throws SystemException, PortalException {
		List<MSMReceiver> msrs =  msmReceiverPersistence.findByU(userId);
		List<MSMessage> messages = new ArrayList<MSMessage>();
		for(int i = 0 ; i < msrs.size() ; i++) {
			MSMessage message = 
					MSMessageLocalServiceUtil.getMSMessage(
							msrs.get(i).getMessageId());
			messages.add(message);
		}
		return messages;
	}
}