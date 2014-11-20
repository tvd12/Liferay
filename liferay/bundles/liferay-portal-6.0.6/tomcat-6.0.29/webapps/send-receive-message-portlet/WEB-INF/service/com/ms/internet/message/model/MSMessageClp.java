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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author I Am Dung
 */
public class MSMessageClp extends BaseModelImpl<MSMessage> implements MSMessage {
	public MSMessageClp() {
	}

	public long getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(long pk) {
		setMessageId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_messageId);
	}

	public long getMessageId() {
		return _messageId;
	}

	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public Date getDateCreated() {
		return _dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		_dateCreated = dateCreated;
	}

	public MSMessage toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (MSMessage)Proxy.newProxyInstance(MSMessage.class.getClassLoader(),
				new Class[] { MSMessage.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		MSMessageClp clone = new MSMessageClp();

		clone.setMessageId(getMessageId());
		clone.setMessage(getMessage());
		clone.setDateCreated(getDateCreated());

		return clone;
	}

	public int compareTo(MSMessage msMessage) {
		long pk = msMessage.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MSMessageClp msMessage = null;

		try {
			msMessage = (MSMessageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = msMessage.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{messageId=");
		sb.append(getMessageId());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", dateCreated=");
		sb.append(getDateCreated());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ms.internet.message.model.MSMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateCreated</column-name><column-value><![CDATA[");
		sb.append(getDateCreated());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _messageId;
	private String _message;
	private Date _dateCreated;
}