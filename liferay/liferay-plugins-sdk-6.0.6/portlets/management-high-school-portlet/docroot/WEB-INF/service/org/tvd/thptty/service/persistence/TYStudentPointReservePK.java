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
public class TYStudentPointReservePK implements Comparable<TYStudentPointReservePK>,
	Serializable {
	public int courses;
	public int semester;
	public long studentId;
	public long subjectId;
	public int pointType;
	public int pointIndex;
	public int pointFactor;

	public TYStudentPointReservePK() {
	}

	public TYStudentPointReservePK(int courses, int semester, long studentId,
		long subjectId, int pointType, int pointIndex, int pointFactor) {
		this.courses = courses;
		this.semester = semester;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.pointType = pointType;
		this.pointIndex = pointIndex;
		this.pointFactor = pointFactor;
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

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public int getPointType() {
		return pointType;
	}

	public void setPointType(int pointType) {
		this.pointType = pointType;
	}

	public int getPointIndex() {
		return pointIndex;
	}

	public void setPointIndex(int pointIndex) {
		this.pointIndex = pointIndex;
	}

	public int getPointFactor() {
		return pointFactor;
	}

	public void setPointFactor(int pointFactor) {
		this.pointFactor = pointFactor;
	}

	public int compareTo(TYStudentPointReservePK pk) {
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

		if (subjectId < pk.subjectId) {
			value = -1;
		}
		else if (subjectId > pk.subjectId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (pointType < pk.pointType) {
			value = -1;
		}
		else if (pointType > pk.pointType) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (pointIndex < pk.pointIndex) {
			value = -1;
		}
		else if (pointIndex > pk.pointIndex) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (pointFactor < pk.pointFactor) {
			value = -1;
		}
		else if (pointFactor > pk.pointFactor) {
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

		TYStudentPointReservePK pk = null;

		try {
			pk = (TYStudentPointReservePK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((courses == pk.courses) && (semester == pk.semester) &&
				(studentId == pk.studentId) && (subjectId == pk.subjectId) &&
				(pointType == pk.pointType) && (pointIndex == pk.pointIndex) &&
				(pointFactor == pk.pointFactor)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(courses) + String.valueOf(semester) +
		String.valueOf(studentId) + String.valueOf(subjectId) +
		String.valueOf(pointType) + String.valueOf(pointIndex) +
		String.valueOf(pointFactor)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(35);

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

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("subjectId");
		sb.append(StringPool.EQUAL);
		sb.append(subjectId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("pointType");
		sb.append(StringPool.EQUAL);
		sb.append(pointType);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("pointIndex");
		sb.append(StringPool.EQUAL);
		sb.append(pointIndex);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("pointFactor");
		sb.append(StringPool.EQUAL);
		sb.append(pointFactor);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}