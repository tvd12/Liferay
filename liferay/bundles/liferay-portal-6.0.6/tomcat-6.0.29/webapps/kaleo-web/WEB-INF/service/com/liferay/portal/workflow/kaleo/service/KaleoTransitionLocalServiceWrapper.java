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

package com.liferay.portal.workflow.kaleo.service;

/**
 * <p>
 * This class is a wrapper for {@link KaleoTransitionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoTransitionLocalService
 * @generated
 */
public class KaleoTransitionLocalServiceWrapper
	implements KaleoTransitionLocalService {
	public KaleoTransitionLocalServiceWrapper(
		KaleoTransitionLocalService kaleoTransitionLocalService) {
		_kaleoTransitionLocalService = kaleoTransitionLocalService;
	}

	/**
	* Adds the kaleo transition to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to add
	* @return the kaleo transition that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.addKaleoTransition(kaleoTransition);
	}

	/**
	* Creates a new kaleo transition with the primary key. Does not add the kaleo transition to the database.
	*
	* @param kaleoTransitionId the primary key for the new kaleo transition
	* @return the new kaleo transition
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTransition createKaleoTransition(
		long kaleoTransitionId) {
		return _kaleoTransitionLocalService.createKaleoTransition(kaleoTransitionId);
	}

	/**
	* Deletes the kaleo transition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition to delete
	* @throws PortalException if a kaleo transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteKaleoTransition(long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_kaleoTransitionLocalService.deleteKaleoTransition(kaleoTransitionId);
	}

	/**
	* Deletes the kaleo transition from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		_kaleoTransitionLocalService.deleteKaleoTransition(kaleoTransition);
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
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery);
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
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _kaleoTransitionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the kaleo transition with the primary key.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition to get
	* @return the kaleo transition
	* @throws PortalException if a kaleo transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransition(kaleoTransitionId);
	}

	/**
	* Gets a range of all the kaleo transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo transitions to return
	* @param end the upper bound of the range of kaleo transitions to return (not inclusive)
	* @return the range of kaleo transitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransitions(start, end);
	}

	/**
	* Gets the number of kaleo transitions.
	*
	* @return the number of kaleo transitions
	* @throws SystemException if a system exception occurred
	*/
	public int getKaleoTransitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransitionsCount();
	}

	/**
	* Updates the kaleo transition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to update
	* @return the kaleo transition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTransition updateKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.updateKaleoTransition(kaleoTransition);
	}

	/**
	* Updates the kaleo transition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to update
	* @param merge whether to merge the kaleo transition with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the kaleo transition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTransition updateKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.updateKaleoTransition(kaleoTransition,
			merge);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		long kaleoDefinitionId, long kaleoNodeId,
		com.liferay.portal.workflow.kaleo.definition.Transition transition,
		com.liferay.portal.workflow.kaleo.model.KaleoNode sourceKaleoNode,
		com.liferay.portal.workflow.kaleo.model.KaleoNode targetKaleoNode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.addKaleoTransition(kaleoDefinitionId,
			kaleoNodeId, transition, sourceKaleoNode, targetKaleoNode,
			serviceContext);
	}

	public void deleteCompanyKaleoTransitions(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_kaleoTransitionLocalService.deleteCompanyKaleoTransitions(companyId);
	}

	public void deleteKaleoDefinitionKaleoTransitions(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_kaleoTransitionLocalService.deleteKaleoDefinitionKaleoTransitions(kaleoDefinitionId);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getDefaultKaleoTransition(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getDefaultKaleoTransition(kaleoNodeId);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoNodeId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransition(kaleoNodeId, name);
	}

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransitions(kaleoNodeId);
	}

	public int getKaleoTransitionsCount(long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransitionLocalService.getKaleoTransitionsCount(kaleoNodeId);
	}

	public KaleoTransitionLocalService getWrappedKaleoTransitionLocalService() {
		return _kaleoTransitionLocalService;
	}

	private KaleoTransitionLocalService _kaleoTransitionLocalService;
}