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

package org.tvd.thptty.model.impl;

import java.util.Date;

import org.tvd.thptty.management.temporary.TYActionKeys;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The model implementation for the TYStudentPoint service. Represents a row in the &quot;TY_TYStudentPoint&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.model.TYStudentPoint} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a t y student point model instance should use the {@link TYStudentPoint} interface instead.
 * </p>
 */
public class TYStudentPointImpl extends TYStudentPointModelImpl
	implements TYStudentPoint {
	public TYStudentPointImpl() {
	}
	
	public String toMobileMessage() {
		StringBuilder builder = new StringBuilder();
		
		try {
			String teacherName = UserLocalServiceUtil.getUser(this.getUserId()).getFullName();
			TYStudent student = TYStudentLocalServiceUtil.getTYStudent(this.getStudentId());
			String studentName = student.getFullName();
			TYClass tyClass = TYClassStudentLocalServiceUtil
					.getClassOfStudent(2013, this.getStudentId());
			String studentClass = tyClass.getClassGroup() + tyClass.getClassName();
			String subject = TYSubjectLocalServiceUtil.getTYSubject(this.getSubjectId()).getSubjectName();
		
			builder.append("Giao vien " + teacherName + " thong bao\n")
				.append("Hoc sinh " + studentName + " lop " + studentClass + " duoc ")
				.append(this.getPoint() + " diem\n")
				.append("Mon: " + subject + "\n")
				.append("He so: " + this.getPointType() + "\n")
				.append(this.getModifiedDate());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return builder.toString();
	}
}