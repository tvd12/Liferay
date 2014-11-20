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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.ms.internet.message.model.MSMessage;

import java.util.List;

/**
 * The persistence utility for the m s message service. This utility wraps {@link MSMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMessagePersistence
 * @see MSMessagePersistenceImpl
 * @generated
 */
public class MSMessageUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MSMessage msMessage) {
		getPersistence().clearCache(msMessage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MSMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MSMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MSMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static MSMessage remove(MSMessage msMessage)
		throws SystemException {
		return getPersistence().remove(msMessage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MSMessage update(MSMessage msMessage, boolean merge)
		throws SystemException {
		return getPersistence().update(msMessage, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MSMessage update(MSMessage msMessage, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(msMessage, merge, serviceContext);
	}

	/**
	* Caches the m s message in the entity cache if it is enabled.
	*
	* @param msMessage the m s message to cache
	*/
	public static void cacheResult(
		com.ms.internet.message.model.MSMessage msMessage) {
		getPersistence().cacheResult(msMessage);
	}

	/**
	* Caches the m s messages in the entity cache if it is enabled.
	*
	* @param msMessages the m s messages to cache
	*/
	public static void cacheResult(
		java.util.List<com.ms.internet.message.model.MSMessage> msMessages) {
		getPersistence().cacheResult(msMessages);
	}

	/**
	* Creates a new m s message with the primary key. Does not add the m s message to the database.
	*
	* @param messageId the primary key for the new m s message
	* @return the new m s message
	*/
	public static com.ms.internet.message.model.MSMessage create(long messageId) {
		return getPersistence().create(messageId);
	}

	/**
	* Removes the m s message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the m s message to remove
	* @return the m s message that was removed
	* @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMessage remove(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMessageException {
		return getPersistence().remove(messageId);
	}

	public static com.ms.internet.message.model.MSMessage updateImpl(
		com.ms.internet.message.model.MSMessage msMessage, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(msMessage, merge);
	}

	/**
	* Finds the m s message with the primary key or throws a {@link com.ms.internet.message.NoSuchMessageException} if it could not be found.
	*
	* @param messageId the primary key of the m s message to find
	* @return the m s message
	* @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMessage findByPrimaryKey(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMessageException {
		return getPersistence().findByPrimaryKey(messageId);
	}

	/**
	* Finds the m s message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the m s message to find
	* @return the m s message, or <code>null</code> if a m s message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMessage fetchByPrimaryKey(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(messageId);
	}

	/**
	* Finds all the m s messages.
	*
	* @return the m s messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ms.internet.message.model.MSMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ms.internet.message.model.MSMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the m s messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the m s messages.
	*
	* @return the number of m s messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MSMessagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MSMessagePersistence)PortletBeanLocatorUtil.locate(com.ms.internet.message.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					MSMessagePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(MSMessagePersistence persistence) {
		_persistence = persistence;
	}

	private static MSMessagePersistence _persistence;
}