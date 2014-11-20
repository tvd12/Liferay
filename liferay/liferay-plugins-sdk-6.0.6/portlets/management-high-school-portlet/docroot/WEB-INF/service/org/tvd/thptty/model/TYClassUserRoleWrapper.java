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

package org.tvd.thptty.model;

/**
 * <p>
 * This class is a wrapper for {@link TYClassUserRole}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYClassUserRole
 * @generated
 */
public class TYClassUserRoleWrapper implements TYClassUserRole {
	public TYClassUserRoleWrapper(TYClassUserRole tyClassUserRole) {
		_tyClassUserRole = tyClassUserRole;
	}

	public org.tvd.thptty.service.persistence.TYClassUserRolePK getPrimaryKey() {
		return _tyClassUserRole.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassUserRolePK pk) {
		_tyClassUserRole.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyClassUserRole.getCourses();
	}

	public void setCourses(int courses) {
		_tyClassUserRole.setCourses(courses);
	}

	public long getClassId() {
		return _tyClassUserRole.getClassId();
	}

	public void setClassId(long classId) {
		_tyClassUserRole.setClassId(classId);
	}

	public long getUserId() {
		return _tyClassUserRole.getUserId();
	}

	public void setUserId(long userId) {
		_tyClassUserRole.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClassUserRole.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyClassUserRole.setUserUuid(userUuid);
	}

	public long getRoleId() {
		return _tyClassUserRole.getRoleId();
	}

	public void setRoleId(long roleId) {
		_tyClassUserRole.setRoleId(roleId);
	}

	public int getStatus() {
		return _tyClassUserRole.getStatus();
	}

	public void setStatus(int status) {
		_tyClassUserRole.setStatus(status);
	}

	public org.tvd.thptty.model.TYClassUserRole toEscapedModel() {
		return _tyClassUserRole.toEscapedModel();
	}

	public boolean isNew() {
		return _tyClassUserRole.isNew();
	}

	public void setNew(boolean n) {
		_tyClassUserRole.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyClassUserRole.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyClassUserRole.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyClassUserRole.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyClassUserRole.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyClassUserRole.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyClassUserRole.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyClassUserRole.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyClassUserRole.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYClassUserRole tyClassUserRole) {
		return _tyClassUserRole.compareTo(tyClassUserRole);
	}

	public int hashCode() {
		return _tyClassUserRole.hashCode();
	}

	public java.lang.String toString() {
		return _tyClassUserRole.toString();
	}

	public java.lang.String toXmlString() {
		return _tyClassUserRole.toXmlString();
	}

	public TYClassUserRole getWrappedTYClassUserRole() {
		return _tyClassUserRole;
	}

	private TYClassUserRole _tyClassUserRole;
}