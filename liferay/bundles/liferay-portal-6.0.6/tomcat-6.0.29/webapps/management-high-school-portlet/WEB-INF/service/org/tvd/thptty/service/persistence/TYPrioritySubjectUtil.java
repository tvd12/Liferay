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

import org.tvd.thptty.model.TYPrioritySubject;

import java.util.List;

/**
 * The persistence utility for the t y priority subject service. This utility wraps {@link TYPrioritySubjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see TYPrioritySubjectPersistence
 * @see TYPrioritySubjectPersistenceImpl
 * @generated
 */
public class TYPrioritySubjectUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYPrioritySubject tyPrioritySubject) {
		getPersistence().clearCache(tyPrioritySubject);
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
	public static List<TYPrioritySubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYPrioritySubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYPrioritySubject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYPrioritySubject remove(TYPrioritySubject tyPrioritySubject)
		throws SystemException {
		return getPersistence().remove(tyPrioritySubject);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYPrioritySubject update(
		TYPrioritySubject tyPrioritySubject, boolean merge)
		throws SystemException {
		return getPersistence().update(tyPrioritySubject, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYPrioritySubject update(
		TYPrioritySubject tyPrioritySubject, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tyPrioritySubject, merge, serviceContext);
	}

	/**
	* Caches the t y priority subject in the entity cache if it is enabled.
	*
	* @param tyPrioritySubject the t y priority subject to cache
	*/
	public static void cacheResult(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject) {
		getPersistence().cacheResult(tyPrioritySubject);
	}

	/**
	* Caches the t y priority subjects in the entity cache if it is enabled.
	*
	* @param tyPrioritySubjects the t y priority subjects to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYPrioritySubject> tyPrioritySubjects) {
		getPersistence().cacheResult(tyPrioritySubjects);
	}

	/**
	* Creates a new t y priority subject with the primary key. Does not add the t y priority subject to the database.
	*
	* @param tyPrioritySubjectPK the primary key for the new t y priority subject
	* @return the new t y priority subject
	*/
	public static org.tvd.thptty.model.TYPrioritySubject create(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK) {
		return getPersistence().create(tyPrioritySubjectPK);
	}

	/**
	* Removes the t y priority subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to remove
	* @return the t y priority subject that was removed
	* @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject remove(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchPrioritySubjectException {
		return getPersistence().remove(tyPrioritySubjectPK);
	}

	public static org.tvd.thptty.model.TYPrioritySubject updateImpl(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tyPrioritySubject, merge);
	}

	/**
	* Finds the t y priority subject with the primary key or throws a {@link org.tvd.thptty.NoSuchPrioritySubjectException} if it could not be found.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	* @return the t y priority subject
	* @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchPrioritySubjectException {
		return getPersistence().findByPrimaryKey(tyPrioritySubjectPK);
	}

	/**
	* Finds the t y priority subject with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	* @return the t y priority subject, or <code>null</code> if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tyPrioritySubjectPK);
	}

	/**
	* Finds all the t y priority subjects.
	*
	* @return the t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.tvd.thptty.model.TYPrioritySubject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t y priority subjects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y priority subjects.
	*
	* @return the number of t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYPrioritySubjectPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYPrioritySubjectPersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYPrioritySubjectPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYPrioritySubjectPersistence persistence) {
		_persistence = persistence;
	}

	private static TYPrioritySubjectPersistence _persistence;
}