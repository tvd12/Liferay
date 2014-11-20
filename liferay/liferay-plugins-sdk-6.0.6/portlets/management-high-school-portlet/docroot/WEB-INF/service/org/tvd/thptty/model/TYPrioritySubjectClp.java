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

import org.tvd.thptty.service.persistence.TYPrioritySubjectPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYPrioritySubjectClp extends BaseModelImpl<TYPrioritySubject>
	implements TYPrioritySubject {
	public TYPrioritySubjectClp() {
	}

	public TYPrioritySubjectPK getPrimaryKey() {
		return new TYPrioritySubjectPK(_courses, _subjectId, _studentId);
	}

	public void setPrimaryKey(TYPrioritySubjectPK pk) {
		setCourses(pk.courses);
		setSubjectId(pk.subjectId);
		setStudentId(pk.studentId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYPrioritySubjectPK(_courses, _subjectId, _studentId);
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

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public boolean getIsSpecial() {
		return _isSpecial;
	}

	public boolean isIsSpecial() {
		return _isSpecial;
	}

	public void setIsSpecial(boolean isSpecial) {
		_isSpecial = isSpecial;
	}

	public int getExtra() {
		return _extra;
	}

	public void setExtra(int extra) {
		_extra = extra;
	}

	public TYPrioritySubject toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYPrioritySubject)Proxy.newProxyInstance(TYPrioritySubject.class.getClassLoader(),
				new Class[] { TYPrioritySubject.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYPrioritySubjectClp clone = new TYPrioritySubjectClp();

		clone.setCourses(getCourses());
		clone.setSubjectId(getSubjectId());
		clone.setStudentId(getStudentId());
		clone.setIsSpecial(getIsSpecial());
		clone.setExtra(getExtra());

		return clone;
	}

	public int compareTo(TYPrioritySubject tyPrioritySubject) {
		TYPrioritySubjectPK pk = tyPrioritySubject.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYPrioritySubjectClp tyPrioritySubject = null;

		try {
			tyPrioritySubject = (TYPrioritySubjectClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYPrioritySubjectPK pk = tyPrioritySubject.getPrimaryKey();

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
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", isSpecial=");
		sb.append(getIsSpecial());
		sb.append(", extra=");
		sb.append(getExtra());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYPrioritySubject");
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
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isSpecial</column-name><column-value><![CDATA[");
		sb.append(getIsSpecial());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extra</column-name><column-value><![CDATA[");
		sb.append(getExtra());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private long _subjectId;
	private long _studentId;
	private boolean _isSpecial;
	private int _extra;
}