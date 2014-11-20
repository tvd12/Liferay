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

import com.ms.internet.message.model.MSMReceiver;

import java.util.List;

/**
 * The persistence utility for the m s m receiver service. This utility wraps {@link MSMReceiverPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see MSMReceiverPersistence
 * @see MSMReceiverPersistenceImpl
 * @generated
 */
public class MSMReceiverUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MSMReceiver msmReceiver) {
		getPersistence().clearCache(msmReceiver);
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
	public static List<MSMReceiver> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MSMReceiver> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MSMReceiver> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static MSMReceiver remove(MSMReceiver msmReceiver)
		throws SystemException {
		return getPersistence().remove(msmReceiver);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MSMReceiver update(MSMReceiver msmReceiver, boolean merge)
		throws SystemException {
		return getPersistence().update(msmReceiver, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MSMReceiver update(MSMReceiver msmReceiver, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(msmReceiver, merge, serviceContext);
	}

	/**
	* Caches the m s m receiver in the entity cache if it is enabled.
	*
	* @param msmReceiver the m s m receiver to cache
	*/
	public static void cacheResult(
		com.ms.internet.message.model.MSMReceiver msmReceiver) {
		getPersistence().cacheResult(msmReceiver);
	}

	/**
	* Caches the m s m receivers in the entity cache if it is enabled.
	*
	* @param msmReceivers the m s m receivers to cache
	*/
	public static void cacheResult(
		java.util.List<com.ms.internet.message.model.MSMReceiver> msmReceivers) {
		getPersistence().cacheResult(msmReceivers);
	}

	/**
	* Creates a new m s m receiver with the primary key. Does not add the m s m receiver to the database.
	*
	* @param msmReceiverPK the primary key for the new m s m receiver
	* @return the new m s m receiver
	*/
	public static com.ms.internet.message.model.MSMReceiver create(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK) {
		return getPersistence().create(msmReceiverPK);
	}

	/**
	* Removes the m s m receiver with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to remove
	* @return the m s m receiver that was removed
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver remove(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence().remove(msmReceiverPK);
	}

	public static com.ms.internet.message.model.MSMReceiver updateImpl(
		com.ms.internet.message.model.MSMReceiver msmReceiver, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(msmReceiver, merge);
	}

	/**
	* Finds the m s m receiver with the primary key or throws a {@link com.ms.internet.message.NoSuchMReceiverException} if it could not be found.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to find
	* @return the m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver findByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence().findByPrimaryKey(msmReceiverPK);
	}

	/**
	* Finds the m s m receiver with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to find
	* @return the m s m receiver, or <code>null</code> if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver fetchByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(msmReceiverPK);
	}

	/**
	* Finds all the m s m receivers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId);
	}

	/**
	* Finds a range of all the m s m receivers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @return the range of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Finds an ordered range of all the m s m receivers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Finds the first m s m receiver in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Finds the last m s m receiver in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver findByU_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Finds the m s m receivers before and after the current m s m receiver in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param msmReceiverPK the primary key of the current m s m receiver
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver[] findByU_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence()
				   .findByU_PrevAndNext(msmReceiverPK, userId, orderByComparator);
	}

	/**
	* Finds all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @return the matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(userId, dateRecieved);
	}

	/**
	* Finds a range of all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @return the range of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(userId, dateRecieved, start, end);
	}

	/**
	* Finds an ordered range of all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_D(userId, dateRecieved, start, end,
			orderByComparator);
	}

	/**
	* Finds the first m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver findByU_D_First(
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence()
				   .findByU_D_First(userId, dateRecieved, orderByComparator);
	}

	/**
	* Finds the last m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver findByU_D_Last(
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence()
				   .findByU_D_Last(userId, dateRecieved, orderByComparator);
	}

	/**
	* Finds the m s m receivers before and after the current m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param msmReceiverPK the primary key of the current m s m receiver
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ms.internet.message.model.MSMReceiver[] findByU_D_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK,
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException {
		return getPersistence()
				   .findByU_D_PrevAndNext(msmReceiverPK, userId, dateRecieved,
			orderByComparator);
	}

	/**
	* Finds all the m s m receivers.
	*
	* @return the m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the m s m receivers.
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
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the m s m receivers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m s m receivers to return
	* @param end the upper bound of the range of m s m receivers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ms.internet.message.model.MSMReceiver> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the m s m receivers where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU(userId);
	}

	/**
	* Removes all the m s m receivers where userId = &#63; and dateRecieved = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_D(long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_D(userId, dateRecieved);
	}

	/**
	* Removes all the m s m receivers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the m s m receivers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU(userId);
	}

	/**
	* Counts all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @return the number of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_D(long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_D(userId, dateRecieved);
	}

	/**
	* Counts all the m s m receivers.
	*
	* @return the number of m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MSMReceiverPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MSMReceiverPersistence)PortletBeanLocatorUtil.locate(com.ms.internet.message.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					MSMReceiverPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(MSMReceiverPersistence persistence) {
		_persistence = persistence;
	}

	private static MSMReceiverPersistence _persistence;
}