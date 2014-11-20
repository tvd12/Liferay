package org.tvd.thptty.management.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;

import org.tvd.thptty.NoSuchClassUserRoleException;
import org.tvd.thptty.NoSuchSemesterException;
import org.tvd.thptty.NoSuchStudentException;
import org.tvd.thptty.management.temporary.CompareClasses;
import org.tvd.thptty.management.temporary.CompareStudentName;
import org.tvd.thptty.management.temporary.TeacherTemp;
import org.tvd.thptty.model.Semester;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYClassUserRole;
import org.tvd.thptty.model.TYMessages;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.model.impl.TYClassImpl;
import org.tvd.thptty.model.impl.TYStudentConductImpl;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.model.impl.TYSubjectImpl;
import org.tvd.thptty.service.SemesterLocalServiceUtil;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYMessagesLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import org.tvd.thptty.management.temporary.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public class ActionUtil {
	
	public static TYClass classFromRequest(ActionRequest request) {
		TYClass tyClass = new TYClassImpl();
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		tyClass.setCompanyId(companyId);
		tyClass.setGroupId(groupId);
		tyClass.setClassCode(ParamUtil.getString(request, "classCode"));
		tyClass.setClassGroup(ParamUtil.getInteger(request, "classGroup"));
		tyClass.setClassName(ParamUtil.getString(request, "className"));
		tyClass.setModifiedDate(new Date());
		tyClass.setUserId(userId);
		
		return tyClass;
	}
	
	public static List<TYClass> getAllClassFromSchool(long companyId, long groupId) {
		List<TYClass> listClasses = null;
		try {
			listClasses =  TYClassLocalServiceUtil.getAllClassBySchool(
					companyId, groupId);
			listClasses = new ArrayList<TYClass>(listClasses);
			Collections.sort(listClasses, new CompareClasses());
			for(int i = 0 ; i < listClasses.size() ; i++) {
				listClasses.get(i).setClassFullName(listClasses.get(i).getClassGroup() + 
						listClasses.get(i).getClassName());
				listClasses.get(i).setIndex(i + 1);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return listClasses;
	}
	
	public static List<TYClass> getClassesByGroup(long companyId, 
			long groupId, int classGroup) {
		List<TYClass> results = new ArrayList<TYClass>();
		List<TYClass> temp = getAllClassFromSchool(companyId, groupId);
		int index = 1;
		for(TYClass tyClass : temp) {
			if(tyClass.getClassGroup() == classGroup) {
				tyClass.setIndex(index++);
				results.add(tyClass);
			}
		}
		
		return new ArrayList<TYClass>(results);
	}
	
	public static TYClass getClassById(long classId, 
			long groupId, long companyId) {
		TYClass tyClass = null;
			try {
				tyClass = TYClassLocalServiceUtil.getClassById(
						classId, groupId, companyId);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		
		return tyClass;
	}
	
	public static TYClass getTYClassById(long classId) {
		TYClass tyClass = null;
		try {
			tyClass = TYClassLocalServiceUtil.getTYClass(classId);
			tyClass.setClassFullName(tyClass.getClassGroup() + 
				tyClass.getClassName());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return tyClass;
	}
	
	public static TYStudent studentFromRequest(ActionRequest request) {
		TYStudent student = new TYStudentImpl();
		
		ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		student.setCompanyId(companyId);
		student.setGroupId(groupId);
		student.setAddress(ParamUtil.getString(request, "address"));
		student.setEmailAddress(ParamUtil.getString(request, "email"));
		student.setEmailPassword(ParamUtil.getString(request, "emailPassword"));
		student.setFatherName(ParamUtil.getString(request, "fatherName"));
		student.setFatherPhone(ParamUtil.getString(request, "fatherPhone"));
		student.setMotherName(ParamUtil.getString(request, "motherName"));
		student.setMotherPhone(ParamUtil.getString(request, "motherPhone"));
		student.setStudentFirstName(ParamUtil.getString(request, "studentFirstName"));
		student.setStudentLastName(ParamUtil.getString(request, "studentLastName"));
		student.setStudentGroup1(ParamUtil.getInteger(request, "studentGroup1"));
		student.setStudentGroup2(ParamUtil.getInteger(request, "studentGroup2"));
		student.setStudentGroup3(ParamUtil.getInteger(request, "studentGroup3"));
		
		int birthDayMonth = ParamUtil.getInteger(request, "birthDayMonth");
	    int birthDayDay = ParamUtil.getInteger(request, "birthDayDay");
	    int birthDayYear = ParamUtil.getInteger(request, "birthDayYear");
	    
	    try {
			student.setBirthDay(PortalUtil.getDate(
					birthDayMonth, birthDayDay, birthDayYear, new PortalException()));
		} catch (PortalException e) {
			e.printStackTrace();
		}
	    
	    String gender = ParamUtil.getString(request, "gender");
		student.setMale(gender.equals("male"));
		
		return student;
	}
	
	public static int getStatusOfClassUserRole(int course, long companyId, long groupId) {
		try {
			List<TYClassUserRole> tmp = 
					TYClassUserRoleLocalServiceUtil.getClassUserRolesByCourse(
							course, companyId, groupId);
			if(tmp != null && tmp.size() > 0) {
				return tmp.get(0).getStatus();
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static TYStudent getStudentByEmail(long companyId, 
			long groupId, String emailAddress) {
		TYStudent student = null;
		try {
			student = TYStudentLocalServiceUtil.getStudentByEmail(
					companyId, groupId, emailAddress);
		} catch (NoSuchStudentException e) {
		} catch (SystemException e) {
		}
		
		return student;
	}
	
	public static TYStudent getStudentById(long studentId) {
		try {
			TYStudent student = TYStudentLocalServiceUtil.getTYStudent(studentId);
			student.setFullName(student.getStudentFirstName() + " " +  
				student.getStudentLastName());
			return student;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<TYStudent> getAllStudentsByGroup(long companyId, long groupId) {
		List<TYStudent> students = Collections.emptyList();
		try {
			students = TYStudentLocalServiceUtil.getAllStudentsByGroup(companyId, groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public static List<TYStudent> getStudentsInClass(int courses, long classId) {
		List<TYStudent> students = Collections.emptyList();
		try {
			students = TYClassStudentLocalServiceUtil.getAllStudentsInClass(
					courses, classId);
			Collections.sort(students, new CompareStudentName());
			for(int i = 0 ; i < students.size() ; i++) {
				students.get(i).setIndex(i + 1);
				students.get(i).setFullName(students.get(i).getStudentFirstName()
						+ " " + students.get(i).getStudentLastName());
			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return students;
	}
	
	public static List<TeacherTemp> getAllTeachers(long groupId) {
		List<User> tempResults = Collections.emptyList();
		try {
			tempResults = UserLocalServiceUtil.getGroupUsers(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		List<TeacherTemp> teachers = new ArrayList<TeacherTemp>();
		int INDEX = 1;
		for(User userTemp : tempResults) {
			TeacherTemp teacher = new TeacherTemp();
			teacher.setFullName(userTemp.getFullName());
			teacher.setTeacherId(userTemp.getUserId());
			teacher.setEmailAddress(userTemp.getEmailAddress());
			teacher.setIndex(INDEX);
			teachers.add(teacher);
			INDEX++;
		}
		
		return teachers;
	}
	
	public static List<TYClass> getClassesByTeacherRole(
			int courses, long groupId, long companyId, long userId, long roleId) {
		List<TYClass> classes = Collections.emptyList();
		try {
			classes = TYClassUserRoleLocalServiceUtil.getClassesByUserRole(
					courses, groupId, companyId, userId, roleId);
			for(int i = 0 ; i < classes.size() ; i++) {
				classes.get(i).setClassFullName(
						classes.get(i).getClassGroup() + classes.get(i).getClassName());
				classes.get(i).setIndex(i + 1);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return classes;
	}
	
	public static List<TYClass> getClassesByRole(int courses, 
			long companyId, long groupId, long roleId) {
		List<TYClass> classes = Collections.emptyList();
		try {
			classes = TYClassUserRoleLocalServiceUtil.getClassesByRole(
					courses, companyId, groupId, roleId);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return classes;
	}
	
	public static User getTeacherManagementOfClass(
			int courses, long classId, long roleId) {
		User teacher = null;
		try {
			teacher = TYClassUserRoleLocalServiceUtil.getUserByClassRole(
					courses, classId, roleId);
		} catch (PortalException e) {
		} catch (SystemException e) {
		}
		return teacher;
	}
	
	
	public static List<TYSubject> getAllSubjects(long companyId, long groupId) {
		List<TYSubject> subjects = Collections.emptyList();
		try {
			subjects = TYSubjectLocalServiceUtil.getAllSubjects(companyId, groupId);
			for(int i = 0 ; i < subjects.size() ; i++) {
				subjects.get(i).setIndex(i + 1);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return subjects;
	}
	
	public static TYSubject subjectFromRequest(ActionRequest request) {
		TYSubject subject = new TYSubjectImpl();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		subject.setCompanyId(companyId);
		subject.setGroupId(groupId);
		subject.setSubjectCode(ParamUtil.getString(request, "subjectCode"));
		subject.setSubjectName(ParamUtil.getString(request, "subjectName"));
		subject.setDescription(ParamUtil.getString(request, "description"));
		
		return subject;
	}
	
	
	public static List<TYStudentConduct> studentConductsFromRequest(ActionRequest request) {
		List<TYStudentConduct> studentConducts = new ArrayList<TYStudentConduct>();
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		long classId = ParamUtil.getLong(request, "classId");
		int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		int courses = TYServiceUtil.getCurrentCourse();
		
		int amountStudent = getStudentsInClass(courses, classId).size();
		
		for(int i = 0 ; i < amountStudent ; i++) {
			TYStudentConduct studentConduct = new TYStudentConductImpl();
			studentConduct.setCourses(courses);
			studentConduct.setSemester(semester);
			studentConduct.setStudentId(ParamUtil.getLong(request, "studentId" + i));
			studentConduct.setConduct(ParamUtil.getInteger(request, "conduct" + i));
			studentConduct.setUserId(userId);
			studentConduct.setModifiedDate(new Date());
			studentConducts.add(studentConduct);
		}
		
		return studentConducts;
	}
	
	public static List<TYStudentPoint> studentPointsFromRequest(ActionRequest request) {
		List<TYStudentPoint> studentPoints = new ArrayList<TYStudentPoint>();
		
		int amountStudent = ParamUtil.getInteger(request, "amountStudent");
		long subjectId = ParamUtil.getLong(request, "subjectId");
		int pointFactor = ParamUtil.getInteger(request, "pointFactor");
		int courses = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		
		long userId = themeDisplay.getUserId();
		
		for(int i = 0 ; i < amountStudent ; i++) {
			
			long studentId = ParamUtil.getLong(request, "studentId" + i);
			int pointType = ParamUtil.getInteger(request, "pointType" + i);
			String point = ParamUtil.getString(request, "point" + i);
			float[] points = TYServiceUtil.getFloatsFromString(point);
			int indexPoint = TYServiceUtil.getCountOfPointByPTPF(courses, 
					semester, studentId, subjectId, pointType, pointFactor);
			for(int k = 0 ; k < points.length ; k++) {
				TYStudentPoint studentPoint = new TYStudentPointImpl();
				studentPoint.setCourses(courses);
				studentPoint.setSemester(semester);
				studentPoint.setStudentId(studentId);
				studentPoint.setSubjectId(subjectId);
				studentPoint.setPointType(pointType);
				studentPoint.setPointIndex(indexPoint + k + 1);
				studentPoint.setPointFactor(pointFactor);
				studentPoint.setPoint(points[k]);
				studentPoint.setUserId(userId);
				studentPoint.setModifiedDate(new Date());
				studentPoints.add(studentPoint);
			}
		}
		
		return studentPoints;
	}
	
	public static void editStudentsPoints(ActionRequest request) {
		long classId = ParamUtil.getLong(request, "classId");
		int courses = TYServiceUtil.getCurrentCourse();
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		int amountStudent = 0;
		amountStudent = getStudentsInClass(courses, classId).size();
		long subjectId = ParamUtil.getLong(request, "subjectId");
		int pointFactor = ParamUtil.getInteger(request, "pointFactor");
		int pointType = ParamUtil.getInteger(request, "pointType");
		
		for(int i = 0 ; i < amountStudent ; i++) {
			long studentId = ParamUtil.getLong(request, "studentId" + i);
			String point = ParamUtil.getString(request, "point" + i);
			float[] points = TYServiceUtil.getFloatsFromString(point);
			for(int k = 0 ; k < points.length ; k++) {
				TYStudentPoint studentPoint = new TYStudentPointImpl();
				studentPoint.setCourses(courses);
				studentPoint.setSemester(semester);
				studentPoint.setStudentId(studentId);
				studentPoint.setSubjectId(subjectId);
				studentPoint.setPointType(pointType);
				studentPoint.setPointIndex(k + 1);
				studentPoint.setPointFactor(pointFactor);
				studentPoint.setPoint(points[k]);
				studentPoint.setUserId(userId);
				studentPoint.setModifiedDate(new Date());
				try {
					TYStudentPointLocalServiceUtil.updateTYStudentPoint(studentPoint);
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}
			
			List<TYStudentPoint> studentsPoints = TYServiceUtil.getPointsStudentsByPTPF(courses, 
					semester, studentId, subjectId, 
						pointType, pointFactor);
			for(int k = points.length ; k < studentsPoints.size() ; k++ ) {
				try {
					TYStudentPointLocalServiceUtil.deleteTYStudentPoint(studentsPoints.get(k));
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static List<TYSubjectClassUserRole> getSubjectsClassesByUserRole(int courses, 
			long teacherId, long roleId) {
		List<TYSubjectClassUserRole> results = 
				new ArrayList<TYSubjectClassUserRole>();
		try {
			results = 
				TYSubjectClassUserRoleLocalServiceUtil.getSubjectsClassesByUserRole(
					courses, teacherId, roleId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static List<TYSubject> getSubjectsOfClassByUserRole(
			int courses, long teacherId, long roleId) {
		List<TYSubjectClassUserRole> temp = 
				getSubjectsClassesByUserRole(courses, teacherId, roleId);
		List<TYSubject> results = new ArrayList<TYSubject>();
		int k = 1;
		for( int i = 0 ; i < temp.size() ; i++ ) {
			try {
				TYSubject subject = TYSubjectLocalServiceUtil.getTYSubject(
						temp.get(i).getSubjectId());
				if(!results.contains(subject)) {
					subject.setIndex(k++);
					results.add(subject);
				}
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return results;
	}
	
	public static TYSubject getSubjectById(long subjectId) {
		TYSubject subject = new TYSubjectImpl();
		try {
			subject = TYSubjectLocalServiceUtil.getTYSubject(subjectId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return subject;
	}
	
	public int getSemesterStatus(long companyId, long groupId, int semesterId) {
		Semester semester = null;
		try {
			semester = SemesterLocalServiceUtil.getSemester(companyId, groupId, semesterId);
			if(semester != null) {
				return semester.getStatus();
			}
		} catch (NoSuchSemesterException e) {
		} catch (SystemException e) {
		}
		return 0;
		
	}
	
	public static int getStatusByClassUserRole(int courses, 
			long classId, long userId, int roleId) {
		TYClassUserRole classUserRole = null;
		try {
			classUserRole = TYClassUserRoleLocalServiceUtil.isTeacherManagement(
					courses, classId, userId, roleId);
			if(classUserRole != null) {
				return classUserRole.getStatus();
			}
		} catch (NoSuchClassUserRoleException e) {
		} catch (SystemException e) {
		}
		
		return 0;
	}
	
	public static int countStudentMissPointBy_C_S_S_PF_PT( int courses, int semester, 
    		long subjectId, int pointFactor, int pointType, long classId) {
		try {
			return TYStudentPointLocalServiceUtil.countStudentMissPointBy_C_S_S_PF_PT(
					courses, semester, subjectId, pointFactor, pointType, classId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static List<TYStudentPoint> getStudentMissPointBy_C_S_S_PF_PT( 
			 int courses, int semester, long subjectId, int pointFactor, 
			 	int pointType, long classId) {
		int start = 0;
		int end = countStudentMissPointBy_C_S_S_PF_PT(courses, 
				semester, subjectId, pointFactor, pointType, classId);
		 try {
			if(end > 0) {
				return TYStudentPointLocalServiceUtil.getStudentMissPointBy_C_S_S_PF_PT(
						courses, semester, subjectId, pointFactor, pointType, 
							classId, start, end);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		 
		return null;
	}
	
	public static List<TYStudentPoint> setPointFactorPointType(int pointFactor, 
			int pointType, List<TYStudentPoint> studentPoints) {
		for (TYStudentPoint tyStudentPoint : studentPoints) {
			tyStudentPoint.setPointType(pointType);
			tyStudentPoint.setPointFactor(pointFactor);
		}
		
		return studentPoints;
	}
	
	public static  List<TYStudentPoint> getStudentMissPointBy_C_S_S(
			int courses, int semester, long subjectId, long classId) {
		List<TYStudentPoint> results = new ArrayList<TYStudentPoint>();
		List<TYStudentPoint> temp = null;
		temp = getStudentMissPointBy_C_S_S_PF_PT(courses, semester, 
				subjectId, 1, 2, classId);
		if(temp != null && temp.size() > 0) {
			temp = setPointFactorPointType(1, 2, temp);
			results.addAll(temp);
		}
		
		temp = getStudentMissPointBy_C_S_S_PF_PT(courses, semester, 
				subjectId, 1, 1, classId);
		if(temp != null && temp.size() > 0) {
			temp = setPointFactorPointType(1, 1, temp);
			results.addAll(temp);
		}
		
		temp = getStudentMissPointBy_C_S_S_PF_PT(courses, semester, 
				subjectId, 2, 1, classId);
		if(temp != null && temp.size() > 0) {
			temp = setPointFactorPointType(2, 1, temp);
			results.addAll(temp);
		}
		
		temp = getStudentMissPointBy_C_S_S_PF_PT(courses, semester, 
				subjectId, 3, 1, classId);
		if(temp != null && temp.size() > 0) {
			temp = setPointFactorPointType(3, 1, temp);
			results.addAll(temp);
		}
		
		return results;
	}
	
	public static int getMaxSemester(int courses, long companyId, long groupId) {
		try {
			return SemesterLocalServiceUtil.getMaxSemester(
					courses, companyId, groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static List<TYMessages> getMessagesByC_G(long companyId, long groupId) {
		try {
			return TYMessagesLocalServiceUtil.getMessagesByC_G(companyId, groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static User getUserById(long userId) {
		try {
			return UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static List<Semester> getSemesters(long companyId, long groupId) {
		try {
			return SemesterLocalServiceUtil.getSemesters(companyId, groupId);
		} catch (SystemException e) {
		}
		return null;
		
	}
	
}
