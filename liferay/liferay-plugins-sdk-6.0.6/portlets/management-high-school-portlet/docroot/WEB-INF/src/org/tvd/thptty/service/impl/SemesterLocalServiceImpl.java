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

import org.tvd.thptty.NoSuchSemesterException;
import org.tvd.thptty.model.Semester;
import org.tvd.thptty.service.base.SemesterLocalServiceBaseImpl;
import org.tvd.thptty.service.persistence.SemesterPK;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the semester local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.SemesterLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.SemesterLocalServiceUtil} to access the semester local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.SemesterLocalServiceBaseImpl
 * @see org.tvd.thptty.service.SemesterLocalServiceUtil
 */
public class SemesterLocalServiceImpl extends SemesterLocalServiceBaseImpl {
	public Semester addSemester(Semester semester) throws SystemException {
		return semesterPersistence.update(semester, false);
	}
	
	public Semester getSemester(long companyId, long groupId, int semesterId) 
			throws NoSuchSemesterException, SystemException {
		return semesterPersistence.findByPrimaryKey(
				new SemesterPK(companyId, groupId, semesterId));
	}
	
	public Semester getSemesterByC_G_Status(long companyId, long groupId, int status) 
			throws NoSuchSemesterException, SystemException {
		return semesterPersistence.findByC_G_Status(companyId, groupId, status);
	}
	
	public int getMaxSemester(int courses, long companyId, long groupId) 
			throws SystemException {
		return tyStudentPointFinder.maxSemesterByC_G(courses, companyId, groupId);
	}
	
	public List<Semester> getSemesters(long companyId, long groupId) 
			throws SystemException {
		return semesterPersistence.findByC_G(companyId, groupId);
	}
}