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

import org.tvd.thptty.model.TYStudent;

import java.util.List;

/**
 * The persistence utility for the t y student service. This utility wraps {@link TYStudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYStudentPersistence
 * @see TYStudentPersistenceImpl
 * @generated
 */
public class TYStudentUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYStudent tyStudent) {
		getPersistence().clearCache(tyStudent);
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
	public static List<TYStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYStudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYStudent remove(TYStudent tyStudent)
		throws SystemException {
		return getPersistence().remove(tyStudent);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYStudent update(TYStudent tyStudent, boolean merge)
		throws SystemException {
		return getPersistence().update(tyStudent, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYStudent update(TYStudent tyStudent, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyStudent, merge, serviceContext);
	}

	/**
	* Caches the t y student in the entity cache if it is enabled.
	*
	* @param tyStudent the t y student to cache
	*/
	public static void cacheResult(org.tvd.thptty.model.TYStudent tyStudent) {
		getPersistence().cacheResult(tyStudent);
	}

	/**
	* Caches the t y students in the entity cache if it is enabled.
	*
	* @param tyStudents the t y students to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudent> tyStudents) {
		getPersistence().cacheResult(tyStudents);
	}

	/**
	* Creates a new t y student with the primary key. Does not add the t y student to the database.
	*
	* @param studentId the primary key for the new t y student
	* @return the new t y student
	*/
	public static org.tvd.thptty.model.TYStudent create(long studentId) {
		return getPersistence().create(studentId);
	}

	/**
	* Removes the t y student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the t y student to remove
	* @return the t y student that was removed
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudent remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence().remove(studentId);
	}

	public static org.tvd.thptty.model.TYStudent updateImpl(
		org.tvd.thptty.model.TYStudent tyStudent, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyStudent, merge);
	}

	/**
	* Finds the t y student with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentException} if it could not be found.
	*
	* @param studentId the primary key of the t y student to find
	* @return the t y student
	* @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudent findByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence().findByPrimaryKey(studentId);
	}

	/**
	* Finds the t y student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the t y student to find
	* @return the t y student, or <code>null</code> if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudent fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentId);
	}

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
	public static org.tvd.thptty.model.TYStudent findByEmail(long companyId,
		long groupId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence().findByEmail(companyId, groupId, emailAddress);
	}

	/**
	* Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudent fetchByEmail(long companyId,
		long groupId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmail(companyId, groupId, emailAddress);
	}

	/**
	* Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudent fetchByEmail(long companyId,
		long groupId, java.lang.String emailAddress, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmail(companyId, groupId, emailAddress,
			retrieveFromCache);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySchool(companyId, groupId);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySchool(companyId, groupId, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findBySchool(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySchool(companyId, groupId, start, end,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findBySchool_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findBySchool_First(companyId, groupId, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findBySchool_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findBySchool_Last(companyId, groupId, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findBySchool_PrevAndNext(
		long studentId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findBySchool_PrevAndNext(studentId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindBySchool(companyId, groupId);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindBySchool(companyId, groupId, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindBySchool(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindBySchool(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_FirstName(companyId, groupId, studentFirstName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_FirstName(companyId, groupId, studentFirstName,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_FirstName(companyId, groupId, studentFirstName,
			start, end, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_FirstName_First(
		long companyId, long groupId, java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_FirstName_First(companyId, groupId,
			studentFirstName, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_FirstName_Last(
		long companyId, long groupId, java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_FirstName_Last(companyId, groupId,
			studentFirstName, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByG_FirstName_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentFirstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_FirstName_PrevAndNext(studentId, companyId,
			groupId, studentFirstName, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_FirstName(companyId, groupId, studentFirstName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_FirstName(companyId, groupId,
			studentFirstName, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_FirstName(
		long companyId, long groupId, java.lang.String studentFirstName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_FirstName(companyId, groupId,
			studentFirstName, start, end, orderByComparator);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LastName(companyId, groupId, studentLastName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LastName(companyId, groupId, studentLastName,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LastName(companyId, groupId, studentLastName,
			start, end, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_LastName_First(
		long companyId, long groupId, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_LastName_First(companyId, groupId, studentLastName,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_LastName_Last(
		long companyId, long groupId, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_LastName_Last(companyId, groupId, studentLastName,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByG_LastName_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_LastName_PrevAndNext(studentId, companyId, groupId,
			studentLastName, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_LastName(companyId, groupId, studentLastName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_LastName(companyId, groupId, studentLastName,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_LastName(
		long companyId, long groupId, java.lang.String studentLastName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_LastName(companyId, groupId, studentLastName,
			start, end, orderByComparator);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, start, end, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_F_L_Name_First(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_F_L_Name_First(companyId, groupId,
			studentFirstName, studentLastName, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByG_F_L_Name_Last(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_F_L_Name_Last(companyId, groupId, studentFirstName,
			studentLastName, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByG_F_L_Name_PrevAndNext(
		long studentId, long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByG_F_L_Name_PrevAndNext(studentId, companyId, groupId,
			studentFirstName, studentLastName, orderByComparator);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_F_L_Name(companyId, groupId,
			studentFirstName, studentLastName);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_F_L_Name(companyId, groupId,
			studentFirstName, studentLastName, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByG_F_L_Name(
		long companyId, long groupId, java.lang.String studentFirstName,
		java.lang.String studentLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_F_L_Name(companyId, groupId,
			studentFirstName, studentLastName, start, end, orderByComparator);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup1(companyId, groupId, studentGroup1);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup1(companyId, groupId, studentGroup1, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup1(companyId, groupId, studentGroup1, start, end,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup1_First(
		long companyId, long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup1_First(companyId, groupId, studentGroup1,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup1_Last(
		long companyId, long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup1_Last(companyId, groupId, studentGroup1,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByGroup1_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup1_PrevAndNext(studentId, companyId, groupId,
			studentGroup1, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup1(companyId, groupId, studentGroup1);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup1(companyId, groupId, studentGroup1,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup1(
		long companyId, long groupId, int studentGroup1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup1(companyId, groupId, studentGroup1,
			start, end, orderByComparator);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup2(companyId, groupId, studentGroup2);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup2(companyId, groupId, studentGroup2, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup2(companyId, groupId, studentGroup2, start, end,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup2_First(
		long companyId, long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup2_First(companyId, groupId, studentGroup2,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup2_Last(
		long companyId, long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup2_Last(companyId, groupId, studentGroup2,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByGroup2_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup2_PrevAndNext(studentId, companyId, groupId,
			studentGroup2, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup2(companyId, groupId, studentGroup2);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup2(companyId, groupId, studentGroup2,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup2(
		long companyId, long groupId, int studentGroup2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup2(companyId, groupId, studentGroup2,
			start, end, orderByComparator);
	}

	/**
	* Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup3(companyId, groupId, studentGroup3);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup3(companyId, groupId, studentGroup3, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup3(companyId, groupId, studentGroup3, start, end,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup3_First(
		long companyId, long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup3_First(companyId, groupId, studentGroup3,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent findByGroup3_Last(
		long companyId, long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup3_Last(companyId, groupId, studentGroup3,
			orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudent[] findByGroup3_PrevAndNext(
		long studentId, long companyId, long groupId, int studentGroup3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return getPersistence()
				   .findByGroup3_PrevAndNext(studentId, companyId, groupId,
			studentGroup3, orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup3(companyId, groupId, studentGroup3);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup3(companyId, groupId, studentGroup3,
			start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> filterFindByGroup3(
		long companyId, long groupId, int studentGroup3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroup3(companyId, groupId, studentGroup3,
			start, end, orderByComparator);
	}

	/**
	* Finds all the t y students.
	*
	* @return the t y students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmail(long companyId, long groupId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		getPersistence().removeByEmail(companyId, groupId, emailAddress);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySchool(companyId, groupId);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_FirstName(companyId, groupId, studentFirstName);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_LastName(companyId, groupId, studentLastName);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @param studentLastName the student last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup1(long companyId, long groupId,
		int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup1(companyId, groupId, studentGroup1);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup2(long companyId, long groupId,
		int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup2(companyId, groupId, studentGroup2);
	}

	/**
	* Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup3(long companyId, long groupId,
		int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup3(companyId, groupId, studentGroup3);
	}

	/**
	* Removes all the t y students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and emailAddress = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param emailAddress the email address to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmail(long companyId, long groupId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmail(companyId, groupId, emailAddress);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySchool(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountBySchool(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountBySchool(companyId, groupId);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_FirstName(companyId, groupId, studentFirstName);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentFirstName the student first name to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_FirstName(long companyId, long groupId,
		java.lang.String studentFirstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_FirstName(companyId, groupId,
			studentFirstName);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_LastName(companyId, groupId, studentLastName);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentLastName the student last name to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_LastName(long companyId, long groupId,
		java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_LastName(companyId, groupId, studentLastName);
	}

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
	public static int countByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName);
	}

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
	public static int filterCountByG_F_L_Name(long companyId, long groupId,
		java.lang.String studentFirstName, java.lang.String studentLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_F_L_Name(companyId, groupId,
			studentFirstName, studentLastName);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup1(long companyId, long groupId,
		int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup1(companyId, groupId, studentGroup1);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup1 the student group1 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroup1(long companyId, long groupId,
		int studentGroup1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByGroup1(companyId, groupId, studentGroup1);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup2(long companyId, long groupId,
		int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup2(companyId, groupId, studentGroup2);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup2 the student group2 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroup2(long companyId, long groupId,
		int studentGroup2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByGroup2(companyId, groupId, studentGroup2);
	}

	/**
	* Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the number of matching t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup3(long companyId, long groupId,
		int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup3(companyId, groupId, studentGroup3);
	}

	/**
	* Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param studentGroup3 the student group3 to search with
	* @return the number of matching t y students that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroup3(long companyId, long groupId,
		int studentGroup3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByGroup3(companyId, groupId, studentGroup3);
	}

	/**
	* Counts all the t y students.
	*
	* @return the number of t y students
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYStudentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYStudentPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYStudentPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYStudentPersistence persistence) {
		_persistence = persistence;
	}

	private static TYStudentPersistence _persistence;
}