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

import org.tvd.thptty.NoSuchStudentConductException;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.service.base.TYStudentConductLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y student conduct local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYStudentConductLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYStudentConductLocalServiceUtil} to access the t y student conduct local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYStudentConductLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYStudentConductLocalServiceUtil
 */
public class TYStudentConductLocalServiceImpl
	extends TYStudentConductLocalServiceBaseImpl {
	
	public TYStudentConduct addStudentConduct(TYStudentConduct studentConduct) 
			throws SystemException {
		return tyStudentConductPersistence.update(studentConduct, false);
	}
	
	public TYStudentConduct getConductOfStudent(int courses, int semester, long studentId) 
			throws NoSuchStudentConductException, SystemException {
		return tyStudentConductPersistence.findByC_S_S(courses, semester, studentId);
	}
	
	public List<TYStudentConduct> getStudentsConductByS_C(int courses, int semester,
    	long companyId, long groupId, int conduct, int start, int end) 
    		throws SystemException {
		return tyStudentPointFinder.findStudentsConductByS_C(
				courses, semester, companyId, groupId, conduct, start, end);
	}
	
	public int countStudentsConductByS_C(int courses, int semester, 
    		long companyId, long groupId, long conduct) throws SystemException {
		return tyStudentPointFinder.countStudentsConductByS_C(
				courses, semester, companyId, groupId, conduct);
	}
	
	public List<TYStudentConduct> getStudentsConductByS_C_C( int courses, int semester,
	    long companyId, long groupId, int conduct, long classId, int start, int end) 
	    	throws SystemException {
		return tyStudentPointFinder.findStudentsConductByS_C_C(
				courses, semester, companyId, groupId, conduct, classId, start, end);
	}
	
	public int countStudentsConductByS_C_C(int courses, int semester,
	    long companyId, long groupId, int conduct, long classId) 
	    	throws SystemException {
		return tyStudentPointFinder.countStudentsConductByS_C_C(
				courses, semester, companyId, groupId, conduct, classId);
	}
}