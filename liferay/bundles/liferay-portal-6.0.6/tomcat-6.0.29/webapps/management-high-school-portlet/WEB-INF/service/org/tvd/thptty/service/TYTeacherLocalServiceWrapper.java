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

/**
 * <p>
 * This class is a wrapper for {@link TYTeacherLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYTeacherLocalService
 * @generated
 */
public class TYTeacherLocalServiceWrapper implements TYTeacherLocalService {
	public TYTeacherLocalServiceWrapper(
		TYTeacherLocalService tyTeacherLocalService) {
		_tyTeacherLocalService = tyTeacherLocalService;
	}

	/**
	* Adds the t y teacher to the database. Also notifies the appropriate model listeners.
	*
	* @param tyTeacher the t y teacher to add
	* @return the t y teacher that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher addTYTeacher(
		org.tvd.thptty.model.TYTeacher tyTeacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.addTYTeacher(tyTeacher);
	}

	/**
	* Creates a new t y teacher with the primary key. Does not add the t y teacher to the database.
	*
	* @param teacherId the primary key for the new t y teacher
	* @return the new t y teacher
	*/
	public org.tvd.thptty.model.TYTeacher createTYTeacher(long teacherId) {
		return _tyTeacherLocalService.createTYTeacher(teacherId);
	}

	/**
	* Deletes the t y teacher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teacherId the primary key of the t y teacher to delete
	* @throws PortalException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYTeacher(long teacherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tyTeacherLocalService.deleteTYTeacher(teacherId);
	}

	/**
	* Deletes the t y teacher from the database. Also notifies the appropriate model listeners.
	*
	* @param tyTeacher the t y teacher to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYTeacher(org.tvd.thptty.model.TYTeacher tyTeacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyTeacherLocalService.deleteTYTeacher(tyTeacher);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y teacher with the primary key.
	*
	* @param teacherId the primary key of the t y teacher to get
	* @return the t y teacher
	* @throws PortalException if a t y teacher with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher getTYTeacher(long teacherId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.getTYTeacher(teacherId);
	}

	/**
	* Gets a range of all the t y teachers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y teachers to return
	* @param end the upper bound of the range of t y teachers to return (not inclusive)
	* @return the range of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYTeacher> getTYTeachers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.getTYTeachers(start, end);
	}

	/**
	* Gets the number of t y teachers.
	*
	* @return the number of t y teachers
	* @throws SystemException if a system exception occurred
	*/
	public int getTYTeachersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.getTYTeachersCount();
	}

	/**
	* Updates the t y teacher in the database. Also notifies the appropriate model listeners.
	*
	* @param tyTeacher the t y teacher to update
	* @return the t y teacher that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher updateTYTeacher(
		org.tvd.thptty.model.TYTeacher tyTeacher)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.updateTYTeacher(tyTeacher);
	}

	/**
	* Updates the t y teacher in the database. Also notifies the appropriate model listeners.
	*
	* @param tyTeacher the t y teacher to update
	* @param merge whether to merge the t y teacher with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y teacher that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYTeacher updateTYTeacher(
		org.tvd.thptty.model.TYTeacher tyTeacher, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyTeacherLocalService.updateTYTeacher(tyTeacher, merge);
	}

	public TYTeacherLocalService getWrappedTYTeacherLocalService() {
		return _tyTeacherLocalService;
	}

	private TYTeacherLocalService _tyTeacherLocalService;
}