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

import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.base.TYClassStudentLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y class student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYClassStudentLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYClassStudentLocalServiceUtil} to access the t y class student local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYClassStudentLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYClassStudentLocalServiceUtil
 */
public class TYClassStudentLocalServiceImpl
	extends TYClassStudentLocalServiceBaseImpl {
	
	public TYClassStudent addStudentIntoClass(TYClassStudent newStudent) 
			throws SystemException {
		return tyClassStudentPersistence.update(newStudent, false);
	}
	
	public List<TYStudent> getAllStudentsInClass(int courses, long classId) 
			throws SystemException, PortalException {
		List<TYClassStudent> temp = 
				tyClassStudentPersistence.findByC_C(courses, classId);
		List<TYStudent> students = new ArrayList<TYStudent>();
		for(int i = 0 ; i < temp.size() ; i++) {
			TYStudent student = 
					TYStudentLocalServiceUtil.getTYStudent(temp.get(i).getStudentId());
			students.add(student);
		}
		return students;
		
	}
	
	public TYClass getClassOfStudent(int courses, long studentId) 
			throws SystemException, PortalException {
		TYClass tyClass = null;
		TYClassStudent temp = 
				tyClassStudentPersistence.findByC_S(courses, studentId);
		tyClass = TYClassLocalServiceUtil.getTYClass(temp.getClassId());
		
		return tyClass;
		
	}
	
	public void deleteStudentClass(TYClassStudent classStudent) 
			throws SystemException {
		deleteTYClassStudent(classStudent);
	}
	
	public int amountStudentsInClass(int courses, long classId) throws SystemException {
		return tyClassStudentPersistence.countByC_C(courses, classId);
	}
	
	public int countClassStudentByCourse_Group(int course, long companyId,
			long groupId, int classGroup) throws SystemException {
		return tyStudentPointFinder.countStudentClassByCourse_Group(
				course, companyId, groupId, classGroup);
	}
	
	public List<TYClassStudent> getClassStudentsByCourse_Group(int course, long companyId, 
			long groupId, int classGroup, int start, int end) throws SystemException {
		return tyStudentPointFinder.findStudentClassByCourse_Group(
				course, companyId, groupId, classGroup, start, end);
	}
}