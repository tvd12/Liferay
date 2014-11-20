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

import org.tvd.thptty.service.persistence.TYStudentConductPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Ta Van Dung
 */
public class TYStudentConductClp extends BaseModelImpl<TYStudentConduct>
	implements TYStudentConduct {
	public TYStudentConductClp() {
	}

	public TYStudentConductPK getPrimaryKey() {
		return new TYStudentConductPK(_courses, _semester, _studentId);
	}

	public void setPrimaryKey(TYStudentConductPK pk) {
		setCourses(pk.courses);
		setSemester(pk.semester);
		setStudentId(pk.studentId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYStudentConductPK(_courses, _semester, _studentId);
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

	public int getConduct() {
		return _conduct;
	}

	public void setConduct(int conduct) {
		_conduct = conduct;
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

	public TYStudentConduct toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYStudentConduct)Proxy.newProxyInstance(TYStudentConduct.class.getClassLoader(),
				new Class[] { TYStudentConduct.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYStudentConductClp clone = new TYStudentConductClp();

		clone.setCourses(getCourses());
		clone.setSemester(getSemester());
		clone.setStudentId(getStudentId());
		clone.setConduct(getConduct());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(TYStudentConduct tyStudentConduct) {
		TYStudentConductPK pk = tyStudentConduct.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYStudentConductClp tyStudentConduct = null;

		try {
			tyStudentConduct = (TYStudentConductClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYStudentConductPK pk = tyStudentConduct.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", semester=");
		sb.append(getSemester());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", conduct=");
		sb.append(getConduct());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYStudentConduct");
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
			"<column><column-name>conduct</column-name><column-value><![CDATA[");
		sb.append(getConduct());
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
	private int _conduct;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
}