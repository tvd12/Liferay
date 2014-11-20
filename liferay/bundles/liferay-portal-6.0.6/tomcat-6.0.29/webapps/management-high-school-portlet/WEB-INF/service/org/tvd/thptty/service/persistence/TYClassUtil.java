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

import org.tvd.thptty.model.TYClass;

import java.util.List;

/**
 * The persistence utility for the t y class service. This utility wraps {@link TYClassPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYClassPersistence
 * @see TYClassPersistenceImpl
 * @generated
 */
public class TYClassUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYClass tyClass) {
		getPersistence().clearCache(tyClass);
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
	public static List<TYClass> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYClass> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYClass> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYClass remove(TYClass tyClass) throws SystemException {
		return getPersistence().remove(tyClass);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYClass update(TYClass tyClass, boolean merge)
		throws SystemException {
		return getPersistence().update(tyClass, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYClass update(TYClass tyClass, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyClass, merge, serviceContext);
	}

	/**
	* Caches the t y class in the entity cache if it is enabled.
	*
	* @param tyClass the t y class to cache
	*/
	public static void cacheResult(org.tvd.thptty.model.TYClass tyClass) {
		getPersistence().cacheResult(tyClass);
	}

	/**
	* Caches the t y classes in the entity cache if it is enabled.
	*
	* @param tyClasses the t y classes to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYClass> tyClasses) {
		getPersistence().cacheResult(tyClasses);
	}

	/**
	* Creates a new t y class with the primary key. Does not add the t y class to the database.
	*
	* @param classId the primary key for the new t y class
	* @return the new t y class
	*/
	public static org.tvd.thptty.model.TYClass create(long classId) {
		return getPersistence().create(classId);
	}

	/**
	* Removes the t y class with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param classId the primary key of the t y class to remove
	* @return the t y class that was removed
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass remove(long classId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence().remove(classId);
	}

	public static org.tvd.thptty.model.TYClass updateImpl(
		org.tvd.thptty.model.TYClass tyClass, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyClass, merge);
	}

	/**
	* Finds the t y class with the primary key or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param classId the primary key of the t y class to find
	* @return the t y class
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass findByPrimaryKey(long classId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence().findByPrimaryKey(classId);
	}

	/**
	* Finds the t y class with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param classId the primary key of the t y class to find
	* @return the t y class, or <code>null</code> if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass fetchByPrimaryKey(long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(classId);
	}

	/**
	* Finds all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_ID(companyId, groupId);
	}

	/**
	* Finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_ID(companyId, groupId, start, end);
	}

	/**
	* Finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_ID(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass findByG_ID_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence()
				   .findByG_ID_First(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the last t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass findByG_ID_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence()
				   .findByG_ID_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the t y classes before and after the current t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classId the primary key of the current t y class
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y class
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass[] findByG_ID_PrevAndNext(
		long classId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence()
				   .findByG_ID_PrevAndNext(classId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_ID(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_ID(companyId, groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_ID(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass findByC_G(long classId,
		long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence().findByC_G(classId, groupId, companyId);
	}

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass fetchByC_G(long classId,
		long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G(classId, groupId, companyId);
	}

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass fetchByC_G(long classId,
		long groupId, long companyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G(classId, groupId, companyId, retrieveFromCache);
	}

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass findByclassGroup_Name(
		long companyId, long groupId, int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		return getPersistence()
				   .findByclassGroup_Name(companyId, groupId, classGroup,
			className);
	}

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass fetchByclassGroup_Name(
		long companyId, long groupId, int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByclassGroup_Name(companyId, groupId, classGroup,
			className);
	}

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClass fetchByclassGroup_Name(
		long companyId, long groupId, int classGroup,
		java.lang.String className, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByclassGroup_Name(companyId, groupId, classGroup,
			className, retrieveFromCache);
	}

	/**
	* Finds all the t y classes.
	*
	* @return the t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the t y classes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the t y classes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClass> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t y classes where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_ID(companyId, groupId);
	}

	/**
	* Removes the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; from the database.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long classId, long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		getPersistence().removeByC_G(classId, groupId, companyId);
	}

	/**
	* Removes the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByclassGroup_Name(long companyId, long groupId,
		int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException {
		getPersistence()
			.removeByclassGroup_Name(companyId, groupId, classGroup, className);
	}

	/**
	* Removes all the t y classes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_ID(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and counts all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_ID(companyId, groupId);
	}

	/**
	* Counts all the t y classes where classId = &#63; and groupId = &#63; and companyId = &#63;.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long classId, long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(classId, groupId, companyId);
	}

	/**
	* Counts all the t y classes where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByclassGroup_Name(long companyId, long groupId,
		int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByclassGroup_Name(companyId, groupId, classGroup,
			className);
	}

	/**
	* Counts all the t y classes.
	*
	* @return the number of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYClassPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYClassPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYClassPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYClassPersistence persistence) {
		_persistence = persistence;
	}

	private static TYClassPersistence _persistence;
}