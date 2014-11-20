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

import org.tvd.thptty.model.TYPrioritySubject;

/**
 * The persistence interface for the t y priority subject service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYPrioritySubjectUtil} to access the t y priority subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYPrioritySubjectPersistenceImpl
 * @see TYPrioritySubjectUtil
 * @generated
 */
public interface TYPrioritySubjectPersistence extends BasePersistence<TYPrioritySubject> {
	/**
	* Caches the t y priority subject in the entity cache if it is enabled.
	*
	* @param tyPrioritySubject the t y priority subject to cache
	*/
	public void cacheResult(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject);

	/**
	* Caches the t y priority subjects in the entity cache if it is enabled.
	*
	* @param tyPrioritySubjects the t y priority subjects to cache
	*/
	public void cacheResult(
		java.util.List<org.tvd.thptty.model.TYPrioritySubject> tyPrioritySubjects);

	/**
	* Creates a new t y priority subject with the primary key. Does not add the t y priority subject to the database.
	*
	* @param tyPrioritySubjectPK the primary key for the new t y priority subject
	* @return the new t y priority subject
	*/
	public org.tvd.thptty.model.TYPrioritySubject create(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK);

	/**
	* Removes the t y priority subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to remove
	* @return the t y priority subject that was removed
	* @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYPrioritySubject remove(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchPrioritySubjectException;

	public org.tvd.thptty.model.TYPrioritySubject updateImpl(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the t y priority subject with the primary key or throws a {@link org.tvd.thptty.NoSuchPrioritySubjectException} if it could not be found.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	* @return the t y priority subject
	* @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYPrioritySubject findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchPrioritySubjectException;

	/**
	* Finds the t y priority subject with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	* @return the t y priority subject, or <code>null</code> if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYPrioritySubject fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the t y priority subjects.
	*
	* @return the t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the t y priority subjects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y priority subjects to return
	* @param end the upper bound of the range of t y priority subjects to return (not inclusive)
	* @return the range of t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the t y priority subjects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y priority subjects to return
	* @param end the upper bound of the range of t y priority subjects to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t y priority subjects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the t y priority subjects.
	*
	* @return the number of t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}