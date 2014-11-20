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
 * The utility for the t y class student local service. This utility wraps {@link org.tvd.thptty.service.impl.TYClassStudentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYClassStudentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassStudentLocalService
 * @see org.tvd.thptty.service.base.TYClassStudentLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYClassStudentLocalServiceImpl
 * @generated
 */
public class TYClassStudentLocalServiceUtil {
	/**
	* Adds the t y class student to the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudent the t y class student to add
	* @return the t y class student that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassStudent addTYClassStudent(
		org.tvd.thptty.model.TYClassStudent tyClassStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYClassStudent(tyClassStudent);
	}

	/**
	* Creates a new t y class student with the primary key. Does not add the t y class student to the database.
	*
	* @param tyClassStudentPK the primary key for the new t y class student
	* @return the new t y class student
	*/
	public static org.tvd.thptty.model.TYClassStudent createTYClassStudent(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK) {
		return getService().createTYClassStudent(tyClassStudentPK);
	}

	/**
	* Deletes the t y class student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudentPK the primary key of the t y class student to delete
	* @throws PortalException if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYClassStudent(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYClassStudent(tyClassStudentPK);
	}

	/**
	* Deletes the t y class student from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudent the t y class student to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYClassStudent(
		org.tvd.thptty.model.TYClassStudent tyClassStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYClassStudent(tyClassStudent);
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
	* Gets the t y class student with the primary key.
	*
	* @param tyClassStudentPK the primary key of the t y class student to get
	* @return the t y class student
	* @throws PortalException if a t y class student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassStudent getTYClassStudent(
		org.tvd.thptty.service.persistence.TYClassStudentPK tyClassStudentPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassStudent(tyClassStudentPK);
	}

	/**
	* Gets a range of all the t y class students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class students to return
	* @param end the upper bound of the range of t y class students to return (not inclusive)
	* @return the range of t y class students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassStudent> getTYClassStudents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassStudents(start, end);
	}

	/**
	* Gets the number of t y class students.
	*
	* @return the number of t y class students
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYClassStudentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassStudentsCount();
	}

	/**
	* Updates the t y class student in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudent the t y class student to update
	* @return the t y class student that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassStudent updateTYClassStudent(
		org.tvd.thptty.model.TYClassStudent tyClassStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYClassStudent(tyClassStudent);
	}

	/**
	* Updates the t y class student in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassStudent the t y class student to update
	* @param merge whether to merge the t y class student with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y class student that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassStudent updateTYClassStudent(
		org.tvd.thptty.model.TYClassStudent tyClassStudent, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYClassStudent(tyClassStudent, merge);
	}

	public static org.tvd.thptty.model.TYClassStudent addStudentIntoClass(
		org.tvd.thptty.model.TYClassStudent newStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudentIntoClass(newStudent);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudent> getAllStudentsInClass(
		int courses, long classId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllStudentsInClass(courses, classId);
	}

	public static org.tvd.thptty.model.TYClass getClassOfStudent(int courses,
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getClassOfStudent(courses, studentId);
	}

	public static void deleteStudentClass(
		org.tvd.thptty.model.TYClassStudent classStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentClass(classStudent);
	}

	public static int amountStudentsInClass(int courses, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().amountStudentsInClass(courses, classId);
	}

	public static int countClassStudentByCourse_Group(int course,
		long companyId, long groupId, int classGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countClassStudentByCourse_Group(course, companyId, groupId,
			classGroup);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassStudent> getClassStudentsByCourse_Group(
		int course, long companyId, long groupId, int classGroup, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getClassStudentsByCourse_Group(course, companyId, groupId,
			classGroup, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYClassStudentLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYClassStudentLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYClassStudentLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYClassStudentLocalService service) {
		_service = service;
	}

	private static TYClassStudentLocalService _service;
}