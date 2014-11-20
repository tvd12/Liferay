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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import org.tvd.thptty.model.SemesterClp;
import org.tvd.thptty.model.TYClassClp;
import org.tvd.thptty.model.TYClassStudentClp;
import org.tvd.thptty.model.TYClassUserRoleClp;
import org.tvd.thptty.model.TYMessagesClp;
import org.tvd.thptty.model.TYPrioritySubjectClp;
import org.tvd.thptty.model.TYStudentClp;
import org.tvd.thptty.model.TYStudentConductClp;
import org.tvd.thptty.model.TYStudentPointClp;
import org.tvd.thptty.model.TYStudentPointReserveClp;
import org.tvd.thptty.model.TYSubjectClassUserRoleClp;
import org.tvd.thptty.model.TYSubjectClp;
import org.tvd.thptty.model.TYSubjectUserRoleClp;
import org.tvd.thptty.model.TYTeacherClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "management-high-school-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(TYClassClp.class.getName())) {
			TYClassClp oldCplModel = (TYClassClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYClassImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setClassId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getClassId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setClassCode",
							new Class[] { String.class });

					String value3 = oldCplModel.getClassCode();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setClassGroup",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getClassGroup());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setClassName",
							new Class[] { String.class });

					String value5 = oldCplModel.getClassName();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value6 = oldCplModel.getModifiedDate();

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getUserId());

					method7.invoke(newModel, value7);

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

		if (oldModelClassName.equals(TYStudentClp.class.getName())) {
			TYStudentClp oldCplModel = (TYStudentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYStudentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getStudentId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setStudentLastName",
							new Class[] { String.class });

					String value4 = oldCplModel.getStudentLastName();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setStudentFirstName",
							new Class[] { String.class });

					String value5 = oldCplModel.getStudentFirstName();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setStudentGroup1",
							new Class[] { Integer.TYPE });

					Integer value6 = new Integer(oldCplModel.getStudentGroup1());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setStudentGroup2",
							new Class[] { Integer.TYPE });

					Integer value7 = new Integer(oldCplModel.getStudentGroup2());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setStudentGroup3",
							new Class[] { Integer.TYPE });

					Integer value8 = new Integer(oldCplModel.getStudentGroup3());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setMale",
							new Class[] { Boolean.TYPE });

					Boolean value9 = new Boolean(oldCplModel.getMale());

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setBirthDay",
							new Class[] { Date.class });

					Date value10 = oldCplModel.getBirthDay();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setEmailAddress",
							new Class[] { String.class });

					String value11 = oldCplModel.getEmailAddress();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setEmailPassword",
							new Class[] { String.class });

					String value12 = oldCplModel.getEmailPassword();

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setAddress",
							new Class[] { String.class });

					String value13 = oldCplModel.getAddress();

					method13.invoke(newModel, value13);

					Method method14 = newModelClass.getMethod("setFatherName",
							new Class[] { String.class });

					String value14 = oldCplModel.getFatherName();

					method14.invoke(newModel, value14);

					Method method15 = newModelClass.getMethod("setFatherPhone",
							new Class[] { String.class });

					String value15 = oldCplModel.getFatherPhone();

					method15.invoke(newModel, value15);

					Method method16 = newModelClass.getMethod("setMotherName",
							new Class[] { String.class });

					String value16 = oldCplModel.getMotherName();

					method16.invoke(newModel, value16);

					Method method17 = newModelClass.getMethod("setMotherPhone",
							new Class[] { String.class });

					String value17 = oldCplModel.getMotherPhone();

					method17.invoke(newModel, value17);

					Method method18 = newModelClass.getMethod("setStudentCode",
							new Class[] { String.class });

					String value18 = oldCplModel.getStudentCode();

					method18.invoke(newModel, value18);

					Method method19 = newModelClass.getMethod("setLoginCount",
							new Class[] { Integer.TYPE });

					Integer value19 = new Integer(oldCplModel.getLoginCount());

					method19.invoke(newModel, value19);

					Method method20 = newModelClass.getMethod("setDateLogin",
							new Class[] { Date.class });

					Date value20 = oldCplModel.getDateLogin();

					method20.invoke(newModel, value20);

					Method method21 = newModelClass.getMethod("setPasswordEncrypt",
							new Class[] { Boolean.TYPE });

					Boolean value21 = new Boolean(oldCplModel.getPasswordEncrypt());

					method21.invoke(newModel, value21);

					Method method22 = newModelClass.getMethod("setQuestion",
							new Class[] { String.class });

					String value22 = oldCplModel.getQuestion();

					method22.invoke(newModel, value22);

					Method method23 = newModelClass.getMethod("setAnswer",
							new Class[] { String.class });

					String value23 = oldCplModel.getAnswer();

					method23.invoke(newModel, value23);

					Method method24 = newModelClass.getMethod("setRegId",
							new Class[] { String.class });

					String value24 = oldCplModel.getRegId();

					method24.invoke(newModel, value24);

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

		if (oldModelClassName.equals(TYClassStudentClp.class.getName())) {
			TYClassStudentClp oldCplModel = (TYClassStudentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYClassStudentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getStudentId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setClassId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getClassId());

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

		if (oldModelClassName.equals(TYClassUserRoleClp.class.getName())) {
			TYClassUserRoleClp oldCplModel = (TYClassUserRoleClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYClassUserRoleImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setClassId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getClassId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getUserId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setRoleId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getRoleId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setStatus",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getStatus());

					method4.invoke(newModel, value4);

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

		if (oldModelClassName.equals(TYSubjectClp.class.getName())) {
			TYSubjectClp oldCplModel = (TYSubjectClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYSubjectImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getSubjectId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setSubjectCode",
							new Class[] { String.class });

					String value3 = oldCplModel.getSubjectCode();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setSubjectName",
							new Class[] { String.class });

					String value4 = oldCplModel.getSubjectName();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value5 = oldCplModel.getDescription();

					method5.invoke(newModel, value5);

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

		if (oldModelClassName.equals(TYSubjectUserRoleClp.class.getName())) {
			TYSubjectUserRoleClp oldCplModel = (TYSubjectUserRoleClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYSubjectUserRoleImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSubjectId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getUserId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setRoleId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getRoleId());

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

		if (oldModelClassName.equals(TYTeacherClp.class.getName())) {
			TYTeacherClp oldCplModel = (TYTeacherClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYTeacherImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setTeacherId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getTeacherId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setTeacherDegree",
							new Class[] { String.class });

					String value1 = oldCplModel.getTeacherDegree();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setTeacherCertificate",
							new Class[] { String.class });

					String value2 = oldCplModel.getTeacherCertificate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

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

		if (oldModelClassName.equals(TYStudentPointReserveClp.class.getName())) {
			TYStudentPointReserveClp oldCplModel = (TYStudentPointReserveClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYStudentPointReserveImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSemester",
							new Class[] { Integer.TYPE });

					Integer value1 = new Integer(oldCplModel.getSemester());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getStudentId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getSubjectId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setPointType",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getPointType());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setPointIndex",
							new Class[] { Integer.TYPE });

					Integer value5 = new Integer(oldCplModel.getPointIndex());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setPointFactor",
							new Class[] { Integer.TYPE });

					Integer value6 = new Integer(oldCplModel.getPointFactor());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setPoint",
							new Class[] { Double.TYPE });

					Double value7 = new Double(oldCplModel.getPoint());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value8 = oldCplModel.getModifiedDate();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value9 = new Long(oldCplModel.getUserId());

					method9.invoke(newModel, value9);

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

		if (oldModelClassName.equals(TYStudentPointClp.class.getName())) {
			TYStudentPointClp oldCplModel = (TYStudentPointClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYStudentPointImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSemester",
							new Class[] { Integer.TYPE });

					Integer value1 = new Integer(oldCplModel.getSemester());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getStudentId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getSubjectId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setPointType",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getPointType());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setPointIndex",
							new Class[] { Integer.TYPE });

					Integer value5 = new Integer(oldCplModel.getPointIndex());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setPointFactor",
							new Class[] { Integer.TYPE });

					Integer value6 = new Integer(oldCplModel.getPointFactor());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setPoint",
							new Class[] { Double.TYPE });

					Double value7 = new Double(oldCplModel.getPoint());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value8 = oldCplModel.getModifiedDate();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value9 = new Long(oldCplModel.getUserId());

					method9.invoke(newModel, value9);

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

		if (oldModelClassName.equals(TYStudentConductClp.class.getName())) {
			TYStudentConductClp oldCplModel = (TYStudentConductClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYStudentConductImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSemester",
							new Class[] { Integer.TYPE });

					Integer value1 = new Integer(oldCplModel.getSemester());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getStudentId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setConduct",
							new Class[] { Integer.TYPE });

					Integer value3 = new Integer(oldCplModel.getConduct());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getModifiedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getUserId());

					method5.invoke(newModel, value5);

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

		if (oldModelClassName.equals(TYSubjectClassUserRoleClp.class.getName())) {
			TYSubjectClassUserRoleClp oldCplModel = (TYSubjectClassUserRoleClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYSubjectClassUserRoleImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSubjectId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setClassId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getClassId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setRoleId",
							new Class[] { Long.TYPE });

					Long value4 = new Long(oldCplModel.getRoleId());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setStatus",
							new Class[] { Integer.TYPE });

					Integer value5 = new Integer(oldCplModel.getStatus());

					method5.invoke(newModel, value5);

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

		if (oldModelClassName.equals(TYPrioritySubjectClp.class.getName())) {
			TYPrioritySubjectClp oldCplModel = (TYPrioritySubjectClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYPrioritySubjectImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCourses",
							new Class[] { Integer.TYPE });

					Integer value0 = new Integer(oldCplModel.getCourses());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getSubjectId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setStudentId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getStudentId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setIsSpecial",
							new Class[] { Boolean.TYPE });

					Boolean value3 = new Boolean(oldCplModel.getIsSpecial());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setExtra",
							new Class[] { Integer.TYPE });

					Integer value4 = new Integer(oldCplModel.getExtra());

					method4.invoke(newModel, value4);

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

		if (oldModelClassName.equals(SemesterClp.class.getName())) {
			SemesterClp oldCplModel = (SemesterClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.SemesterImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getCompanyId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setSemesterId",
							new Class[] { Integer.TYPE });

					Integer value2 = new Integer(oldCplModel.getSemesterId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setStatus",
							new Class[] { Integer.TYPE });

					Integer value3 = new Integer(oldCplModel.getStatus());

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

		if (oldModelClassName.equals(TYMessagesClp.class.getName())) {
			TYMessagesClp oldCplModel = (TYMessagesClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.tvd.thptty.model.impl.TYMessagesImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setMessageId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getMessageId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getGroupId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setActionId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getActionId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value4 = new Long(oldCplModel.getUserId());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setClassId",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getClassId());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setSubjectId",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getSubjectId());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setHappenDate",
							new Class[] { Date.class });

					Date value7 = oldCplModel.getHappenDate();

					method7.invoke(newModel, value7);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.TYClassImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYClassClp newModel = new TYClassClp();

					Method method0 = oldModelClass.getMethod("getClassId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setClassId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getClassCode");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setClassCode(value3);

					Method method4 = oldModelClass.getMethod("getClassGroup");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setClassGroup(value4);

					Method method5 = oldModelClass.getMethod("getClassName");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setClassName(value5);

					Method method6 = oldModelClass.getMethod("getModifiedDate");

					Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value6);

					Method method7 = oldModelClass.getMethod("getUserId");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setUserId(value7);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.TYStudentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYStudentClp newModel = new TYStudentClp();

					Method method0 = oldModelClass.getMethod("getStudentId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod(
							"getStudentLastName");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setStudentLastName(value4);

					Method method5 = oldModelClass.getMethod(
							"getStudentFirstName");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setStudentFirstName(value5);

					Method method6 = oldModelClass.getMethod("getStudentGroup1");

					Integer value6 = (Integer)method6.invoke(oldModel,
							(Object[])null);

					newModel.setStudentGroup1(value6);

					Method method7 = oldModelClass.getMethod("getStudentGroup2");

					Integer value7 = (Integer)method7.invoke(oldModel,
							(Object[])null);

					newModel.setStudentGroup2(value7);

					Method method8 = oldModelClass.getMethod("getStudentGroup3");

					Integer value8 = (Integer)method8.invoke(oldModel,
							(Object[])null);

					newModel.setStudentGroup3(value8);

					Method method9 = oldModelClass.getMethod("getMale");

					Boolean value9 = (Boolean)method9.invoke(oldModel,
							(Object[])null);

					newModel.setMale(value9);

					Method method10 = oldModelClass.getMethod("getBirthDay");

					Date value10 = (Date)method10.invoke(oldModel,
							(Object[])null);

					newModel.setBirthDay(value10);

					Method method11 = oldModelClass.getMethod("getEmailAddress");

					String value11 = (String)method11.invoke(oldModel,
							(Object[])null);

					newModel.setEmailAddress(value11);

					Method method12 = oldModelClass.getMethod(
							"getEmailPassword");

					String value12 = (String)method12.invoke(oldModel,
							(Object[])null);

					newModel.setEmailPassword(value12);

					Method method13 = oldModelClass.getMethod("getAddress");

					String value13 = (String)method13.invoke(oldModel,
							(Object[])null);

					newModel.setAddress(value13);

					Method method14 = oldModelClass.getMethod("getFatherName");

					String value14 = (String)method14.invoke(oldModel,
							(Object[])null);

					newModel.setFatherName(value14);

					Method method15 = oldModelClass.getMethod("getFatherPhone");

					String value15 = (String)method15.invoke(oldModel,
							(Object[])null);

					newModel.setFatherPhone(value15);

					Method method16 = oldModelClass.getMethod("getMotherName");

					String value16 = (String)method16.invoke(oldModel,
							(Object[])null);

					newModel.setMotherName(value16);

					Method method17 = oldModelClass.getMethod("getMotherPhone");

					String value17 = (String)method17.invoke(oldModel,
							(Object[])null);

					newModel.setMotherPhone(value17);

					Method method18 = oldModelClass.getMethod("getStudentCode");

					String value18 = (String)method18.invoke(oldModel,
							(Object[])null);

					newModel.setStudentCode(value18);

					Method method19 = oldModelClass.getMethod("getLoginCount");

					Integer value19 = (Integer)method19.invoke(oldModel,
							(Object[])null);

					newModel.setLoginCount(value19);

					Method method20 = oldModelClass.getMethod("getDateLogin");

					Date value20 = (Date)method20.invoke(oldModel,
							(Object[])null);

					newModel.setDateLogin(value20);

					Method method21 = oldModelClass.getMethod(
							"getPasswordEncrypt");

					Boolean value21 = (Boolean)method21.invoke(oldModel,
							(Object[])null);

					newModel.setPasswordEncrypt(value21);

					Method method22 = oldModelClass.getMethod("getQuestion");

					String value22 = (String)method22.invoke(oldModel,
							(Object[])null);

					newModel.setQuestion(value22);

					Method method23 = oldModelClass.getMethod("getAnswer");

					String value23 = (String)method23.invoke(oldModel,
							(Object[])null);

					newModel.setAnswer(value23);

					Method method24 = oldModelClass.getMethod("getRegId");

					String value24 = (String)method24.invoke(oldModel,
							(Object[])null);

					newModel.setRegId(value24);

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
					"org.tvd.thptty.model.impl.TYClassStudentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYClassStudentClp newModel = new TYClassStudentClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getStudentId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value1);

					Method method2 = oldModelClass.getMethod("getClassId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setClassId(value2);

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
					"org.tvd.thptty.model.impl.TYClassUserRoleImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYClassUserRoleClp newModel = new TYClassUserRoleClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getClassId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setClassId(value1);

					Method method2 = oldModelClass.getMethod("getUserId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setUserId(value2);

					Method method3 = oldModelClass.getMethod("getRoleId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setRoleId(value3);

					Method method4 = oldModelClass.getMethod("getStatus");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setStatus(value4);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.TYSubjectImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYSubjectClp newModel = new TYSubjectClp();

					Method method0 = oldModelClass.getMethod("getSubjectId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getSubjectCode");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setSubjectCode(value3);

					Method method4 = oldModelClass.getMethod("getSubjectName");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setSubjectName(value4);

					Method method5 = oldModelClass.getMethod("getDescription");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value5);

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
					"org.tvd.thptty.model.impl.TYSubjectUserRoleImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYSubjectUserRoleClp newModel = new TYSubjectUserRoleClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSubjectId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value1);

					Method method2 = oldModelClass.getMethod("getUserId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setUserId(value2);

					Method method3 = oldModelClass.getMethod("getRoleId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setRoleId(value3);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.TYTeacherImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYTeacherClp newModel = new TYTeacherClp();

					Method method0 = oldModelClass.getMethod("getTeacherId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setTeacherId(value0);

					Method method1 = oldModelClass.getMethod("getTeacherDegree");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setTeacherDegree(value1);

					Method method2 = oldModelClass.getMethod(
							"getTeacherCertificate");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setTeacherCertificate(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

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
					"org.tvd.thptty.model.impl.TYStudentPointReserveImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYStudentPointReserveClp newModel = new TYStudentPointReserveClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSemester");

					Integer value1 = (Integer)method1.invoke(oldModel,
							(Object[])null);

					newModel.setSemester(value1);

					Method method2 = oldModelClass.getMethod("getStudentId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value2);

					Method method3 = oldModelClass.getMethod("getSubjectId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value3);

					Method method4 = oldModelClass.getMethod("getPointType");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setPointType(value4);

					Method method5 = oldModelClass.getMethod("getPointIndex");

					Integer value5 = (Integer)method5.invoke(oldModel,
							(Object[])null);

					newModel.setPointIndex(value5);

					Method method6 = oldModelClass.getMethod("getPointFactor");

					Integer value6 = (Integer)method6.invoke(oldModel,
							(Object[])null);

					newModel.setPointFactor(value6);

					Method method7 = oldModelClass.getMethod("getPoint");

					Double value7 = (Double)method7.invoke(oldModel,
							(Object[])null);

					newModel.setPoint(value7);

					Method method8 = oldModelClass.getMethod("getModifiedDate");

					Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value8);

					Method method9 = oldModelClass.getMethod("getUserId");

					Long value9 = (Long)method9.invoke(oldModel, (Object[])null);

					newModel.setUserId(value9);

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
					"org.tvd.thptty.model.impl.TYStudentPointImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYStudentPointClp newModel = new TYStudentPointClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSemester");

					Integer value1 = (Integer)method1.invoke(oldModel,
							(Object[])null);

					newModel.setSemester(value1);

					Method method2 = oldModelClass.getMethod("getStudentId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value2);

					Method method3 = oldModelClass.getMethod("getSubjectId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value3);

					Method method4 = oldModelClass.getMethod("getPointType");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setPointType(value4);

					Method method5 = oldModelClass.getMethod("getPointIndex");

					Integer value5 = (Integer)method5.invoke(oldModel,
							(Object[])null);

					newModel.setPointIndex(value5);

					Method method6 = oldModelClass.getMethod("getPointFactor");

					Integer value6 = (Integer)method6.invoke(oldModel,
							(Object[])null);

					newModel.setPointFactor(value6);

					Method method7 = oldModelClass.getMethod("getPoint");

					Double value7 = (Double)method7.invoke(oldModel,
							(Object[])null);

					newModel.setPoint(value7);

					Method method8 = oldModelClass.getMethod("getModifiedDate");

					Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value8);

					Method method9 = oldModelClass.getMethod("getUserId");

					Long value9 = (Long)method9.invoke(oldModel, (Object[])null);

					newModel.setUserId(value9);

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
					"org.tvd.thptty.model.impl.TYStudentConductImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYStudentConductClp newModel = new TYStudentConductClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSemester");

					Integer value1 = (Integer)method1.invoke(oldModel,
							(Object[])null);

					newModel.setSemester(value1);

					Method method2 = oldModelClass.getMethod("getStudentId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value2);

					Method method3 = oldModelClass.getMethod("getConduct");

					Integer value3 = (Integer)method3.invoke(oldModel,
							(Object[])null);

					newModel.setConduct(value3);

					Method method4 = oldModelClass.getMethod("getModifiedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value4);

					Method method5 = oldModelClass.getMethod("getUserId");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setUserId(value5);

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
					"org.tvd.thptty.model.impl.TYSubjectClassUserRoleImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYSubjectClassUserRoleClp newModel = new TYSubjectClassUserRoleClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSubjectId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value1);

					Method method2 = oldModelClass.getMethod("getClassId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setClassId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getRoleId");

					Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

					newModel.setRoleId(value4);

					Method method5 = oldModelClass.getMethod("getStatus");

					Integer value5 = (Integer)method5.invoke(oldModel,
							(Object[])null);

					newModel.setStatus(value5);

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
					"org.tvd.thptty.model.impl.TYPrioritySubjectImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYPrioritySubjectClp newModel = new TYPrioritySubjectClp();

					Method method0 = oldModelClass.getMethod("getCourses");

					Integer value0 = (Integer)method0.invoke(oldModel,
							(Object[])null);

					newModel.setCourses(value0);

					Method method1 = oldModelClass.getMethod("getSubjectId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value1);

					Method method2 = oldModelClass.getMethod("getStudentId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setStudentId(value2);

					Method method3 = oldModelClass.getMethod("getIsSpecial");

					Boolean value3 = (Boolean)method3.invoke(oldModel,
							(Object[])null);

					newModel.setIsSpecial(value3);

					Method method4 = oldModelClass.getMethod("getExtra");

					Integer value4 = (Integer)method4.invoke(oldModel,
							(Object[])null);

					newModel.setExtra(value4);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.SemesterImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					SemesterClp newModel = new SemesterClp();

					Method method0 = oldModelClass.getMethod("getCompanyId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getSemesterId");

					Integer value2 = (Integer)method2.invoke(oldModel,
							(Object[])null);

					newModel.setSemesterId(value2);

					Method method3 = oldModelClass.getMethod("getStatus");

					Integer value3 = (Integer)method3.invoke(oldModel,
							(Object[])null);

					newModel.setStatus(value3);

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

		if (oldModelClassName.equals("org.tvd.thptty.model.impl.TYMessagesImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TYMessagesClp newModel = new TYMessagesClp();

					Method method0 = oldModelClass.getMethod("getMessageId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setMessageId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getGroupId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value2);

					Method method3 = oldModelClass.getMethod("getActionId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setActionId(value3);

					Method method4 = oldModelClass.getMethod("getUserId");

					Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

					newModel.setUserId(value4);

					Method method5 = oldModelClass.getMethod("getClassId");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setClassId(value5);

					Method method6 = oldModelClass.getMethod("getSubjectId");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setSubjectId(value6);

					Method method7 = oldModelClass.getMethod("getHappenDate");

					Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

					newModel.setHappenDate(value7);

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