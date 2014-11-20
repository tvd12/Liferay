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

import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYStudentPointReserve;
import org.tvd.thptty.model.impl.TYStudentPointReserveImpl;
import org.tvd.thptty.service.base.TYStudentPointReserveLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y student point reserve local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYStudentPointReserveLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYStudentPointReserveLocalServiceUtil} to access the t y student point reserve local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYStudentPointReserveLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYStudentPointReserveLocalServiceUtil
 */
public class TYStudentPointReserveLocalServiceImpl
	extends TYStudentPointReserveLocalServiceBaseImpl {
	
	public TYStudentPointReserve addStudentPoint(TYStudentPoint in) 
			throws SystemException {
		TYStudentPointReserve studentPoint = new TYStudentPointReserveImpl();
		studentPoint.setSemester(in.getSemester());
		studentPoint.setCourses(in.getCourses());
		studentPoint.setStudentId(in.getStudentId());
		studentPoint.setSubjectId(in.getStudentId());
		studentPoint.setPointType(in.getPointType());
		studentPoint.setPointIndex(in.getPointIndex());
		studentPoint.setPointFactor(in.getPointFactor());
		studentPoint.setUserId(in.getStudentId());
		studentPoint.setModifiedDate(in.getModifiedDate());
		return tyStudentPointReservePersistence.update(studentPoint, false);
	}
}