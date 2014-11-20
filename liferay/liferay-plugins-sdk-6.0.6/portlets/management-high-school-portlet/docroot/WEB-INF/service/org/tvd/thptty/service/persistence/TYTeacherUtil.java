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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import org.tvd.thptty.model.TYTeacher;

import java.util.List;

/**
 * The persistence utility for the t y teacher service. This utility wraps {@link TYTeacherPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYTeacherPersistence
 * @see TYTeacherPersistenceImpl
 * @generated
 */
public class TYTeacherUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYTeacher tyTeacher) {
		getPersistence().clearCache(tyTeacher);
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
	public static List<TYTeacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYTeacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYTeacher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYTeacher remove(TYTeacher tyTeacher)
		throws SystemException {
		return getPersistence().remove(tyTeacher);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYTeacher update(TYTeacher tyTeacher, boolean merge)
		throws SystemException {
		return getPersistence().update(tyTeacher, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYTeacher update(TYTeacher tyTeacher, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyTeacher, merge, serviceContext);
	}

	/**
	* Caches the t y teacher in the entity cache if it is enabled.
	*
	* @param tyTeacher the t y teacher to cache
	*/
	public static void cacheResult(org.tvd.thptty.model.TYTeacher tyTeacher) {
		getPersistence().cacheResult(tyTeacher);
	}

	/**
	* Caches the t y teachers in the entity cache if it is enabled.
	*
	* @param tyTeachers the t y teachers to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYTeacher> tyTeachers) {
		getPersistence().cacheResult(tyTeachers);
	}

	/**
	* Creates a new t y teacher with the primary key. Does not add the t y teacher to the database.
	*
	* @param teacherId the primary key for the new t y teacher
	* @return the new t y teacher
	*/
	public static org.tvd.thptty.model.TYTeacher create(long teacherId) {
		return getPersistence().create(teacherId);
	}

	/**
	* Removes the t y teacher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teacherId the primary key of the t y teacher to remove
	* @return the t y teacher that was removed
	* @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher remove(long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException {
		return getPersistence().remove(teacherId);
	}

	public static org.tvd.thptty.model.TYTeacher updateImpl(
		org.tvd.thptty.model.TYTeacher tyTeacher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyTeacher, merge);
	}

	/**
	* Finds the t y teacher with the primary key or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	*
	* @param teacherId the primary key of the t y teacher to find
	* @return the t y teacher
	* @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher findByPrimaryKey(
		long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException {
		return getPersistence().findByPrimaryKey(teacherId);
	}

	/**
	* Finds the t y teacher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param teacherId the primary key of the t y teacher to find
	* @return the t y teacher, or <code>null</code> if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher fetchByPrimaryKey(
		long teacherId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(teacherId);
	}

	/**
	* Finds the t y teacher where userId = &#63; or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher
	* @throws org.tvd.thptty.NoSuchTeacherException if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher findByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher fetchByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId(userId);
	}

	/**
	* Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user id to search with
	* @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYTeacher fetchByuserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId(userId, retrieveFromCache);
	}

	/**
	* Finds all the t y teachers.
	*
	* @return the t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYTeacher> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.tvd.thptty.model.TYTeacher> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYTeacher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the t y teacher where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchTeacherException {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Removes all the t y teachers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y teachers where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Counts all the t y teachers.
	*
	* @return the number of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYTeacherPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYTeacherPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYTeacherPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYTeacherPersistence persistence) {
		_persistence = persistence;
	}

	private static TYTeacherPersistence _persistence;
}