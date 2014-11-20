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

/**
 * <p>
 * This class is a wrapper for {@link TYClass}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYClass
 * @generated
 */
public class TYClassWrapper implements TYClass {
	public TYClassWrapper(TYClass tyClass) {
		_tyClass = tyClass;
	}

	public long getPrimaryKey() {
		return _tyClass.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tyClass.setPrimaryKey(pk);
	}

	public long getClassId() {
		return _tyClass.getClassId();
	}

	public void setClassId(long classId) {
		_tyClass.setClassId(classId);
	}

	public long getCompanyId() {
		return _tyClass.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_tyClass.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _tyClass.getGroupId();
	}

	public void setGroupId(long groupId) {
		_tyClass.setGroupId(groupId);
	}

	public java.lang.String getClassCode() {
		return _tyClass.getClassCode();
	}

	public void setClassCode(java.lang.String classCode) {
		_tyClass.setClassCode(classCode);
	}

	public int getClassGroup() {
		return _tyClass.getClassGroup();
	}

	public void setClassGroup(int classGroup) {
		_tyClass.setClassGroup(classGroup);
	}

	public java.lang.String getClassName() {
		return _tyClass.getClassName();
	}

	public void setClassName(java.lang.String className) {
		_tyClass.setClassName(className);
	}

	public java.util.Date getModifiedDate() {
		return _tyClass.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_tyClass.setModifiedDate(modifiedDate);
	}

	public long getUserId() {
		return _tyClass.getUserId();
	}

	public void setUserId(long userId) {
		_tyClass.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyClass.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyClass.setUserUuid(userUuid);
	}

	public org.tvd.thptty.model.TYClass toEscapedModel() {
		return _tyClass.toEscapedModel();
	}

	public boolean isNew() {
		return _tyClass.isNew();
	}

	public void setNew(boolean n) {
		_tyClass.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyClass.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyClass.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyClass.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyClass.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyClass.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyClass.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyClass.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyClass.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYClass tyClass) {
		return _tyClass.compareTo(tyClass);
	}

	public int hashCode() {
		return _tyClass.hashCode();
	}

	public java.lang.String toString() {
		return _tyClass.toString();
	}

	public java.lang.String toXmlString() {
		return _tyClass.toXmlString();
	}

	public java.lang.String getClassFullName() {
		return _tyClass.getClassFullName();
	}

	public void setClassFullName(java.lang.String classFullName) {
		_tyClass.setClassFullName(classFullName);
	}

	public void setIndex(int index) {
		_tyClass.setIndex(index);
	}

	public int getIndex() {
		return _tyClass.getIndex();
	}

	public TYClass getWrappedTYClass() {
		return _tyClass;
	}

	private TYClass _tyClass;
}