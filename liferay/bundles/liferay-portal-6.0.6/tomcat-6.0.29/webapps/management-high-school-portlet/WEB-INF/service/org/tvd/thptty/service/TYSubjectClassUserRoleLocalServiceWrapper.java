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
 * This class is a wrapper for {@link TYSubjectClassUserRoleLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubjectClassUserRoleLocalService
 * @generated
 */
public class TYSubjectClassUserRoleLocalServiceWrapper
	implements TYSubjectClassUserRoleLocalService {
	public TYSubjectClassUserRoleLocalServiceWrapper(
		TYSubjectClassUserRoleLocalService tySubjectClassUserRoleLocalService) {
		_tySubjectClassUserRoleLocalService = tySubjectClassUserRoleLocalService;
	}

	/**
	* Adds the t y subject class user role to the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to add
	* @return the t y subject class user role that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectClassUserRole addTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.addTYSubjectClassUserRole(tySubjectClassUserRole);
	}

	/**
	* Creates a new t y subject class user role with the primary key. Does not add the t y subject class user role to the database.
	*
	* @param tySubjectClassUserRolePK the primary key for the new t y subject class user role
	* @return the new t y subject class user role
	*/
	public org.tvd.thptty.model.TYSubjectClassUserRole createTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK) {
		return _tySubjectClassUserRoleLocalService.createTYSubjectClassUserRole(tySubjectClassUserRolePK);
	}

	/**
	* Deletes the t y subject class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to delete
	* @throws PortalException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tySubjectClassUserRoleLocalService.deleteTYSubjectClassUserRole(tySubjectClassUserRolePK);
	}

	/**
	* Deletes the t y subject class user role from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tySubjectClassUserRoleLocalService.deleteTYSubjectClassUserRole(tySubjectClassUserRole);
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
		return _tySubjectClassUserRoleLocalService.dynamicQuery(dynamicQuery);
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
		return _tySubjectClassUserRoleLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _tySubjectClassUserRoleLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _tySubjectClassUserRoleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y subject class user role with the primary key.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to get
	* @return the t y subject class user role
	* @throws PortalException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectClassUserRole getTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getTYSubjectClassUserRole(tySubjectClassUserRolePK);
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
	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getTYSubjectClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getTYSubjectClassUserRoles(start,
			end);
	}

	/**
	* Gets the number of t y subject class user roles.
	*
	* @return the number of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public int getTYSubjectClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getTYSubjectClassUserRolesCount();
	}

	/**
	* Updates the t y subject class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to update
	* @return the t y subject class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.updateTYSubjectClassUserRole(tySubjectClassUserRole);
	}

	/**
	* Updates the t y subject class user role in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRole the t y subject class user role to update
	* @param merge whether to merge the t y subject class user role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y subject class user role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.updateTYSubjectClassUserRole(tySubjectClassUserRole,
			merge);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole addSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole newSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.addSubjectClassUserRole(newSCUR);
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassBySubjectUserRole(
		int courses, long subjectId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getClassBySubjectUserRole(courses,
			subjectId, userId, roleId);
	}

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectsClassesByUserRole(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getSubjectsClassesByUserRole(courses,
			userId, roleId);
	}

	public void deleteSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole oldSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tySubjectClassUserRoleLocalService.deleteSubjectClassUserRole(oldSCUR);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole hasSubjectClassRole(
		int courses, long subjectId, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return _tySubjectClassUserRoleLocalService.hasSubjectClassRole(courses,
			subjectId, classId, userId, roleId);
	}

	public int countSubjectClassUserRoleBy(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.countSubjectClassUserRoleBy(courses,
			companyId, groupId);
	}

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getSubjectClassUserRolesByCourse(courses,
			companyId, groupId);
	}

	public int coutSubjectClassUsersByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.coutSubjectClassUsersByC_R(courses,
			companyId, groupId, roleId);
	}

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUsersByC_R(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRoleLocalService.getSubjectClassUsersByC_R(courses,
			companyId, groupId, roleId);
	}

	public TYSubjectClassUserRoleLocalService getWrappedTYSubjectClassUserRoleLocalService() {
		return _tySubjectClassUserRoleLocalService;
	}

	private TYSubjectClassUserRoleLocalService _tySubjectClassUserRoleLocalService;
}