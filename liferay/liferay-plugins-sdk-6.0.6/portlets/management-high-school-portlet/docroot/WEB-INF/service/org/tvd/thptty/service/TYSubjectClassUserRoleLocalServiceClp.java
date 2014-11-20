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
public class TYSubjectClassUserRoleLocalServiceClp
	implements TYSubjectClassUserRoleLocalService {
	public TYSubjectClassUserRoleLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole addTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTYSubjectClassUserRoleMethodKey0,
				tySubjectClassUserRole);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole createTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTYSubjectClassUserRoleMethodKey1,
				tySubjectClassUserRolePK);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYSubjectClassUserRoleMethodKey2,
				tySubjectClassUserRolePK);

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

	public void deleteTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYSubjectClassUserRoleMethodKey3,
				tySubjectClassUserRole);

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

	public org.tvd.thptty.model.TYSubjectClassUserRole getTYSubjectClassUserRole(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYSubjectClassUserRoleMethodKey8,
				tySubjectClassUserRolePK);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getTYSubjectClassUserRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYSubjectClassUserRolesMethodKey9,
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

		return (java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTYSubjectClassUserRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYSubjectClassUserRolesCountMethodKey10);

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

	public org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYSubjectClassUserRoleMethodKey11,
				tySubjectClassUserRole);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole updateTYSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYSubjectClassUserRoleMethodKey12,
				tySubjectClassUserRole, merge);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole addSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole newSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addSubjectClassUserRoleMethodKey13,
				newSCUR);

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

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYClass> getClassBySubjectUserRole(
		int courses, long subjectId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getClassBySubjectUserRoleMethodKey14,
				courses, subjectId, userId, roleId);

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

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectsClassesByUserRole(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSubjectsClassesByUserRoleMethodKey15,
				courses, userId, roleId);

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

		return (java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteSubjectClassUserRole(
		org.tvd.thptty.model.TYSubjectClassUserRole oldSCUR)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteSubjectClassUserRoleMethodKey16,
				oldSCUR);

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

	public org.tvd.thptty.model.TYSubjectClassUserRole hasSubjectClassRole(
		int courses, long subjectId, long classId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_hasSubjectClassRoleMethodKey17,
				courses, subjectId, classId, userId, roleId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof org.tvd.thptty.NoSuchSubjectClassUserRoleException) {
				throw (org.tvd.thptty.NoSuchSubjectClassUserRoleException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYSubjectClassUserRole)ClpSerializer.translateOutput(returnObj);
	}

	public int countSubjectClassUserRoleBy(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countSubjectClassUserRoleByMethodKey18,
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

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUserRolesByCourse(
		int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSubjectClassUserRolesByCourseMethodKey19,
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

		return (java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public int coutSubjectClassUsersByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_coutSubjectClassUsersByC_RMethodKey20,
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

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> getSubjectClassUsersByC_R(
		int courses, long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getSubjectClassUsersByC_RMethodKey21,
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

		return (java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole>)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTYSubjectClassUserRoleMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addTYSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class);
	private MethodKey _createTYSubjectClassUserRoleMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"createTYSubjectClassUserRole",
			org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK.class);
	private MethodKey _deleteTYSubjectClassUserRoleMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYSubjectClassUserRole",
			org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK.class);
	private MethodKey _deleteTYSubjectClassUserRoleMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class);
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
	private MethodKey _getTYSubjectClassUserRoleMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYSubjectClassUserRole",
			org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK.class);
	private MethodKey _getTYSubjectClassUserRolesMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYSubjectClassUserRoles", int.class, int.class);
	private MethodKey _getTYSubjectClassUserRolesCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYSubjectClassUserRolesCount");
	private MethodKey _updateTYSubjectClassUserRoleMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class);
	private MethodKey _updateTYSubjectClassUserRoleMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class, boolean.class);
	private MethodKey _addSubjectClassUserRoleMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"addSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class);
	private MethodKey _getClassBySubjectUserRoleMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getClassBySubjectUserRole", int.class, long.class, long.class,
			long.class);
	private MethodKey _getSubjectsClassesByUserRoleMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSubjectsClassesByUserRole", int.class, long.class, long.class);
	private MethodKey _deleteSubjectClassUserRoleMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteSubjectClassUserRole",
			org.tvd.thptty.model.TYSubjectClassUserRole.class);
	private MethodKey _hasSubjectClassRoleMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"hasSubjectClassRole", int.class, long.class, long.class,
			long.class, long.class);
	private MethodKey _countSubjectClassUserRoleByMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"countSubjectClassUserRoleBy", int.class, long.class, long.class);
	private MethodKey _getSubjectClassUserRolesByCourseMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSubjectClassUserRolesByCourse", int.class, long.class,
			long.class);
	private MethodKey _coutSubjectClassUsersByC_RMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"coutSubjectClassUsersByC_R", int.class, long.class, long.class,
			long.class);
	private MethodKey _getSubjectClassUsersByC_RMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"getSubjectClassUsersByC_R", int.class, long.class, long.class,
			long.class);
}