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

import org.tvd.thptty.model.TYClassStudent;

/**
 * The persistence interface for the t y class student service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYClassStudentUtil} to access the t y class student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassStudentPersistenceImpl
 * @see TYClassStudentUtil
 * @generated
 */
public interface TYClassStudentPersistence extends BasePersistence<TYClassStudent> {
	/**
	* Caches the t y class student in the entity cache if it is enabled.
	*
	* @param tyClassStudent the t y class student to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYClassStudent tyClassStudent);

	/**
	* Caches the t y class students in the entity cache if it is enabled.
	*
	* @param tyClassStudents the t y class students to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYClassStudent> tyClassStudents);

	/**
	* Creates a new t y class student with the primary key. Does not add the t y class student to the database.
	*
	* @param tyClassStudentPK the primary key for the new t y class student
	* @return the new t y class student
	*/
	public org.tvd.thptty.model.TYClassStudent create(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK);

	/**
	* Removes the t y class student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudentPK the primary key of the t y class student to remove
	* @return the t y class student that was removed
	* @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent remove(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	public org.tvd.thptty.model.TYClassStudent updateImpl(
		org.tvd.thptty.model.TYClassStudent tyClassStudent, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class student with the primary key or throws a {@link org.tvd.thptty.NoSuchClassStudentException} if it could not be found.
	*
	* @param tyClassStudentPK the primary key of the t y class student to find
	* @return the t y class student
	* @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Finds the t y class student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyClassStudentPK the primary key of the t y class student to find
	* @return the t y class student, or <code>null</code> if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y class students where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the matching t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findByC_C(
		int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y class students where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param start the lower bound of the range of t y class students to return
	* @param end the upper bound of the range of t y class students to return (not inclusive)
	* @return the range of matching t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findByC_C(
		int courses, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y class students where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param start the lower bound of the range of t y class students to return
	* @param end the upper bound of the range of t y class students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findByC_C(
		int courses, long classId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y class student in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y class student
	* @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent findByC_C_First(int courses,
		long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Finds the last t y class student in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y class student
	* @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent findByC_C_Last(int courses,
		long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Finds the t y class students before and after the current t y class student in the ordered set where courses = &#63; and classId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tyClassStudentPK the primary key of the current t y class student
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y class student
	* @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent[] findByC_C_PrevAndNext(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK,
		int courses, long classId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Finds the t y class student where courses = &#63; and studentId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassStudentException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param studentId the student id to search with
	* @return the matching t y class student
	* @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent findByC_S(int courses,
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Finds the t y class student where courses = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param studentId the student id to search with
	* @return the matching t y class student, or <code>null</code> if a matching t y class student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent fetchByC_S(int courses,
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class student where courses = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param studentId the student id to search with
	* @return the matching t y class student, or <code>null</code> if a matching t y class student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassStudent fetchByC_S(int courses,
		long studentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y class students.
	*
	* @return the t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y class students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class students to return
	* @param end the upper bound of the range of t y class students to return (not inclusive)
	* @return the range of t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y class students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class students to return
	* @param end the upper bound of the range of t y class students to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y class students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClassStudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y class students where courses = &#63; and classId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y class student where courses = &#63; and studentId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param studentId the student id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S(int courses, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassStudentException;

	/**
	* Removes all the t y class students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class students where courses = &#63; and classId = &#63;.
	*
	* @param courses the courses to search with
	* @param classId the class id to search with
	* @return the number of matching t y class students
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class students where courses = &#63; and studentId = &#63;.
	*
	* @param courses the courses to search with
	* @param studentId the student id to search with
	* @return the number of matching t y class students
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S(int courses, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y class students.
	*
	* @return the number of t y class students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}