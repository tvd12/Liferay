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
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the t y student point local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TYStudentPointLocalServiceUtil} to access the t y student point local service. Add custom service methods to {@link org.tvd.thptty.service.impl.TYStudentPointLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPointLocalServiceUtil
 * @see org.tvd.thptty.service.base.TYStudentPointLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYStudentPointLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TYStudentPointLocalService {
	/**
	* Adds the t y student point to the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPoint the t y student point to add
	* @return the t y student point that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint addTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new t y student point with the primary key. Does not add the t y student point to the database.
	*
	* @param tyStudentPointPK the primary key for the new t y student point
	* @return the new t y student point
	*/
	public org.tvd.thptty.model.TYStudentPoint createTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK);

	/**
	* Deletes the t y student point with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPointPK the primary key of the t y student point to delete
	* @throws PortalException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the t y student point from the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPoint the t y student point to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the t y student point with the primary key.
	*
	* @param tyStudentPointPK the primary key of the t y student point to get
	* @return the t y student point
	* @throws PortalException if a t y student point with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.tvd.thptty.model.TYStudentPoint getTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the t y student points.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y student points to return
	* @param end the upper bound of the range of t y student points to return (not inclusive)
	* @return the range of t y student points
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getTYStudentPoints(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of t y student points.
	*
	* @return the number of t y student points
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTYStudentPointsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the t y student point in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPoint the t y student point to update
	* @return the t y student point that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint updateTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the t y student point in the database. Also notifies the appropriate model listeners.
	*
	* @param tyStudentPoint the t y student point to update
	* @param merge whether to merge the t y student point with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y student point that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.tvd.thptty.model.TYStudentPoint updateTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public org.tvd.thptty.model.TYStudentPoint addStudentPoint(
		org.tvd.thptty.model.TYStudentPoint studentPoint)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentPointsByPTPF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPointsByFactor(
		int courses, int semester, long studentId, long subjectId,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPointsBySubject(
		int courses, int semester, long studentId, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPoints(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentsPointsByC_S(
		int courses, int semester, long companyId, long groupId, float from,
		float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentsPointsByC_S(int courses, int semester,
		long companyId, long groupId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentsPointsByC_S_Class(
		int courses, int semester, long companyId, long groupId, long classId,
		float from, float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentsPointsByC_S_Class(int courses, int semester,
		long companyId, long groupId, long classId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCountOfPointByPTPF(int courses, int semester, long studentId,
		long subjectId, int pointType, int pointFactor);

	public int countStudentMissPointBy_C_S_S_PF_PT(int courses, int semester,
		long subjectId, int pointFactor, int pointType, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentMissPointBy_C_S_S_PF_PT(
		int courses, int semester, long subjectId, int pointFactor,
		int pointType, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}