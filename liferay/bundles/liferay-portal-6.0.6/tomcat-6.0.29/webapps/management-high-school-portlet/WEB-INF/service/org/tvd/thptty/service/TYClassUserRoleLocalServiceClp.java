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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Ta Van Dung
 */
public class TYClassUserRoleLocalServiceClp
	implements TYClassUserRoleLocalService {
	public TYClassUserRoleLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public org.tvd.thptty.model.TYClassUserRole addTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTYClassUserRoleMethodKey0,
				tyClassUserRole);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYClassUserRole createTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTYClassUserRoleMethodKey1,
				tyClassUserRolePK);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYClassUserRoleMethodKey2,
				tyClassUserRolePK);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYClassUserRoleMethodKey3,
				tyClassUserRole);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				dynamicQuery, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				dynamicQuery, start, end, orderByComparator);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public org.tvd.thptty.model.TYClassUserRole getTYClassUserRole(
		org.tvd.thptty.service.persistence.TYClassUserRolePK tyClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYClassUserRoleMethodKey8,
				tyClassUserRolePK);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getTYClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYClassUserRolesMethodKey9,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTYClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYClassUserRolesCountMethodKey10);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYClassUserRoleMethodKey11,
				tyClassUserRole);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYClassUserRole updateTYClassUserRole(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYClassUserRoleMethodKey12,
				tyClassUserRole, merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYClassUserRole addClassUserRole(
		org.tvd.thptty.model.TYClassUserRole newRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addClassUserRoleMethodKey13,
				newRole);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.model.User getUserByClassRole(int courses,
		long classId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getUserByClassRoleMethodKey14,
				courses, classId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.User)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassesByUserRole(
		int courses, long groupId, long companyId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getClassesByUserRoleMethodKey15,
				courses, groupId, companyId, userId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYClass>)ClpSerializer.translateOutput(returnObj);
	}

	public int countClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countClassesUserRoleByC_RMethodKey16,
				courses, companyId, groupId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassesByRole(
		int courses, long groupId, long companyId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getClassesByRoleMethodKey17,
				courses, groupId, companyId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYClass>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassesUsersByC_G(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getClassesUsersByC_GMethodKey18,
				courses, companyId, groupId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteClassUserRole(
		org.tvd.thptty.model.TYClassUserRole oldRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteClassUserRoleMethodKey19,
				oldRole);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public org.tvd.thptty.model.TYClassUserRole isTeacherManagement(
		int courses, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchClassUserRoleException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_isTeacherManagementMethodKey20,
				courses, classId, userId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.tvd.thptty.NoSuchClassUserRoleException) {
				throw (org.tvd.thptty.NoSuchClassUserRoleException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public int countClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countClassesUserRoleByCourseMethodKey21,
				courses, companyId, groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> getClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getClassUserRolesByCourseMethodKey22,
				courses, companyId, groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTYClassUserRoleMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addTYClassUserRole", org.tvd.thptty.model.TYClassUserRole.class);
	private MethodKey _createTYClassUserRoleMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"createTYClassUserRole",
			org.tvd.thptty.service.persistence.TYClassUserRolePK.class);
	private MethodKey _deleteTYClassUserRoleMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYClassUserRole",
			org.tvd.thptty.service.persistence.TYClassUserRolePK.class);
	private MethodKey _deleteTYClassUserRoleMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYClassUserRole", org.tvd.thptty.model.TYClassUserRole.class);
	private MethodKey _dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery", com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class);
	private MethodKey _dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQueryCount",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _getTYClassUserRoleMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYClassUserRole",
			org.tvd.thptty.service.persistence.TYClassUserRolePK.class);
	private MethodKey _getTYClassUserRolesMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYClassUserRoles", int.class, int.class);
	private MethodKey _getTYClassUserRolesCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYClassUserRolesCount");
	private MethodKey _updateTYClassUserRoleMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYClassUserRole", org.tvd.thptty.model.TYClassUserRole.class);
	private MethodKey _updateTYClassUserRoleMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYClassUserRole",
			org.tvd.thptty.model.TYClassUserRole.class, boolean.class);
	private MethodKey _addClassUserRoleMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"addClassUserRole", org.tvd.thptty.model.TYClassUserRole.class);
	private MethodKey _getUserByClassRoleMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getUserByClassRole", int.class, long.class, long.class);
	private MethodKey _getClassesByUserRoleMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getClassesByUserRole", int.class, long.class, long.class,
			long.class, long.class);
	private MethodKey _countClassesUserRoleByC_RMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"countClassesUserRoleByC_R", int.class, long.class, long.class,
			long.class);
	private MethodKey _getClassesByRoleMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"getClassesByRole", int.class, long.class, long.class, long.class);
	private MethodKey _getClassesUsersByC_GMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"getClassesUsersByC_G", int.class, long.class, long.class,
			long.class);
	private MethodKey _deleteClassUserRoleMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteClassUserRole", org.tvd.thptty.model.TYClassUserRole.class);
	private MethodKey _isTeacherManagementMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"isTeacherManagement", int.class, long.class, long.class, long.class);
	private MethodKey _countClassesUserRoleByCourseMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"countClassesUserRoleByCourse", int.class, long.class, long.class);
	private MethodKey _getClassUserRolesByCourseMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"getClassUserRolesByCourse", int.class, long.class, long.class);
}