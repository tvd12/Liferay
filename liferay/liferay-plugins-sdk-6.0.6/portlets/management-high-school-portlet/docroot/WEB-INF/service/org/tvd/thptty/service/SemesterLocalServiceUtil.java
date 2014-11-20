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
 * The utility for the semester local service. This utility wraps {@link org.tvd.thptty.service.impl.SemesterLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.SemesterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see SemesterLocalService
 * @see org.tvd.thptty.service.base.SemesterLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.SemesterLocalServiceImpl
 * @generated
 */
public class SemesterLocalServiceUtil {
	/**
	* Adds the semester to the database. Also notifies the appropriate model listeners.
	*
	* @param semester the semester to add
	* @return the semester that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester addSemester(
		org.tvd.thptty.model.Semester semester)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSemester(semester);
	}

	/**
	* Creates a new semester with the primary key. Does not add the semester to the database.
	*
	* @param semesterPK the primary key for the new semester
	* @return the new semester
	*/
	public static org.tvd.thptty.model.Semester createSemester(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK) {
		return getService().createSemester(semesterPK);
	}

	/**
	* Deletes the semester with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param semesterPK the primary key of the semester to delete
	* @throws PortalException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSemester(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSemester(semesterPK);
	}

	/**
	* Deletes the semester from the database. Also notifies the appropriate model listeners.
	*
	* @param semester the semester to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSemester(org.tvd.thptty.model.Semester semester)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSemester(semester);
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
	* Gets the semester with the primary key.
	*
	* @param semesterPK the primary key of the semester to get
	* @return the semester
	* @throws PortalException if a semester with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester getSemester(
		org.tvd.thptty.service.persistence.SemesterPK semesterPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSemester(semesterPK);
	}

	/**
	* Gets a range of all the semesters.
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
	public static java.util.List<org.tvd.thptty.model.Semester> getSemesters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSemesters(start, end);
	}

	/**
	* Gets the number of semesters.
	*
	* @return the number of semesters
	* @throws SystemException if a system exception occurred
	*/
	public static int getSemestersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSemestersCount();
	}

	/**
	* Updates the semester in the database. Also notifies the appropriate model listeners.
	*
	* @param semester the semester to update
	* @return the semester that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester updateSemester(
		org.tvd.thptty.model.Semester semester)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSemester(semester);
	}

	/**
	* Updates the semester in the database. Also notifies the appropriate model listeners.
	*
	* @param semester the semester to update
	* @param merge whether to merge the semester with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the semester that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.Semester updateSemester(
		org.tvd.thptty.model.Semester semester, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSemester(semester, merge);
	}

	public static org.tvd.thptty.model.Semester getSemester(long companyId,
		long groupId, int semesterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getService().getSemester(companyId, groupId, semesterId);
	}

	public static org.tvd.thptty.model.Semester getSemesterByC_G_Status(
		long companyId, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSemesterException {
		return getService().getSemesterByC_G_Status(companyId, groupId, status);
	}

	public static int getMaxSemester(int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMaxSemester(courses, companyId, groupId);
	}

	public static java.util.List<org.tvd.thptty.model.Semester> getSemesters(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSemesters(companyId, groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SemesterLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					SemesterLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new SemesterLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(SemesterLocalService service) {
		_service = service;
	}

	private static SemesterLocalService _service;
}