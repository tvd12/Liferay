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
 * This class is a wrapper for {@link TYStudent}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudent
 * @generated
 */
public class TYStudentWrapper implements TYStudent {
	public TYStudentWrapper(TYStudent tyStudent) {
		_tyStudent = tyStudent;
	}

	public long getPrimaryKey() {
		return _tyStudent.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tyStudent.setPrimaryKey(pk);
	}

	public long getStudentId() {
		return _tyStudent.getStudentId();
	}

	public void setStudentId(long studentId) {
		_tyStudent.setStudentId(studentId);
	}

	public long getCompanyId() {
		return _tyStudent.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_tyStudent.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _tyStudent.getGroupId();
	}

	public void setGroupId(long groupId) {
		_tyStudent.setGroupId(groupId);
	}

	public long getUserId() {
		return _tyStudent.getUserId();
	}

	public void setUserId(long userId) {
		_tyStudent.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudent.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tyStudent.setUserUuid(userUuid);
	}

	public java.lang.String getStudentLastName() {
		return _tyStudent.getStudentLastName();
	}

	public void setStudentLastName(java.lang.String studentLastName) {
		_tyStudent.setStudentLastName(studentLastName);
	}

	public java.lang.String getStudentFirstName() {
		return _tyStudent.getStudentFirstName();
	}

	public void setStudentFirstName(java.lang.String studentFirstName) {
		_tyStudent.setStudentFirstName(studentFirstName);
	}

	public int getStudentGroup1() {
		return _tyStudent.getStudentGroup1();
	}

	public void setStudentGroup1(int studentGroup1) {
		_tyStudent.setStudentGroup1(studentGroup1);
	}

	public int getStudentGroup2() {
		return _tyStudent.getStudentGroup2();
	}

	public void setStudentGroup2(int studentGroup2) {
		_tyStudent.setStudentGroup2(studentGroup2);
	}

	public int getStudentGroup3() {
		return _tyStudent.getStudentGroup3();
	}

	public void setStudentGroup3(int studentGroup3) {
		_tyStudent.setStudentGroup3(studentGroup3);
	}

	public boolean getMale() {
		return _tyStudent.getMale();
	}

	public boolean isMale() {
		return _tyStudent.isMale();
	}

	public void setMale(boolean male) {
		_tyStudent.setMale(male);
	}

	public java.util.Date getBirthDay() {
		return _tyStudent.getBirthDay();
	}

	public void setBirthDay(java.util.Date birthDay) {
		_tyStudent.setBirthDay(birthDay);
	}

	public java.lang.String getEmailAddress() {
		return _tyStudent.getEmailAddress();
	}

	public void setEmailAddress(java.lang.String emailAddress) {
		_tyStudent.setEmailAddress(emailAddress);
	}

	public java.lang.String getEmailPassword() {
		return _tyStudent.getEmailPassword();
	}

	public void setEmailPassword(java.lang.String emailPassword) {
		_tyStudent.setEmailPassword(emailPassword);
	}

	public java.lang.String getAddress() {
		return _tyStudent.getAddress();
	}

	public void setAddress(java.lang.String address) {
		_tyStudent.setAddress(address);
	}

	public java.lang.String getFatherName() {
		return _tyStudent.getFatherName();
	}

	public void setFatherName(java.lang.String fatherName) {
		_tyStudent.setFatherName(fatherName);
	}

	public java.lang.String getFatherPhone() {
		return _tyStudent.getFatherPhone();
	}

	public void setFatherPhone(java.lang.String fatherPhone) {
		_tyStudent.setFatherPhone(fatherPhone);
	}

	public java.lang.String getMotherName() {
		return _tyStudent.getMotherName();
	}

	public void setMotherName(java.lang.String motherName) {
		_tyStudent.setMotherName(motherName);
	}

	public java.lang.String getMotherPhone() {
		return _tyStudent.getMotherPhone();
	}

	public void setMotherPhone(java.lang.String motherPhone) {
		_tyStudent.setMotherPhone(motherPhone);
	}

	public java.lang.String getStudentCode() {
		return _tyStudent.getStudentCode();
	}

	public void setStudentCode(java.lang.String studentCode) {
		_tyStudent.setStudentCode(studentCode);
	}

	public int getLoginCount() {
		return _tyStudent.getLoginCount();
	}

	public void setLoginCount(int loginCount) {
		_tyStudent.setLoginCount(loginCount);
	}

	public java.util.Date getDateLogin() {
		return _tyStudent.getDateLogin();
	}

	public void setDateLogin(java.util.Date dateLogin) {
		_tyStudent.setDateLogin(dateLogin);
	}

	public boolean getPasswordEncrypt() {
		return _tyStudent.getPasswordEncrypt();
	}

	public boolean isPasswordEncrypt() {
		return _tyStudent.isPasswordEncrypt();
	}

	public void setPasswordEncrypt(boolean passwordEncrypt) {
		_tyStudent.setPasswordEncrypt(passwordEncrypt);
	}

	public java.lang.String getQuestion() {
		return _tyStudent.getQuestion();
	}

	public void setQuestion(java.lang.String question) {
		_tyStudent.setQuestion(question);
	}

	public java.lang.String getAnswer() {
		return _tyStudent.getAnswer();
	}

	public void setAnswer(java.lang.String answer) {
		_tyStudent.setAnswer(answer);
	}

	public java.lang.String getRegId() {
		return _tyStudent.getRegId();
	}

	public void setRegId(java.lang.String regId) {
		_tyStudent.setRegId(regId);
	}

	public org.tvd.thptty.model.TYStudent toEscapedModel() {
		return _tyStudent.toEscapedModel();
	}

	public boolean isNew() {
		return _tyStudent.isNew();
	}

	public void setNew(boolean n) {
		_tyStudent.setNew(n);
	}

	public boolean isCachedModel() {
		return _tyStudent.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tyStudent.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tyStudent.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tyStudent.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tyStudent.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tyStudent.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tyStudent.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tyStudent.clone();
	}

	public int compareTo(org.tvd.thptty.model.TYStudent tyStudent) {
		return _tyStudent.compareTo(tyStudent);
	}

	public int hashCode() {
		return _tyStudent.hashCode();
	}

	public java.lang.String toString() {
		return _tyStudent.toString();
	}

	public java.lang.String toXmlString() {
		return _tyStudent.toXmlString();
	}

	public java.lang.String getGender() {
		return _tyStudent.getGender();
	}

	public void setGender(java.lang.String gender) {
		_tyStudent.setGender(gender);
	}

	public void setFullName(java.lang.String fullName) {
		_tyStudent.setFullName(fullName);
	}

	public java.lang.String getFullName() {
		return _tyStudent.getFullName();
	}

	public void setIndex(int index) {
		_tyStudent.setIndex(index);
	}

	public int getIndex() {
		return _tyStudent.getIndex();
	}

	public TYStudent getWrappedTYStudent() {
		return _tyStudent;
	}

	private TYStudent _tyStudent;
}