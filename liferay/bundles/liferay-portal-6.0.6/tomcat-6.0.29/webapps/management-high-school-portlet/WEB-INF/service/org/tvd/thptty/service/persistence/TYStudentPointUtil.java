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

import org.tvd.thptty.model.TYStudentPoint;

import java.util.List;

/**
 * The persistence utility for the t y student point service. This utility wraps {@link TYStudentPointPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYStudentPointPersistence
 * @see TYStudentPointPersistenceImpl
 * @generated
 */
public class TYStudentPointUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYStudentPoint tyStudentPoint) {
		getPersistence().clearCache(tyStudentPoint);
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
	public static List<TYStudentPoint> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYStudentPoint> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYStudentPoint> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYStudentPoint remove(TYStudentPoint tyStudentPoint)
		throws SystemException {
		return getPersistence().remove(tyStudentPoint);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYStudentPoint update(TYStudentPoint tyStudentPoint,
		boolean merge) throws SystemException {
		return getPersistence().update(tyStudentPoint, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYStudentPoint update(TYStudentPoint tyStudentPoint,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyStudentPoint, merge, serviceContext);
	}

	/**
	* Caches the t y student point in the entity cache if it is enabled.
	*
	* @param tyStudentPoint the t y student point to cache
	*/
	public static void cacheResult(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint) {
		getPersistence().cacheResult(tyStudentPoint);
	}

	/**
	* Caches the t y student points in the entity cache if it is enabled.
	*
	* @param tyStudentPoints the t y student points to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudentPoint> tyStudentPoints) {
		getPersistence().cacheResult(tyStudentPoints);
	}

	/**
	* Creates a new t y student point with the primary key. Does not add the t y student point to the database.
	*
	* @param tyStudentPointPK the primary key for the new t y student point
	* @return the new t y student point
	*/
	public static org.tvd.thptty.model.TYStudentPoint create(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK) {
		return getPersistence().create(tyStudentPointPK);
	}

	/**
	* Removes the t y student point with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPointPK the primary key of the t y student point to remove
	* @return the t y student point that was removed
	* @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPoint remove(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence().remove(tyStudentPointPK);
	}

	public static org.tvd.thptty.model.TYStudentPoint updateImpl(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyStudentPoint, merge);
	}

	/**
	* Finds the t y student point with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentPointException} if it could not be found.
	*
	* @param tyStudentPointPK the primary key of the t y student point to find
	* @return the t y student point
	* @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPoint findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence().findByPrimaryKey(tyStudentPointPK);
	}

	/**
	* Finds the t y student point with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyStudentPointPK the primary key of the t y student point to find
	* @return the t y student point, or <code>null</code> if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPoint fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tyStudentPointPK);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence()
				   .findByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor, retrieveFromCache);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor, start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor, start, end, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PF_First(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_First(courses, semester, studentId,
			subjectId, pointType, pointFactor, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint findByC_S_S_S_PT_PF_Last(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_Last(courses, semester, studentId,
			subjectId, pointType, pointFactor, orderByComparator);
	}

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
	public static org.tvd.thptty.model.TYStudentPoint[] findByC_S_S_S_PT_PF_PrevAndNext(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK,
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_PrevAndNext(tyStudentPointPK, courses,
			semester, studentId, subjectId, pointType, pointFactor,
			orderByComparator);
	}

	/**
	* Finds all the t y student points.
	*
	* @return the t y student points
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static void removeByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointException {
		getPersistence()
			.removeByC_S_S_S_PT_PI_PF(courses, semester, studentId, subjectId,
			pointType, pointIndex, pointFactor);
	}

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
	public static void removeByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByC_S_S_S_PT_PF(courses, semester, studentId, subjectId,
			pointType, pointFactor);
	}

	/**
	* Removes all the t y student points from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

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
	public static int countByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor);
	}

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
	public static int countByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor);
	}

	/**
	* Counts all the t y student points.
	*
	* @return the number of t y student points
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYStudentPointPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYStudentPointPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYStudentPointPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYStudentPointPersistence persistence) {
		_persistence = persistence;
	}

	private static TYStudentPointPersistence _persistence;
}