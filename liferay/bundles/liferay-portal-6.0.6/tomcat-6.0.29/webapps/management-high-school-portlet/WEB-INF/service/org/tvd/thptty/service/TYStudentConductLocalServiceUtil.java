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
 * The utility for the t y student conduct local service. This utility wraps {@link org.tvd.thptty.service.impl.TYStudentConductLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYStudentConductLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentConductLocalService
 * @see org.tvd.thptty.service.base.TYStudentConductLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYStudentConductLocalServiceImpl
 * @generated
 */
public class TYStudentConductLocalServiceUtil {
	/**
	* Adds the t y student conduct to the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to add
	* @return the t y student conduct that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentConduct addTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYStudentConduct(tyStudentConduct);
	}

	/**
	* Creates a new t y student conduct with the primary key. Does not add the t y student conduct to the database.
	*
	* @param tyStudentConductPK the primary key for the new t y student conduct
	* @return the new t y student conduct
	*/
	public static org.tvd.thptty.model.TYStudentConduct createTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK) {
		return getService().createTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Deletes the t y student conduct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to delete
	* @throws PortalException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Deletes the t y student conduct from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYStudentConduct(tyStudentConduct);
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
	* Gets the t y student conduct with the primary key.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to get
	* @return the t y student conduct
	* @throws PortalException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentConduct getTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Gets a range of all the t y student conducts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student conducts to return
	* @param end the upper bound of the range of t y student conducts to return (not inclusive)
	* @return the range of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYStudentConduct> getTYStudentConducts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYStudentConducts(start, end);
	}

	/**
	* Gets the number of t y student conducts.
	*
	* @return the number of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYStudentConductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYStudentConductsCount();
	}

	/**
	* Updates the t y student conduct in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to update
	* @return the t y student conduct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentConduct updateTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYStudentConduct(tyStudentConduct);
	}

	/**
	* Updates the t y student conduct in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to update
	* @param merge whether to merge the t y student conduct with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y student conduct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYStudentConduct updateTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYStudentConduct(tyStudentConduct, merge);
	}

	public static org.tvd.thptty.model.TYStudentConduct addStudentConduct(
		org.tvd.thptty.model.TYStudentConduct studentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudentConduct(studentConduct);
	}

	public static org.tvd.thptty.model.TYStudentConduct getConductOfStudent(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException {
		return getService().getConductOfStudent(courses, semester, studentId);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentConduct> getStudentsConductByS_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStudentsConductByS_C(courses, semester, companyId,
			groupId, conduct, start, end);
	}

	public static int countStudentsConductByS_C(int courses, int semester,
		long companyId, long groupId, long conduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countStudentsConductByS_C(courses, semester, companyId,
			groupId, conduct);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentConduct> getStudentsConductByS_C_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStudentsConductByS_C_C(courses, semester, companyId,
			groupId, conduct, classId, start, end);
	}

	public static int countStudentsConductByS_C_C(int courses, int semester,
		long companyId, long groupId, int conduct, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countStudentsConductByS_C_C(courses, semester, companyId,
			groupId, conduct, classId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYStudentConductLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYStudentConductLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYStudentConductLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYStudentConductLocalService service) {
		_service = service;
	}

	private static TYStudentConductLocalService _service;
}