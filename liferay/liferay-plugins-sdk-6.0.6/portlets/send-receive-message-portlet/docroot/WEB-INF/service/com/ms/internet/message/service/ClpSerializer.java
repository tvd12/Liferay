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

package com.ms.internet.message.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.ms.internet.message.model.MSMReceiverClp;
import com.ms.internet.message.model.MSMSenderClp;
import com.ms.internet.message.model.MSMessageClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "send-receive-message-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(MSMessageClp.class.getName())) {
			MSMessageClp oldCplModel = (MSMessageClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.ms.internet.message.model.impl.MSMessageImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setMessageId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getMessageId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setMessage",
							new Class[] { String.class });

					String value1 = oldCplModel.getMessage();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setDateCreated",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getDateCreated();

					method2.invoke(newModel, value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(MSMSenderClp.class.getName())) {
			MSMSenderClp oldCplModel = (MSMSenderClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.ms.internet.message.model.impl.MSMSenderImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getUserId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setMessageId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getMessageId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setDateSend",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getDateSend();

					method2.invoke(newModel, value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(MSMReceiverClp.class.getName())) {
			MSMReceiverClp oldCplModel = (MSMReceiverClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.ms.internet.message.model.impl.MSMReceiverImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getUserId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setMessageId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getMessageId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setDateRecieved",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getDateRecieved();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setMsStatus",
							new Class[] { Boolean.TYPE });

					Boolean value3 = new Boolean(oldCplModel.getMsStatus());

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.ms.internet.message.model.impl.MSMessageImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					MSMessageClp newModel = new MSMessageClp();

					Method method0 = oldModelClass.getMethod("getMessageId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setMessageId(value0);

					Method method1 = oldModelClass.getMethod("getMessage");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setMessage(value1);

					Method method2 = oldModelClass.getMethod("getDateCreated");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setDateCreated(value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.ms.internet.message.model.impl.MSMSenderImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					MSMSenderClp newModel = new MSMSenderClp();

					Method method0 = oldModelClass.getMethod("getUserId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setUserId(value0);

					Method method1 = oldModelClass.getMethod("getMessageId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setMessageId(value1);

					Method method2 = oldModelClass.getMethod("getDateSend");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setDateSend(value2);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.ms.internet.message.model.impl.MSMReceiverImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					MSMReceiverClp newModel = new MSMReceiverClp();

					Method method0 = oldModelClass.getMethod("getUserId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setUserId(value0);

					Method method1 = oldModelClass.getMethod("getMessageId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setMessageId(value1);

					Method method2 = oldModelClass.getMethod("getDateRecieved");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setDateRecieved(value2);

					Method method3 = oldModelClass.getMethod("getMsStatus");

					Boolean value3 = (Boolean)method3.invoke(oldModel,
							(Object[])null);

					newModel.setMsStatus(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}