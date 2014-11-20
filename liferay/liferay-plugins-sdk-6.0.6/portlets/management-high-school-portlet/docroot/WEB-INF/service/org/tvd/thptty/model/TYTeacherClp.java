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

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYTeacherClp extends BaseModelImpl<TYTeacher> implements TYTeacher {
	public TYTeacherClp() {
	}

	public long getPrimaryKey() {
		return _teacherId;
	}

	public void setPrimaryKey(long pk) {
		setTeacherId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_teacherId);
	}

	public long getTeacherId() {
		return _teacherId;
	}

	public void setTeacherId(long teacherId) {
		_teacherId = teacherId;
	}

	public String getTeacherDegree() {
		return _teacherDegree;
	}

	public void setTeacherDegree(String teacherDegree) {
		_teacherDegree = teacherDegree;
	}

	public String getTeacherCertificate() {
		return _teacherCertificate;
	}

	public void setTeacherCertificate(String teacherCertificate) {
		_teacherCertificate = teacherCertificate;
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

	public TYTeacher toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYTeacher)Proxy.newProxyInstance(TYTeacher.class.getClassLoader(),
				new Class[] { TYTeacher.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYTeacherClp clone = new TYTeacherClp();

		clone.setTeacherId(getTeacherId());
		clone.setTeacherDegree(getTeacherDegree());
		clone.setTeacherCertificate(getTeacherCertificate());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(TYTeacher tyTeacher) {
		long pk = tyTeacher.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYTeacherClp tyTeacher = null;

		try {
			tyTeacher = (TYTeacherClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tyTeacher.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{teacherId=");
		sb.append(getTeacherId());
		sb.append(", teacherDegree=");
		sb.append(getTeacherDegree());
		sb.append(", teacherCertificate=");
		sb.append(getTeacherCertificate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYTeacher");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teacherId</column-name><column-value><![CDATA[");
		sb.append(getTeacherId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>teacherDegree</column-name><column-value><![CDATA[");
		sb.append(getTeacherDegree());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>teacherCertificate</column-name><column-value><![CDATA[");
		sb.append(getTeacherCertificate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _teacherId;
	private String _teacherDegree;
	private String _teacherCertificate;
	private long _userId;
	private String _userUuid;
}