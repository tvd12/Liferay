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
public class TYSubjectUserRolePK implements Comparable<TYSubjectUserRolePK>,
	Serializable {
	public int courses;
	public long subjectId;
	public long userId;
	public long roleId;

	public TYSubjectUserRolePK() {
	}

	public TYSubjectUserRolePK(int courses, long subjectId, long userId,
		long roleId) {
		this.courses = courses;
		this.subjectId = subjectId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public int compareTo(TYSubjectUserRolePK pk) {
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

		if (userId < pk.userId) {
			value = -1;
		}
		else if (userId > pk.userId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (roleId < pk.roleId) {
			value = -1;
		}
		else if (roleId > pk.roleId) {
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

		TYSubjectUserRolePK pk = null;

		try {
			pk = (TYSubjectUserRolePK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((courses == pk.courses) && (subjectId == pk.subjectId) &&
				(userId == pk.userId) && (roleId == pk.roleId)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(courses) + String.valueOf(subjectId) +
		String.valueOf(userId) + String.valueOf(roleId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(20);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("courses");
		sb.append(StringPool.EQUAL);
		sb.append(courses);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("subjectId");
		sb.append(StringPool.EQUAL);
		sb.append(subjectId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("userId");
		sb.append(StringPool.EQUAL);
		sb.append(userId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("roleId");
		sb.append(StringPool.EQUAL);
		sb.append(roleId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}