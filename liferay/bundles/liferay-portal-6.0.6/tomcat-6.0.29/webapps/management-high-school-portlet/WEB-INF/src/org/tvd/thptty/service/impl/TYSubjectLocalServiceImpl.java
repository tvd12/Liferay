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

import org.tvd.thptty.NoSuchSubjectException;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;
import org.tvd.thptty.service.base.TYSubjectLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;

/**
 * The implementation of the t y subject local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYSubjectLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYSubjectLocalServiceUtil} to access the t y subject local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYSubjectLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYSubjectLocalServiceUtil
 */
public class TYSubjectLocalServiceImpl extends TYSubjectLocalServiceBaseImpl {
	
	public TYSubject addSubject(TYSubject newSubject) 
			throws SystemException, PortalException {
		TYSubject subject = tySubjectPersistence.create(
				counterLocalService.increment(TYSubject.class.getName()));
		subject.setCompanyId(newSubject.getCompanyId());
		subject.setGroupId(newSubject.getGroupId());
		subject.setSubjectCode(newSubject.getSubjectCode());
		subject.setSubjectName(newSubject.getSubjectName());
		subject.setDescription(newSubject.getDescription());
		
		resourceLocalService.addResources(newSubject.getCompanyId(), 
				newSubject.getGroupId(), TYSubject.class.getName(), false);
		return tySubjectPersistence.update(subject, false);
	}
	
	public void deltetSubject(long subjectId) 
			throws PortalException, SystemException {
		TYSubject subject = 
				TYSubjectLocalServiceUtil.getTYSubject(subjectId);
		deleteSubject(subject);
	}
	
	public void deleteSubject(TYSubject subject) 
			throws PortalException, SystemException {
		resourceLocalService.deleteResource(subject.getCompanyId(), 
			TYSubject.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, 
				subject.getPrimaryKey());
	}
	
	public TYSubject getSubjectByName(long companyId, long groupId, 
			String subjectName) throws NoSuchSubjectException, SystemException {
		return tySubjectPersistence.findByName(companyId, groupId, subjectName);
	}
	
	public TYSubject getSubjectByCode(long companyId, long groupId, 
			String subjectCode) throws NoSuchSubjectException, SystemException {
		return tySubjectPersistence.findByCode(companyId, groupId, subjectCode);
	}
	
	public List<TYSubject> getAllSubjects(long companyId, long groupId) 
			throws SystemException {
		return tySubjectPersistence.findByC_G(companyId, groupId);
	}
}