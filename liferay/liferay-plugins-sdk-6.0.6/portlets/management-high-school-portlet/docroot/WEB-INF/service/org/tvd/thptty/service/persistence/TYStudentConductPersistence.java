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

import org.tvd.thptty.model.TYStudentConduct;

/**
 * The persistence interface for the t y student conduct service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYStudentConductUtil} to access the t y student conduct persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentConductPersistenceImpl
 * @see TYStudentConductUtil
 * @generated
 */
public interface TYStudentConductPersistence extends BasePersistence<TYStudentConduct> {
	/**
	* Caches the t y student conduct in the entity cache if it is enabled.
	*
	* @param tyStudentConduct the t y student conduct to cache
	*/
	public void cacheResult(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct);

	/**
	* Caches the t y student conducts in the entity cache if it is enabled.
	*
	* @param tyStudentConducts the t y student conducts to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudentConduct> tyStudentConducts);

	/**
	* Creates a new t y student conduct with the primary key. Does not add the t y student conduct to the database.
	*
	* @param tyStudentConductPK the primary key for the new t y student conduct
	* @return the new t y student conduct
	*/
	public org.tvd.thptty.model.TYStudentConduct create(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK);

	/**
	* Removes the t y student conduct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to remove
	* @return the t y student conduct that was removed
	* @throws org.tvd.thptty.NoSuchStudentConductException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct remove(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException;

	public org.tvd.thptty.model.TYStudentConduct updateImpl(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student conduct with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentConductException} if it could not be found.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to find
	* @return the t y student conduct
	* @throws org.tvd.thptty.NoSuchStudentConductException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException;

	/**
	* Finds the t y student conduct with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to find
	* @return the t y student conduct, or <code>null</code> if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentConductException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @return the matching t y student conduct
	* @throws org.tvd.thptty.NoSuchStudentConductException if a matching t y student conduct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct findByC_S_S(int courses,
		int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException;

	/**
	* Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @return the matching t y student conduct, or <code>null</code> if a matching t y student conduct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct fetchByC_S_S(int courses,
		int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @return the matching t y student conduct, or <code>null</code> if a matching t y student conduct could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct fetchByC_S_S(int courses,
		int semester, long studentId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y student conducts.
	*
	* @return the t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentConduct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y student conducts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student conducts to return
	* @param end the upper bound of the range of t y student conducts to return (not inclusive)
	* @return the range of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentConduct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y student conducts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student conducts to return
	* @param end the upper bound of the range of t y student conducts to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentConduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S_S(int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException;

	/**
	* Removes all the t y student conducts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y student conducts where courses = &#63; and semester = &#63; and studentId = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @return the number of matching t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S_S(int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y student conducts.
	*
	* @return the number of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}