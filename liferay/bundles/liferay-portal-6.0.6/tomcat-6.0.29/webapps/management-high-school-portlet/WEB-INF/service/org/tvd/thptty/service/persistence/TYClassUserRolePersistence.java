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

import org.tvd.thptty.model.TYClassUserRole;

/**
 * The persistence interface for the t y class user role service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYClassUserRoleUtil} to access the t y class user role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassUserRolePersistenceImpl
 * @see TYClassUserRoleUtil
 * @generated
 */
public interface TYClassUserRolePersistence extends BasePersistence<TYClassUserRole> {
	/**
	* Caches the t y class user role in the entity cache if it is enabled.
	*
	* @param tyClassUserRole the t y class user role to cache
	*/
	public void cacheResult(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole);

	/**
	* Caches the t y class user roles in the entity cache if it is enabled.
	*
	* @param tyClassUserRoles the t y class user roles to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYClassUserRole> tyClassUserRoles);

	/**
	* Creates a new t y class user role with the primary key. Does not add the t y class user role to the database.
	*
	* @param tyClassUserRolePK the primary key for the new t y class user role
	* @return the new t y class user role
	*/
	public org.tvd.thptty.model.TYClassUserRole create(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK);

	/**
	* Removes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to remove
	* @return the t y class user role that was removed
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole remove(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	public org.tvd.thptty.model.TYClassUserRole updateImpl(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class user role with the primary key or throws a {@link org.tvd.thptty.NoSuchClassUserRoleException} if it could not be found.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to find
	* @return the t y class user role
	* @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	/**
	* Finds the t y class user role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to find
	* @return the t y class user role, or <code>null</code> if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYClassUserRole findByC_C_R(int courses,
		long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	/**
	* Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole fetchByC_C_R(int courses,
		long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole fetchByC_C_R(int courses,
		long classId, long roleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_C(
		int courses, long classId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYClassUserRole findByC_C_First(int courses,
		long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

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
	public org.tvd.thptty.model.TYClassUserRole findByC_C_Last(int courses,
		long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

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
	public org.tvd.thptty.model.TYClassUserRole[] findByC_C_PrevAndNext(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK,
		int courses, long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	/**
	* Finds all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYClassUserRole findByC_U_R_First(int courses,
		long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

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
	public org.tvd.thptty.model.TYClassUserRole findByC_U_R_Last(int courses,
		long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

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
	public org.tvd.thptty.model.TYClassUserRole[] findByC_U_R_PrevAndNext(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK,
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	/**
	* Finds all the t y class user roles.
	*
	* @return the t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C_R(int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException;

	/**
	* Removes all the t y class user roles where courses = &#63; and classId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y class user roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class user roles where courses = &#63; and classId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_R(int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class user roles where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class user roles.
	*
	* @return the number of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}