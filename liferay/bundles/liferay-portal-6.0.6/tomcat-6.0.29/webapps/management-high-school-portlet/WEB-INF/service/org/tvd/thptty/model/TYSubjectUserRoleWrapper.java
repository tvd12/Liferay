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
 * This class is a wrapper for {@link TYSubjectUserRole}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubjectUserRole
 * @generated
 */
public class TYSubjectUserRoleWrapper implements TYSubjectUserRole {
	public TYSubjectUserRoleWrapper(TYSubjectUserRole tySubjectUserRole) {
		_tySubjectUserRole = tySubjectUserRole;
	}

	public org.tvd.thptty.service.persistence.TYSubjectUserRolePK getPrimaryKey() {
		return _tySubjectUserRole.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectUserRolePK pk) {
		_tySubjectUserRole.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tySubjectUserRole.getCourses();
	}

	public void setCourses(int courses) {
		_tySubjectUserRole.setCourses(courses);
	}

	public long getSubjectId() {
		return _tySubjectUserRole.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tySubjectUserRole.setSubjectId(subjectId);
	}

	public long getUserId() {
		return _tySubjectUserRole.getUserId();
	}

	public void setUserId(long userId) {
		_tySubjectUserRole.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectUserRole.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tySubjectUserRole.setUserUuid(userUuid);
	}

	public long getRoleId() {
		return _tySubjectUserRole.getRoleId();
	}

	public void setRoleId(long roleId) {
		_tySubjectUserRole.setRoleId(roleId);
	}

	public org.tvd.thptty.model.TYSubjectUserRole toEscapedModel() {
		return _tySubjectUserRole.toEscapedModel();
	}

	public boolean isNew() {
		return _tySubjectUserRole.isNew();
	}

	public void setNew(boolean n) {
		_tySubjectUserRole.setNew(n);
	}

	public boolean isCachedModel() {
		return _tySubjectUserRole.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tySubjectUserRole.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tySubjectUserRole.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tySubjectUserRole.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tySubjectUserRole.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tySubjectUserRole.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tySubjectUserRole.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tySubjectUserRole.clone();
	}

	public int compareTo(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole) {
		return _tySubjectUserRole.compareTo(tySubjectUserRole);
	}

	public int hashCode() {
		return _tySubjectUserRole.hashCode();
	}

	public java.lang.String toString() {
		return _tySubjectUserRole.toString();
	}

	public java.lang.String toXmlString() {
		return _tySubjectUserRole.toXmlString();
	}

	public TYSubjectUserRole getWrappedTYSubjectUserRole() {
		return _tySubjectUserRole;
	}

	private TYSubjectUserRole _tySubjectUserRole;
}