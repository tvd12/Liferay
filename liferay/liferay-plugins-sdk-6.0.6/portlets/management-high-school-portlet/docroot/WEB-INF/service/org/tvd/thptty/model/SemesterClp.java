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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.tvd.thptty.service.persistence.SemesterPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class SemesterClp extends BaseModelImpl<Semester> implements Semester {
	public SemesterClp() {
	}

	public SemesterPK getPrimaryKey() {
		return new SemesterPK(_companyId, _groupId, _semesterId);
	}

	public void setPrimaryKey(SemesterPK pk) {
		setCompanyId(pk.companyId);
		setGroupId(pk.groupId);
		setSemesterId(pk.semesterId);
	}

	public Serializable getPrimaryKeyObj() {
		return new SemesterPK(_companyId, _groupId, _semesterId);
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

	public int getSemesterId() {
		return _semesterId;
	}

	public void setSemesterId(int semesterId) {
		_semesterId = semesterId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public Semester toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Semester)Proxy.newProxyInstance(Semester.class.getClassLoader(),
				new Class[] { Semester.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		SemesterClp clone = new SemesterClp();

		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setSemesterId(getSemesterId());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(Semester semester) {
		SemesterPK pk = semester.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SemesterClp semester = null;

		try {
			semester = (SemesterClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		SemesterPK pk = semester.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", semesterId=");
		sb.append(getSemesterId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.Semester");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>semesterId</column-name><column-value><![CDATA[");
		sb.append(getSemesterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _companyId;
	private long _groupId;
	private int _semesterId;
	private int _status;
}