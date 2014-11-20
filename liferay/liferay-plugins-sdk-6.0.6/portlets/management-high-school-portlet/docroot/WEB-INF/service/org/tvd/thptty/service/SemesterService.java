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

package org.tvd.thptty.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the semester remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link SemesterServiceUtil} to access the semester remote service. Add custom service methods to {@link org.tvd.thptty.service.impl.SemesterServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Ta Van Dung
 * @see SemesterServiceUtil
 * @see org.tvd.thptty.service.base.SemesterServiceBaseImpl
 * @see org.tvd.thptty.service.impl.SemesterServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SemesterService {
	public org.tvd.thptty.model.Semester addSemster(
		org.tvd.thptty.model.Semester semester)
		throws com.liferay.portal.kernel.exception.SystemException;
}