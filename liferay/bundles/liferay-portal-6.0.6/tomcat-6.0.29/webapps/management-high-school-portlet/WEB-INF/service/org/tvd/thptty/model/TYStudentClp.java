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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Ta Van Dung
 */
public class TYStudentClp extends BaseModelImpl<TYStudent> implements TYStudent {
	public TYStudentClp() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentId);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
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

	public String getStudentLastName() {
		return _studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		_studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		return _studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		_studentFirstName = studentFirstName;
	}

	public int getStudentGroup1() {
		return _studentGroup1;
	}

	public void setStudentGroup1(int studentGroup1) {
		_studentGroup1 = studentGroup1;
	}

	public int getStudentGroup2() {
		return _studentGroup2;
	}

	public void setStudentGroup2(int studentGroup2) {
		_studentGroup2 = studentGroup2;
	}

	public int getStudentGroup3() {
		return _studentGroup3;
	}

	public void setStudentGroup3(int studentGroup3) {
		_studentGroup3 = studentGroup3;
	}

	public boolean getMale() {
		return _male;
	}

	public boolean isMale() {
		return _male;
	}

	public void setMale(boolean male) {
		_male = male;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getEmailPassword() {
		return _emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		_emailPassword = emailPassword;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getFatherName() {
		return _fatherName;
	}

	public void setFatherName(String fatherName) {
		_fatherName = fatherName;
	}

	public String getFatherPhone() {
		return _fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		_fatherPhone = fatherPhone;
	}

	public String getMotherName() {
		return _motherName;
	}

	public void setMotherName(String motherName) {
		_motherName = motherName;
	}

	public String getMotherPhone() {
		return _motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		_motherPhone = motherPhone;
	}

	public String getStudentCode() {
		return _studentCode;
	}

	public void setStudentCode(String studentCode) {
		_studentCode = studentCode;
	}

	public int getLoginCount() {
		return _loginCount;
	}

	public void setLoginCount(int loginCount) {
		_loginCount = loginCount;
	}

	public Date getDateLogin() {
		return _dateLogin;
	}

	public void setDateLogin(Date dateLogin) {
		_dateLogin = dateLogin;
	}

	public boolean getPasswordEncrypt() {
		return _passwordEncrypt;
	}

	public boolean isPasswordEncrypt() {
		return _passwordEncrypt;
	}

	public void setPasswordEncrypt(boolean passwordEncrypt) {
		_passwordEncrypt = passwordEncrypt;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public String getRegId() {
		return _regId;
	}

	public void setRegId(String regId) {
		_regId = regId;
	}

	public java.lang.String getGender() {
		throw new UnsupportedOperationException();
	}

	public void setGender(java.lang.String gender) {
		throw new UnsupportedOperationException();
	}

	public void setFullName(java.lang.String fullName) {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getFullName() {
		throw new UnsupportedOperationException();
	}

	public void setIndex(int index) {
		throw new UnsupportedOperationException();
	}

	public int getIndex() {
		throw new UnsupportedOperationException();
	}

	public TYStudent toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (TYStudent)Proxy.newProxyInstance(TYStudent.class.getClassLoader(),
				new Class[] { TYStudent.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYStudentClp clone = new TYStudentClp();

		clone.setStudentId(getStudentId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setStudentLastName(getStudentLastName());
		clone.setStudentFirstName(getStudentFirstName());
		clone.setStudentGroup1(getStudentGroup1());
		clone.setStudentGroup2(getStudentGroup2());
		clone.setStudentGroup3(getStudentGroup3());
		clone.setMale(getMale());
		clone.setBirthDay(getBirthDay());
		clone.setEmailAddress(getEmailAddress());
		clone.setEmailPassword(getEmailPassword());
		clone.setAddress(getAddress());
		clone.setFatherName(getFatherName());
		clone.setFatherPhone(getFatherPhone());
		clone.setMotherName(getMotherName());
		clone.setMotherPhone(getMotherPhone());
		clone.setStudentCode(getStudentCode());
		clone.setLoginCount(getLoginCount());
		clone.setDateLogin(getDateLogin());
		clone.setPasswordEncrypt(getPasswordEncrypt());
		clone.setQuestion(getQuestion());
		clone.setAnswer(getAnswer());
		clone.setRegId(getRegId());

		return clone;
	}

	public int compareTo(TYStudent tyStudent) {
		int value = 0;

		value = getStudentLastName().compareTo(tyStudent.getStudentLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYStudentClp tyStudent = null;

		try {
			tyStudent = (TYStudentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tyStudent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", studentLastName=");
		sb.append(getStudentLastName());
		sb.append(", studentFirstName=");
		sb.append(getStudentFirstName());
		sb.append(", studentGroup1=");
		sb.append(getStudentGroup1());
		sb.append(", studentGroup2=");
		sb.append(getStudentGroup2());
		sb.append(", studentGroup3=");
		sb.append(getStudentGroup3());
		sb.append(", male=");
		sb.append(getMale());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", emailPassword=");
		sb.append(getEmailPassword());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", fatherName=");
		sb.append(getFatherName());
		sb.append(", fatherPhone=");
		sb.append(getFatherPhone());
		sb.append(", motherName=");
		sb.append(getMotherName());
		sb.append(", motherPhone=");
		sb.append(getMotherPhone());
		sb.append(", studentCode=");
		sb.append(getStudentCode());
		sb.append(", loginCount=");
		sb.append(getLoginCount());
		sb.append(", dateLogin=");
		sb.append(getDateLogin());
		sb.append(", passwordEncrypt=");
		sb.append(getPasswordEncrypt());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append(", regId=");
		sb.append(getRegId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYStudent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentLastName</column-name><column-value><![CDATA[");
		sb.append(getStudentLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentFirstName</column-name><column-value><![CDATA[");
		sb.append(getStudentFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup1</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup2</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup3</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>male</column-name><column-value><![CDATA[");
		sb.append(getMale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDay</column-name><column-value><![CDATA[");
		sb.append(getBirthDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailPassword</column-name><column-value><![CDATA[");
		sb.append(getEmailPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fatherName</column-name><column-value><![CDATA[");
		sb.append(getFatherName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fatherPhone</column-name><column-value><![CDATA[");
		sb.append(getFatherPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motherName</column-name><column-value><![CDATA[");
		sb.append(getMotherName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motherPhone</column-name><column-value><![CDATA[");
		sb.append(getMotherPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentCode</column-name><column-value><![CDATA[");
		sb.append(getStudentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loginCount</column-name><column-value><![CDATA[");
		sb.append(getLoginCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateLogin</column-name><column-value><![CDATA[");
		sb.append(getDateLogin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passwordEncrypt</column-name><column-value><![CDATA[");
		sb.append(getPasswordEncrypt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regId</column-name><column-value><![CDATA[");
		sb.append(getRegId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private String _studentLastName;
	private String _studentFirstName;
	private int _studentGroup1;
	private int _studentGroup2;
	private int _studentGroup3;
	private boolean _male;
	private Date _birthDay;
	private String _emailAddress;
	private String _emailPassword;
	private String _address;
	private String _fatherName;
	private String _fatherPhone;
	private String _motherName;
	private String _motherPhone;
	private String _studentCode;
	private int _loginCount;
	private Date _dateLogin;
	private boolean _passwordEncrypt;
	private String _question;
	private String _answer;
	private String _regId;
}