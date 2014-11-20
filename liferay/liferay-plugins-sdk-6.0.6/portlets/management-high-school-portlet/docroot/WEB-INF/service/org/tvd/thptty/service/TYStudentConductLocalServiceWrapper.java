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
 * This class is a wrapper for {@link TYStudentConductLocalService}.
 * </p>
 *
 * @author    Ta Van Dung
 * @see       TYStudentConductLocalService
 * @generated
 */
public class TYStudentConductLocalServiceWrapper
	implements TYStudentConductLocalService {
	public TYStudentConductLocalServiceWrapper(
		TYStudentConductLocalService tyStudentConductLocalService) {
		_tyStudentConductLocalService = tyStudentConductLocalService;
	}

	/**
	* Adds the t y student conduct to the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to add
	* @return the t y student conduct that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct addTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.addTYStudentConduct(tyStudentConduct);
	}

	/**
	* Creates a new t y student conduct with the primary key. Does not add the t y student conduct to the database.
	*
	* @param tyStudentConductPK the primary key for the new t y student conduct
	* @return the new t y student conduct
	*/
	public org.tvd.thptty.model.TYStudentConduct createTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK) {
		return _tyStudentConductLocalService.createTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Deletes the t y student conduct with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to delete
	* @throws PortalException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tyStudentConductLocalService.deleteTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Deletes the t y student conduct from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tyStudentConductLocalService.deleteTYStudentConduct(tyStudentConduct);
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
		return _tyStudentConductLocalService.dynamicQuery(dynamicQuery);
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
		return _tyStudentConductLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _tyStudentConductLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tyStudentConductLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y student conduct with the primary key.
	*
	* @param tyStudentConductPK the primary key of the t y student conduct to get
	* @return the t y student conduct
	* @throws PortalException if a t y student conduct with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct getTYStudentConduct(
		org.tvd.thptty.service.persistence.TYStudentConductPK tyStudentConductPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.getTYStudentConduct(tyStudentConductPK);
	}

	/**
	* Gets a range of all the t y student conducts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student conducts to return
	* @param end the upper bound of the range of t y student conducts to return (not inclusive)
	* @return the range of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.tvd.thptty.model.TYStudentConduct> getTYStudentConducts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.getTYStudentConducts(start, end);
	}

	/**
	* Gets the number of t y student conducts.
	*
	* @return the number of t y student conducts
	* @throws SystemException if a system exception occurred
	*/
	public int getTYStudentConductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.getTYStudentConductsCount();
	}

	/**
	* Updates the t y student conduct in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to update
	* @return the t y student conduct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct updateTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.updateTYStudentConduct(tyStudentConduct);
	}

	/**
	* Updates the t y student conduct in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentConduct the t y student conduct to update
	* @param merge whether to merge the t y student conduct with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y student conduct that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentConduct updateTYStudentConduct(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.updateTYStudentConduct(tyStudentConduct,
			merge);
	}

	public org.tvd.thptty.model.TYStudentConduct addStudentConduct(
		org.tvd.thptty.model.TYStudentConduct studentConduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.addStudentConduct(studentConduct);
	}

	public org.tvd.thptty.model.TYStudentConduct getConductOfStudent(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchStudentConductException {
		return _tyStudentConductLocalService.getConductOfStudent(courses,
			semester, studentId);
	}

	public java.util.List<org.tvd.thptty.model.TYStudentConduct> getStudentsConductByS_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.getStudentsConductByS_C(courses,
			semester, companyId, groupId, conduct, start, end);
	}

	public int countStudentsConductByS_C(int courses, int semester,
		long companyId, long groupId, long conduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.countStudentsConductByS_C(courses,
			semester, companyId, groupId, conduct);
	}

	public java.util.List<org.tvd.thptty.model.TYStudentConduct> getStudentsConductByS_C_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.getStudentsConductByS_C_C(courses,
			semester, companyId, groupId, conduct, classId, start, end);
	}

	public int countStudentsConductByS_C_C(int courses, int semester,
		long companyId, long groupId, int conduct, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tyStudentConductLocalService.countStudentsConductByS_C_C(courses,
			semester, companyId, groupId, conduct, classId);
	}

	public TYStudentConductLocalService getWrappedTYStudentConductLocalService() {
		return _tyStudentConductLocalService;
	}

	private TYStudentConductLocalService _tyStudentConductLocalService;
}