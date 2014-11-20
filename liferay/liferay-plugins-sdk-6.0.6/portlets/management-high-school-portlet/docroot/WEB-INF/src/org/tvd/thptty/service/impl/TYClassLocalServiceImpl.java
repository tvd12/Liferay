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

import org.tvd.thptty.NoSuchClassException;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.service.base.TYClassLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;

/**
 * The implementation of the t y class local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYClassLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYClassLocalServiceUtil} to access the t y class local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYClassLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYClassLocalServiceUtil
 */
public class TYClassLocalServiceImpl extends TYClassLocalServiceBaseImpl {
	
	public TYClass addClass(TYClass newClass) 
			throws SystemException, PortalException {
		TYClass tyClass = tyClassPersistence.create(
				counterLocalService.increment(TYClass.class.getName()));
		
		tyClass.setCompanyId(newClass.getCompanyId());
		tyClass.setGroupId(newClass.getGroupId());
		tyClass.setClassCode(newClass.getClassCode());
		tyClass.setClassGroup(newClass.getClassGroup());
		tyClass.setClassName(newClass.getClassName());
		tyClass.setModifiedDate(newClass.getModifiedDate());
		tyClass.setUserId(newClass.getUserId());
		
		resourceLocalService.addResources(newClass.getCompanyId(),
			newClass.getGroupId(), newClass.getUserId(), 
				TYClass.class.getName(), tyClass.getPrimaryKey(), 
					false, true, true);
		
		return tyClassPersistence.update(tyClass, false);
	}
	
	public void deleteClass(long classId) 
			throws SystemException, PortalException {
		TYClass delClass = 
				tyClassPersistence.findByPrimaryKey(classId);
		deleteClass(delClass);
	}
	
	public void deleteClass(TYClass delClass) 
			throws PortalException, SystemException {
		resourceLocalService.deleteResource(delClass.getCompanyId(), 
			TYClass.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL ,
			delClass.getPrimaryKey());
		tyClassPersistence.remove(delClass);
	}
	
	public List<TYClass> getAllClassBySchool(long companyId, long groupId) 
			throws SystemException {
		return tyClassPersistence.findByG_ID(companyId, groupId);
	}
	
	public TYClass getClassById(long classId, long groupId, long companyId) 
			throws SystemException {
		return tyClassPersistence.fetchByC_G(classId, groupId, companyId);
	}
	
	public int getMaxClassGroup(long companyId, long groupId) 
			throws SystemException {
		List<TYClass> classes = 
				tyClassPersistence.filterFindByG_ID(companyId, groupId);
		int max = classes.get(0).getClassGroup();
		for(int i = 1 ; i < classes.size() ; i++) {
			if(classes.get(i).getClassGroup() > max) {
				max = classes.get(i).getClassGroup();
			}
		}
		return max;
	}
	
	public TYClass getClassByClassGroup_Name(long companyId, 
		long groupId, int classGroup, String className) 
			throws SystemException, NoSuchClassException {
		return tyClassPersistence.findByclassGroup_Name(companyId, groupId, 
				classGroup, className);
	}
	
}