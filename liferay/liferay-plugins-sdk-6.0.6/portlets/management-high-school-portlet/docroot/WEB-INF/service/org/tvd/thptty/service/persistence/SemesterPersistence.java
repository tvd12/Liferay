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

import org.tvd.thptty.model.Semester;

/**
 * The persistence interface for the semester service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SemesterUtil} to access the semester persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see SemesterPersistenceImpl
 * @see SemesterUtil
 * @generated
 */
public interface SemesterPersistence extends BasePersistence<Semester> {
	/**
	* Caches the semester in the entity cache if it is enabled.
	*
	* @param semester the semester to cache
	*/
	public void cacheResult(org.tvd.thptty.model.Semester semester);

	/**
	* Caches the semesters in the entity cache if it is enabled.
	*
	* @param semesters the semesters to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.Semester> semesters);

	/**
	* Creates a new semester with the primary key. Does not add the semester to the database.
	*
	* @param semesterPK the primary key for the new semester
	* @return the new semester
	*/
	public org.tvd.thptty.model.Semester create(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK);

	/**
	* Removes the semester with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param semesterPK the primary key of the semester to remove
	* @return the semester that was removed
	* @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.Semester remove(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

	public org.tvd.thptty.model.Semester updateImpl(
		org.tvd.thptty.model.Semester semester, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the semester with the primary key or throws a {@link org.tvd.thptty.NoSuchSemesterException} if it could not be found.
	*
	* @param semesterPK the primary key of the semester to find
	* @return the semester
	* @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.Semester findByPrimaryKey(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

	/**
	* Finds the semester with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param semesterPK the primary key of the semester to find
	* @return the semester, or <code>null</code> if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.Semester fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.Semester findByC_G_Status(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

	/**
	* Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching semester, or <code>null</code> if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.Semester fetchByC_G_Status(long companyId,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching semester, or <code>null</code> if a matching semester could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.Semester fetchByC_G_Status(long companyId,
		long groupId, int status, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.Semester> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.tvd.thptty.model.Semester findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

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
	public org.tvd.thptty.model.Semester findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

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
	public org.tvd.thptty.model.Semester[] findByC_G_PrevAndNext(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

	/**
	* Finds all the semesters.
	*
	* @return the semesters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.Semester> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.Semester> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.tvd.thptty.model.Semester> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the semester where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_Status(long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException;

	/**
	* Removes all the semesters where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the semesters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the semesters where companyId = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_Status(long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the semesters where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching semesters
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the semesters.
	*
	* @return the number of semesters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}