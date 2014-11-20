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

import org.tvd.thptty.service.persistence.TYClassStudentPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Ta Van Dung
 */
public class TYClassStudentClp extends BaseModelImpl<TYClassStudent>
	implements TYClassStudent {
	public TYClassStudentClp() {
	}

	public TYClassStudentPK getPrimaryKey() {
		return new TYClassStudentPK(_courses, _studentId);
	}

	public void setPrimaryKey(TYClassStudentPK pk) {
		setCourses(pk.courses);
		setStudentId(pk.studentId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYClassStudentPK(_courses, _studentId);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		_courses = courses;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public long getClassId() {
		return _classId;
	}

	public void setClassId(long classId) {
		_classId = classId;
	}

	public TYClassStudent toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYClassStudent)Proxy.newProxyInstance(TYClassStudent.class.getClassLoader(),
				new Class[] { TYClassStudent.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYClassStudentClp clone = new TYClassStudentClp();

		clone.setCourses(getCourses());
		clone.setStudentId(getStudentId());
		clone.setClassId(getClassId());

		return clone;
	}

	public int compareTo(TYClassStudent tyClassStudent) {
		TYClassStudentPK pk = tyClassStudent.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYClassStudentClp tyClassStudent = null;

		try {
			tyClassStudent = (TYClassStudentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYClassStudentPK pk = tyClassStudent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", classId=");
		sb.append(getClassId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYClassStudent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classId</column-name><column-value><![CDATA[");
		sb.append(getClassId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private long _studentId;
	private long _classId;
}