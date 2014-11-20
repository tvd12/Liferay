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

package com.ms.internet.message.service;

/**
 * <p>
 * This class is a wrapper for {@link MSMessageLocalService}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMessageLocalService
 * @generated
 */
public class MSMessageLocalServiceWrapper implements MSMessageLocalService {
	public MSMessageLocalServiceWrapper(
		MSMessageLocalService msMessageLocalService) {
		_msMessageLocalService = msMessageLocalService;
	}

	/**
	* Adds the m s message to the database. Also notifies the appropriate model listeners.
	*
	* @param msMessage the m s message to add
	* @return the m s message that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage addMSMessage(
		com.ms.internet.message.model.MSMessage msMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.addMSMessage(msMessage);
	}

	/**
	* Creates a new m s message with the primary key. Does not add the m s message to the database.
	*
	* @param messageId the primary key for the new m s message
	* @return the new m s message
	*/
	public com.ms.internet.message.model.MSMessage createMSMessage(
		long messageId) {
		return _msMessageLocalService.createMSMessage(messageId);
	}

	/**
	* Deletes the m s message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the m s message to delete
	* @throws PortalException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_msMessageLocalService.deleteMSMessage(messageId);
	}

	/**
	* Deletes the m s message from the database. Also notifies the appropriate model listeners.
	*
	* @param msMessage the m s message to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMessage(
		com.ms.internet.message.model.MSMessage msMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		_msMessageLocalService.deleteMSMessage(msMessage);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the m s message with the primary key.
	*
	* @param messageId the primary key of the m s message to get
	* @return the m s message
	* @throws PortalException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage getMSMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.getMSMessage(messageId);
	}

	/**
	* Gets a range of all the m s messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s messages to return
	* @param end the upper bound of the range of m s messages to return (not inclusive)
	* @return the range of m s messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMessage> getMSMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.getMSMessages(start, end);
	}

	/**
	* Gets the number of m s messages.
	*
	* @return the number of m s messages
	* @throws SystemException if a system exception occurred
	*/
	public int getMSMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.getMSMessagesCount();
	}

	/**
	* Updates the m s message in the database. Also notifies the appropriate model listeners.
	*
	* @param msMessage the m s message to update
	* @return the m s message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage updateMSMessage(
		com.ms.internet.message.model.MSMessage msMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.updateMSMessage(msMessage);
	}

	/**
	* Updates the m s message in the database. Also notifies the appropriate model listeners.
	*
	* @param msMessage the m s message to update
	* @param merge whether to merge the m s message with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the m s message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage updateMSMessage(
		com.ms.internet.message.model.MSMessage msMessage, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.updateMSMessage(msMessage, merge);
	}

	public com.ms.internet.message.model.MSMessage addNewMessage(
		com.ms.internet.message.model.MSMessage newMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msMessageLocalService.addNewMessage(newMessage);
	}

	public MSMessageLocalService getWrappedMSMessageLocalService() {
		return _msMessageLocalService;
	}

	private MSMessageLocalService _msMessageLocalService;
}