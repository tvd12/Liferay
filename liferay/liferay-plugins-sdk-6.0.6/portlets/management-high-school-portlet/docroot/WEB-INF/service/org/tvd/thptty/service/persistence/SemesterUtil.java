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

import org.tvd.thptty.model.Semester;

import java.util.List;

/**
 * The persistence utility for the semester service. This utility wraps {@link SemesterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see SemesterPersistence
 * @see SemesterPersistenceImpl
 * @generated
 */
public class SemesterUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Semester semester) {
		getPersistence().clearCache(semester);
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
	public static List<Semester> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Semester> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Semester> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Semester remove(Semester semester) throws SystemException {
		return getPersistence().remove(semester);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Semester update(Semester semester, boolean merge)
		throws SystemException {
		return getPersistence().update(semester, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Semester update(Semester semester, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(semester, merge, serviceContext);
	}

	/**
	* Caches the semester in the entity cache if it is enabled.
	*
	* @param semester the semester to cache
	*/
	public static void cacheResult(org.tvd.thptty.model.Semester semester) {
		getPersistence().cacheResult(semester);
	}

	/**
	* Caches the semesters in the entity cache if it is enabled.
	*
	* @param semesters the semesters to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.Semester> semesters) {
		getPersistence().cacheResult(semesters);
	}

	/**
	* Creates a new semester with the primary key. Does not add the semester to the database.
	*
	* @param semesterPK the primary key for the new semester
	* @return the new semester
	*/
	public static org.tvd.thptty.model.Semester create(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK) {
		return getPersistence().create(semesterPK);
	}

	/**
	* Removes the semester with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param semesterPK the primary key of the semester to remove
	* @return the semester that was removed
	* @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester remove(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence().remove(semesterPK);
	}

	public static org.tvd.thptty.model.Semester updateImpl(
		org.tvd.thptty.model.Semester semester, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(semester, merge);
	}

	/**
	* Finds the semester with the primary key or throws a {@link org.tvd.thptty.NoSuchSemesterException} if it could not be found.
	*
	* @param semesterPK the primary key of the semester to find
	* @return the semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester findByPrimaryKey(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence().findByPrimaryKey(semesterPK);
	}

	/**
	* Finds the semester with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param semesterPK the primary key of the semester to find
	* @return the semester, or <code>null</code> if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(semesterPK);
	}

	/**
	* Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or throws a {@link org.tvd.thptty.NoSuchSemesterException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester findByC_G_Status(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence().findByC_G_Status(companyId, groupId, status);
	}

	/**
	* Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching semester, or <code>null</code> if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester fetchByC_G_Status(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G_Status(companyId, groupId, status);
	}

	/**
	* Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching semester, or <code>null</code> if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester fetchByC_G_Status(
		long companyId, long groupId, int status, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Status(companyId, groupId, status,
			retrieveFromCache);
	}

	/**
	* Finds all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Finds a range of all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of semesters to return
	* @param end the upper bound of the range of semesters to return (not inclusive)
	* @return the range of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Finds an ordered range of all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of semesters to return
	* @param end the upper bound of the range of semesters to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first semester in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the last semester in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the semesters before and after the current semester in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param semesterPK the primary key of the current semester
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester[] findByC_G_PrevAndNext(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getPersistence()
				   .findByC_G_PrevAndNext(semesterPK, companyId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the semesters.
	*
	* @return the semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the semesters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of semesters to return
	* @param end the upper bound of the range of semesters to return (not inclusive)
	* @return the range of semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the semesters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of semesters to return
	* @param end the upper bound of the range of semesters to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of semesters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.Semester> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the semester where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_Status(long companyId, long groupId,
		int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		getPersistence().removeByC_G_Status(companyId, groupId, status);
	}

	/**
	* Removes all the semesters where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Removes all the semesters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the semesters where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_Status(long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_Status(companyId, groupId, status);
	}

	/**
	* Counts all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Counts all the semesters.
	*
	* @return the number of semesters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SemesterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SemesterPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					SemesterPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(SemesterPersistence persistence) {
		_persistence = persistence;
	}

	private static SemesterPersistence _persistence;
}