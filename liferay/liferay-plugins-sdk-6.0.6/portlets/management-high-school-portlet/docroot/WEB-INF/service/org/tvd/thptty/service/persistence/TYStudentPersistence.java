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

import org.tvd.thptty.model.TYStudent;

/**
 * The persistence interface for the t y student service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYStudentUtil} to access the t y student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPersistenceImpl
 * @see TYStudentUtil
 * @generated
 */
public interface TYStudentPersistence extends BasePersistence<TYStudent> {
	/**
	* Caches the t y student in the entity cache if it is enabled.
	*
	* @param tyStudent the t y student to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYStudent tyStudent);

	/**
	* Caches the t y students in the entity cache if it is enabled.
	*
	* @param tyStudents the t y students to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudent> tyStudents);

	/**
	* Creates a new t y student with the primary key. Does not add the t y student to the database.
	*
	* @param studentId the primary key for the new t y student
	* @return the new t y student
	*/
	public org.tvd.thptty.model.TYStudent create(long studentId);

	/**
	* Removes the t y student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the t y student to remove
	* @return the t y student that was removed
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	public org.tvd.thptty.model.TYStudent updateImpl(
		org.tvd.thptty.model.TYStudent tyStudent, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentException} if it could not be found.
	*
	* @param studentId the primary key of the t y student to find
	* @return the t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByPrimaryKey(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the t y student to find
	* @return the t y student, or <code>null</code> if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent fetchByPrimaryKey(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByEmail(long companyId,
		long groupId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent fetchByEmail(long companyId,
		long groupId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent fetchByEmail(long companyId,
		long groupId, java.lang.String emailAddress, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findBySchool_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findBySchool_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findBySchool_PrevAndNext(
		long studentId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_FirstName_First(
		long companyId, long groupId, java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_FirstName_Last(
		long companyId, long groupId, java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByG_FirstName_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_LastName_First(
		long companyId, long groupId, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_LastName_Last(
		long companyId, long groupId, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByG_LastName_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_F_L_Name_First(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByG_F_L_Name_Last(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByG_F_L_Name_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup1_First(long companyId,
		long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup1_Last(long companyId,
		long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByGroup1_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup2_First(long companyId,
		long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup2_Last(long companyId,
		long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByGroup2_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup3_First(long companyId,
		long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent findByGroup3_Last(long companyId,
		long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param studentId the primary key of the current t y student
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent[] findByGroup3_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y students.
	*
	* @return the t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmail(long companyId, long groupId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup1(long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup2(long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup3(long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and emailAddress = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmail(long companyId, long groupId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup1(long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroup1(long companyId, long groupId,
		int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup2(long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroup2(long companyId, long groupId,
		int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup3(long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroup3(long companyId, long groupId,
		int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y students.
	*
	* @return the number of t y students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}