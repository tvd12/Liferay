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

package com.ms.internet.message.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.ms.internet.message.model.MSMessage;

/**
 * The persistence interface for the m s message service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link MSMessageUtil} to access the m s message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMessagePersistenceImpl
 * @see MSMessageUtil
 * @generated
 */
public interface MSMessagePersistence extends BasePersistence<MSMessage> {
	/**
	* Caches the m s message in the entity cache if it is enabled.
	*
	* @param msMessage the m s message to cache
	*/
	public void cacheResult(com.ms.internet.message.model.MSMessage msMessage);

	/**
	* Caches the m s messages in the entity cache if it is enabled.
	*
	* @param msMessages the m s messages to cache
	*/
	public void cacheResult(
		java.util.List<com.ms.internet.message.model.MSMessage> msMessages);

	/**
	* Creates a new m s message with the primary key. Does not add the m s message to the database.
	*
	* @param messageId the primary key for the new m s message
	* @return the new m s message
	*/
	public com.ms.internet.message.model.MSMessage create(long messageId);

	/**
	* Removes the m s message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the m s message to remove
	* @return the m s message that was removed
	* @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage remove(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMessageException;

	public com.ms.internet.message.model.MSMessage updateImpl(
		com.ms.internet.message.model.MSMessage msMessage, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the m s message with the primary key or throws a {@link com.ms.internet.message.NoSuchMessageException} if it could not be found.
	*
	* @param messageId the primary key of the m s message to find
	* @return the m s message
	* @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage findByPrimaryKey(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMessageException;

	/**
	* Finds the m s message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the m s message to find
	* @return the m s message, or <code>null</code> if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMessage fetchByPrimaryKey(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the m s messages.
	*
	* @return the m s messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the m s messages.
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
	public java.util.List<com.ms.internet.message.model.MSMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the m s messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s messages to return
	* @param end the upper bound of the range of m s messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of m s messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the m s messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the m s messages.
	*
	* @return the number of m s messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}