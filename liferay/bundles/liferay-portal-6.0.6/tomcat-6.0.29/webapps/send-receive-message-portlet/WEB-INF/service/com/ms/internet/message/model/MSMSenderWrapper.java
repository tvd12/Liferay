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

package com.ms.internet.message.model;

/**
 * <p>
 * This class is a wrapper for {@link MSMSender}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMSender
 * @generated
 */
public class MSMSenderWrapper implements MSMSender {
	public MSMSenderWrapper(MSMSender msmSender) {
		_msmSender = msmSender;
	}

	public com.ms.internet.message.service.persistence.MSMSenderPK getPrimaryKey() {
		return _msmSender.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.ms.internet.message.service.persistence.MSMSenderPK pk) {
		_msmSender.setPrimaryKey(pk);
	}

	public long getUserId() {
		return _msmSender.getUserId();
	}

	public void setUserId(long userId) {
		_msmSender.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmSender.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_msmSender.setUserUuid(userUuid);
	}

	public long getMessageId() {
		return _msmSender.getMessageId();
	}

	public void setMessageId(long messageId) {
		_msmSender.setMessageId(messageId);
	}

	public java.util.Date getDateSend() {
		return _msmSender.getDateSend();
	}

	public void setDateSend(java.util.Date dateSend) {
		_msmSender.setDateSend(dateSend);
	}

	public com.ms.internet.message.model.MSMSender toEscapedModel() {
		return _msmSender.toEscapedModel();
	}

	public boolean isNew() {
		return _msmSender.isNew();
	}

	public void setNew(boolean n) {
		_msmSender.setNew(n);
	}

	public boolean isCachedModel() {
		return _msmSender.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_msmSender.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _msmSender.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_msmSender.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _msmSender.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _msmSender.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_msmSender.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _msmSender.clone();
	}

	public int compareTo(com.ms.internet.message.model.MSMSender msmSender) {
		return _msmSender.compareTo(msmSender);
	}

	public int hashCode() {
		return _msmSender.hashCode();
	}

	public java.lang.String toString() {
		return _msmSender.toString();
	}

	public java.lang.String toXmlString() {
		return _msmSender.toXmlString();
	}

	public MSMSender getWrappedMSMSender() {
		return _msmSender;
	}

	private MSMSender _msmSender;
}