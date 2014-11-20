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
 * This class is a wrapper for {@link TYMessages}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYMessages
 * @generated
 */
public class TYMessagesWrapper implements TYMessages {
	public TYMessagesWrapper(TYMessages tyMessages) {
		_tyMessages = tyMessages;
	}

	public long getPrimaryKey() {
		return _tyMessages.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tyMessages.setPrimaryKey(pk);
	}

	public long getMessageId() {
		return _tyMessages.getMessageId();
	}

	public void setMessageId(long messageId) {
		_tyMessages.setMessageId(messageId);
	}

	public long getCompanyId() {
		return _tyMessages.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_tyMessages.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _tyMessages.getGroupId();
	}

	public void setGroupId(long groupId) {
		_tyMessages.setGroupId(groupId);
	}

	public long getActionId() {
		return _tyMessages.getActionId();
	}

	public void setActionId(long actionId) {
		_tyMessages.setActionId(actionId);
	}

	public long getUserId() {
		return _tyMessages.getUserId();
	}

	public void setUserId(long userId) {
		_tyMessages.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyMessages.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyMessages.setUserUuid(userUuid);
	}

	public long getClassId() {
		return _tyMessages.getClassId();
	}

	public void setClassId(long classId) {
		_tyMessages.setClassId(classId);
	}

	public long getSubjectId() {
		return _tyMessages.getSubjectId();
	}

	public void setSubjectId(long subjectId) {
		_tyMessages.setSubjectId(subjectId);
	}

	public java.util.Date getHappenDate() {
		return _tyMessages.getHappenDate();
	}

	public void setHappenDate(java.util.Date happenDate) {
		_tyMessages.setHappenDate(happenDate);
	}

	public org.tvd.thptty.model.TYMessages toEscapedModel() {
		return _tyMessages.toEscapedModel();
	}

	public boolean isNew() {
		return _tyMessages.isNew();
	}

	public void setNew(boolean n) {
		_tyMessages.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyMessages.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyMessages.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyMessages.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyMessages.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyMessages.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyMessages.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyMessages.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyMessages.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYMessages tyMessages) {
		return _tyMessages.compareTo(tyMessages);
	}

	public int hashCode() {
		return _tyMessages.hashCode();
	}

	public java.lang.String toString() {
		return _tyMessages.toString();
	}

	public java.lang.String toXmlString() {
		return _tyMessages.toXmlString();
	}

	public TYMessages getWrappedTYMessages() {
		return _tyMessages;
	}

	private TYMessages _tyMessages;
}