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
 * This class is a wrapper for {@link TYSubjectLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYSubjectLocalService
 * @generated
 */
public class TYSubjectLocalServiceWrapper implements TYSubjectLocalService {
	public TYSubjectLocalServiceWrapper(
		TYSubjectLocalService tySubjectLocalService) {
		_tySubjectLocalService = tySubjectLocalService;
	}

	/**
	* Adds the t y subject to the database. Also notifies the appropriate model listeners.
	*
	* @param tySubject the t y subject to add
	* @return the t y subject that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject addTYSubject(
		org.tvd.thptty.model.TYSubject tySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.addTYSubject(tySubject);
	}

	/**
	* Creates a new t y subject with the primary key. Does not add the t y subject to the database.
	*
	* @param subjectId the primary key for the new t y subject
	* @return the new t y subject
	*/
	public org.tvd.thptty.model.TYSubject createTYSubject(long subjectId) {
		return _tySubjectLocalService.createTYSubject(subjectId);
	}

	/**
	* Deletes the t y subject with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subjectId the primary key of the t y subject to delete
	* @throws PortalException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubject(long subjectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tySubjectLocalService.deleteTYSubject(subjectId);
	}

	/**
	* Deletes the t y subject from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubject the t y subject to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYSubject(org.tvd.thptty.model.TYSubject tySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tySubjectLocalService.deleteTYSubject(tySubject);
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
		return _tySubjectLocalService.dynamicQuery(dynamicQuery);
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
		return _tySubjectLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tySubjectLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tySubjectLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y subject with the primary key.
	*
	* @param subjectId the primary key of the t y subject to get
	* @return the t y subject
	* @throws PortalException if a t y subject with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject getTYSubject(long subjectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.getTYSubject(subjectId);
	}

	/**
	* Gets a range of all the t y subjects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subjects to return
	* @param end the upper bound of the range of t y subjects to return (not inclusive)
	* @return the range of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYSubject> getTYSubjects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.getTYSubjects(start, end);
	}

	/**
	* Gets the number of t y subjects.
	*
	* @return the number of t y subjects
	* @throws SystemException if a system exception occurred
	*/
	public int getTYSubjectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.getTYSubjectsCount();
	}

	/**
	* Updates the t y subject in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubject the t y subject to update
	* @return the t y subject that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject updateTYSubject(
		org.tvd.thptty.model.TYSubject tySubject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.updateTYSubject(tySubject);
	}

	/**
	* Updates the t y subject in the database. Also notifies the appropriate model listeners.
	*
	* @param tySubject the t y subject to update
	* @param merge whether to merge the t y subject with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y subject that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYSubject updateTYSubject(
		org.tvd.thptty.model.TYSubject tySubject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.updateTYSubject(tySubject, merge);
	}

	public org.tvd.thptty.model.TYSubject addSubject(
		org.tvd.thptty.model.TYSubject newSubject)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.addSubject(newSubject);
	}

	public void deltetSubject(long subjectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tySubjectLocalService.deltetSubject(subjectId);
	}

	public void deleteSubject(org.tvd.thptty.model.TYSubject subject)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tySubjectLocalService.deleteSubject(subject);
	}

	public org.tvd.thptty.model.TYSubject getSubjectByName(long companyId,
		long groupId, java.lang.String subjectName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return _tySubjectLocalService.getSubjectByName(companyId, groupId,
			subjectName);
	}

	public org.tvd.thptty.model.TYSubject getSubjectByCode(long companyId,
		long groupId, java.lang.String subjectCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectException {
		return _tySubjectLocalService.getSubjectByCode(companyId, groupId,
			subjectCode);
	}

	public java.util.List<org.tvd.thptty.model.TYSubject> getAllSubjects(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tySubjectLocalService.getAllSubjects(companyId, groupId);
	}

	public TYSubjectLocalService getWrappedTYSubjectLocalService() {
		return _tySubjectLocalService;
	}

	private TYSubjectLocalService _tySubjectLocalService;
}