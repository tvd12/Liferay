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

package org.tvd.thptty.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Ta Van Dung
 */
public class TYStudentConductPK implements Comparable<TYStudentConductPK>,
	Serializable {
	public int courses;
	public int semester;
	public long studentId;

	public TYStudentConductPK() {
	}

	public TYStudentConductPK(int courses, int semester, long studentId) {
		this.courses = courses;
		this.semester = semester;
		this.studentId = studentId;
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public int compareTo(TYStudentConductPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (courses < pk.courses) {
			value = -1;
		}
		else if (courses > pk.courses) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (semester < pk.semester) {
			value = -1;
		}
		else if (semester > pk.semester) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (studentId < pk.studentId) {
			value = -1;
		}
		else if (studentId > pk.studentId) {
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

		TYStudentConductPK pk = null;

		try {
			pk = (TYStudentConductPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((courses == pk.courses) && (semester == pk.semester) &&
				(studentId == pk.studentId)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(courses) + String.valueOf(semester) +
		String.valueOf(studentId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("courses");
		sb.append(StringPool.EQUAL);
		sb.append(courses);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("semester");
		sb.append(StringPool.EQUAL);
		sb.append(semester);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("studentId");
		sb.append(StringPool.EQUAL);
		sb.append(studentId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}