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

import org.tvd.thptty.model.TYSubject;

/**
 * The persistence interface for the t y subject service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYSubjectUtil} to access the t y subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectPersistenceImpl
 * @see TYSubjectUtil
 * @generated
 */
public interface TYSubjectPersistence extends BasePersistence<TYSubject> {
	/**
	* Caches the t y subject in the entity cache if it is enabled.
	*
	* @param tySubject the t y subject to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYSubject tySubject);

	/**
	* Caches the t y subjects in the entity cache if it is enabled.
	*
	* @param tySubjects the t y subjects to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYSubject> tySubjects);

	/**
	* Creates a new t y subject with the primary key. Does not add the t y subject to the database.
	*
	* @param subjectId the primary key for the new t y subject
	* @return the new t y subject
	*/
	public org.tvd.thptty.model.TYSubject create(long subjectId);

	/**
	* Removes the t y subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectId the primary key of the t y subject to remove
	* @return the t y subject that was removed
	* @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject remove(long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	public org.tvd.thptty.model.TYSubject updateImpl(
		org.tvd.thptty.model.TYSubject tySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	*
	* @param subjectId the primary key of the t y subject to find
	* @return the t y subject
	* @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject findByPrimaryKey(long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Finds the t y subject with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subjectId the primary key of the t y subject to find
	* @return the t y subject, or <code>null</code> if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject fetchByPrimaryKey(long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYSubject findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

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
	public org.tvd.thptty.model.TYSubject findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

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
	public org.tvd.thptty.model.TYSubject[] findByC_G_PrevAndNext(
		long subjectId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Filters by the user's permissions and finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> filterFindByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYSubject findByCode(long companyId,
		long groupId, java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject fetchByCode(long companyId,
		long groupId, java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject fetchByCode(long companyId,
		long groupId, java.lang.String subjectCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.TYSubject findByName(long companyId,
		long groupId, java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject fetchByName(long companyId,
		long groupId, java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject fetchByName(long companyId,
		long groupId, java.lang.String subjectName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y subjects.
	*
	* @return the t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.TYSubject> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y subjects where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCode(long companyId, long groupId,
		java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByName(long companyId, long groupId,
		java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException;

	/**
	* Removes all the t y subjects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y subjects that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectCode = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectCode the subject code to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(long companyId, long groupId,
		java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectName = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param subjectName the subject name to search with
	* @return the number of matching t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(long companyId, long groupId,
		java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y subjects.
	*
	* @return the number of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}