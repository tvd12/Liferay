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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the t y messages local service. This utility wraps {@link org.tvd.thptty.service.impl.TYMessagesLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.tvd.thptty.service.impl.TYMessagesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYMessagesLocalService
 * @see org.tvd.thptty.service.base.TYMessagesLocalServiceBaseImpl
 * @see org.tvd.thptty.service.impl.TYMessagesLocalServiceImpl
 * @generated
 */
public class TYMessagesLocalServiceUtil {
	/**
	* Adds the t y messages to the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to add
	* @return the t y messages that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYMessages addTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTYMessages(tyMessages);
	}

	/**
	* Creates a new t y messages with the primary key. Does not add the t y messages to the database.
	*
	* @param messageId the primary key for the new t y messages
	* @return the new t y messages
	*/
	public static org.tvd.thptty.model.TYMessages createTYMessages(
		long messageId) {
		return getService().createTYMessages(messageId);
	}

	/**
	* Deletes the t y messages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t y messages to delete
	* @throws PortalException if a t y messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYMessages(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYMessages(messageId);
	}

	/**
	* Deletes the t y messages from the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTYMessages(tyMessages);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the t y messages with the primary key.
	*
	* @param messageId the primary key of the t y messages to get
	* @return the t y messages
	* @throws PortalException if a t y messages with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYMessages getTYMessages(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYMessages(messageId);
	}

	/**
	* Gets a range of all the t y messageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y messageses to return
	* @param end the upper bound of the range of t y messageses to return (not inclusive)
	* @return the range of t y messageses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYMessages> getTYMessageses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYMessageses(start, end);
	}

	/**
	* Gets the number of t y messageses.
	*
	* @return the number of t y messageses
	* @throws SystemException if a system exception occurred
	*/
	public static int getTYMessagesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTYMessagesesCount();
	}

	/**
	* Updates the t y messages in the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to update
	* @return the t y messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYMessages updateTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYMessages(tyMessages);
	}

	/**
	* Updates the t y messages in the database. Also notifies the appropriate model listeners.
	*
	* @param tyMessages the t y messages to update
	* @param merge whether to merge the t y messages with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t y messages that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYMessages updateTYMessages(
		org.tvd.thptty.model.TYMessages tyMessages, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTYMessages(tyMessages, merge);
	}

	public static org.tvd.thptty.model.TYMessages addMessage(
		org.tvd.thptty.model.TYMessages newMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addMessage(newMessage);
	}

	public static java.util.List<org.tvd.thptty.model.TYMessages> getMessagesByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMessagesByC_G(companyId, groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TYMessagesLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TYMessagesLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TYMessagesLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TYMessagesLocalService service) {
		_service = service;
	}

	private static TYMessagesLocalService _service;
}