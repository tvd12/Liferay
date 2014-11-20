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

import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.service.base.TYStudentPointLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y student point local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYStudentPointLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYStudentPointLocalServiceUtil} to access the t y student point local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYStudentPointLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYStudentPointLocalServiceUtil
 */
public class TYStudentPointLocalServiceImpl
	extends TYStudentPointLocalServiceBaseImpl {
	
	public TYStudentPoint addStudentPoint(TYStudentPoint studentPoint) 
			throws SystemException {
		return tyStudentPointPersistence.update(studentPoint, false);
	}
	
	public List<TYStudentPoint> getStudentPointsByPTPF(int courses, 
			int semester, long studentId, long subjectId, int pointType, 
			int pointFactor) throws SystemException {
		return tyStudentPointPersistence.findByC_S_S_S_PT_PF(courses, 
				semester, studentId, subjectId, pointType, pointFactor);
	}
	
	public TYStudentPoint getStudentAVGPointsByFactor(int courses, int semester, 
			long studentId, long subjectId, int pointFactor) throws SystemException {
		List<TYStudentPoint> studentPoint = tyStudentPointFinder.findByAVGPointFactor(courses, semester, 
				studentId, subjectId, pointFactor);
		if(studentPoint.size() > 0) {
			return studentPoint.get(0);
		}
		return null;
	}
	
	public TYStudentPoint getStudentAVGPointsBySubject(int courses, int semester, 
			long studentId, long subjectId) throws SystemException {
		List<TYStudentPoint> studentPoint =  tyStudentPointFinder.findByAVGPointSubject(courses, semester, 
				studentId, subjectId);
		if(studentPoint.size() > 0) {
			return studentPoint.get(0);
		}
		return null;
	}
	
	public TYStudentPoint getStudentAVGPoints(int courses, int semester, 
			long studentId) throws SystemException {
		List<TYStudentPoint> studentPoint = tyStudentPointFinder.findByAVGPoint(courses, semester, 
				studentId);
		if(studentPoint.size() > 0) {
			return studentPoint.get(0);
		}
		return null;
	}
	
	public List<TYStudentPoint> getStudentsPointsByC_S(int courses, int semester, 
			long companyId, long groupId, float from , float to, int begin, int end) 
				throws SystemException {
		return tyStudentPointFinder.findByAVGPointOfStudents_C_S(
				courses, semester, companyId, groupId, from, to, begin, end);
	}
	
	public int countStudentsPointsByC_S(int courses, int semester, 
			long companyId, long groupId, float from , float to) 
				throws SystemException {
		return tyStudentPointFinder.countByAVGPointOfStudents_C_S(
				courses, semester, companyId, groupId, from, to);
	}
	
	public List<TYStudentPoint> getStudentsPointsByC_S_Class(int courses, int semester, 
			long companyId, long groupId, long classId, float from , float to, 
				int begin, int end) throws SystemException {
		return tyStudentPointFinder.findByAVGPointOfStudents_C_S_Class(
				courses, semester, companyId, groupId, classId, from, to, begin, end);
	}
	
	public int countStudentsPointsByC_S_Class(int courses, int semester, 
			long companyId, long groupId, long classId, float from , float to) 
				throws SystemException {
		return tyStudentPointFinder.countByAVGPointOfStudents_C_S_Class(
				courses, semester, companyId, groupId, classId, from, to);
	}
	
	public int getCountOfPointByPTPF(int courses, int semester, 
			long studentId, long subjectId, int pointType, int pointFactor) {
		try {
			return tyStudentPointPersistence.countByC_S_S_S_PT_PF(courses, semester, 
					studentId, subjectId, pointType, pointFactor);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int countStudentMissPointBy_C_S_S_PF_PT( int courses, int semester, 
    		long subjectId, int pointFactor, int pointType, long classId) throws SystemException {
		return tyStudentPointFinder.countStudentMissPointBy_C_S_S_PF_PT(
				courses, semester, subjectId, pointFactor, pointType, classId);
	}
	
	 public List<TYStudentPoint> getStudentMissPointBy_C_S_S_PF_PT( 
			 int courses, int semester, long subjectId, int pointFactor, 
			 	int pointType, long classId, int start, int end) throws SystemException {
		 return tyStudentPointFinder.findStudentMissPointBy_C_S_S_PF_PT(courses, semester, 
				 subjectId, pointFactor, pointType, classId, start, end);
	 }
}