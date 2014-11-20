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

import com.ms.internet.message.model.MSMReceiver;

/**
 * The persistence interface for the m s m receiver service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link MSMReceiverUtil} to access the m s m receiver persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMReceiverPersistenceImpl
 * @see MSMReceiverUtil
 * @generated
 */
public interface MSMReceiverPersistence extends BasePersistence<MSMReceiver> {
	/**
	* Caches the m s m receiver in the entity cache if it is enabled.
	*
	* @param msmReceiver the m s m receiver to cache
	*/
	public void cacheResult(
		com.ms.internet.message.model.MSMReceiver msmReceiver);

	/**
	* Caches the m s m receivers in the entity cache if it is enabled.
	*
	* @param msmReceivers the m s m receivers to cache
	*/
	public void cacheResult(
		java.util.List<com.ms.internet.message.model.MSMReceiver> msmReceivers);

	/**
	* Creates a new m s m receiver with the primary key. Does not add the m s m receiver to the database.
	*
	* @param msmReceiverPK the primary key for the new m s m receiver
	* @return the new m s m receiver
	*/
	public com.ms.internet.message.model.MSMReceiver create(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK);

	/**
	* Removes the m s m receiver with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to remove
	* @return the m s m receiver that was removed
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver remove(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

	public com.ms.internet.message.model.MSMReceiver updateImpl(
		com.ms.internet.message.model.MSMReceiver msmReceiver, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the m s m receiver with the primary key or throws a {@link com.ms.internet.message.NoSuchMReceiverException} if it could not be found.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to find
	* @return the m s m receiver
	* @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver findByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

	/**
	* Finds the m s m receiver with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param msmReceiverPK the primary key of the m s m receiver to find
	* @return the m s m receiver, or <code>null</code> if a m s m receiver with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ms.internet.message.model.MSMReceiver fetchByPrimaryKey(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the m s m receivers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ms.internet.message.model.MSMReceiver findByU_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

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
	public com.ms.internet.message.model.MSMReceiver findByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

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
	public com.ms.internet.message.model.MSMReceiver[] findByU_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

	/**
	* Finds all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @return the matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findByU_D(
		long userId, java.util.Date dateRecieved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ms.internet.message.model.MSMReceiver findByU_D_First(
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

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
	public com.ms.internet.message.model.MSMReceiver findByU_D_Last(
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

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
	public com.ms.internet.message.model.MSMReceiver[] findByU_D_PrevAndNext(
		com.ms.internet.message.service.persistence.MSMReceiverPK msmReceiverPK,
		long userId, java.util.Date dateRecieved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ms.internet.message.NoSuchMReceiverException;

	/**
	* Finds all the m s m receivers.
	*
	* @return the m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ms.internet.message.model.MSMReceiver> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the m s m receivers where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the m s m receivers where userId = &#63; and dateRecieved = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_D(long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the m s m receivers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the m s m receivers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	*
	* @param userId the user id to search with
	* @param dateRecieved the date recieved to search with
	* @return the number of matching m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_D(long userId, java.util.Date dateRecieved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the m s m receivers.
	*
	* @return the number of m s m receivers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}