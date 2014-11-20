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

import org.tvd.thptty.model.TYClassUserRole;

import java.util.List;

/**
 * The persistence utility for the t y class user role service. This utility wraps {@link TYClassUserRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYClassUserRolePersistence
 * @see TYClassUserRolePersistenceImpl
 * @generated
 */
public class TYClassUserRoleUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYClassUserRole tyClassUserRole) {
		getPersistence().clearCache(tyClassUserRole);
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
	public static List<TYClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYClassUserRole remove(TYClassUserRole tyClassUserRole)
		throws SystemException {
		return getPersistence().remove(tyClassUserRole);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYClassUserRole update(TYClassUserRole tyClassUserRole,
		boolean merge) throws SystemException {
		return getPersistence().update(tyClassUserRole, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYClassUserRole update(TYClassUserRole tyClassUserRole,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyClassUserRole, merge, serviceContext);
	}

	/**
	* Caches the t y class user role in the entity cache if it is enabled.
	*
	* @param tyClassUserRole the t y class user role to cache
	*/
	public static void cacheResult(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole) {
		getPersistence().cacheResult(tyClassUserRole);
	}

	/**
	* Caches the t y class user roles in the entity cache if it is enabled.
	*
	* @param tyClassUserRoles the t y class user roles to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYClassUserRole> tyClassUserRoles) {
		getPersistence().cacheResult(tyClassUserRoles);
	}

	/**
	* Creates a new t y class user role with the primary key. Does not add the t y class user role to the database.
	*
	* @param tyClassUserRolePK the primary key for the new t y class user role
	* @return the new t y class user role
	*/
	public static org.tvd.thptty.model.TYClassUserRole create(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK) {
		return getPersistence().create(tyClassUserRolePK);
	}

	/**
	* Removes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to remove
	* @return the t y class user role that was removed
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole remove(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence().remove(tyClassUserRolePK);
	}

	public static org.tvd.thptty.model.TYClassUserRole updateImpl(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyClassUserRole, merge);
	}

	/**
	* Finds the t y class user role with the primary key or throws a {@link org.tvd.thptty.NoSuchClassUserRoleException} if it could not be found.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to find
	* @return the t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence().findByPrimaryKey(tyClassUserRolePK);
	}

	/**
	* Finds the t y class user role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to find
	* @return the t y class user role, or <code>null</code> if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tyClassUserRolePK);
	}

	/**
	* Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassUserRoleException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByC_C_R(
		int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence().findByC_C_R(courses, classId, roleId);
	}

	/**
	* Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole fetchByC_C_R(
		int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_C_R(courses, classId, roleId);
	}

	/**
	* Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole fetchByC_C_R(
		int courses, long classId, long roleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_R(courses, classId, roleId, retrieveFromCache);
	}

	/**
	* Finds all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(courses, classId);
	}

	/**
	* Finds a range of all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @return the range of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(courses, classId, start, end);
	}

	/**
	* Finds an ordered range of all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C(courses, classId, start, end, orderByComparator);
	}

	/**
	* Finds the first t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByC_C_First(
		int courses, long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_C_First(courses, classId, orderByComparator);
	}

	/**
	* Finds the last t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByC_C_Last(
		int courses, long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_C_Last(courses, classId, orderByComparator);
	}

	/**
	* Finds the t y class user roles before and after the current t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tyClassUserRolePK the primary key of the current t y class user role
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole[] findByC_C_PrevAndNext(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK,
		int courses, long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_C_PrevAndNext(tyClassUserRolePK, courses, classId,
			orderByComparator);
	}

	/**
	* Finds all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U_R(courses, userId, roleId);
	}

	/**
	* Finds a range of all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @return the range of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U_R(courses, userId, roleId, start, end);
	}

	/**
	* Finds an ordered range of all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_U_R(courses, userId, roleId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByC_U_R_First(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_First(courses, userId, roleId, orderByComparator);
	}

	/**
	* Finds the last t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole findByC_U_R_Last(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_Last(courses, userId, roleId, orderByComparator);
	}

	/**
	* Finds the t y class user roles before and after the current t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tyClassUserRolePK the primary key of the current t y class user role
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole[] findByC_U_R_PrevAndNext(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK,
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_PrevAndNext(tyClassUserRolePK, courses, userId,
			roleId, orderByComparator);
	}

	/**
	* Finds all the t y class user roles.
	*
	* @return the t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the t y class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @return the range of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the t y class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C_R(int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		getPersistence().removeByC_C_R(courses, classId, roleId);
	}

	/**
	* Removes all the t y class user roles where courses = &#63; and classId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_C(courses, classId);
	}

	/**
	* Removes all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_U_R(courses, userId, roleId);
	}

	/**
	* Removes all the t y class user roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y class user roles where courses = &#63; and classId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C_R(int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C_R(courses, classId, roleId);
	}

	/**
	* Counts all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C(courses, classId);
	}

	/**
	* Counts all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_U_R(courses, userId, roleId);
	}

	/**
	* Counts all the t y class user roles.
	*
	* @return the number of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYClassUserRolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYClassUserRolePersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYClassUserRolePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYClassUserRolePersistence persistence) {
		_persistence = persistence;
	}

	private static TYClassUserRolePersistence _persistence;
}