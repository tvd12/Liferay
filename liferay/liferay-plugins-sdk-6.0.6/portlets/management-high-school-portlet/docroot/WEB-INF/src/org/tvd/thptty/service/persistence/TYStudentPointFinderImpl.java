/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.

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

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYClassUserRole;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.model.impl.TYClassStudentImpl;
import org.tvd.thptty.model.impl.TYClassUserRoleImpl;
import org.tvd.thptty.model.impl.TYStudentConductImpl;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.model.impl.TYSubjectClassUserRoleImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ta Van Dung
 */
public class TYStudentPointFinderImpl extends BasePersistenceImpl<TYStudentPoint>
    implements TYStudentPointFinder {

	/**
	 * 
	 * Student-Point
	*/
    public static String FIND_BY_AVG_POINT_FACTOR =
    		TYStudentPointFinder.class.getName() + ".findByAVGPointFactor";

    public List<TYStudentPoint> findByAVGPointFactor( int courses, int semester,
    	long studentId, long subjectId, int pointFactor) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_BY_AVG_POINT_FACTOR);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("avgPoint", Type.FLOAT);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(studentId);
            qPos.add(subjectId);
            qPos.add(pointFactor);
            
            List<Object[]> studentAVGPoints =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), 0, 1);

            List<TYStudentPoint> temps = assemblePoints(studentAVGPoints);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String FIND_BY_AVG_POINT_SUBJECT =
    		TYStudentPointFinder.class.getName() + ".findByAVGPointSubject";

    public List<TYStudentPoint> findByAVGPointSubject( int courses, int semester,
    	long studentId, long subjectId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_BY_AVG_POINT_SUBJECT);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("avgPoint", Type.FLOAT);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(studentId);
            qPos.add(subjectId);
            
            List<Object[]> studentAVGPoints =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), 0, 1);

            List<TYStudentPoint> temps = assemblePoints(studentAVGPoints);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String FIND_BY_AVG_POINT =
    		TYStudentPointFinder.class.getName() + ".findByAVGPoint";

    public List<TYStudentPoint> findByAVGPoint( int courses, int semester,
    	long studentId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_BY_AVG_POINT);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("avgPoint", Type.FLOAT);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(studentId);
            
            List<Object[]> studentAVGPoints =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), 0, 1);

            List<TYStudentPoint> temps = assemblePoints(studentAVGPoints);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String FIND_BY_AVG_POINT_OF_STUDENT_C_S =
    		TYStudentPointFinder.class.getName() + ".findByAVGPointOfStudents_C_S";

    public List<TYStudentPoint> findByAVGPointOfStudents_C_S( int courses, int semester,
    	long companyId, long groupId, float from, float to, int begin, 
    		int end) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_BY_AVG_POINT_OF_STUDENT_C_S);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("avgPoint", Type.FLOAT);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(from);
            qPos.add(to);
            
            List<Object[]> studentAVGPoints =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), begin, end);

            List<TYStudentPoint> temps = assemblePoints(studentAVGPoints);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String COUNT_BY_AVG_POINT_OF_STUDENT_C_S =
    		TYStudentPointFinder.class.getName() + ".countByAVGPointOfStudents_C_S";

    public int countByAVGPointOfStudents_C_S( int courses, int semester,
    	long companyId, long groupId, float from, float to) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_BY_AVG_POINT_OF_STUDENT_C_S);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(from);
            qPos.add(to);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            
            return (Integer)counts.get(0);
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String FIND_BY_AVG_POINT_OF_STUDENT_C_S_CLASS =
    		TYStudentPointFinder.class.getName() + ".findByAVGPointOfStudents_C_S_Class";

    public List<TYStudentPoint> findByAVGPointOfStudents_C_S_Class( 
    	int courses, int semester, long companyId, long groupId,
    		long classId, float from, float to, int begin, int end) 
    			throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_BY_AVG_POINT_OF_STUDENT_C_S_CLASS);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("avgPoint", Type.FLOAT);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(classId);
            qPos.add(from);
            qPos.add(to);
            
            List<Object[]> studentAVGPoints =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), begin, end);

            List<TYStudentPoint> temps = assemblePoints(studentAVGPoints);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    public static String COUNT_BY_AVG_POINT_OF_STUDENT_C_S_CLASS =
    		TYStudentPointFinder.class.getName() + ".countByAVGPointOfStudents_C_S_Class";

    public int countByAVGPointOfStudents_C_S_Class( int courses, int semester,
    	long companyId, long groupId, long classId, float from, float to) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_BY_AVG_POINT_OF_STUDENT_C_S_CLASS);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(classId);
            qPos.add(from);
            qPos.add(to);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            
            return (Integer)counts.get(0);
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }

    private List<TYStudentPoint> assemblePoints(List<Object[]> studentAVGPoints) {

        List<TYStudentPoint> studentPoints = new ArrayList<TYStudentPoint>();
        for (Object[] studentAVGPoint : studentAVGPoints) {
        	TYStudentPoint studentPoint = new TYStudentPointImpl();
        	studentPoint.setStudentId((Long)studentAVGPoint[0]);
        	studentPoint.setPoint((Float)studentAVGPoint[1]);
           
        	studentPoints.add(studentPoint);
        }

        return studentPoints;
    }
    
    
    /**
     * 
     * Student-Class
    */
    
    public static String FIND_STUDENT_CLASS_COURSE_GROUP =
    		TYStudentPointFinder.class.getName() + ".findStudentClassByCourse_Group";

    public List<TYClassStudent> findStudentClassByCourse_Group( int courses, long companyId,
    		long groupId, int classGroup, int start, int end) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_STUDENT_CLASS_COURSE_GROUP);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("classId", Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(classGroup);
            
            List<Object[]> classStudents =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYClassStudent> temps = assembleClassStudent(classStudents);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    private List<TYClassStudent> assembleClassStudent(List<Object[]> classStudents) {
    	 List<TYClassStudent> results = new ArrayList<TYClassStudent>();
         for (Object[] temp : classStudents) {
         	TYClassStudent classStudent = new TYClassStudentImpl();
         	classStudent.setStudentId((Long)temp[0]);
         	classStudent.setClassId((Long)temp[1]);
         	results.add(classStudent);
         }

         return results;
    }
    
    
    public static String COUNT_STUDENT_CLASS_COURSE_GROUP =
    		TYStudentPointFinder.class.getName() + ".countStudentClassByCourse_Group";

    public int countStudentClassByCourse_Group( int courses, long companyId,
    		long groupId, int classGroup) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_STUDENT_CLASS_COURSE_GROUP);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(classGroup);
            
            List<Object> classStudents =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)classStudents.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    public static String FIND_STUDENT_MISS_POINT_C_S_S_PF_PT =
    		TYStudentPointFinder.class.getName() + ".findStudentMissPointBy_C_S_S_PF_PT";

    public List<TYStudentPoint> findStudentMissPointBy_C_S_S_PF_PT( int courses, int semester, 
    		long subjectId, int pointFactor, int pointType, long classId,
    			int start, int end) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_STUDENT_MISS_POINT_C_S_S_PF_PT);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(subjectId);
            qPos.add(classId);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(subjectId);
            qPos.add(pointFactor);
            qPos.add(pointType);
            qPos.add(classId);
            
            List<Object> students =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYStudentPoint> temps = assembleStudent(students);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    private List<TYStudentPoint> assembleStudent(List<Object> students) {
    	 List<TYStudentPoint> results = new ArrayList<TYStudentPoint>();
         for (Object temp : students) {
        	TYStudentPoint student = new TYStudentPointImpl();
         	student.setStudentId((Long)temp);
         	results.add(student);
         }

         return results;
    }
    
    
    public static String COUNT_STUDENT_MISS_POINT_C_S_S_PF_PT =
    		TYStudentPointFinder.class.getName() + ".countStudentMissPointBy_C_S_S_PF_PT";

    public int countStudentMissPointBy_C_S_S_PF_PT( int courses, int semester, 
    		long subjectId, int pointFactor, int pointType, 
    			long classId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_STUDENT_MISS_POINT_C_S_S_PF_PT);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(subjectId);
            qPos.add(classId);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(subjectId);
            qPos.add(pointFactor);
            qPos.add(pointType);
            qPos.add(classId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    public static String MAX_SEMESTER_BY_C_G =
    		TYStudentPointFinder.class.getName() + ".maxSemesterByC_G";

    public int maxSemesterByC_G( int courses, long companyId, long groupId) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(MAX_SEMESTER_BY_C_G);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("max", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(courses);
            
            List<Object> maxs =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int max = (Integer)maxs.get(0);

            return max;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    
    /**
     * Class-User-Role
     * 
     * 
     * 
     */
    
    public static String FIND_CLASSES_USER_ROLE_BY_C_R =
    		TYStudentPointFinder.class.getName() + ".findClassesUserRoleByC_R";

    public List<TYClassUserRole> findClassesUserRoleByC_R( int courses,
    	long companyId, long groupId, long roleId, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_CLASSES_USER_ROLE_BY_C_R);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("classId", Type.LONG);
            q.addScalar("userId", Type.LONG);
            q.addScalar("roleId", Type.LONG);
            q.addScalar("status", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(roleId);
            
            List<Object[]> classesUsers =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYClassUserRole> temps = assembleClassUser(classesUsers);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    private List<TYClassUserRole> assembleClassUser(List<Object[]> classsUsers) {
    	 List<TYClassUserRole> results = new ArrayList<TYClassUserRole>();
         for (Object[] temp : classsUsers) {
        	TYClassUserRole classUserRole = new TYClassUserRoleImpl();
        	classUserRole.setClassId((Long)temp[0]);
        	classUserRole.setUserId((Long)temp[1]);
        	classUserRole.setRoleId((Long)temp[2]);
        	classUserRole.setStatus((Integer)temp[3]);
         	results.add(classUserRole);
         }

         return results;
    }
    
    
    public static String COUNT_CLASSES_USER_ROLE_BY_C_R =
    		TYStudentPointFinder.class.getName() + ".countClassesUserRoleByC_R";

    public int countClassesUserRoleByC_R(int courses, long companyId, long groupId,
    		long roleId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_CLASSES_USER_ROLE_BY_C_R);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(roleId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    public static String FIND_CLASSES_USER_ROLE_BY_COURSE =
    		TYStudentPointFinder.class.getName() + ".findClassesUserRoleByCourse";

    public List<TYClassUserRole> findClassesUserRoleByCourse( int courses,
    	long companyId, long groupId, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_CLASSES_USER_ROLE_BY_COURSE);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("classId", Type.LONG);
            q.addScalar("userId", Type.LONG);
            q.addScalar("roleId", Type.LONG);
            q.addScalar("status", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            
            List<Object[]> classesUsers =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYClassUserRole> temps = assembleClassUser(classesUsers);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }    
    
    public static String COUNT_CLASSES_USER_ROLE_BY_COURSE =
    		TYStudentPointFinder.class.getName() + ".countClassesUserRoleByCourse";

    public int countClassesUserRoleByCourse(int courses, 
    		long companyId, long groupId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_CLASSES_USER_ROLE_BY_COURSE);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    /**
     * 
     * Subject-Class-User-Role
     * 
     * 
    */
    
    public static String FIND_SUBJECT_CLASSES_USER_ROLE_BY_C_R =
    		TYStudentPointFinder.class.getName() + ".findSubjectClassesUserRoleByC_R";

    public List<TYSubjectClassUserRole> findSubjectClassesUserRoleByC_R( int courses,
    	long companyId, long groupId, long roleId, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_SUBJECT_CLASSES_USER_ROLE_BY_C_R);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("subjectId", Type.LONG);
            q.addScalar("classId", Type.LONG);
            q.addScalar("userId", Type.LONG);
            q.addScalar("status", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(roleId);
            
            List<Object[]> subjectsClassesUsers =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYSubjectClassUserRole> temps = assembleSubjectClassUser(subjectsClassesUsers);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    private List<TYSubjectClassUserRole> assembleSubjectClassUser(List<Object[]> subjectsClasssUsers) {
    	 List<TYSubjectClassUserRole> results = new ArrayList<TYSubjectClassUserRole>();
         for (Object[] temp : subjectsClasssUsers) {
        	TYSubjectClassUserRole subjectClassUserRole = new TYSubjectClassUserRoleImpl();
        	subjectClassUserRole.setSubjectId((Long)temp[0]);
        	subjectClassUserRole.setClassId((Long)temp[1]);
        	subjectClassUserRole.setUserId((Long)temp[2]);
        	subjectClassUserRole.setRoleId((Long)temp[3]);
        	subjectClassUserRole.setStatus((Integer)temp[4]);
         	results.add(subjectClassUserRole);
         }

         return results;
    }
    
    
    public static String COUNT_SUBJECT_CLASSES_USER_ROLE_BY_C_R =
    		TYStudentPointFinder.class.getName() + ".countSubjectClassesUserRoleByC_R";

    public int countSubjectClassesUserRoleByC_R(int courses, long companyId, long groupId,
    		long roleId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_SUBJECT_CLASSES_USER_ROLE_BY_C_R);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(roleId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    public static String FIND_SUBJECT_CLASSES_USER_ROLE_BY_COURSE =
    		TYStudentPointFinder.class.getName() + ".findSubjectClassesUserRoleByCourse";

    public List<TYSubjectClassUserRole> findSubjectClassesUserRoleByCourse( int courses,
    	long companyId, long groupId, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_SUBJECT_CLASSES_USER_ROLE_BY_COURSE);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("subjectId", Type.LONG);
            q.addScalar("classId", Type.LONG);
            q.addScalar("userId", Type.LONG);
            q.addScalar("roleId", Type.LONG);
            q.addScalar("status", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            
            List<Object[]> subjectsClassesUsers =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYSubjectClassUserRole> temps = assembleSubjectClassUser(subjectsClassesUsers);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }    
    
    public static String COUNT_SUBJECT_CLASSES_USER_ROLE_BY_COURSE =
    		TYStudentPointFinder.class.getName() + ".countSubjectClassesUserRoleByCourse";

    public int countSubjectClassesUserRoleByCourse(int courses, 
    		long companyId, long groupId) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_SUBJECT_CLASSES_USER_ROLE_BY_COURSE);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(companyId);
            qPos.add(groupId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    /**
     * 
     * Student-Conduct
     * 
    */
    public static String FIND_STUDENTS_CONDUCT_BY_S_C =
    		TYStudentPointFinder.class.getName() + ".findStudentsConductByS_C";

    public List<TYStudentConduct> findStudentsConductByS_C(int courses, int semester,
    		long companyId, long groupId, int conduct, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_STUDENTS_CONDUCT_BY_S_C);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("conduct", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(conduct);
            
            List<Object[]> studentsConducts =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYStudentConduct> temps = assembleStudentsConducts(studentsConducts);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    private List<TYStudentConduct> assembleStudentsConducts(List<Object[]> subjectsClasssUsers) {
    	 List<TYStudentConduct> results = new ArrayList<TYStudentConduct>();
         for (Object[] temp : subjectsClasssUsers) {
        	TYStudentConduct studentConduct = new TYStudentConductImpl();
        	studentConduct.setStudentId((Long)temp[0]);
        	studentConduct.setConduct((Integer)temp[1]);
         	results.add(studentConduct);
         }

         return results;
    }
    
    
    public static String COUNT_STUDENTS_CONDUCT_BY_S_C =
    		TYStudentPointFinder.class.getName() + ".countStudentsConductByS_C";

    public int countStudentsConductByS_C(int courses, int semester, 
    		long companyId, long groupId, long conduct) throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_STUDENTS_CONDUCT_BY_S_C);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(conduct);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
    
    public static String FIND_STUDENTS_CONDUCT_BY_S_C_C =
    		TYStudentPointFinder.class.getName() + ".findStudentsConductByS_C_C";

    public List<TYStudentConduct> findStudentsConductByS_C_C( int courses, int semester,
    	long companyId, long groupId, int conduct, long classId, int start, int end) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(FIND_STUDENTS_CONDUCT_BY_S_C_C);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("studentId", Type.LONG);
            q.addScalar("conduct", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(conduct);
            qPos.add(classId);
            
            List<Object[]> studentsConducts =
                    (List<Object[]>) QueryUtil.list(
                        q, getDialect(), start, end);

            List<TYStudentConduct> temps = assembleStudentsConducts(studentsConducts);

            return temps;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }    
    
    public static String COUNT_STUDENTS_CONDUCT_BY_S_C_C =
    		TYStudentPointFinder.class.getName() + ".countStudentsConductByS_C_C";

    public int countStudentsConductByS_C_C(int courses, int semester,
    	long companyId, long groupId, int conduct, long classId) 
    		throws SystemException {

        //long classNameId = PortalUtil.getClassNameId(
            //"org.tvd.thptty.model.TYStudentPoint");
        Session session = null;

        try {
            session = openSession();

            String sql = CustomSQLUtil.get(COUNT_STUDENTS_CONDUCT_BY_S_C_C);

            SQLQuery q = session.createSQLQuery(sql);
            q.addScalar("count", Type.INTEGER);

            QueryPos qPos = QueryPos.getInstance(q);
            qPos.add(courses);
            qPos.add(semester);
            qPos.add(companyId);
            qPos.add(groupId);
            qPos.add(conduct);
            qPos.add(classId);
            
            List<Object> counts =
                    (List<Object>) QueryUtil.list(
                        q, getDialect(), 0, 1);
            int count = (Integer)counts.get(0);

            return count;
        }
        catch (Exception e) {
            throw new SystemException(e);
        }
        finally {
            closeSession(session);
        }
    }
    
}
