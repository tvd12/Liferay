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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.ms.internet.message.service.persistence.MSMReceiverPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author I Am Dung
 */
public class MSMReceiverClp extends BaseModelImpl<MSMReceiver>
	implements MSMReceiver {
	public MSMReceiverClp() {
	}

	public MSMReceiverPK getPrimaryKey() {
		return new MSMReceiverPK(_userId, _messageId);
	}

	public void setPrimaryKey(MSMReceiverPK pk) {
		setUserId(pk.userId);
		setMessageId(pk.messageId);
	}

	public Serializable getPrimaryKeyObj() {
		return new MSMReceiverPK(_userId, _messageId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getMessageId() {
		return _messageId;
	}

	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	public Date getDateRecieved() {
		return _dateRecieved;
	}

	public void setDateRecieved(Date dateRecieved) {
		_dateRecieved = dateRecieved;
	}

	public boolean getMsStatus() {
		return _msStatus;
	}

	public boolean isMsStatus() {
		return _msStatus;
	}

	public void setMsStatus(boolean msStatus) {
		_msStatus = msStatus;
	}

	public MSMReceiver toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (MSMReceiver)Proxy.newProxyInstance(MSMReceiver.class.getClassLoader(),
				new Class[] { MSMReceiver.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		MSMReceiverClp clone = new MSMReceiverClp();

		clone.setUserId(getUserId());
		clone.setMessageId(getMessageId());
		clone.setDateRecieved(getDateRecieved());
		clone.setMsStatus(getMsStatus());

		return clone;
	}

	public int compareTo(MSMReceiver msmReceiver) {
		MSMReceiverPK pk = msmReceiver.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MSMReceiverClp msmReceiver = null;

		try {
			msmReceiver = (MSMReceiverClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		MSMReceiverPK pk = msmReceiver.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", messageId=");
		sb.append(getMessageId());
		sb.append(", dateRecieved=");
		sb.append(getDateRecieved());
		sb.append(", msStatus=");
		sb.append(getMsStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ms.internet.message.model.MSMReceiver");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateRecieved</column-name><column-value><![CDATA[");
		sb.append(getDateRecieved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>msStatus</column-name><column-value><![CDATA[");
		sb.append(getMsStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private long _messageId;
	private Date _dateRecieved;
	private boolean _msStatus;
}