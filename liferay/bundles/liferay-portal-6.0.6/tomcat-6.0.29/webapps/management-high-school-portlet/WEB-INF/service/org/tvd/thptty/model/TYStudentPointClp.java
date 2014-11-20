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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.tvd.thptty.service.persistence.TYStudentPointPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Ta Van Dung
 */
public class TYStudentPointClp extends BaseModelImpl<TYStudentPoint>
	implements TYStudentPoint {
	public TYStudentPointClp() {
	}

	public TYStudentPointPK getPrimaryKey() {
		return new TYStudentPointPK(_courses, _semester, _studentId,
			_subjectId, _pointType, _pointIndex, _pointFactor);
	}

	public void setPrimaryKey(TYStudentPointPK pk) {
		setCourses(pk.courses);
		setSemester(pk.semester);
		setStudentId(pk.studentId);
		setSubjectId(pk.subjectId);
		setPointType(pk.pointType);
		setPointIndex(pk.pointIndex);
		setPointFactor(pk.pointFactor);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYStudentPointPK(_courses, _semester, _studentId,
			_subjectId, _pointType, _pointIndex, _pointFactor);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		_courses = courses;
	}

	public int getSemester() {
		return _semester;
	}

	public void setSemester(int semester) {
		_semester = semester;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public int getPointType() {
		return _pointType;
	}

	public void setPointType(int pointType) {
		_pointType = pointType;
	}

	public int getPointIndex() {
		return _pointIndex;
	}

	public void setPointIndex(int pointIndex) {
		_pointIndex = pointIndex;
	}

	public int getPointFactor() {
		return _pointFactor;
	}

	public void setPointFactor(int pointFactor) {
		_pointFactor = pointFactor;
	}

	public double getPoint() {
		return _point;
	}

	public void setPoint(double point) {
		_point = point;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public java.lang.String toMobileMessage() {
		throw new UnsupportedOperationException();
	}

	public TYStudentPoint toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYStudentPoint)Proxy.newProxyInstance(TYStudentPoint.class.getClassLoader(),
				new Class[] { TYStudentPoint.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYStudentPointClp clone = new TYStudentPointClp();

		clone.setCourses(getCourses());
		clone.setSemester(getSemester());
		clone.setStudentId(getStudentId());
		clone.setSubjectId(getSubjectId());
		clone.setPointType(getPointType());
		clone.setPointIndex(getPointIndex());
		clone.setPointFactor(getPointFactor());
		clone.setPoint(getPoint());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(TYStudentPoint tyStudentPoint) {
		TYStudentPointPK pk = tyStudentPoint.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYStudentPointClp tyStudentPoint = null;

		try {
			tyStudentPoint = (TYStudentPointClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYStudentPointPK pk = tyStudentPoint.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", semester=");
		sb.append(getSemester());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", pointType=");
		sb.append(getPointType());
		sb.append(", pointIndex=");
		sb.append(getPointIndex());
		sb.append(", pointFactor=");
		sb.append(getPointFactor());
		sb.append(", point=");
		sb.append(getPoint());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYStudentPoint");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>semester</column-name><column-value><![CDATA[");
		sb.append(getSemester());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointType</column-name><column-value><![CDATA[");
		sb.append(getPointType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointIndex</column-name><column-value><![CDATA[");
		sb.append(getPointIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointFactor</column-name><column-value><![CDATA[");
		sb.append(getPointFactor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>point</column-name><column-value><![CDATA[");
		sb.append(getPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private int _semester;
	private long _studentId;
	private long _subjectId;
	private int _pointType;
	private int _pointIndex;
	private int _pointFactor;
	private double _point;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
}