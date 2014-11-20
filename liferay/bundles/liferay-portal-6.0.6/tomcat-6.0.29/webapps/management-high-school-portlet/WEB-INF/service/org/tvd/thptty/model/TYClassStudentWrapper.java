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
 * This class is a wrapper for {@link TYClassStudent}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYClassStudent
 * @generated
 */
public class TYClassStudentWrapper implements TYClassStudent {
	public TYClassStudentWrapper(TYClassStudent tyClassStudent) {
		_tyClassStudent = tyClassStudent;
	}

	public org.tvd.thptty.service.persistence.TYClassStudentPK getPrimaryKey() {
		return _tyClassStudent.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYClassStudentPK pk) {
		_tyClassStudent.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyClassStudent.getCourses();
	}

	public void setCourses(int courses) {
		_tyClassStudent.setCourses(courses);
	}

	public long getStudentId() {
		return _tyClassStudent.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyClassStudent.setStudentId(studentId);
	}

	public long getClassId() {
		return _tyClassStudent.getClassId();
	}

	public void setClassId(long classId) {
		_tyClassStudent.setClassId(classId);
	}

	public org.tvd.thptty.model.TYClassStudent toEscapedModel() {
		return _tyClassStudent.toEscapedModel();
	}

	public boolean isNew() {
		return _tyClassStudent.isNew();
	}

	public void setNew(boolean n) {
		_tyClassStudent.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyClassStudent.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyClassStudent.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyClassStudent.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyClassStudent.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyClassStudent.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyClassStudent.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyClassStudent.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyClassStudent.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYClassStudent tyClassStudent) {
		return _tyClassStudent.compareTo(tyClassStudent);
	}

	public int hashCode() {
		return _tyClassStudent.hashCode();
	}

	public java.lang.String toString() {
		return _tyClassStudent.toString();
	}

	public java.lang.String toXmlString() {
		return _tyClassStudent.toXmlString();
	}

	public TYClassStudent getWrappedTYClassStudent() {
		return _tyClassStudent;
	}

	private TYClassStudent _tyClassStudent;
}