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

package org.tvd.thptty.service.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import org.tvd.thptty.service.ClpSerializer;
import org.tvd.thptty.service.SemesterLocalServiceUtil;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYMessagesLocalServiceUtil;
import org.tvd.thptty.service.TYPrioritySubjectLocalServiceUtil;
import org.tvd.thptty.service.TYStudentConductLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointReserveLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYTeacherLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener implements MessageListener {
	public static final String SERVLET_CONTEXT_NAME = ClpSerializer.SERVLET_CONTEXT_NAME;

	public void receive(Message message) {
		try {
			doReceive(message);
		}
		catch (Exception e) {
			_log.error("Unable to process message " + message, e);
		}
	}

	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(SERVLET_CONTEXT_NAME)) {
			TYClassLocalServiceUtil.clearService();

			TYStudentLocalServiceUtil.clearService();

			TYClassStudentLocalServiceUtil.clearService();

			TYClassUserRoleLocalServiceUtil.clearService();

			TYSubjectLocalServiceUtil.clearService();

			TYSubjectUserRoleLocalServiceUtil.clearService();

			TYTeacherLocalServiceUtil.clearService();

			TYStudentPointReserveLocalServiceUtil.clearService();

			TYStudentPointLocalServiceUtil.clearService();

			TYStudentConductLocalServiceUtil.clearService();

			TYSubjectClassUserRoleLocalServiceUtil.clearService();

			TYPrioritySubjectLocalServiceUtil.clearService();

			SemesterLocalServiceUtil.clearService();

			TYMessagesLocalServiceUtil.clearService();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpMessageListener.class);
}