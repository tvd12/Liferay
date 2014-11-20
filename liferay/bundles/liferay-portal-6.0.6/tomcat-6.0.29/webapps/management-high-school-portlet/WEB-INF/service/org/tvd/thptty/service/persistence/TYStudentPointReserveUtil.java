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

import org.tvd.thptty.model.TYStudentPointReserve;

import java.util.List;

/**
 * The persistence utility for the t y student point reserve service. This utility wraps {@link TYStudentPointReservePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYStudentPointReservePersistence
 * @see TYStudentPointReservePersistenceImpl
 * @generated
 */
public class TYStudentPointReserveUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYStudentPointReserve tyStudentPointReserve) {
		getPersistence().clearCache(tyStudentPointReserve);
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
	public static List<TYStudentPointReserve> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYStudentPointReserve> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYStudentPointReserve> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYStudentPointReserve remove(
		TYStudentPointReserve tyStudentPointReserve) throws SystemException {
		return getPersistence().remove(tyStudentPointReserve);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYStudentPointReserve update(
		TYStudentPointReserve tyStudentPointReserve, boolean merge)
		throws SystemException {
		return getPersistence().update(tyStudentPointReserve, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYStudentPointReserve update(
		TYStudentPointReserve tyStudentPointReserve, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tyStudentPointReserve, merge, serviceContext);
	}

	/**
	* Caches the t y student point reserve in the entity cache if it is enabled.
	*
	* @param tyStudentPointReserve the t y student point reserve to cache
	*/
	public static void cacheResult(
		org.tvd.thptty.model.TYStudentPointReserve tyStudentPointReserve) {
		getPersistence().cacheResult(tyStudentPointReserve);
	}

	/**
	* Caches the t y student point reserves in the entity cache if it is enabled.
	*
	* @param tyStudentPointReserves the t y student point reserves to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYStudentPointReserve> tyStudentPointReserves) {
		getPersistence().cacheResult(tyStudentPointReserves);
	}

	/**
	* Creates a new t y student point reserve with the primary key. Does not add the t y student point reserve to the database.
	*
	* @param tyStudentPointReservePK the primary key for the new t y student point reserve
	* @return the new t y student point reserve
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve create(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK tyStudentPointReservePK) {
		return getPersistence().create(tyStudentPointReservePK);
	}

	/**
	* Removes the t y student point reserve with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPointReservePK the primary key of the t y student point reserve to remove
	* @return the t y student point reserve that was removed
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve remove(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK tyStudentPointReservePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence().remove(tyStudentPointReservePK);
	}

	public static org.tvd.thptty.model.TYStudentPointReserve updateImpl(
		org.tvd.thptty.model.TYStudentPointReserve tyStudentPointReserve,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyStudentPointReserve, merge);
	}

	/**
	* Finds the t y student point reserve with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentPointReserveException} if it could not be found.
	*
	* @param tyStudentPointReservePK the primary key of the t y student point reserve to find
	* @return the t y student point reserve
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK tyStudentPointReservePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence().findByPrimaryKey(tyStudentPointReservePK);
	}

	/**
	* Finds the t y student point reserve with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyStudentPointReservePK the primary key of the t y student point reserve to find
	* @return the t y student point reserve, or <code>null</code> if a t y student point reserve with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK tyStudentPointReservePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tyStudentPointReservePK);
	}

	/**
	* Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentPointReserveException} if it could not be found.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point reserve
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve findByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence()
				   .findByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor);
	}

	/**
	* Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point reserve, or <code>null</code> if a matching t y student point reserve could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor);
	}

	/**
	* Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point reserve, or <code>null</code> if a matching t y student point reserve could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve fetchByC_S_S_S_PT_PI_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointIndex, int pointFactor,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId,
			subjectId, pointType, pointIndex, pointFactor, retrieveFromCache);
	}

	/**
	* Finds all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @return the matching t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor);
	}

	/**
	* Finds a range of all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	* @param start the lower bound of the range of t y student point reserves to return
	* @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	* @return the range of matching t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor, start, end);
	}

	/**
	* Finds an ordered range of all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	* @param start the lower bound of the range of t y student point reserves to return
	* @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findByC_S_S_S_PT_PF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF(courses, semester, studentId,
			subjectId, pointType, pointFactor, start, end, orderByComparator);
	}

	/**
	* Finds the first t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	* @return the first matching t y student point reserve
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve findByC_S_S_S_PT_PF_First(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_First(courses, semester, studentId,
			subjectId, pointType, pointFactor, orderByComparator);
	}

	/**
	* Finds the last t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	* @return the last matching t y student point reserve
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve findByC_S_S_S_PT_PF_Last(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_Last(courses, semester, studentId,
			subjectId, pointType, pointFactor, orderByComparator);
	}

	/**
	* Finds the t y student point reserves before and after the current t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tyStudentPointReservePK the primary key of the current t y student point reserve
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y student point reserve
	* @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentPointReserve[] findByC_S_S_S_PT_PF_PrevAndNext(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK tyStudentPointReservePK,
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentPointReserveException {
		return getPersistence()
				   .findByC_S_S_S_PT_PF_PrevAndNext(tyStudentPointReservePK,
			courses, semester, studentId, subjectId, pointType, pointFactor,
			orderByComparator);
	}

	/**
	* Finds all the t y student point reserves.
	*
	* @return the t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the t y student point reserves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student point reserves to return
	* @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	* @return the range of t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the t y student point reserves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student point reserves to return
	* @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentPointReserve> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; from the database.
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
			org.tvd.thptty.NoSuchStudentPointReserveException {
		getPersistence()
			.removeByC_S_S_S_PT_PI_PF(courses, semester, studentId, subjectId,
			pointType, pointIndex, pointFactor);
	}

	/**
	* Removes all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63; from the database.
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
	* Removes all the t y student point reserves from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointIndex the point index to search with
	* @param pointFactor the point factor to search with
	* @return the number of matching t y student point reserves
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
	* Counts all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	*
	* @param courses the courses to search with
	* @param semester the semester to search with
	* @param studentId the student id to search with
	* @param subjectId the subject id to search with
	* @param pointType the point type to search with
	* @param pointFactor the point factor to search with
	* @return the number of matching t y student point reserves
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
	* Counts all the t y student point reserves.
	*
	* @return the number of t y student point reserves
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYStudentPointReservePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYStudentPointReservePersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYStudentPointReservePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYStudentPointReservePersistence persistence) {
		_persistence = persistence;
	}

	private static TYStudentPointReservePersistence _persistence;
}