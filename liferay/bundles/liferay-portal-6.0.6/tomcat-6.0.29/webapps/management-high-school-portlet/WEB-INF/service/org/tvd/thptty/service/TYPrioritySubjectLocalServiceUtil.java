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

package org.tvd.thptty.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the t y priority subject local service. This utility wraps {@link org.tvd.thptty.service.impl.TYPrioritySubjectLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYPrioritySubjectLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYPrioritySubjectLocalService
 * @see org.tvd.thptty.service.base.TYPrioritySubjectLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYPrioritySubjectLocalServiceImpl
 * @generated
 */
public class TYPrioritySubjectLocalServiceUtil {
	/**
	* Adds the t y priority subject to the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubject the t y priority subject to add
	* @return the t y priority subject that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject addTYPrioritySubject(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYPrioritySubject(tyPrioritySubject);
	}

	/**
	* Creates a new t y priority subject with the primary key. Does not add the t y priority subject to the database.
	*
	* @param tyPrioritySubjectPK the primary key for the new t y priority subject
	* @return the new t y priority subject
	*/
	public static org.tvd.thptty.model.TYPrioritySubject createTYPrioritySubject(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK) {
		return getService().createTYPrioritySubject(tyPrioritySubjectPK);
	}

	/**
	* Deletes the t y priority subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to delete
	* @throws PortalException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYPrioritySubject(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYPrioritySubject(tyPrioritySubjectPK);
	}

	/**
	* Deletes the t y priority subject from the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubject the t y priority subject to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYPrioritySubject(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYPrioritySubject(tyPrioritySubject);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y priority subject with the primary key.
	*
	* @param tyPrioritySubjectPK the primary key of the t y priority subject to get
	* @return the t y priority subject
	* @throws PortalException if a t y priority subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject getTYPrioritySubject(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK tyPrioritySubjectPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYPrioritySubject(tyPrioritySubjectPK);
	}

	/**
	* Gets a range of all the t y priority subjects.
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
	public static java.util.List<org.tvd.thptty.model.TYPrioritySubject> getTYPrioritySubjects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYPrioritySubjects(start, end);
	}

	/**
	* Gets the number of t y priority subjects.
	*
	* @return the number of t y priority subjects
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYPrioritySubjectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYPrioritySubjectsCount();
	}

	/**
	* Updates the t y priority subject in the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubject the t y priority subject to update
	* @return the t y priority subject that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject updateTYPrioritySubject(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYPrioritySubject(tyPrioritySubject);
	}

	/**
	* Updates the t y priority subject in the database. Also notifies the appropriate model listeners.
	*
	* @param tyPrioritySubject the t y priority subject to update
	* @param merge whether to merge the t y priority subject with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y priority subject that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYPrioritySubject updateTYPrioritySubject(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYPrioritySubject(tyPrioritySubject, merge);
	}

	public static org.tvd.thptty.model.TYPrioritySubject addPrioritySubject(
		org.tvd.thptty.model.TYPrioritySubject pSubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPrioritySubject(pSubject);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYPrioritySubjectLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYPrioritySubjectLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYPrioritySubjectLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYPrioritySubjectLocalService service) {
		_service = service;
	}

	private static TYPrioritySubjectLocalService _service;
}