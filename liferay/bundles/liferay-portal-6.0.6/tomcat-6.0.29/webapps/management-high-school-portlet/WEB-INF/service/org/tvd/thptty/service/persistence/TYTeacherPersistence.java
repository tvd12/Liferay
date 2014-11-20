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

package org.tvd.thptty.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.tvd.thptty.model.TYTeacher;

/**
 * The persistence interface for the t y teacher service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYTeacherUtil} to access the t y teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYTeacherPersistenceImpl
 * @see TYTeacherUtil
 * @generated
 */
public interface TYTeacherPersistence extends BasePersistence<TYTeacher> {
	/**
	* Caches the t y teacher in the entity cache if it is enabled.
	*
	* @param tyTeacher the t y teacher to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYTeacher tyTeacher);

	/**
	* Caches the t y teachers in the entity cache if it is enabled.
	*
	* @param tyTeachers the t y teachers to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYTeacher> tyTeachers);

	/**
	* Creates a new t y teacher with the primary key. Does not add the t y teacher to the database.
	*
	* @param teacherId the primary key for the new t y teacher
	* @return the new t y teacher
	*/
	public org.tvd.thptty.model.TYTeacher create(long teacherId);

	/**
	* Removes the t y teacher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teacherId the primary key of the t y teacher to remove
	* @return the t y teacher that was removed
	* @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher remove(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException;

	public org.tvd.thptty.model.TYTeacher updateImpl(
		org.tvd.thptty.model.TYTeacher tyTeacher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y teacher with the primary key or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	*
	* @param teacherId the primary key of the t y teacher to find
	* @return the t y teacher
	* @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher findByPrimaryKey(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException;

	/**
	* Finds the t y teacher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param teacherId the primary key of the t y teacher to find
	* @return the t y teacher, or <code>null</code> if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher fetchByPrimaryKey(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y teacher where userId = &#63; or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher
	* @throws org.tvd.thptty.NoSuchTeacherException if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher findByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException;

	/**
	* Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher fetchByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher fetchByuserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y teachers.
	*
	* @return the t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYTeacher> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y teachers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y teachers to return
	* @param end the upper bound of the range of t y teachers to return (not inclusive)
	* @return the range of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYTeacher> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y teachers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y teachers to return
	* @param end the upper bound of the range of t y teachers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYTeacher> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y teacher where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException;

	/**
	* Removes all the t y teachers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y teachers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y teachers.
	*
	* @return the number of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}