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

import org.tvd.thptty.service.persistence.TYClassUserRolePK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYClassUserRoleClp extends BaseModelImpl<TYClassUserRole>
	implements TYClassUserRole {
	public TYClassUserRoleClp() {
	}

	public TYClassUserRolePK getPrimaryKey() {
		return new TYClassUserRolePK(_courses, _classId, _userId, _roleId);
	}

	public void setPrimaryKey(TYClassUserRolePK pk) {
		setCourses(pk.courses);
		setClassId(pk.classId);
		setUserId(pk.userId);
		setRoleId(pk.roleId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYClassUserRolePK(_courses, _classId, _userId, _roleId);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		_courses = courses;
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

	public TYClassUserRole toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYClassUserRole)Proxy.newProxyInstance(TYClassUserRole.class.getClassLoader(),
				new Class[] { TYClassUserRole.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYClassUserRoleClp clone = new TYClassUserRoleClp();

		clone.setCourses(getCourses());
		clone.setClassId(getClassId());
		clone.setUserId(getUserId());
		clone.setRoleId(getRoleId());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(TYClassUserRole tyClassUserRole) {
		TYClassUserRolePK pk = tyClassUserRole.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYClassUserRoleClp tyClassUserRole = null;

		try {
			tyClassUserRole = (TYClassUserRoleClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYClassUserRolePK pk = tyClassUserRole.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{courses=");
		sb.append(getCourses());
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
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYClassUserRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
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
	private long _classId;
	private long _userId;
	private String _userUuid;
	private long _roleId;
	private int _status;
}