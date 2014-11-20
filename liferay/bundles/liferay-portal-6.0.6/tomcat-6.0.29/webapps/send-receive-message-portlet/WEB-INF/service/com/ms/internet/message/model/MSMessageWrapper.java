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
 * This class is a wrapper for {@link MSMessage}.
 * </p>
 *
 * @author    I Am Dung
 * @see       MSMessage
 * @generated
 */
public class MSMessageWrapper implements MSMessage {
	public MSMessageWrapper(MSMessage msMessage) {
		_msMessage = msMessage;
	}

	public long getPrimaryKey() {
		return _msMessage.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_msMessage.setPrimaryKey(pk);
	}

	public long getMessageId() {
		return _msMessage.getMessageId();
	}

	public void setMessageId(long messageId) {
		_msMessage.setMessageId(messageId);
	}

	public java.lang.String getMessage() {
		return _msMessage.getMessage();
	}

	public void setMessage(java.lang.String message) {
		_msMessage.setMessage(message);
	}

	public java.util.Date getDateCreated() {
		return _msMessage.getDateCreated();
	}

	public void setDateCreated(java.util.Date dateCreated) {
		_msMessage.setDateCreated(dateCreated);
	}

	public com.ms.internet.message.model.MSMessage toEscapedModel() {
		return _msMessage.toEscapedModel();
	}

	public boolean isNew() {
		return _msMessage.isNew();
	}

	public void setNew(boolean n) {
		_msMessage.setNew(n);
	}

	public boolean isCachedModel() {
		return _msMessage.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_msMessage.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _msMessage.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_msMessage.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _msMessage.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _msMessage.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_msMessage.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _msMessage.clone();
	}

	public int compareTo(com.ms.internet.message.model.MSMessage msMessage) {
		return _msMessage.compareTo(msMessage);
	}

	public int hashCode() {
		return _msMessage.hashCode();
	}

	public java.lang.String toString() {
		return _msMessage.toString();
	}

	public java.lang.String toXmlString() {
		return _msMessage.toXmlString();
	}

	public MSMessage getWrappedMSMessage() {
		return _msMessage;
	}

	private MSMessage _msMessage;
}