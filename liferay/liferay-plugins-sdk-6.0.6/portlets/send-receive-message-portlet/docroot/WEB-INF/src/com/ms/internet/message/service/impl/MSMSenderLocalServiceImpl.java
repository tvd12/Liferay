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

import com.liferay.portal.kernel.exception.SystemException;
import com.ms.internet.message.NoSuchMSenderException;
import com.ms.internet.message.model.MSMSender;
import com.ms.internet.message.service.base.MSMSenderLocalServiceBaseImpl;

/**
 * The implementation of the m s m sender local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ms.internet.message.service.MSMSenderLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.ms.internet.message.service.MSMSenderLocalServiceUtil} to access the m s m sender local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author I Am Dung
 * @see com.ms.internet.message.service.base.MSMSenderLocalServiceBaseImpl
 * @see com.ms.internet.message.service.MSMSenderLocalServiceUtil
 */
public class MSMSenderLocalServiceImpl extends MSMSenderLocalServiceBaseImpl {
	
	public MSMSender addMSMSender(MSMSender newMsmSender) 
			throws SystemException {
		return msmSenderPersistence.update(newMsmSender, false);
	}
	
	public MSMSender getSenderByMsgId(long messageId) 
			throws NoSuchMSenderException, SystemException {
		return msmSenderPersistence.findByMI(messageId);
	}
}