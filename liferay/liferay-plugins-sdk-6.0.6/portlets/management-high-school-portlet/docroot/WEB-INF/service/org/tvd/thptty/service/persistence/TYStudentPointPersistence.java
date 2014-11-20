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

import org.tvd.thptty.model.TYStudentPoint;

/**
 * The persistence interface for the t y student point service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYStudentPointUtil} to access the t y student point persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPointPersistenceImpl
 * @see TYStudentPointUtil
 * @generated
 */
public interface TYStudentPointPersistence extends BasePersistence<TYStudentPoint> {
	/**
	* Caches the t y student point in the entity cache if it is enabled.
	*
	* @param tyStudentPoint the t y student point to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYStudentPoint tyStudentPoint);

	/**
	* Caches the t y student points in the entity cache if it is enabled.
	*
	* @param tyStudentPoints the t y student points to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudentPoint> tyStudentPoints);

	/**
	* Creates a new t y student point with the primary key. Does not add the t y student point to the database.
	*
	* @param tyStudentPointPK the primary key for the new t y student point
	* @return the new t y student point
	*/
	public org.tvd.thptty.model.TYStudentPoint create(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK);

	/**
	* Removes the t y student point with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPointPK the primary key of the t y student point to remove
	* @return the t y student point that was removed
	* @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint remove(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	public org.tvd.thptty.model.TYStudentPoint updateImpl(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student point with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentPointException} if it could not be found.
	*
	* @param tyStudentPointPK the primary key of the t y student point to find
	* @return the t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Finds the t y student point with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyStudentPointPK the primary key of the t y student point to find
	* @return the t y student point, or <code>null</code> if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentPointException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point, or <code>null</code> if a matching t y student point could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point, or <code>null</code> if a matching t y student point could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param start the lower bound of the range of t y student points to return
	* @param end the upper bound of the range of t y student points to return (not inclusive)
	* @return the range of matching t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param start the lower bound of the range of t y student points to return
	* @param end the upper bound of the range of t y student points to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PF_First(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Finds the last t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PF_Last(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Finds the t y student points before and after the current t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tyStudentPointPK the primary key of the current t y student point
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint[] findByC_S_S_S_PT_PF_PrevAndNext(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK,
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Finds all the t y student points.
	*
	* @return the t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y student points.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student points to return
	* @param end the upper bound of the range of t y student points to return (not inclusive)
	* @return the range of t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y student points.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student points to return
	* @param end the upper bound of the range of t y student points to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y student points
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException;

	/**
	* Removes all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y student points from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the number of matching t y student points
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @return the number of matching t y student points
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S_S_S_PT_PF(int courses, int semester, long studentId,
		long subjectId, int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y student points.
	*
	* @return the number of t y student points
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}