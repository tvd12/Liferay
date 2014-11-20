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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Ta Van Dung
 */
public class TYMessagesClp extends BaseModelImpl<TYMessages>
	implements TYMessages {
	public TYMessagesClp() {
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getActionId() {
		return _actionId;
	}

	public void setActionId(long actionId) {
		_actionId = actionId;
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

	public long getClassId() {
		return _classId;
	}

	public void setClassId(long classId) {
		_classId = classId;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public Date getHappenDate() {
		return _happenDate;
	}

	public void setHappenDate(Date happenDate) {
		_happenDate = happenDate;
	}

	public TYMessages toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYMessages)Proxy.newProxyInstance(TYMessages.class.getClassLoader(),
				new Class[] { TYMessages.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYMessagesClp clone = new TYMessagesClp();

		clone.setMessageId(getMessageId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setActionId(getActionId());
		clone.setUserId(getUserId());
		clone.setClassId(getClassId());
		clone.setSubjectId(getSubjectId());
		clone.setHappenDate(getHappenDate());

		return clone;
	}

	public int compareTo(TYMessages tyMessages) {
		int value = 0;

		value = DateUtil.compareTo(getHappenDate(), tyMessages.getHappenDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYMessagesClp tyMessages = null;

		try {
			tyMessages = (TYMessagesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tyMessages.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{messageId=");
		sb.append(getMessageId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", actionId=");
		sb.append(getActionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", classId=");
		sb.append(getClassId());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", happenDate=");
		sb.append(getHappenDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYMessages");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionId</column-name><column-value><![CDATA[");
		sb.append(getActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classId</column-name><column-value><![CDATA[");
		sb.append(getClassId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>happenDate</column-name><column-value><![CDATA[");
		sb.append(getHappenDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _messageId;
	private long _companyId;
	private long _groupId;
	private long _actionId;
	private long _userId;
	private String _userUuid;
	private long _classId;
	private long _subjectId;
	private Date _happenDate;
}