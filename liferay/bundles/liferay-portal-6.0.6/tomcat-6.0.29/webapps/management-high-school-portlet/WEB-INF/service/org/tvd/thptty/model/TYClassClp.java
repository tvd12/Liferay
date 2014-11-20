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

import java.util.Date;

/**
 * @author Ta Van Dung
 */
public class TYClassClp extends BaseModelImpl<TYClass> implements TYClass {
	public TYClassClp() {
	}

	public long getPrimaryKey() {
		return _classId;
	}

	public void setPrimaryKey(long pk) {
		setClassId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_classId);
	}

	public long getClassId() {
		return _classId;
	}

	public void setClassId(long classId) {
		_classId = classId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getClassCode() {
		return _classCode;
	}

	public void setClassCode(String classCode) {
		_classCode = classCode;
	}

	public int getClassGroup() {
		return _classGroup;
	}

	public void setClassGroup(int classGroup) {
		_classGroup = classGroup;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
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

	public java.lang.String getClassFullName() {
		throw new UnsupportedOperationException();
	}

	public void setClassFullName(java.lang.String classFullName) {
		throw new UnsupportedOperationException();
	}

	public void setIndex(int index) {
		throw new UnsupportedOperationException();
	}

	public int getIndex() {
		throw new UnsupportedOperationException();
	}

	public TYClass toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYClass)Proxy.newProxyInstance(TYClass.class.getClassLoader(),
				new Class[] { TYClass.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYClassClp clone = new TYClassClp();

		clone.setClassId(getClassId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setClassCode(getClassCode());
		clone.setClassGroup(getClassGroup());
		clone.setClassName(getClassName());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(TYClass tyClass) {
		int value = 0;

		if (getClassId() < tyClass.getClassId()) {
			value = -1;
		}
		else if (getClassId() > tyClass.getClassId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYClassClp tyClass = null;

		try {
			tyClass = (TYClassClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tyClass.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{classId=");
		sb.append(getClassId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", classCode=");
		sb.append(getClassCode());
		sb.append(", classGroup=");
		sb.append(getClassGroup());
		sb.append(", className=");
		sb.append(getClassName());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYClass");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>classId</column-name><column-value><![CDATA[");
		sb.append(getClassId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classCode</column-name><column-value><![CDATA[");
		sb.append(getClassCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classGroup</column-name><column-value><![CDATA[");
		sb.append(getClassGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>className</column-name><column-value><![CDATA[");
		sb.append(getClassName());
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

	private long _classId;
	private long _companyId;
	private long _groupId;
	private String _classCode;
	private int _classGroup;
	private String _className;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
}