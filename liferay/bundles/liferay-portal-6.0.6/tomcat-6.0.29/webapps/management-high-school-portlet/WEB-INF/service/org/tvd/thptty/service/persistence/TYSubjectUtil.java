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

import org.tvd.thptty.model.TYSubject;

import java.util.List;

/**
 * The persistence utility for the t y subject service. This utility wraps {@link TYSubjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYSubjectPersistence
 * @see TYSubjectPersistenceImpl
 * @generated
 */
public class TYSubjectUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYSubject tySubject) {
		getPersistence().clearCache(tySubject);
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
	public static List<TYSubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYSubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYSubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYSubject remove(TYSubject tySubject)
		throws SystemException {
		return getPersistence().remove(tySubject);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYSubject update(TYSubject tySubject, boolean merge)
		throws SystemException {
		return getPersistence().update(tySubject, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYSubject update(TYSubject tySubject, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tySubject, merge, serviceContext);
	}

	/**
	* Caches the t y subject in the entity cache if it is enabled.
	*
	* @param tySubject the t y subject to cache
	*/
	public static void cacheResult(org.tvd.thptty.model.TYSubject tySubject) {
		getPersistence().cacheResult(tySubject);
	}

	/**
	* Caches the t y subjects in the entity cache if it is enabled.
	*
	* @param tySubjects the t y subjects to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYSubject> tySubjects) {
		getPersistence().cacheResult(tySubjects);
	}

	/**
	* Creates a new t y subject with the primary key. Does not add the t y subject to the database.
	*
	* @param subjectId the primary key for the new t y subject
	* @return the new t y subject
	*/
	public static org.tvd.thptty.model.TYSubject create(long subjectId) {
		return getPersistence().create(subjectId);
	}

	/**
	* Removes the t y subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectId the primary key of the t y subject to remove
	* @return the t y subject that was removed
	* @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject remove(long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence().remove(subjectId);
	}

	public static org.tvd.thptty.model.TYSubject updateImpl(
		org.tvd.thptty.model.TYSubject tySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tySubject, merge);
	}

	/**
	* Finds the t y subject with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	*
	* @param subjectId the primary key of the t y subject to find
	* @return the t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject findByPrimaryKey(
		long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence().findByPrimaryKey(subjectId);
	}

	/**
	* Finds the t y subject with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subjectId the primary key of the t y subject to find
	* @return the t y subject, or <code>null</code> if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject fetchByPrimaryKey(
		long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(subjectId);
	}

	/**
	* Finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Finds a range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @return the range of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Finds an ordered range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the last t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Finds the t y subjects before and after the current t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param subjectId the primary key of the current t y subject
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject[] findByC_G_PrevAndNext(
		long subjectId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence()
				   .findByC_G_PrevAndNext(subjectId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByC_G(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @return the range of matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByC_G(companyId, groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByC_G(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the matching t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject findByCode(long companyId,
		long groupId, java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence().findByCode(companyId, groupId, subjectCode);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject fetchByCode(long companyId,
		long groupId, java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(companyId, groupId, subjectCode);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject fetchByCode(long companyId,
		long groupId, java.lang.String subjectCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCode(companyId, groupId, subjectCode,
			retrieveFromCache);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the matching t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject findByName(long companyId,
		long groupId, java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return getPersistence().findByName(companyId, groupId, subjectName);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject fetchByName(long companyId,
		long groupId, java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName(companyId, groupId, subjectName);
	}

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubject fetchByName(long companyId,
		long groupId, java.lang.String subjectName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByName(companyId, groupId, subjectName,
			retrieveFromCache);
	}

	/**
	* Finds all the t y subjects.
	*
	* @return the t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the t y subjects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @return the range of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the t y subjects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t y subjects where companyId = &#63; and groupId = &#63; from the database.
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
	* Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCode(long companyId, long groupId,
		java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		getPersistence().removeByCode(companyId, groupId, subjectCode);
	}

	/**
	* Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(long companyId, long groupId,
		java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		getPersistence().removeByName(companyId, groupId, subjectName);
	}

	/**
	* Removes all the t y subjects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByC_G(companyId, groupId);
	}

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectCode = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(long companyId, long groupId,
		java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(companyId, groupId, subjectCode);
	}

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(long companyId, long groupId,
		java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(companyId, groupId, subjectName);
	}

	/**
	* Counts all the t y subjects.
	*
	* @return the number of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYSubjectPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYSubjectPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYSubjectPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYSubjectPersistence persistence) {
		_persistence = persistence;
	}

	private static TYSubjectPersistence _persistence;
}