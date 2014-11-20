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
 * This class is a wrapper for {@link TYStudentLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudentLocalService
 * @generated
 */
public class TYStudentLocalServiceWrapper implements TYStudentLocalService {
	public TYStudentLocalServiceWrapper(
		TYStudentLocalService tyStudentLocalService) {
		_tyStudentLocalService = tyStudentLocalService;
	}

	/**
	* Adds the t y student to the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudent the t y student to add
	* @return the t y student that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent addTYStudent(
		org.tvd.thptty.model.TYStudent tyStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.addTYStudent(tyStudent);
	}

	/**
	* Creates a new t y student with the primary key. Does not add the t y student to the database.
	*
	* @param studentId the primary key for the new t y student
	* @return the new t y student
	*/
	public org.tvd.thptty.model.TYStudent createTYStudent(long studentId) {
		return _tyStudentLocalService.createTYStudent(studentId);
	}

	/**
	* Deletes the t y student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the t y student to delete
	* @throws PortalException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tyStudentLocalService.deleteTYStudent(studentId);
	}

	/**
	* Deletes the t y student from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudent the t y student to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudent(org.tvd.thptty.model.TYStudent tyStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyStudentLocalService.deleteTYStudent(tyStudent);
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
		return _tyStudentLocalService.dynamicQuery(dynamicQuery);
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
		return _tyStudentLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tyStudentLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tyStudentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y student with the primary key.
	*
	* @param studentId the primary key of the t y student to get
	* @return the t y student
	* @throws PortalException if a t y student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent getTYStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.getTYStudent(studentId);
	}

	/**
	* Gets a range of all the t y students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y students to return
	* @param end the upper bound of the range of t y students to return (not inclusive)
	* @return the range of t y students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudent> getTYStudents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.getTYStudents(start, end);
	}

	/**
	* Gets the number of t y students.
	*
	* @return the number of t y students
	* @throws SystemException if a system exception occurred
	*/
	public int getTYStudentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.getTYStudentsCount();
	}

	/**
	* Updates the t y student in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudent the t y student to update
	* @return the t y student that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent updateTYStudent(
		org.tvd.thptty.model.TYStudent tyStudent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.updateTYStudent(tyStudent);
	}

	/**
	* Updates the t y student in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudent the t y student to update
	* @param merge whether to merge the t y student with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y student that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudent updateTYStudent(
		org.tvd.thptty.model.TYStudent tyStudent, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.updateTYStudent(tyStudent, merge);
	}

	public org.tvd.thptty.model.TYStudent addStudent(
		org.tvd.thptty.model.TYStudent newStudent)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.addStudent(newStudent);
	}

	public java.util.List<org.tvd.thptty.model.TYStudent> getAllStudentsByGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentLocalService.getAllStudentsByGroup(companyId, groupId);
	}

	public void updateStudent(org.tvd.thptty.model.TYStudent student)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyStudentLocalService.updateStudent(student);
	}

	public org.tvd.thptty.model.TYStudent getStudentByEmail(long companyId,
		long groupId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentException {
		return _tyStudentLocalService.getStudentByEmail(companyId, groupId,
			emailAddress);
	}

	public TYStudentLocalService getWrappedTYStudentLocalService() {
		return _tyStudentLocalService;
	}

	private TYStudentLocalService _tyStudentLocalService;
}