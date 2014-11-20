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

package org.tvd.thptty.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;

/**
 * @author Ta Van Dung
 */
public class TYStudentPointFinderUtil {
	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointFactor(
		int courses, int semester, long studentId, long subjectId,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAVGPointFactor(courses, semester, studentId,
			subjectId, pointFactor);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointSubject(
		int courses, int semester, long studentId, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAVGPointSubject(courses, semester, studentId,
			subjectId);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPoint(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByAVGPoint(courses, semester, studentId);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointOfStudents_C_S(
		int courses, int semester, long companyId, long groupId, float from,
		float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAVGPointOfStudents_C_S(courses, semester, companyId,
			groupId, from, to, begin, end);
	}

	public static int countByAVGPointOfStudents_C_S(int courses, int semester,
		long companyId, long groupId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByAVGPointOfStudents_C_S(courses, semester, companyId,
			groupId, from, to);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointOfStudents_C_S_Class(
		int courses, int semester, long companyId, long groupId, long classId,
		float from, float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAVGPointOfStudents_C_S_Class(courses, semester,
			companyId, groupId, classId, from, to, begin, end);
	}

	public static int countByAVGPointOfStudents_C_S_Class(int courses,
		int semester, long companyId, long groupId, long classId, float from,
		float to) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByAVGPointOfStudents_C_S_Class(courses, semester,
			companyId, groupId, classId, from, to);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassStudent> findStudentClassByCourse_Group(
		int courses, long companyId, long groupId, int classGroup, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findStudentClassByCourse_Group(courses, companyId, groupId,
			classGroup, start, end);
	}

	public static int countStudentClassByCourse_Group(int courses,
		long companyId, long groupId, int classGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countStudentClassByCourse_Group(courses, companyId,
			groupId, classGroup);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentPoint> findStudentMissPointBy_C_S_S_PF_PT(
		int courses, int semester, long subjectId, int pointFactor,
		int pointType, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findStudentMissPointBy_C_S_S_PF_PT(courses, semester,
			subjectId, pointFactor, pointType, classId, start, end);
	}

	public static int countStudentMissPointBy_C_S_S_PF_PT(int courses,
		int semester, long subjectId, int pointFactor, int pointType,
		long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countStudentMissPointBy_C_S_S_PF_PT(courses, semester,
			subjectId, pointFactor, pointType, classId);
	}

	public static int maxSemesterByC_G(int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().maxSemesterByC_G(courses, companyId, groupId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findClassesUserRoleByC_R(
		int courses, long companyId, long groupId, long roleId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findClassesUserRoleByC_R(courses, companyId, groupId,
			roleId, start, end);
	}

	public static int countClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countClassesUserRoleByC_R(courses, companyId, groupId,
			roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYClassUserRole> findClassesUserRoleByCourse(
		int courses, long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findClassesUserRoleByCourse(courses, companyId, groupId,
			start, end);
	}

	public static int countClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countClassesUserRoleByCourse(courses, companyId, groupId);
	}

	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findSubjectClassesUserRoleByC_R(
		int courses, long companyId, long groupId, long roleId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findSubjectClassesUserRoleByC_R(courses, companyId,
			groupId, roleId, start, end);
	}

	public static int countSubjectClassesUserRoleByC_R(int courses,
		long companyId, long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countSubjectClassesUserRoleByC_R(courses, companyId,
			groupId, roleId);
	}

	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findSubjectClassesUserRoleByCourse(
		int courses, long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findSubjectClassesUserRoleByCourse(courses, companyId,
			groupId, start, end);
	}

	public static int countSubjectClassesUserRoleByCourse(int courses,
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countSubjectClassesUserRoleByCourse(courses, companyId,
			groupId);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentConduct> findStudentsConductByS_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findStudentsConductByS_C(courses, semester, companyId,
			groupId, conduct, start, end);
	}

	public static int countStudentsConductByS_C(int courses, int semester,
		long companyId, long groupId, long conduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countStudentsConductByS_C(courses, semester, companyId,
			groupId, conduct);
	}

	public static java.util.List<org.tvd.thptty.model.TYStudentConduct> findStudentsConductByS_C_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findStudentsConductByS_C_C(courses, semester, companyId,
			groupId, conduct, classId, start, end);
	}

	public static int countStudentsConductByS_C_C(int courses, int semester,
		long companyId, long groupId, int conduct, long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countStudentsConductByS_C_C(courses, semester, companyId,
			groupId, conduct, classId);
	}

	public static TYStudentPointFinder getFinder() {
		if (_finder == null) {
			_finder = (TYStudentPointFinder)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYStudentPointFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(TYStudentPointFinder finder) {
		_finder = finder;
	}

	private static TYStudentPointFinder _finder;
}