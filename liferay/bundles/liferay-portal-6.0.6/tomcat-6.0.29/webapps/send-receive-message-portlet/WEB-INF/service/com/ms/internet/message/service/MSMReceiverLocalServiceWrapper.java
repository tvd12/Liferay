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
 * This class is a wrapper for {@link MSMReceiverLocalService}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMReceiverLocalService
 * @generated
 */
public class MSMReceiverLocalServiceWrapper implements MSMReceiverLocalService {
	public MSMReceiverLocalServiceWrapper(
		MSMReceiverLocalService msmReceiverLocalService) {
		_msmReceiverLocalService = msmReceiverLocalService;
	}

	/**
	* Adds the m s m receiver to the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiver the m s m receiver to add
	* @return the m s m receiver that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver addMSMReceiver(
		com.ms.internet.message.model.MSMReceiver msmReceiver)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.addMSMReceiver(msmReceiver);
	}

	/**
	* Creates a new m s m receiver with the primary key. Does not add the m s m receiver to the database.
	*
	* @param msmReceiverPK the primary key for the new m s m receiver
	* @return the new m s m receiver
	*/
	public com.ms.internet.message.model.MSMReceiver createMSMReceiver(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK) {
		return _msmReceiverLocalService.createMSMReceiver(msmReceiverPK);
	}

	/**
	* Deletes the m s m receiver with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to delete
	* @throws PortalException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMReceiver(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_msmReceiverLocalService.deleteMSMReceiver(msmReceiverPK);
	}

	/**
	* Deletes the m s m receiver from the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiver the m s m receiver to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMSMReceiver(
		com.ms.internet.message.model.MSMReceiver msmReceiver)
		throws com.liferay.portal.kernel.exception.SystemException {
		_msmReceiverLocalService.deleteMSMReceiver(msmReceiver);
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
		return _msmReceiverLocalService.dynamicQuery(dynamicQuery);
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
		return _msmReceiverLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _msmReceiverLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _msmReceiverLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the m s m receiver with the primary key.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to get
	* @return the m s m receiver
	* @throws PortalException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver getMSMReceiver(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.getMSMReceiver(msmReceiverPK);
	}

	/**
	* Gets a range of all the m s m receivers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @return the range of m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMReceiver> getMSMReceivers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.getMSMReceivers(start, end);
	}

	/**
	* Gets the number of m s m receivers.
	*
	* @return the number of m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public int getMSMReceiversCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.getMSMReceiversCount();
	}

	/**
	* Updates the m s m receiver in the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiver the m s m receiver to update
	* @return the m s m receiver that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver updateMSMReceiver(
		com.ms.internet.message.model.MSMReceiver msmReceiver)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.updateMSMReceiver(msmReceiver);
	}

	/**
	* Updates the m s m receiver in the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiver the m s m receiver to update
	* @param merge whether to merge the m s m receiver with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the m s m receiver that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver updateMSMReceiver(
		com.ms.internet.message.model.MSMReceiver msmReceiver, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.updateMSMReceiver(msmReceiver, merge);
	}

	public java.util.List<com.ms.internet.message.model.MSMessage> getAllMessagesByUser(
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiverLocalService.getAllMessagesByUser(userId);
	}

	public MSMReceiverLocalService getWrappedMSMReceiverLocalService() {
		return _msmReceiverLocalService;
	}

	private MSMReceiverLocalService _msmReceiverLocalService;
}