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

import java.util.ArrayList;
import java.util.List;

import org.tvd.thptty.NoSuchSubjectClassUserRoleException;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.base.TYSubjectClassUserRoleLocalServiceBaseImpl;
import org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y subject class user role local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYSubjectClassUserRoleLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil} to access the t y subject class user role local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYSubjectClassUserRoleLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil
 */
public class TYSubjectClassUserRoleLocalServiceImpl
	extends TYSubjectClassUserRoleLocalServiceBaseImpl {
	
	public TYSubjectClassUserRole addSubjectClassUserRole(TYSubjectClassUserRole newSCUR) 
			throws SystemException {
		return tySubjectClassUserRolePersistence.update(newSCUR, false);
	}
	
	public List<TYClass> getClassBySubjectUserRole(int courses, long subjectId, 
			long userId, long roleId) throws SystemException, PortalException {
		List<TYSubjectClassUserRole> temps =  
				tySubjectClassUserRolePersistence.findByC_S_U_R(
						courses, subjectId, userId, roleId);
		List<TYClass> results = new ArrayList<TYClass>();
		for(int i = 0 ; i < temps.size() ; i++) {
			TYClass temp = TYClassLocalServiceUtil.getTYClass(
					temps.get(i).getClassId());
			results.add(temp);
		}
		return results;
	}
	
	public List<TYSubjectClassUserRole> getSubjectsClassesByUserRole(
			int courses, long userId, long roleId) throws SystemException {
		return tySubjectClassUserRolePersistence.findByC_U_R(courses, userId, roleId);
	}
	
	public void deleteSubjectClassUserRole(TYSubjectClassUserRole oldSCUR) 
			throws SystemException {
		tySubjectClassUserRolePersistence.remove(oldSCUR);
	}
	
	public TYSubjectClassUserRole hasSubjectClassRole(int courses, long subjectId, long classId, 
			long userId, long roleId) throws SystemException, NoSuchSubjectClassUserRoleException {
		return tySubjectClassUserRolePersistence.findByPrimaryKey(new TYSubjectClassUserRolePK(
				courses, subjectId, classId, userId, roleId));
		
	}
	
	public int countSubjectClassUserRoleBy(int courses, long companyId, 
			long groupId) throws SystemException {
		return tyStudentPointFinder.countSubjectClassesUserRoleByCourse(
				courses, companyId, groupId);
	}
	
	public List<TYSubjectClassUserRole> getSubjectClassUserRolesByCourse(int courses,
			long companyId, long groupId) throws SystemException {
		int start = 0;
		int end = countSubjectClassUserRoleBy(courses, companyId, groupId);
		if(end > 0) {
			return tyStudentPointFinder.findSubjectClassesUserRoleByCourse(
				courses, companyId, groupId, start, end);
		}
		
		return null;
	}
	
	public int coutSubjectClassUsersByC_R(int courses, long companyId, 
			long groupId, long roleId) throws SystemException {
		return tyStudentPointFinder.countSubjectClassesUserRoleByC_R(
				courses, companyId, groupId, roleId);
	}
	
	public List<TYSubjectClassUserRole> getSubjectClassUsersByC_R(int courses, long companyId,
			long groupId, long roleId) throws SystemException {
		int start = 0;
		int end = coutSubjectClassUsersByC_R(courses, companyId, groupId, roleId);
		if(end > 0) {
			return tyStudentPointFinder.findSubjectClassesUserRoleByC_R(
					courses, companyId, groupId, roleId, start, end);
		}
		
		return null;
	}
}