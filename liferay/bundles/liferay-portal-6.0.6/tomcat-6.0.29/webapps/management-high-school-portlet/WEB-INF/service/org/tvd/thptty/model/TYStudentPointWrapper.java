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
 * This class is a wrapper for {@link TYStudentPoint}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudentPoint
 * @generated
 */
public class TYStudentPointWrapper implements TYStudentPoint {
	public TYStudentPointWrapper(TYStudentPoint tyStudentPoint) {
		_tyStudentPoint = tyStudentPoint;
	}

	public org.tvd.thptty.service.persistence.TYStudentPointPK getPrimaryKey() {
		return _tyStudentPoint.getPrimaryKey();
	}

	public void setPrimaryKey(
		org.tvd.thptty.service.persistence.TYStudentPointPK pk) {
		_tyStudentPoint.setPrimaryKey(pk);
	}

	public int getCourses() {
		return _tyStudentPoint.getCourses();
	}

	public void setCourses(int courses) {
		_tyStudentPoint.setCourses(courses);
	}

	public int getSemester() {
		return _tyStudentPoint.getSemester();
	}

	public void setSemester(int semester) {
		_tyStudentPoint.setSemester(semester);
	}

	public long getStudentId() {
		return _tyStudentPoint.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyStudentPoint.setStudentId(studentId);
	}

	public long getSubjectId() {
		return _tyStudentPoint.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tyStudentPoint.setSubjectId(subjectId);
	}

	public int getPointType() {
		return _tyStudentPoint.getPointType();
	}

	public void setPointType(int pointType) {
		_tyStudentPoint.setPointType(pointType);
	}

	public int getPointIndex() {
		return _tyStudentPoint.getPointIndex();
	}

	public void setPointIndex(int pointIndex) {
		_tyStudentPoint.setPointIndex(pointIndex);
	}

	public int getPointFactor() {
		return _tyStudentPoint.getPointFactor();
	}

	public void setPointFactor(int pointFactor) {
		_tyStudentPoint.setPointFactor(pointFactor);
	}

	public double getPoint() {
		return _tyStudentPoint.getPoint();
	}

	public void setPoint(double point) {
		_tyStudentPoint.setPoint(point);
	}

	public java.util.Date getModifiedDate() {
		return _tyStudentPoint.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_tyStudentPoint.setModifiedDate(modifiedDate);
	}

	public long getUserId() {
		return _tyStudentPoint.getUserId();
	}

	public void setUserId(long userId) {
		_tyStudentPoint.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentPoint.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyStudentPoint.setUserUuid(userUuid);
	}

	public org.tvd.thptty.model.TYStudentPoint toEscapedModel() {
		return _tyStudentPoint.toEscapedModel();
	}

	public boolean isNew() {
		return _tyStudentPoint.isNew();
	}

	public void setNew(boolean n) {
		_tyStudentPoint.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyStudentPoint.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyStudentPoint.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyStudentPoint.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyStudentPoint.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyStudentPoint.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyStudentPoint.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyStudentPoint.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyStudentPoint.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYStudentPoint tyStudentPoint) {
		return _tyStudentPoint.compareTo(tyStudentPoint);
	}

	public int hashCode() {
		return _tyStudentPoint.hashCode();
	}

	public java.lang.String toString() {
		return _tyStudentPoint.toString();
	}

	public java.lang.String toXmlString() {
		return _tyStudentPoint.toXmlString();
	}

	public java.lang.String toMobileMessage() {
		return _tyStudentPoint.toMobileMessage();
	}

	public TYStudentPoint getWrappedTYStudentPoint() {
		return _tyStudentPoint;
	}

	private TYStudentPoint _tyStudentPoint;
}