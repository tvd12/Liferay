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

import org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYSubjectClassUserRoleClp extends BaseModelImpl<TYSubjectClassUserRole>
	implements TYSubjectClassUserRole {
	public TYSubjectClassUserRoleClp() {
	}

	public TYSubjectClassUserRolePK getPrimaryKey() {
		return new TYSubjectClassUserRolePK(_courses, _subjectId, _classId,
			_userId, _roleId);
	}

	public void setPrimaryKey(TYSubjectClassUserRolePK pk) {
		setCourses(pk.courses);
		setSubjectId(pk.subjectId);
		setClassId(pk.classId);
		setUserId(pk.userId);
		setRoleId(pk.roleId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYSubjectClassUserRolePK(_courses, _subjectId, _classId,
			_userId, _roleId);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		_courses = courses;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public long getClassId() {
		return _classId;
	}

	public void setClassId(long classId) {
		_classId = classId;
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

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public TYSubjectClassUserRole toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYSubjectClassUserRole)Proxy.newProxyInstance(TYSubjectClassUserRole.class.getClassLoader(),
				new Class[] { TYSubjectClassUserRole.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYSubjectClassUserRoleClp clone = new TYSubjectClassUserRoleClp();

		clone.setCourses(getCourses());
		clone.setSubjectId(getSubjectId());
		clone.setClassId(getClassId());
		clone.setUserId(getUserId());
		clone.setRoleId(getRoleId());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(TYSubjectClassUserRole tySubjectClassUserRole) {
		TYSubjectClassUserRolePK pk = tySubjectClassUserRole.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYSubjectClassUserRoleClp tySubjectClassUserRole = null;

		try {
			tySubjectClassUserRole = (TYSubjectClassUserRoleClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYSubjectClassUserRolePK pk = tySubjectClassUserRole.getPrimaryKey();

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
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", classId=");
		sb.append(getClassId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYSubjectClassUserRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classId</column-name><column-value><![CDATA[");
		sb.append(getClassId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private long _subjectId;
	private long _classId;
	private long _userId;
	private String _userUuid;
	private long _roleId;
	private int _status;
}