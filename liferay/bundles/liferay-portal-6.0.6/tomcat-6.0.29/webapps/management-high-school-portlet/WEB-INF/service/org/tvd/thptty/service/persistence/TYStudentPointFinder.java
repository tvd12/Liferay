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

/**
 * @author Ta Van Dung
 */
public interface TYStudentPointFinder {
	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointFactor(
		int courses, int semester, long studentId, long subjectId,
		int pointFactor)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointSubject(
		int courses, int semester, long studentId, long subjectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPoint(
		int courses, int semester, long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointOfStudents_C_S(
		int courses, int semester, long companyId, long groupId, float from,
		float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByAVGPointOfStudents_C_S(int courses, int semester,
		long companyId, long groupId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findByAVGPointOfStudents_C_S_Class(
		int courses, int semester, long companyId, long groupId, long classId,
		float from, float to, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByAVGPointOfStudents_C_S_Class(int courses, int semester,
		long companyId, long groupId, long classId, float from, float to)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYClassStudent> findStudentClassByCourse_Group(
		int courses, long companyId, long groupId, int classGroup, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentClassByCourse_Group(int courses, long companyId,
		long groupId, int classGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentPoint> findStudentMissPointBy_C_S_S_PF_PT(
		int courses, int semester, long subjectId, int pointFactor,
		int pointType, long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentMissPointBy_C_S_S_PF_PT(int courses, int semester,
		long subjectId, int pointFactor, int pointType, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int maxSemesterByC_G(int courses, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findClassesUserRoleByC_R(
		int courses, long companyId, long groupId, long roleId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYClassUserRole> findClassesUserRoleByCourse(
		int courses, long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findSubjectClassesUserRoleByC_R(
		int courses, long companyId, long groupId, long roleId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countSubjectClassesUserRoleByC_R(int courses, long companyId,
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findSubjectClassesUserRoleByCourse(
		int courses, long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countSubjectClassesUserRoleByCourse(int courses, long companyId,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentConduct> findStudentsConductByS_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentsConductByS_C(int courses, int semester,
		long companyId, long groupId, long conduct)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.tvd.thptty.model.TYStudentConduct> findStudentsConductByS_C_C(
		int courses, int semester, long companyId, long groupId, int conduct,
		long classId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countStudentsConductByS_C_C(int courses, int semester,
		long companyId, long groupId, int conduct, long classId)
		throws com.liferay.portal.kernel.exception.SystemException;
}