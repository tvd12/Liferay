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
 * This class is a wrapper for {@link TYSubjectUserRoleLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubjectUserRoleLocalService
 * @generated
 */
public class TYSubjectUserRoleLocalServiceWrapper
	implements TYSubjectUserRoleLocalService {
	public TYSubjectUserRoleLocalServiceWrapper(
		TYSubjectUserRoleLocalService tySubjectUserRoleLocalService) {
		_tySubjectUserRoleLocalService = tySubjectUserRoleLocalService;
	}

	/**
	* Adds the t y subject user role to the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRole the t y subject user role to add
	* @return the t y subject user role that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole addTYSubjectUserRole(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.addTYSubjectUserRole(tySubjectUserRole);
	}

	/**
	* Creates a new t y subject user role with the primary key. Does not add the t y subject user role to the database.
	*
	* @param tySubjectUserRolePK the primary key for the new t y subject user role
	* @return the new t y subject user role
	*/
	public org.tvd.thptty.model.TYSubjectUserRole createTYSubjectUserRole(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK) {
		return _tySubjectUserRoleLocalService.createTYSubjectUserRole(tySubjectUserRolePK);
	}

	/**
	* Deletes the t y subject user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRolePK the primary key of the t y subject user role to delete
	* @throws PortalException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubjectUserRole(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tySubjectUserRoleLocalService.deleteTYSubjectUserRole(tySubjectUserRolePK);
	}

	/**
	* Deletes the t y subject user role from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRole the t y subject user role to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubjectUserRole(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tySubjectUserRoleLocalService.deleteTYSubjectUserRole(tySubjectUserRole);
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
		return _tySubjectUserRoleLocalService.dynamicQuery(dynamicQuery);
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
		return _tySubjectUserRoleLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tySubjectUserRoleLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tySubjectUserRoleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y subject user role with the primary key.
	*
	* @param tySubjectUserRolePK the primary key of the t y subject user role to get
	* @return the t y subject user role
	* @throws PortalException if a t y subject user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole getTYSubjectUserRole(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK tySubjectUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.getTYSubjectUserRole(tySubjectUserRolePK);
	}

	/**
	* Gets a range of all the t y subject user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject user roles to return
	* @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	* @return the range of t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubjectUserRole> getTYSubjectUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.getTYSubjectUserRoles(start, end);
	}

	/**
	* Gets the number of t y subject user roles.
	*
	* @return the number of t y subject user roles
	* @throws SystemException if a system exception occurred
	*/
	public int getTYSubjectUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.getTYSubjectUserRolesCount();
	}

	/**
	* Updates the t y subject user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRole the t y subject user role to update
	* @return the t y subject user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole updateTYSubjectUserRole(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.updateTYSubjectUserRole(tySubjectUserRole);
	}

	/**
	* Updates the t y subject user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectUserRole the t y subject user role to update
	* @param merge whether to merge the t y subject user role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y subject user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectUserRole updateTYSubjectUserRole(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.updateTYSubjectUserRole(tySubjectUserRole,
			merge);
	}

	public org.tvd.thptty.model.TYSubjectUserRole addSubjectUserRole(
		org.tvd.thptty.model.TYSubjectUserRole newRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.addSubjectUserRole(newRole);
	}

	public com.liferay.portal.model.User getUserBySubjectRole(int courses,
		long groupId, long subjectId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRoleLocalService.getUserBySubjectRole(courses,
			groupId, subjectId, roleId);
	}

	public TYSubjectUserRoleLocalService getWrappedTYSubjectUserRoleLocalService() {
		return _tySubjectUserRoleLocalService;
	}

	private TYSubjectUserRoleLocalService _tySubjectUserRoleLocalService;
}