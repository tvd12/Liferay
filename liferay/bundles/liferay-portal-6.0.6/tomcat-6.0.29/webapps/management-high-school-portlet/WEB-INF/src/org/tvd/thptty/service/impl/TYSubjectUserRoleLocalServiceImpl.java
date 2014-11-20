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

import org.tvd.thptty.model.TYSubjectUserRole;
import org.tvd.thptty.service.base.TYSubjectUserRoleLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the t y subject user role local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYSubjectUserRoleLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYSubjectUserRoleLocalServiceUtil} to access the t y subject user role local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYSubjectUserRoleLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYSubjectUserRoleLocalServiceUtil
 */
public class TYSubjectUserRoleLocalServiceImpl
	extends TYSubjectUserRoleLocalServiceBaseImpl {
	
	public TYSubjectUserRole addSubjectUserRole(TYSubjectUserRole newRole) 
			throws SystemException {
		return tySubjectUserRolePersistence.update(newRole, false);
	}
	
	public User getUserBySubjectRole(int courses, long groupId, long subjectId, long roleId) 
			throws SystemException, PortalException {
		TYSubjectUserRole temp = tySubjectUserRolePersistence.findByC_S_R(
				courses, subjectId, roleId);
		User user = UserLocalServiceUtil.getUser(temp.getUserId());
		return user;
	}
}