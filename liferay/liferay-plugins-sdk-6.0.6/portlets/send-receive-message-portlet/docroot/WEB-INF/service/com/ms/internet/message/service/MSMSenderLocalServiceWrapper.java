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
 * This class is a wrapper for {@link MSMSenderLocalService}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMSenderLocalService
 * @generated
 */
public class MSMSenderLocalServiceWrapper implements MSMSenderLocalService {
	public MSMSenderLocalServiceWrapper(
		MSMSenderLocalService msmSenderLocalService) {
		_msmSenderLocalService = msmSenderLocalService;
	}

	/**
	* Adds the m s m sender to the database. Also notifies the appropriate model listeners.
	*
	* @param msmSender the m s m sender to add
	* @return the m s m sender that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMSender addMSMSender(
		com.ms.internet.message.model.MSMSender msmSender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.addMSMSender(msmSender);
	}

	/**
	* Creates a new m s m sender with the primary key. Does not add the m s m sender to the database.
	*
	* @param msmSenderPK the primary key for the new m s m sender
	* @return the new m s m sender
	*/
	public com.ms.internet.message.model.MSMSender createMSMSender(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK) {
		return _msmSenderLocalService.createMSMSender(msmSenderPK);
	}

	/**
	* Deletes the m s m sender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param msmSenderPK the primary key of the m s m sender to delete
	* @throws PortalException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMSender(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_msmSenderLocalService.deleteMSMSender(msmSenderPK);
	}

	/**
	* Deletes the m s m sender from the database. Also notifies the appropriate model listeners.
	*
	* @param msmSender the m s m sender to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMSender(
		com.ms.internet.message.model.MSMSender msmSender)
		throws com.liferay.portal.kernel.exception.SystemException {
		_msmSenderLocalService.deleteMSMSender(msmSender);
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
		return _msmSenderLocalService.dynamicQuery(dynamicQuery);
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
		return _msmSenderLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _msmSenderLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _msmSenderLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the m s m sender with the primary key.
	*
	* @param msmSenderPK the primary key of the m s m sender to get
	* @return the m s m sender
	* @throws PortalException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMSender getMSMSender(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.getMSMSender(msmSenderPK);
	}

	/**
	* Gets a range of all the m s m senders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @return the range of m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMSender> getMSMSenders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.getMSMSenders(start, end);
	}

	/**
	* Gets the number of m s m senders.
	*
	* @return the number of m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public int getMSMSendersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.getMSMSendersCount();
	}

	/**
	* Updates the m s m sender in the database. Also notifies the appropriate model listeners.
	*
	* @param msmSender the m s m sender to update
	* @return the m s m sender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMSender updateMSMSender(
		com.ms.internet.message.model.MSMSender msmSender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.updateMSMSender(msmSender);
	}

	/**
	* Updates the m s m sender in the database. Also notifies the appropriate model listeners.
	*
	* @param msmSender the m s m sender to update
	* @param merge whether to merge the m s m sender with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the m s m sender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMSender updateMSMSender(
		com.ms.internet.message.model.MSMSender msmSender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSenderLocalService.updateMSMSender(msmSender, merge);
	}

	public com.ms.internet.message.model.MSMSender getSenderByMsgId(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return _msmSenderLocalService.getSenderByMsgId(messageId);
	}

	public MSMSenderLocalService getWrappedMSMSenderLocalService() {
		return _msmSenderLocalService;
	}

	private MSMSenderLocalService _msmSenderLocalService;
}