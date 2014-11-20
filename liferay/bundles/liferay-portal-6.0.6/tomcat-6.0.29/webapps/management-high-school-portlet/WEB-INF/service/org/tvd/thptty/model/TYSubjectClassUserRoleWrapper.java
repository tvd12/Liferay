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
 * This class is a wrapper for {@link TYSubjectClassUserRole}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubjectClassUserRole
 * @generated
 */
public class TYSubjectClassUserRoleWrapper implements TYSubjectClassUserRole {
	public TYSubjectClassUserRoleWrapper(
		TYSubjectClassUserRole tySubjectClassUserRole) {
		_tySubjectClassUserRole = tySubjectClassUserRole;
	}

	public org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK getPrimaryKey() {
		return _tySubjectClassUserRole.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK pk) {
		_tySubjectClassUserRole.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tySubjectClassUserRole.getCourses();
	}

	public void setCourses(int courses) {
		_tySubjectClassUserRole.setCourses(courses);
	}

	public long getSubjectId() {
		return _tySubjectClassUserRole.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tySubjectClassUserRole.setSubjectId(subjectId);
	}

	public long getClassId() {
		return _tySubjectClassUserRole.getClassId();
	}

	public void setClassId(long classId) {
		_tySubjectClassUserRole.setClassId(classId);
	}

	public long getUserId() {
		return _tySubjectClassUserRole.getUserId();
	}

	public void setUserId(long userId) {
		_tySubjectClassUserRole.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectClassUserRole.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tySubjectClassUserRole.setUserUuid(userUuid);
	}

	public long getRoleId() {
		return _tySubjectClassUserRole.getRoleId();
	}

	public void setRoleId(long roleId) {
		_tySubjectClassUserRole.setRoleId(roleId);
	}

	public int getStatus() {
		return _tySubjectClassUserRole.getStatus();
	}

	public void setStatus(int status) {
		_tySubjectClassUserRole.setStatus(status);
	}

	public org.tvd.thptty.model.TYSubjectClassUserRole toEscapedModel() {
		return _tySubjectClassUserRole.toEscapedModel();
	}

	public boolean isNew() {
		return _tySubjectClassUserRole.isNew();
	}

	public void setNew(boolean n) {
		_tySubjectClassUserRole.setNew(n);
	}

	public boolean isCachedModel() {
		return _tySubjectClassUserRole.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tySubjectClassUserRole.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tySubjectClassUserRole.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tySubjectClassUserRole.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tySubjectClassUserRole.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tySubjectClassUserRole.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tySubjectClassUserRole.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tySubjectClassUserRole.clone();
	}

	public int compareTo(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole) {
		return _tySubjectClassUserRole.compareTo(tySubjectClassUserRole);
	}

	public int hashCode() {
		return _tySubjectClassUserRole.hashCode();
	}

	public java.lang.String toString() {
		return _tySubjectClassUserRole.toString();
	}

	public java.lang.String toXmlString() {
		return _tySubjectClassUserRole.toXmlString();
	}

	public TYSubjectClassUserRole getWrappedTYSubjectClassUserRole() {
		return _tySubjectClassUserRole;
	}

	private TYSubjectClassUserRole _tySubjectClassUserRole;
}