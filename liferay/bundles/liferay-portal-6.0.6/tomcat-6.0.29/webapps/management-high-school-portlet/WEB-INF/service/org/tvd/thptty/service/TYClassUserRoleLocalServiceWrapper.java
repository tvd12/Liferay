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

/**
 * <p>
 * This class is a wrapper for {@link TYClassUserRoleLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYClassUserRoleLocalService
 * @generated
 */
public class TYClassUserRoleLocalServiceWrapper
	implements TYClassUserRoleLocalService {
	public TYClassUserRoleLocalServiceWrapper(
		TYClassUserRoleLocalService tyClassUserRoleLocalService) {
		_tyClassUserRoleLocalService = tyClassUserRoleLocalService;
	}

	/**
	* Adds the t y class user role to the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to add
	* @return the t y class user role that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole addTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.addTYClassUserRole(tyClassUserRole);
	}

	/**
	* Creates a new t y class user role with the primary key. Does not add the t y class user role to the database.
	*
	* @param tyClassUserRolePK the primary key for the new t y class user role
	* @return the new t y class user role
	*/
	public org.tvd.thptty.model.TYClassUserRole createTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK) {
		return _tyClassUserRoleLocalService.createTYClassUserRole(tyClassUserRolePK);
	}

	/**
	* Deletes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to delete
	* @throws PortalException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tyClassUserRoleLocalService.deleteTYClassUserRole(tyClassUserRolePK);
	}

	/**
	* Deletes the t y class user role from the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyClassUserRoleLocalService.deleteTYClassUserRole(tyClassUserRole);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y class user role with the primary key.
	*
	* @param tyClassUserRolePK the primary key of the t y class user role to get
	* @return the t y class user role
	* @throws PortalException if a t y class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole getTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getTYClassUserRole(tyClassUserRolePK);
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
	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getTYClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getTYClassUserRoles(start, end);
	}

	/**
	* Gets the number of t y class user roles.
	*
	* @return the number of t y class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int getTYClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getTYClassUserRolesCount();
	}

	/**
	* Updates the t y class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to update
	* @return the t y class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.updateTYClassUserRole(tyClassUserRole);
	}

	/**
	* Updates the t y class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tyClassUserRole the t y class user role to update
	* @param merge whether to merge the t y class user role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.updateTYClassUserRole(tyClassUserRole,
			merge);
	}

	public org.tvd.thptty.model.TYClassUserRole addClassUserRole(
		org.tvd.thptty.model.TYClassUserRole newRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.addClassUserRole(newRole);
	}

	public com.liferay.portal.model.User getUserByClassRole(int courses,
		long classId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getUserByClassRole(courses,
			classId, roleId);
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassesByUserRole(
		int courses, long groupId, long companyId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getClassesByUserRole(courses,
			groupId, companyId, userId, roleId);
	}

	public int countClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.countClassesUserRoleByC_R(courses,
			companyId, groupId, roleId);
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassesByRole(
		int courses, long groupId, long companyId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getClassesByRole(courses, groupId,
			companyId, roleId);
	}

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassesUsersByC_G(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getClassesUsersByC_G(courses,
			companyId, groupId, roleId);
	}

	public void deleteClassUserRole(
		org.tvd.thptty.model.TYClassUserRole oldRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyClassUserRoleLocalService.deleteClassUserRole(oldRole);
	}

	public org.tvd.thptty.model.TYClassUserRole isTeacherManagement(
		int courses, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		return _tyClassUserRoleLocalService.isTeacherManagement(courses,
			classId, userId, roleId);
	}

	public int countClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.countClassesUserRoleByCourse(courses,
			companyId, groupId);
	}

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRoleLocalService.getClassUserRolesByCourse(courses,
			companyId, groupId);
	}

	public TYClassUserRoleLocalService getWrappedTYClassUserRoleLocalService() {
		return _tyClassUserRoleLocalService;
	}

	private TYClassUserRoleLocalService _tyClassUserRoleLocalService;
}