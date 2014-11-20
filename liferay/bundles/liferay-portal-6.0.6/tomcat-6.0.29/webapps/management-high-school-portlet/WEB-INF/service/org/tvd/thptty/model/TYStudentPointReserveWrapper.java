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
 * This class is a wrapper for {@link TYStudentPointReserve}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudentPointReserve
 * @generated
 */
public class TYStudentPointReserveWrapper implements TYStudentPointReserve {
	public TYStudentPointReserveWrapper(
		TYStudentPointReserve tyStudentPointReserve) {
		_tyStudentPointReserve = tyStudentPointReserve;
	}

	public org.tvd.thptty.service.persistence.TYStudentPointReservePK getPrimaryKey() {
		return _tyStudentPointReserve.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointReservePK pk) {
		_tyStudentPointReserve.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyStudentPointReserve.getCourses();
	}

	public void setCourses(int courses) {
		_tyStudentPointReserve.setCourses(courses);
	}

	public int getSemester() {
		return _tyStudentPointReserve.getSemester();
	}

	public void setSemester(int semester) {
		_tyStudentPointReserve.setSemester(semester);
	}

	public long getStudentId() {
		return _tyStudentPointReserve.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyStudentPointReserve.setStudentId(studentId);
	}

	public long getSubjectId() {
		return _tyStudentPointReserve.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tyStudentPointReserve.setSubjectId(subjectId);
	}

	public int getPointType() {
		return _tyStudentPointReserve.getPointType();
	}

	public void setPointType(int pointType) {
		_tyStudentPointReserve.setPointType(pointType);
	}

	public int getPointIndex() {
		return _tyStudentPointReserve.getPointIndex();
	}

	public void setPointIndex(int pointIndex) {
		_tyStudentPointReserve.setPointIndex(pointIndex);
	}

	public int getPointFactor() {
		return _tyStudentPointReserve.getPointFactor();
	}

	public void setPointFactor(int pointFactor) {
		_tyStudentPointReserve.setPointFactor(pointFactor);
	}

	public double getPoint() {
		return _tyStudentPointReserve.getPoint();
	}

	public void setPoint(double point) {
		_tyStudentPointReserve.setPoint(point);
	}

	public java.util.Date getModifiedDate() {
		return _tyStudentPointReserve.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_tyStudentPointReserve.setModifiedDate(modifiedDate);
	}

	public long getUserId() {
		return _tyStudentPointReserve.getUserId();
	}

	public void setUserId(long userId) {
		_tyStudentPointReserve.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentPointReserve.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyStudentPointReserve.setUserUuid(userUuid);
	}

	public org.tvd.thptty.model.TYStudentPointReserve toEscapedModel() {
		return _tyStudentPointReserve.toEscapedModel();
	}

	public boolean isNew() {
		return _tyStudentPointReserve.isNew();
	}

	public void setNew(boolean n) {
		_tyStudentPointReserve.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyStudentPointReserve.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyStudentPointReserve.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyStudentPointReserve.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyStudentPointReserve.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyStudentPointReserve.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyStudentPointReserve.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyStudentPointReserve.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyStudentPointReserve.clone();
	}

	public int compareTo(
		org.tvd.thptty.model.TYStudentPointReserve tyStudentPointReserve) {
		return _tyStudentPointReserve.compareTo(tyStudentPointReserve);
	}

	public int hashCode() {
		return _tyStudentPointReserve.hashCode();
	}

	public java.lang.String toString() {
		return _tyStudentPointReserve.toString();
	}

	public java.lang.String toXmlString() {
		return _tyStudentPointReserve.toXmlString();
	}

	public TYStudentPointReserve getWrappedTYStudentPointReserve() {
		return _tyStudentPointReserve;
	}

	private TYStudentPointReserve _tyStudentPointReserve;
}