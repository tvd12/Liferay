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

import org.tvd.thptty.model.TYClass;

/**
 * The persistence interface for the t y class service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYClassUtil} to access the t y class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassPersistenceImpl
 * @see TYClassUtil
 * @generated
 */
public interface TYClassPersistence extends BasePersistence<TYClass> {
	/**
	* Caches the t y class in the entity cache if it is enabled.
	*
	* @param tyClass the t y class to cache
	*/
	public void cacheResult(org.tvd.thptty.model.TYClass tyClass);

	/**
	* Caches the t y classes in the entity cache if it is enabled.
	*
	* @param tyClasses the t y classes to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYClass> tyClasses);

	/**
	* Creates a new t y class with the primary key. Does not add the t y class to the database.
	*
	* @param classId the primary key for the new t y class
	* @return the new t y class
	*/
	public org.tvd.thptty.model.TYClass create(long classId);

	/**
	* Removes the t y class with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param classId the primary key of the t y class to remove
	* @return the t y class that was removed
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass remove(long classId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	public org.tvd.thptty.model.TYClass updateImpl(
		org.tvd.thptty.model.TYClass tyClass, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class with the primary key or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param classId the primary key of the t y class to find
	* @return the t y class
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass findByPrimaryKey(long classId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Finds the t y class with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param classId the primary key of the t y class to find
	* @return the t y class, or <code>null</code> if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass fetchByPrimaryKey(long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findByG_ID(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass findByG_ID_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Finds the last t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass findByG_ID_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Finds the t y classes before and after the current t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classId the primary key of the current t y class
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y class
	* @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass[] findByG_ID_PrevAndNext(long classId,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Filters by the user's permissions and finds all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> filterFindByG_ID(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass findByC_G(long classId, long groupId,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass fetchByC_G(long classId, long groupId,
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass fetchByC_G(long classId, long groupId,
		long companyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class
	* @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass findByclassGroup_Name(long companyId,
		long groupId, int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass fetchByclassGroup_Name(long companyId,
		long groupId, int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClass fetchByclassGroup_Name(long companyId,
		long groupId, int classGroup, java.lang.String className,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y classes.
	*
	* @return the t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y classes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @return the range of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y classes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y classes to return
	* @param end the upper bound of the range of t y classes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYClass> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y classes where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; from the database.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long classId, long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Removes the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByclassGroup_Name(long companyId, long groupId,
		int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassException;

	/**
	* Removes all the t y classes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the t y classes where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching t y classes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_ID(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y classes where classId = &#63; and groupId = &#63; and companyId = &#63;.
	*
	* @param classId the class id to search with
	* @param groupId the group id to search with
	* @param companyId the company id to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long classId, long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y classes where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param classGroup the class group to search with
	* @param className the class name to search with
	* @return the number of matching t y classes
	* @throws SystemException if a system exception occurred
	*/
	public int countByclassGroup_Name(long companyId, long groupId,
		int classGroup, java.lang.String className)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y classes.
	*
	* @return the number of t y classes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}