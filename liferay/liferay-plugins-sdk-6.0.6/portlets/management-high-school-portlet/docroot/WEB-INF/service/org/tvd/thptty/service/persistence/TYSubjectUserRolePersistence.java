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

import org.tvd.thptty.model.TYSubjectUserRole;

/**
 * The persistence interface for the t y subject user role service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYSubjectUserRoleUtil} to access the t y subject user role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectUserRolePersistenceImpl
 * @see TYSubjectUserRoleUtil
 * @generated
 */
public interface TYSubjectUserRolePersistence extends BasePersistence<TYSubjectUserRole> {
	/**
	* Caches the t y subject user role in the entity cache if it is enabled.
	*
	* @param tySubjectUserRole the t y subject user role to cache
	*/
	public void cacheResult(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole);

	/**
	* Caches the t y subject user roles in the entity cache if it is enabled.
	*
	* @param tySubjectUserRoles the t y subject user roles to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYSubjectUserRole> tySubjectUserRoles);

	/**
	* Creates a new t y subject user role with the primary key. Does not add the t y subject user role to the database.
	*
	* @param tySubjectUserRolePK the primary key for the new t y subject user role
	* @return the new t y subject user role
	*/
	public org.tvd.thptty.model.TYSubjectUserRole create(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK);

	/**
	* Removes the t y subject user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRolePK the primary key of the t y subject user role to remove
	* @return the t y subject user role that was removed
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole remove(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	public org.tvd.thptty.model.TYSubjectUserRole updateImpl(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject user role with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectUserRoleException} if it could not be found.
	*
	* @param tySubjectUserRolePK the primary key of the t y subject user role to find
	* @return the t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the t y subject user role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tySubjectUserRolePK the primary key of the t y subject user role to find
	* @return the t y subject user role, or <code>null</code> if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectUserRoleException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByC_S_R(int courses,
		long subjectId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject user role, or <code>null</code> if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole fetchByC_S_R(int courses,
		long subjectId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject user role, or <code>null</code> if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole fetchByC_S_R(int courses,
		long subjectId, long roleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @return the matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_S(
		int courses, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @return the range of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_S(
		int courses, long subjectId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_S(
		int courses, long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByC_S_First(int courses,
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the last t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByC_S_Last(int courses,
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the t y subject user roles before and after the current t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tySubjectUserRolePK the primary key of the current t y subject user role
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole[] findByC_S_PrevAndNext(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK,
		int courses, long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_U_R(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @return the range of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByC_U_R_First(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the last t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole findByC_U_R_Last(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds the t y subject user roles before and after the current t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tySubjectUserRolePK the primary key of the current t y subject user role
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y subject user role
	* @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole[] findByC_U_R_PrevAndNext(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK,
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Finds all the t y subject user roles.
	*
	* @return the t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y subject user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @return the range of t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y subject user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S_R(int courses, long subjectId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectUserRoleException;

	/**
	* Removes all the t y subject user roles where courses = &#63; and subjectId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S(int courses, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y subject user roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subject user roles where courses = &#63; and subjectId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S_R(int courses, long subjectId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @return the number of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S(int courses, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subject user roles.
	*
	* @return the number of t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}