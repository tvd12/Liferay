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
 * This class is a wrapper for {@link Semester}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       Semester
 * @generated
 */
public class SemesterWrapper implements Semester {
	public SemesterWrapper(Semester semester) {
		_semester = semester;
	}

	public org.tvd.thptty.service.persistence.SemesterPK getPrimaryKey() {
		return _semester.getPrimaryKey();
	}

	public void setPrimaryKey(org.tvd.thptty.service.persistence.SemesterPK pk) {
		_semester.setPrimaryKey(pk);
	}

	public long getCompanyId() {
		return _semester.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_semester.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _semester.getGroupId();
	}

	public void setGroupId(long groupId) {
		_semester.setGroupId(groupId);
	}

	public int getSemesterId() {
		return _semester.getSemesterId();
	}

	public void setSemesterId(int semesterId) {
		_semester.setSemesterId(semesterId);
	}

	public int getStatus() {
		return _semester.getStatus();
	}

	public void setStatus(int status) {
		_semester.setStatus(status);
	}

	public org.tvd.thptty.model.Semester toEscapedModel() {
		return _semester.toEscapedModel();
	}

	public boolean isNew() {
		return _semester.isNew();
	}

	public void setNew(boolean n) {
		_semester.setNew(n);
	}

	public boolean isCachedModel() {
		return _semester.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_semester.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _semester.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_semester.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _semester.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _semester.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_semester.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _semester.clone();
	}

	public int compareTo(org.tvd.thptty.model.Semester semester) {
		return _semester.compareTo(semester);
	}

	public int hashCode() {
		return _semester.hashCode();
	}

	public java.lang.String toString() {
		return _semester.toString();
	}

	public java.lang.String toXmlString() {
		return _semester.toXmlString();
	}

	public Semester getWrappedSemester() {
		return _semester;
	}

	private Semester _semester;
}