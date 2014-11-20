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
 * This class is a wrapper for {@link TYPrioritySubject}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYPrioritySubject
 * @generated
 */
public class TYPrioritySubjectWrapper implements TYPrioritySubject {
	public TYPrioritySubjectWrapper(TYPrioritySubject tyPrioritySubject) {
		_tyPrioritySubject = tyPrioritySubject;
	}

	public org.tvd.thptty.service.persistence.TYPrioritySubjectPK getPrimaryKey() {
		return _tyPrioritySubject.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYPrioritySubjectPK pk) {
		_tyPrioritySubject.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyPrioritySubject.getCourses();
	}

	public void setCourses(int courses) {
		_tyPrioritySubject.setCourses(courses);
	}

	public long getSubjectId() {
		return _tyPrioritySubject.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tyPrioritySubject.setSubjectId(subjectId);
	}

	public long getStudentId() {
		return _tyPrioritySubject.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyPrioritySubject.setStudentId(studentId);
	}

	public boolean getIsSpecial() {
		return _tyPrioritySubject.getIsSpecial();
	}

	public boolean isIsSpecial() {
		return _tyPrioritySubject.isIsSpecial();
	}

	public void setIsSpecial(boolean isSpecial) {
		_tyPrioritySubject.setIsSpecial(isSpecial);
	}

	public int getExtra() {
		return _tyPrioritySubject.getExtra();
	}

	public void setExtra(int extra) {
		_tyPrioritySubject.setExtra(extra);
	}

	public org.tvd.thptty.model.TYPrioritySubject toEscapedModel() {
		return _tyPrioritySubject.toEscapedModel();
	}

	public boolean isNew() {
		return _tyPrioritySubject.isNew();
	}

	public void setNew(boolean n) {
		_tyPrioritySubject.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyPrioritySubject.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyPrioritySubject.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyPrioritySubject.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyPrioritySubject.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyPrioritySubject.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyPrioritySubject.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyPrioritySubject.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyPrioritySubject.clone();
	}

	public int compareTo(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject) {
		return _tyPrioritySubject.compareTo(tyPrioritySubject);
	}

	public int hashCode() {
		return _tyPrioritySubject.hashCode();
	}

	public java.lang.String toString() {
		return _tyPrioritySubject.toString();
	}

	public java.lang.String toXmlString() {
		return _tyPrioritySubject.toXmlString();
	}

	public TYPrioritySubject getWrappedTYPrioritySubject() {
		return _tyPrioritySubject;
	}

	private TYPrioritySubject _tyPrioritySubject;
}