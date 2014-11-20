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
 * The utility for the t y subject class user role local service. This utility wraps {@link org.tvd.thptty.service.impl.TYSubjectClassUserRoleLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYSubjectClassUserRoleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectClassUserRoleLocalService
 * @see org.tvd.thptty.service.base.TYSubjectClassUserRoleLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYSubjectClassUserRoleLocalServiceImpl
 * @generated
 */
public class TYSubjectClassUserRoleLocalServiceUtil {
	/**
	* Adds the t y subject class user role to the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to add
	* @return the t y subject class user role that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole addTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYSubjectClassUserRole(tySubjectClassUserRole);
	}

	/**
	* Creates a new t y subject class user role with the primary key. Does not add the t y subject class user role to the database.
	*
	* @param tySubjectClassUserRolePK the primary key for the new t y subject class user role
	* @return the new t y subject class user role
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole createTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK) {
		return getService()
				   .createTYSubjectClassUserRole(tySubjectClassUserRolePK);
	}

	/**
	* Deletes the t y subject class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to delete
	* @throws PortalException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYSubjectClassUserRole(tySubjectClassUserRolePK);
	}

	/**
	* Deletes the t y subject class user role from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYSubjectClassUserRole(tySubjectClassUserRole);
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
	* Gets the t y subject class user role with the primary key.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to get
	* @return the t y subject class user role
	* @throws PortalException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole getTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYSubjectClassUserRole(tySubjectClassUserRolePK);
	}

	/**
	* Gets a range of all the t y subject class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @return the range of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getTYSubjectClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYSubjectClassUserRoles(start, end);
	}

	/**
	* Gets the number of t y subject class user roles.
	*
	* @return the number of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYSubjectClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYSubjectClassUserRolesCount();
	}

	/**
	* Updates the t y subject class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to update
	* @return the t y subject class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYSubjectClassUserRole(tySubjectClassUserRole);
	}

	/**
	* Updates the t y subject class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to update
	* @param merge whether to merge the t y subject class user role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y subject class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTYSubjectClassUserRole(tySubjectClassUserRole, merge);
	}

	public static org.tvd.thptty.model.TYSubjectClassUserRole addSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole newSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSubjectClassUserRole(newSCUR);
	}

	public static java.util.List<org.tvd.thptty.model.TYClass> getClassBySubjectUserRole(
		int courses, long subjectId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getClassBySubjectUserRole(courses, subjectId, userId, roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectsClassesByUserRole(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubjectsClassesByUserRole(courses, userId, roleId);
	}

	public static void deleteSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole oldSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSubjectClassUserRole(oldSCUR);
	}

	public static org.tvd.thptty.model.TYSubjectClassUserRole hasSubjectClassRole(
		int courses, long subjectId, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getService()
				   .hasSubjectClassRole(courses, subjectId, classId, userId,
			roleId);
	}

	public static int countSubjectClassUserRoleBy(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countSubjectClassUserRoleBy(courses, companyId, groupId);
	}

	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSubjectClassUserRolesByCourse(courses, companyId, groupId);
	}

	public static int coutSubjectClassUsersByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .coutSubjectClassUsersByC_R(courses, companyId, groupId,
			roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUsersByC_R(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSubjectClassUsersByC_R(courses, companyId, groupId,
			roleId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYSubjectClassUserRoleLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYSubjectClassUserRoleLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYSubjectClassUserRoleLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYSubjectClassUserRoleLocalService service) {
		_service = service;
	}

	private static TYSubjectClassUserRoleLocalService _service;
}