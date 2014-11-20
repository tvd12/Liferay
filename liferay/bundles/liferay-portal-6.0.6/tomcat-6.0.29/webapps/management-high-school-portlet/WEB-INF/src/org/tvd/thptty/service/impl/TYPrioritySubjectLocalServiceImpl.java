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

import org.tvd.thptty.model.TYPrioritySubject;
import org.tvd.thptty.service.base.TYPrioritySubjectLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t y priority subject local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.service.TYPrioritySubjectLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.tvd.thptty.service.TYPrioritySubjectLocalServiceUtil} to access the t y priority subject local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see org.tvd.thptty.service.base.TYPrioritySubjectLocalServiceBaseImpl
 * @see org.tvd.thptty.service.TYPrioritySubjectLocalServiceUtil
 */
public class TYPrioritySubjectLocalServiceImpl
	extends TYPrioritySubjectLocalServiceBaseImpl {
	
	public TYPrioritySubject addPrioritySubject(TYPrioritySubject pSubject) 
			throws SystemException {
		return tyPrioritySubjectPersistence.update(pSubject, false);
	}
}