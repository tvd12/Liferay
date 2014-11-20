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

import org.tvd.thptty.NoSuchClassUserRoleException;
import org.tvd.thptty.management.temporary.RoleKeys;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYClassUserRole;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.base.TYClassUserRoleLocalServiceBaseImpl;
import org.tvd.thptty.service.persistence.TYClassUserRolePK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the t y class user role local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYClassUserRoleLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYClassUserRoleLocalServiceUtil} to access the t y class user role local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYClassUserRoleLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYClassUserRoleLocalServiceUtil
 */
public class TYClassUserRoleLocalServiceImpl
	extends TYClassUserRoleLocalServiceBaseImpl {
	
	public TYClassUserRole addClassUserRole(TYClassUserRole newRole) 
			throws SystemException {
		if(newRole.getRoleId() == RoleKeys.MANAGEMENT) {
			User temp;
			try {
				temp = getUserByClassRole(newRole.getCourses(), 
					newRole.getClassId(), newRole.getRoleId());
				if(temp != null) {
					return newRole;
				}
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		return tyClassUserRolePersistence.update(newRole, false);
	}
	
	public User getUserByClassRole(int courses, long classId, long roleId) 
			throws SystemException, PortalException {
		TYClassUserRole temp = 
				tyClassUserRolePersistence.findByC_C_R(courses, classId, roleId);
		return UserLocalServiceUtil.getUser(temp.getUserId());
	}
	
	public List<TYClass> getClassesByUserRole(int courses, long groupId, long companyId, 
			long userId, long roleId) throws SystemException {
		List<TYClassUserRole> temp = tyClassUserRolePersistence.findByC_U_R(
				courses, userId, roleId);
		
		List<TYClass> classes = new ArrayList<TYClass>();
		for(int i = 0 ; i < temp.size() ; i++) {
			TYClass tyClass = TYClassLocalServiceUtil.getClassById(
					temp.get(i).getClassId(), groupId, companyId);
			classes.add(tyClass);
		}
		
		return classes;
	}
	
	public int countClassesUserRoleByC_R(int courses, long companyId, long groupId,
			long roleId) throws SystemException {
		return tyStudentPointFinder.countClassesUserRoleByC_R(
				courses, companyId, groupId, roleId);
	}
	
	public List<TYClass> getClassesByRole(int courses, long groupId, long companyId, 
			long roleId) throws SystemException, PortalException {
		int start = 0;
		int end = countClassesUserRoleByC_R(courses, companyId, groupId, roleId);
		if(end > 0) {
			List<TYClassUserRole> classUserRoles = tyStudentPointFinder.findClassesUserRoleByC_R(
					courses, companyId, groupId, roleId, start, end);
			List<TYClass> classes = new ArrayList<TYClass>();
			for(TYClassUserRole temp : classUserRoles) {
				long classId = temp.getClassId();
				TYClass tyClass = TYClassLocalServiceUtil.getTYClass(classId);
				if(!classes.contains(tyClass)) {
					classes.add(tyClass);
				}
			}
			return classes;
		}
		
		return null;
		
	}
	
	public List<TYClassUserRole> getClassesUsersByC_G(int courses, 
			long companyId, long groupId, long roleId) throws SystemException {
		int start = 0;
		int end = countClassesUserRoleByC_R(courses, companyId, groupId, roleId);
		if(end > 0) {
			return tyStudentPointFinder.findClassesUserRoleByC_R(courses, 
					companyId, groupId, roleId, start, end);
		}
		return null;
	}
	
	public void deleteClassUserRole(TYClassUserRole oldRole) 
			throws SystemException {
		deleteTYClassUserRole(oldRole);
	}
	
	
	public TYClassUserRole isTeacherManagement(int courses, long classId, 
			long userId, long roleId) throws NoSuchClassUserRoleException, SystemException {
		return tyClassUserRolePersistence.findByPrimaryKey(
				new TYClassUserRolePK(courses, classId, userId, roleId));
	}
	
	public int countClassesUserRoleByCourse(int courses, long companyId, 
			long groupId) throws SystemException {
		return tyStudentPointFinder.countClassesUserRoleByCourse(
				courses, companyId, groupId);
		
	}
	
	public List<TYClassUserRole> getClassUserRolesByCourse(int courses, 
			long companyId, long groupId) throws SystemException {
		int start = 0;
		int end = countClassesUserRoleByCourse(courses, companyId, groupId);
		if(end > 0) {
			return tyStudentPointFinder.findClassesUserRoleByCourse(
				courses, companyId, groupId, start, end);
		}
		return null;
	}
	
}