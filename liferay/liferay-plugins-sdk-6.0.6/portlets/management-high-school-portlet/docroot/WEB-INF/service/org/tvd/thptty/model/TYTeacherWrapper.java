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
 * This class is a wrapper for {@link TYTeacher}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYTeacher
 * @generated
 */
public class TYTeacherWrapper implements TYTeacher {
	public TYTeacherWrapper(TYTeacher tyTeacher) {
		_tyTeacher = tyTeacher;
	}

	public long getPrimaryKey() {
		return _tyTeacher.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tyTeacher.setPrimaryKey(pk);
	}

	public long getTeacherId() {
		return _tyTeacher.getTeacherId();
	}

	public void setTeacherId(long teacherId) {
		_tyTeacher.setTeacherId(teacherId);
	}

	public java.lang.String getTeacherDegree() {
		return _tyTeacher.getTeacherDegree();
	}

	public void setTeacherDegree(java.lang.String teacherDegree) {
		_tyTeacher.setTeacherDegree(teacherDegree);
	}

	public java.lang.String getTeacherCertificate() {
		return _tyTeacher.getTeacherCertificate();
	}

	public void setTeacherCertificate(java.lang.String teacherCertificate) {
		_tyTeacher.setTeacherCertificate(teacherCertificate);
	}

	public long getUserId() {
		return _tyTeacher.getUserId();
	}

	public void setUserId(long userId) {
		_tyTeacher.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacher.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyTeacher.setUserUuid(userUuid);
	}

	public org.tvd.thptty.model.TYTeacher toEscapedModel() {
		return _tyTeacher.toEscapedModel();
	}

	public boolean isNew() {
		return _tyTeacher.isNew();
	}

	public void setNew(boolean n) {
		_tyTeacher.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyTeacher.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyTeacher.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyTeacher.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyTeacher.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyTeacher.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyTeacher.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyTeacher.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyTeacher.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYTeacher tyTeacher) {
		return _tyTeacher.compareTo(tyTeacher);
	}

	public int hashCode() {
		return _tyTeacher.hashCode();
	}

	public java.lang.String toString() {
		return _tyTeacher.toString();
	}

	public java.lang.String toXmlString() {
		return _tyTeacher.toXmlString();
	}

	public TYTeacher getWrappedTYTeacher() {
		return _tyTeacher;
	}

	private TYTeacher _tyTeacher;
}