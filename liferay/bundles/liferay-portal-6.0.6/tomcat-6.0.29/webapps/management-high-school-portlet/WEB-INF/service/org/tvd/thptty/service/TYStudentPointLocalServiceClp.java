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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Ta Van Dung
 */
public class TYStudentPointLocalServiceClp implements TYStudentPointLocalService {
	public TYStudentPointLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public org.tvd.thptty.model.TYStudentPoint addTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTYStudentPointMethodKey0,
				tyStudentPoint);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint createTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTYStudentPointMethodKey1,
				tyStudentPointPK);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYStudentPointMethodKey2,
				tyStudentPointPK);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTYStudentPointMethodKey3,
				tyStudentPoint);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				dynamicQuery, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				dynamicQuery, start, end, orderByComparator);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				dynamicQuery);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public org.tvd.thptty.model.TYStudentPoint getTYStudentPoint(
		org.tvd.thptty.service.persistence.TYStudentPointPK tyStudentPointPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYStudentPointMethodKey8,
				tyStudentPointPK);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getTYStudentPoints(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYStudentPointsMethodKey9,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYStudentPoint>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTYStudentPointsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTYStudentPointsCountMethodKey10);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public org.tvd.thptty.model.TYStudentPoint updateTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYStudentPointMethodKey11,
				tyStudentPoint);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint updateTYStudentPoint(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTYStudentPointMethodKey12,
				tyStudentPoint, merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint addStudentPoint(
		org.tvd.thptty.model.TYStudentPoint studentPoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addStudentPointMethodKey13,
				studentPoint);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentPointsByPTPF(
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentPointsByPTPFMethodKey14,
				courses, semester, studentId, subjectId, pointType, pointFactor);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYStudentPoint>)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPointsByFactor(
		int courses, int semester, long studentId, long subjectId,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentAVGPointsByFactorMethodKey15,
				courses, semester, studentId, subjectId, pointFactor);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPointsBySubject(
		int courses, int semester, long studentId, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentAVGPointsBySubjectMethodKey16,
				courses, semester, studentId, subjectId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public org.tvd.thptty.model.TYStudentPoint getStudentAVGPoints(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentAVGPointsMethodKey17,
				courses, semester, studentId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (org.tvd.thptty.model.TYStudentPoint)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentsPointsByC_S(
		int courses, int semester, long companyId, long groupId, float from,
		float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentsPointsByC_SMethodKey18,
				courses, semester, companyId, groupId, from, to, begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYStudentPoint>)ClpSerializer.translateOutput(returnObj);
	}

	public int countStudentsPointsByC_S(int courses, int semester,
		long companyId, long groupId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countStudentsPointsByC_SMethodKey19,
				courses, semester, companyId, groupId, from, to);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentsPointsByC_S_Class(
		int courses, int semester, long companyId, long groupId, long classId,
		float from, float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentsPointsByC_S_ClassMethodKey20,
				courses, semester, companyId, groupId, classId, from, to,
				begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYStudentPoint>)ClpSerializer.translateOutput(returnObj);
	}

	public int countStudentsPointsByC_S_Class(int courses, int semester,
		long companyId, long groupId, long classId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countStudentsPointsByC_S_ClassMethodKey21,
				courses, semester, companyId, groupId, classId, from, to);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public int getCountOfPointByPTPF(int courses, int semester, long studentId,
		long subjectId, int pointType, int pointFactor) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getCountOfPointByPTPFMethodKey22,
				courses, semester, studentId, subjectId, pointType, pointFactor);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public int countStudentMissPointBy_C_S_S_PF_PT(int courses, int semester,
		long subjectId, int pointFactor, int pointType, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countStudentMissPointBy_C_S_S_PF_PTMethodKey23,
				courses, semester, subjectId, pointFactor, pointType, classId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> getStudentMissPointBy_C_S_S_PF_PT(
		int courses, int semester, long subjectId, int pointFactor,
		int pointType, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStudentMissPointBy_C_S_S_PF_PTMethodKey24,
				courses, semester, subjectId, pointFactor, pointType, classId,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<org.tvd.thptty.model.TYStudentPoint>)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTYStudentPointMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addTYStudentPoint", org.tvd.thptty.model.TYStudentPoint.class);
	private MethodKey _createTYStudentPointMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"createTYStudentPoint",
			org.tvd.thptty.service.persistence.TYStudentPointPK.class);
	private MethodKey _deleteTYStudentPointMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYStudentPoint",
			org.tvd.thptty.service.persistence.TYStudentPointPK.class);
	private MethodKey _deleteTYStudentPointMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTYStudentPoint", org.tvd.thptty.model.TYStudentPoint.class);
	private MethodKey _dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery", com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class);
	private MethodKey _dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQuery",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
			int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"dynamicQueryCount",
			com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
	private MethodKey _getTYStudentPointMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYStudentPoint",
			org.tvd.thptty.service.persistence.TYStudentPointPK.class);
	private MethodKey _getTYStudentPointsMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYStudentPoints", int.class, int.class);
	private MethodKey _getTYStudentPointsCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTYStudentPointsCount");
	private MethodKey _updateTYStudentPointMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYStudentPoint", org.tvd.thptty.model.TYStudentPoint.class);
	private MethodKey _updateTYStudentPointMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateTYStudentPoint", org.tvd.thptty.model.TYStudentPoint.class,
			boolean.class);
	private MethodKey _addStudentPointMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"addStudentPoint", org.tvd.thptty.model.TYStudentPoint.class);
	private MethodKey _getStudentPointsByPTPFMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentPointsByPTPF", int.class, int.class, long.class,
			long.class, int.class, int.class);
	private MethodKey _getStudentAVGPointsByFactorMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentAVGPointsByFactor", int.class, int.class, long.class,
			long.class, int.class);
	private MethodKey _getStudentAVGPointsBySubjectMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentAVGPointsBySubject", int.class, int.class, long.class,
			long.class);
	private MethodKey _getStudentAVGPointsMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentAVGPoints", int.class, int.class, long.class);
	private MethodKey _getStudentsPointsByC_SMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentsPointsByC_S", int.class, int.class, long.class,
			long.class, float.class, float.class, int.class, int.class);
	private MethodKey _countStudentsPointsByC_SMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"countStudentsPointsByC_S", int.class, int.class, long.class,
			long.class, float.class, float.class);
	private MethodKey _getStudentsPointsByC_S_ClassMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentsPointsByC_S_Class", int.class, int.class, long.class,
			long.class, long.class, float.class, float.class, int.class,
			int.class);
	private MethodKey _countStudentsPointsByC_S_ClassMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"countStudentsPointsByC_S_Class", int.class, int.class, long.class,
			long.class, long.class, float.class, float.class);
	private MethodKey _getCountOfPointByPTPFMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"getCountOfPointByPTPF", int.class, int.class, long.class,
			long.class, int.class, int.class);
	private MethodKey _countStudentMissPointBy_C_S_S_PF_PTMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
			"countStudentMissPointBy_C_S_S_PF_PT", int.class, int.class,
			long.class, int.class, int.class, long.class);
	private MethodKey _getStudentMissPointBy_C_S_S_PF_PTMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStudentMissPointBy_C_S_S_PF_PT", int.class, int.class,
			long.class, int.class, int.class, long.class, int.class, int.class);
}