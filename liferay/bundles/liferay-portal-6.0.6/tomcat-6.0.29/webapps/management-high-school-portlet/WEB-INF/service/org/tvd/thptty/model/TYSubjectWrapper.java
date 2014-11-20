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
 * This class is a wrapper for {@link TYSubject}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubject
 * @generated
 */
public class TYSubjectWrapper implements TYSubject {
	public TYSubjectWrapper(TYSubject tySubject) {
		_tySubject = tySubject;
	}

	public long getPrimaryKey() {
		return _tySubject.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tySubject.setPrimaryKey(pk);
	}

	public long getSubjectId() {
		return _tySubject.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tySubject.setSubjectId(subjectId);
	}

	public long getCompanyId() {
		return _tySubject.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_tySubject.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _tySubject.getGroupId();
	}

	public void setGroupId(long groupId) {
		_tySubject.setGroupId(groupId);
	}

	public java.lang.String getSubjectCode() {
		return _tySubject.getSubjectCode();
	}

	public void setSubjectCode(java.lang.String subjectCode) {
		_tySubject.setSubjectCode(subjectCode);
	}

	public java.lang.String getSubjectName() {
		return _tySubject.getSubjectName();
	}

	public void setSubjectName(java.lang.String subjectName) {
		_tySubject.setSubjectName(subjectName);
	}

	public java.lang.String getDescription() {
		return _tySubject.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_tySubject.setDescription(description);
	}

	public org.tvd.thptty.model.TYSubject toEscapedModel() {
		return _tySubject.toEscapedModel();
	}

	public boolean isNew() {
		return _tySubject.isNew();
	}

	public void setNew(boolean n) {
		_tySubject.setNew(n);
	}

	public boolean isCachedModel() {
		return _tySubject.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tySubject.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tySubject.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tySubject.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tySubject.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tySubject.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tySubject.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tySubject.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYSubject tySubject) {
		return _tySubject.compareTo(tySubject);
	}

	public int hashCode() {
		return _tySubject.hashCode();
	}

	public java.lang.String toString() {
		return _tySubject.toString();
	}

	public java.lang.String toXmlString() {
		return _tySubject.toXmlString();
	}

	public void setIndex(int index) {
		_tySubject.setIndex(index);
	}

	public int getIndex() {
		return _tySubject.getIndex();
	}

	public TYSubject getWrappedTYSubject() {
		return _tySubject;
	}

	private TYSubject _tySubject;
}