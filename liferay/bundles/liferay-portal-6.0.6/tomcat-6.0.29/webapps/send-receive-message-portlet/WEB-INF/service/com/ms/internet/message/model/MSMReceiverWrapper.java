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
 * This class is a wrapper for {@link MSMReceiver}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMReceiver
 * @generated
 */
public class MSMReceiverWrapper implements MSMReceiver {
	public MSMReceiverWrapper(MSMReceiver msmReceiver) {
		_msmReceiver = msmReceiver;
	}

	public com.ms.internet.message.service.persistence.MSMReceiverPK getPrimaryKey() {
		return _msmReceiver.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.ms.internet.message.service.persistence.MSMReceiverPK pk) {
		_msmReceiver.setPrimaryKey(pk);
	}

	public long getUserId() {
		return _msmReceiver.getUserId();
	}

	public void setUserId(long userId) {
		_msmReceiver.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _msmReceiver.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_msmReceiver.setUserUuid(userUuid);
	}

	public long getMessageId() {
		return _msmReceiver.getMessageId();
	}

	public void setMessageId(long messageId) {
		_msmReceiver.setMessageId(messageId);
	}

	public java.util.Date getDateRecieved() {
		return _msmReceiver.getDateRecieved();
	}

	public void setDateRecieved(java.util.Date dateRecieved) {
		_msmReceiver.setDateRecieved(dateRecieved);
	}

	public boolean getMsStatus() {
		return _msmReceiver.getMsStatus();
	}

	public boolean isMsStatus() {
		return _msmReceiver.isMsStatus();
	}

	public void setMsStatus(boolean msStatus) {
		_msmReceiver.setMsStatus(msStatus);
	}

	public com.ms.internet.message.model.MSMReceiver toEscapedModel() {
		return _msmReceiver.toEscapedModel();
	}

	public boolean isNew() {
		return _msmReceiver.isNew();
	}

	public void setNew(boolean n) {
		_msmReceiver.setNew(n);
	}

	public boolean isCachedModel() {
		return _msmReceiver.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_msmReceiver.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _msmReceiver.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_msmReceiver.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _msmReceiver.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _msmReceiver.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_msmReceiver.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _msmReceiver.clone();
	}

	public int compareTo(com.ms.internet.message.model.MSMReceiver msmReceiver) {
		return _msmReceiver.compareTo(msmReceiver);
	}

	public int hashCode() {
		return _msmReceiver.hashCode();
	}

	public java.lang.String toString() {
		return _msmReceiver.toString();
	}

	public java.lang.String toXmlString() {
		return _msmReceiver.toXmlString();
	}

	public MSMReceiver getWrappedMSMReceiver() {
		return _msmReceiver;
	}

	private MSMReceiver _msmReceiver;
}