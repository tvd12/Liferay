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

package org.tvd.thptty.service;

/**
 * <p>
 * This class is a wrapper for {@link TYMessagesLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYMessagesLocalService
 * @generated
 */
public class TYMessagesLocalServiceWrapper implements TYMessagesLocalService {
	public TYMessagesLocalServiceWrapper(
		TYMessagesLocalService tyMessagesLocalService) {
		_tyMessagesLocalService = tyMessagesLocalService;
	}

	/**
	* Adds the t y messages to the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to add
	* @return the t y messages that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYMessages addTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.addTYMessages(tyMessages);
	}

	/**
	* Creates a new t y messages with the primary key. Does not add the t y messages to the database.
	*
	* @param messageId the primary key for the new t y messages
	* @return the new t y messages
	*/
	public org.tvd.thptty.model.TYMessages createTYMessages(long messageId) {
		return _tyMessagesLocalService.createTYMessages(messageId);
	}

	/**
	* Deletes the t y messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t y messages to delete
	* @throws PortalException if a t y messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYMessages(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tyMessagesLocalService.deleteTYMessages(messageId);
	}

	/**
	* Deletes the t y messages from the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYMessages(org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyMessagesLocalService.deleteTYMessages(tyMessages);
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
		return _tyMessagesLocalService.dynamicQuery(dynamicQuery);
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
		return _tyMessagesLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tyMessagesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tyMessagesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y messages with the primary key.
	*
	* @param messageId the primary key of the t y messages to get
	* @return the t y messages
	* @throws PortalException if a t y messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYMessages getTYMessages(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.getTYMessages(messageId);
	}

	/**
	* Gets a range of all the t y messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y messageses to return
	* @param end the upper bound of the range of t y messageses to return (not inclusive)
	* @return the range of t y messageses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYMessages> getTYMessageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.getTYMessageses(start, end);
	}

	/**
	* Gets the number of t y messageses.
	*
	* @return the number of t y messageses
	* @throws SystemException if a system exception occurred
	*/
	public int getTYMessagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.getTYMessagesesCount();
	}

	/**
	* Updates the t y messages in the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to update
	* @return the t y messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYMessages updateTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.updateTYMessages(tyMessages);
	}

	/**
	* Updates the t y messages in the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to update
	* @param merge whether to merge the t y messages with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYMessages updateTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.updateTYMessages(tyMessages, merge);
	}

	public org.tvd.thptty.model.TYMessages addMessage(
		org.tvd.thptty.model.TYMessages newMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.addMessage(newMessage);
	}

	public java.util.List<org.tvd.thptty.model.TYMessages> getMessagesByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessagesLocalService.getMessagesByC_G(companyId, groupId);
	}

	public TYMessagesLocalService getWrappedTYMessagesLocalService() {
		return _tyMessagesLocalService;
	}

	private TYMessagesLocalService _tyMessagesLocalService;
}