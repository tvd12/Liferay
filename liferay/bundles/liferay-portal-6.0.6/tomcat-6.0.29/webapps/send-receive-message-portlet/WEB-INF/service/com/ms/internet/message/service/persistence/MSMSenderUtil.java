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

import com.ms.internet.message.model.MSMSender;

import java.util.List;

/**
 * The persistence utility for the m s m sender service. This utility wraps {@link MSMSenderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see MSMSenderPersistence
 * @see MSMSenderPersistenceImpl
 * @generated
 */
public class MSMSenderUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MSMSender msmSender) {
		getPersistence().clearCache(msmSender);
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
	public static List<MSMSender> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MSMSender> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MSMSender> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static MSMSender remove(MSMSender msmSender)
		throws SystemException {
		return getPersistence().remove(msmSender);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MSMSender update(MSMSender msmSender, boolean merge)
		throws SystemException {
		return getPersistence().update(msmSender, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MSMSender update(MSMSender msmSender, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(msmSender, merge, serviceContext);
	}

	/**
	* Caches the m s m sender in the entity cache if it is enabled.
	*
	* @param msmSender the m s m sender to cache
	*/
	public static void cacheResult(
		com.ms.internet.message.model.MSMSender msmSender) {
		getPersistence().cacheResult(msmSender);
	}

	/**
	* Caches the m s m senders in the entity cache if it is enabled.
	*
	* @param msmSenders the m s m senders to cache
	*/
	public static void cacheResult(
		java.util.List<com.ms.internet.message.model.MSMSender> msmSenders) {
		getPersistence().cacheResult(msmSenders);
	}

	/**
	* Creates a new m s m sender with the primary key. Does not add the m s m sender to the database.
	*
	* @param msmSenderPK the primary key for the new m s m sender
	* @return the new m s m sender
	*/
	public static com.ms.internet.message.model.MSMSender create(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK) {
		return getPersistence().create(msmSenderPK);
	}

	/**
	* Removes the m s m sender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param msmSenderPK the primary key of the m s m sender to remove
	* @return the m s m sender that was removed
	* @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender remove(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence().remove(msmSenderPK);
	}

	public static com.ms.internet.message.model.MSMSender updateImpl(
		com.ms.internet.message.model.MSMSender msmSender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(msmSender, merge);
	}

	/**
	* Finds the m s m sender with the primary key or throws a {@link com.ms.internet.message.NoSuchMSenderException} if it could not be found.
	*
	* @param msmSenderPK the primary key of the m s m sender to find
	* @return the m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence().findByPrimaryKey(msmSenderPK);
	}

	/**
	* Finds the m s m sender with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param msmSenderPK the primary key of the m s m sender to find
	* @return the m s m sender, or <code>null</code> if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender fetchByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(msmSenderPK);
	}

	/**
	* Finds the m s m sender where messageId = &#63; or throws a {@link com.ms.internet.message.NoSuchMSenderException} if it could not be found.
	*
	* @param messageId the message id to search with
	* @return the matching m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByMI(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence().findByMI(messageId);
	}

	/**
	* Finds the m s m sender where messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param messageId the message id to search with
	* @return the matching m s m sender, or <code>null</code> if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender fetchByMI(
		long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMI(messageId);
	}

	/**
	* Finds the m s m sender where messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param messageId the message id to search with
	* @return the matching m s m sender, or <code>null</code> if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender fetchByMI(
		long messageId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMI(messageId, retrieveFromCache);
	}

	/**
	* Finds all the m s m senders where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId);
	}

	/**
	* Finds a range of all the m s m senders where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @return the range of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Finds an ordered range of all the m s m senders where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Finds the first m s m sender in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Finds the last m s m sender in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Finds the m s m senders before and after the current m s m sender in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param msmSenderPK the primary key of the current m s m sender
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender[] findByU_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence()
				   .findByU_PrevAndNext(msmSenderPK, userId, orderByComparator);
	}

	/**
	* Finds all the m s m senders where userId = &#63; and dateSend = &#63;.
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @return the matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU_D(
		long userId, java.util.Date dateSend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(userId, dateSend);
	}

	/**
	* Finds a range of all the m s m senders where userId = &#63; and dateSend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @return the range of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU_D(
		long userId, java.util.Date dateSend, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(userId, dateSend, start, end);
	}

	/**
	* Finds an ordered range of all the m s m senders where userId = &#63; and dateSend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findByU_D(
		long userId, java.util.Date dateSend, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_D(userId, dateSend, start, end, orderByComparator);
	}

	/**
	* Finds the first m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByU_D_First(
		long userId, java.util.Date dateSend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence()
				   .findByU_D_First(userId, dateSend, orderByComparator);
	}

	/**
	* Finds the last m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender findByU_D_Last(
		long userId, java.util.Date dateSend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence()
				   .findByU_D_Last(userId, dateSend, orderByComparator);
	}

	/**
	* Finds the m s m senders before and after the current m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param msmSenderPK the primary key of the current m s m sender
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next m s m sender
	* @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMSender[] findByU_D_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMSenderPK msmSenderPK,
		long userId, java.util.Date dateSend,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		return getPersistence()
				   .findByU_D_PrevAndNext(msmSenderPK, userId, dateSend,
			orderByComparator);
	}

	/**
	* Finds all the m s m senders.
	*
	* @return the m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the m s m senders.
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
	public static java.util.List<com.ms.internet.message.model.MSMSender> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the m s m senders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s m senders to return
	* @param end the upper bound of the range of m s m senders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMSender> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the m s m sender where messageId = &#63; from the database.
	*
	* @param messageId the message id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMI(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMSenderException {
		getPersistence().removeByMI(messageId);
	}

	/**
	* Removes all the m s m senders where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU(userId);
	}

	/**
	* Removes all the m s m senders where userId = &#63; and dateSend = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_D(long userId, java.util.Date dateSend)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_D(userId, dateSend);
	}

	/**
	* Removes all the m s m senders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the m s m senders where messageId = &#63;.
	*
	* @param messageId the message id to search with
	* @return the number of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMI(long messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMI(messageId);
	}

	/**
	* Counts all the m s m senders where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU(userId);
	}

	/**
	* Counts all the m s m senders where userId = &#63; and dateSend = &#63;.
	*
	* @param userId the user id to search with
	* @param dateSend the date send to search with
	* @return the number of matching m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_D(long userId, java.util.Date dateSend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_D(userId, dateSend);
	}

	/**
	* Counts all the m s m senders.
	*
	* @return the number of m s m senders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MSMSenderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MSMSenderPersistence)PortletBeanLocatorUtil.locate(com.ms.internet.message.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					MSMSenderPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(MSMSenderPersistence persistence) {
		_persistence = persistence;
	}

	private static MSMSenderPersistence _persistence;
}