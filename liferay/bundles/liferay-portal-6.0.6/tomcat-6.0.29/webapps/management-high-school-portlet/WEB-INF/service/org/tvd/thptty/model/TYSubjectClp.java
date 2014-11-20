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

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYSubjectClp extends BaseModelImpl<TYSubject> implements TYSubject {
	public TYSubjectClp() {
	}

	public long getPrimaryKey() {
		return _subjectId;
	}

	public void setPrimaryKey(long pk) {
		setSubjectId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_subjectId);
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
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

	public String getSubjectCode() {
		return _subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		_subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return _subjectName;
	}

	public void setSubjectName(String subjectName) {
		_subjectName = subjectName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setIndex(int index) {
		throw new UnsupportedOperationException();
	}

	public int getIndex() {
		throw new UnsupportedOperationException();
	}

	public TYSubject toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYSubject)Proxy.newProxyInstance(TYSubject.class.getClassLoader(),
				new Class[] { TYSubject.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYSubjectClp clone = new TYSubjectClp();

		clone.setSubjectId(getSubjectId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setSubjectCode(getSubjectCode());
		clone.setSubjectName(getSubjectName());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(TYSubject tySubject) {
		long pk = tySubject.getPrimaryKey();

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

		TYSubjectClp tySubject = null;

		try {
			tySubject = (TYSubjectClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tySubject.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{subjectId=");
		sb.append(getSubjectId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", subjectCode=");
		sb.append(getSubjectCode());
		sb.append(", subjectName=");
		sb.append(getSubjectName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYSubject");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
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
			"<column><column-name>subjectCode</column-name><column-value><![CDATA[");
		sb.append(getSubjectCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectName</column-name><column-value><![CDATA[");
		sb.append(getSubjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _subjectId;
	private long _companyId;
	private long _groupId;
	private String _subjectCode;
	private String _subjectName;
	private String _description;
}