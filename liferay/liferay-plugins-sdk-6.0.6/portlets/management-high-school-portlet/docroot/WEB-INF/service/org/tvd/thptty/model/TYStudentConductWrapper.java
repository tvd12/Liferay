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
 * This class is a wrapper for {@link TYStudentConduct}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudentConduct
 * @generated
 */
public class TYStudentConductWrapper implements TYStudentConduct {
	public TYStudentConductWrapper(TYStudentConduct tyStudentConduct) {
		_tyStudentConduct = tyStudentConduct;
	}

	public org.tvd.thptty.service.persistence.TYStudentConductPK getPrimaryKey() {
		return _tyStudentConduct.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentConductPK pk) {
		_tyStudentConduct.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyStudentConduct.getCourses();
	}

	public void setCourses(int courses) {
		_tyStudentConduct.setCourses(courses);
	}

	public int getSemester() {
		return _tyStudentConduct.getSemester();
	}

	public void setSemester(int semester) {
		_tyStudentConduct.setSemester(semester);
	}

	public long getStudentId() {
		return _tyStudentConduct.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyStudentConduct.setStudentId(studentId);
	}

	public int getConduct() {
		return _tyStudentConduct.getConduct();
	}

	public void setConduct(int conduct) {
		_tyStudentConduct.setConduct(conduct);
	}

	public java.util.Date getModifiedDate() {
		return _tyStudentConduct.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_tyStudentConduct.setModifiedDate(modifiedDate);
	}

	public long getUserId() {
		return _tyStudentConduct.getUserId();
	}

	public void setUserId(long userId) {
		_tyStudentConduct.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConduct.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyStudentConduct.setUserUuid(userUuid);
	}

	public org.tvd.thptty.model.TYStudentConduct toEscapedModel() {
		return _tyStudentConduct.toEscapedModel();
	}

	public boolean isNew() {
		return _tyStudentConduct.isNew();
	}

	public void setNew(boolean n) {
		_tyStudentConduct.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyStudentConduct.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyStudentConduct.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyStudentConduct.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyStudentConduct.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyStudentConduct.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyStudentConduct.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyStudentConduct.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyStudentConduct.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYStudentConduct tyStudentConduct) {
		return _tyStudentConduct.compareTo(tyStudentConduct);
	}

	public int hashCode() {
		return _tyStudentConduct.hashCode();
	}

	public java.lang.String toString() {
		return _tyStudentConduct.toString();
	}

	public java.lang.String toXmlString() {
		return _tyStudentConduct.toXmlString();
	}

	public TYStudentConduct getWrappedTYStudentConduct() {
		return _tyStudentConduct;
	}

	private TYStudentConduct _tyStudentConduct;
}