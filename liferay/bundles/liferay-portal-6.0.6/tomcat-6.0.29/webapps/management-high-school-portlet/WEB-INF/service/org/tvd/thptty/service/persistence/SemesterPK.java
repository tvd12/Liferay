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
public class SemesterPK implements Comparable<SemesterPK>, Serializable {
	public long companyId;
	public long groupId;
	public int semesterId;

	public SemesterPK() {
	}

	public SemesterPK(long companyId, long groupId, int semesterId) {
		this.companyId = companyId;
		this.groupId = groupId;
		this.semesterId = semesterId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public int getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public int compareTo(SemesterPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (companyId < pk.companyId) {
			value = -1;
		}
		else if (companyId > pk.companyId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (groupId < pk.groupId) {
			value = -1;
		}
		else if (groupId > pk.groupId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (semesterId < pk.semesterId) {
			value = -1;
		}
		else if (semesterId > pk.semesterId) {
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

		SemesterPK pk = null;

		try {
			pk = (SemesterPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((companyId == pk.companyId) && (groupId == pk.groupId) &&
				(semesterId == pk.semesterId)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(companyId) + String.valueOf(groupId) +
		String.valueOf(semesterId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("companyId");
		sb.append(StringPool.EQUAL);
		sb.append(companyId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("groupId");
		sb.append(StringPool.EQUAL);
		sb.append(groupId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("semesterId");
		sb.append(StringPool.EQUAL);
		sb.append(semesterId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}