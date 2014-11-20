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
 * The utility for the t y class user role local service. This utility wraps {@link org.tvd.thptty.service.impl.TYClassUserRoleLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYClassUserRoleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassUserRoleLocalService
 * @see org.tvd.thptty.service.base.TYClassUserRoleLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYClassUserRoleLocalServiceImpl
 * @generated
 */
public class TYClassUserRoleLocalServiceUtil {
	/**
	* Adds the t y class user role to the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to add
	* @return the t y class user role that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole addTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYClassUserRole(tyClassUserRole);
	}

	/**
	* Creates a new t y class user role with the primary key. Does not add the t y class user role to the database.
	*
	* @param tyClassUserRolePK the primary key for the new t y class user role
	* @return the new t y class user role
	*/
	public static org.tvd.thptty.model.TYClassUserRole createTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK) {
		return getService().createTYClassUserRole(tyClassUserRolePK);
	}

	/**
	* Deletes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to delete
	* @throws PortalException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYClassUserRole(tyClassUserRolePK);
	}

	/**
	* Deletes the t y class user role from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYClassUserRole(tyClassUserRole);
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
	* Gets the t y class user role with the primary key.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to get
	* @return the t y class user role
	* @throws PortalException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole getTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassUserRole(tyClassUserRolePK);
	}

	/**
	* Gets a range of all the t y class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y class user roles to return
	* @param end the upper bound of the range of t y class user roles to return (not inclusive)
	* @return the range of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> getTYClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassUserRoles(start, end);
	}

	/**
	* Gets the number of t y class user roles.
	*
	* @return the number of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYClassUserRolesCount();
	}

	/**
	* Updates the t y class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to update
	* @return the t y class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYClassUserRole(tyClassUserRole);
	}

	/**
	* Updates the t y class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to update
	* @param merge whether to merge the t y class user role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYClassUserRole(tyClassUserRole, merge);
	}

	public static org.tvd.thptty.model.TYClassUserRole addClassUserRole(
		org.tvd.thptty.model.TYClassUserRole newRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addClassUserRole(newRole);
	}

	public static com.liferay.portal.model.User getUserByClassRole(
		int courses, long classId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserByClassRole(courses, classId, roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClass> getClassesByUserRole(
		int courses, long groupId, long companyId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getClassesByUserRole(courses, groupId, companyId, userId,
			roleId);
	}

	public static int countClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countClassesUserRoleByC_R(courses, companyId, groupId,
			roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClass> getClassesByRole(
		int courses, long groupId, long companyId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getClassesByRole(courses, groupId, companyId, roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassesUsersByC_G(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getClassesUsersByC_G(courses, companyId, groupId, roleId);
	}

	public static void deleteClassUserRole(
		org.tvd.thptty.model.TYClassUserRole oldRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteClassUserRole(oldRole);
	}

	public static org.tvd.thptty.model.TYClassUserRole isTeacherManagement(
		int courses, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return getService().isTeacherManagement(courses, classId, userId, roleId);
	}

	public static int countClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countClassesUserRoleByCourse(courses, companyId, groupId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getClassUserRolesByCourse(courses, companyId, groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYClassUserRoleLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYClassUserRoleLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYClassUserRoleLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYClassUserRoleLocalService service) {
		_service = service;
	}

	private static TYClassUserRoleLocalService _service;
}