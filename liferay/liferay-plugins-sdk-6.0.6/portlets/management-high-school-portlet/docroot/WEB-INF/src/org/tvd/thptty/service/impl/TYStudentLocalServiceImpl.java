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

package org.tvd.thptty.service.impl;

import java.util.List;

import org.tvd.thptty.NoSuchStudentException;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.service.base.TYStudentLocalServiceBaseImpl;
import org.tvd.util.EncryptUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYStudentLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYStudentLocalServiceUtil} to access the t y student local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYStudentLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYStudentLocalServiceUtil
 */
public class TYStudentLocalServiceImpl extends TYStudentLocalServiceBaseImpl {
	
	public TYStudent addStudent(TYStudent newStudent) 
			throws SystemException, PortalException {
		TYStudent tyStudent = tyStudentPersistence.create(counterLocalService.increment(
				TYStudent.class.getName()));
		tyStudent.setAddress(newStudent.getAddress());
		tyStudent.setBirthDay(newStudent.getBirthDay());
		tyStudent.setMale(newStudent.getMale());
		tyStudent.setEmailAddress(newStudent.getEmailAddress());
		tyStudent.setEmailPassword(newStudent.getEmailPassword());
		tyStudent.setFatherName(newStudent.getFatherName());
		tyStudent.setFatherPhone(newStudent.getFatherPhone());
		tyStudent.setGroupId(newStudent.getGroupId());
		tyStudent.setMotherName(newStudent.getMotherName());
		tyStudent.setMotherPhone(newStudent.getMotherPhone());
		tyStudent.setStudentFirstName(newStudent.getStudentFirstName());
		tyStudent.setStudentLastName(newStudent.getStudentLastName());
		tyStudent.setStudentGroup1(newStudent.getStudentGroup1());
		tyStudent.setStudentGroup2(newStudent.getStudentGroup2());
		tyStudent.setStudentGroup3(newStudent.getStudentGroup3());
		tyStudent.setCompanyId(newStudent.getCompanyId());
		
		if(tyStudent.getEmailAddress().equals("")) {
			tyStudent.setEmailAddress("student" + tyStudent.getStudentId() + "@tvd.com");
		}
		
		tyStudent.setUserId(newStudent.getUserId());
		tyStudent.setStudentCode(String.valueOf(tyStudent.getStudentId()));
		
		String pass = EncryptUtils.base64encode(String.valueOf(tyStudent.getStudentId()));
		
		tyStudent.setEmailPassword(pass);
		tyStudent.setPasswordEncrypt(true);
		
		resourceLocalService.addResources(newStudent.getCompanyId(),
				newStudent.getGroupId(), TYStudent.class.getName(), false);
		
		return tyStudentPersistence.update(tyStudent, false);
		
	}
	
	public List<TYStudent> getAllStudentsByGroup(long companyId, long groupId) 
			throws SystemException {
		return tyStudentPersistence.findBySchool(companyId, groupId);
	}
	
	public void updateStudent(TYStudent student) 
			throws SystemException {
		if(student.getEmailAddress().equals("")) {
			student.setEmailAddress("student" + student.getStudentId() + "@tvd.com");
		}
		String pass = student.getEmailPassword();
		pass = EncryptUtils.base64encode(pass);
		student.setPasswordEncrypt(true);
		student.setEmailPassword(pass);
		updateTYStudent(student);
	}
	
	public TYStudent getStudentByEmail(long companyId, long groupId, String emailAddress) 
			throws NoSuchStudentException, SystemException {
		return tyStudentPersistence.findByEmail(companyId, groupId, emailAddress);
	}
	
}