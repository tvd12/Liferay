package org.tvd.thptty.management.util;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tvd.thptty.NoSuchSemesterException;
import org.tvd.thptty.NoSuchStudentConductException;
import org.tvd.thptty.management.temporary.SubjectClassUserRoleTemp;
import org.tvd.thptty.model.Semester;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.model.impl.TYStudentConductImpl;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.service.SemesterLocalServiceUtil;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentConductLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectUserRoleLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.User;
import com.liferay.portal.service.PhoneLocalServiceUtil;

public class TYServiceUtil {
	
	public static int getCurrentCourse() {
		Calendar calendar = Calendar.getInstance();
		//int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		if(month > 8) {
			//year += 1;
		}
		//return year;
		return 2013;
	}
	
	public static TVDDate getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int dateInt = calendar.get(Calendar.DATE);
		TVDDate date = new TVDDate();
		date.setDate(dateInt);
		date.setMonth(month);
		date.setYear(year);
		return date;
	}
	
	public static int getCurrentSemester(long companyId, long groupId) {
		Semester semester = null;
		try {
			semester = SemesterLocalServiceUtil.getSemesterByC_G_Status(
				companyId, groupId, 1);
			if(semester != null) {
				return semester.getSemesterId();
			}
		} catch (NoSuchSemesterException e) {
		} catch (SystemException e) {
		}
		
		return 0;
	}
	
	public static Semester getSemesterByC_G_Status(long companyId, 
			long groupId, int status) {
		try {
			return SemesterLocalServiceUtil.getSemesterByC_G_Status(
					companyId, groupId, status);
		} catch (NoSuchSemesterException e) {
		} catch (SystemException e) {
		}
		
		return null;
	}
	
	public static Map<Integer, String> getListCourses(int start) {
		int year = getCurrentCourse();
		Map<Integer, String> listCourses = new HashMap<Integer, String>();
		
		for(int i = year ; i >= start ; i--) {
			String courses = "" + (i - 1) + "-" + i;
			listCourses.put(i, courses);
		}
		return listCourses;
	}
	
	public static List<Phone> getPhoneByUserId(long userId) {
		List<Phone> phones = Collections.emptyList();
		try {
			phones = PhoneLocalServiceUtil.getPhones();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		for(int i = 0 ; i < phones.size() ; ) {
			if(phones.get(i).getUserId() != userId) {
				phones.remove(i);
			} else {
				i++;
			}
		}
				
		return phones;
	}
	
	public static TYClass getClassOfStudent(int courses, long studentId) {
		TYClass tyClass = null;
		try {
			tyClass = TYClassStudentLocalServiceUtil.getClassOfStudent(
					courses, studentId);
			tyClass.setClassFullName(tyClass.getClassGroup() + 
					tyClass.getClassName());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return tyClass;
	}
	
	public static User getUserBySubjectRole(int courses, long groupId, 
			long subjectId, long roleId) {
		User user = null;
		try {
			user = TYSubjectUserRoleLocalServiceUtil.getUserBySubjectRole(
					courses, groupId, subjectId, roleId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static List<TYClass> getClassByUserSubjectRole(int courses, 
			long userId, long roleId, long subjectId) {
		List<TYClass> classes = new ArrayList<TYClass>();
		try {
			classes = 
					TYSubjectClassUserRoleLocalServiceUtil.getClassBySubjectUserRole(
							courses, subjectId, userId, roleId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} 
		return classes;
	}
	
	public static List<TYSubjectClassUserRole> getSubjectsClassesByUserRole(
			int courses, long userId, long roleId) {
		List<TYSubjectClassUserRole> result = new ArrayList<TYSubjectClassUserRole>();
		try {
			result = TYSubjectClassUserRoleLocalServiceUtil.getSubjectsClassesByUserRole(
					courses, userId, roleId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static List<SubjectClassUserRoleTemp> getAllClassSubjectByUserRole(
			int courses, long userId, long roleId) {
		List<TYSubjectClassUserRole> temp = getSubjectsClassesByUserRole(
				courses, userId, roleId);
		List<SubjectClassUserRoleTemp> result = new 
				ArrayList<SubjectClassUserRoleTemp>();
		for( int i = 0 ; i < temp.size() ; i++) {
			SubjectClassUserRoleTemp tmp = new SubjectClassUserRoleTemp(temp.get(i));
			tmp.setIndex(i + 1);
			result.add(tmp);
		}
		
		return result;
	}
	
	/**
	 * 
	 * Student-Conduct
	 * 
	*/
	
	public static TYStudentConduct getConductOfStudent(int courses, 
			int semester, long studentId) {
		TYStudentConduct studentConduct = new TYStudentConductImpl();
		try {
			studentConduct = TYStudentConductLocalServiceUtil.getConductOfStudent(
					courses, semester, studentId);
		} catch (NoSuchStudentConductException e) {
		} catch (SystemException e) {
		}
		return studentConduct;
	}
	
	public static List<TYStudentConduct> getStudentsConductByS_C(int courses, int semester,
	    	long companyId, long groupId, int conduct) {
		int start = 0;
		int end = countStudentsConductByS_C(
				courses, semester, companyId, groupId, conduct);
		try {
			if(end > 0) {
				return TYStudentConductLocalServiceUtil.getStudentsConductByS_C(
					courses, semester, companyId, groupId, conduct, start, end);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}
		
	public static int countStudentsConductByS_C(int courses, int semester, 
			long companyId, long groupId, long conduct) {
		try {
			return TYStudentConductLocalServiceUtil.countStudentsConductByS_C(
				courses, semester, companyId, groupId, conduct);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
		
	public static List<TYStudentConduct> getStudentsConductByS_C_C( int courses, int semester,
		    long companyId, long groupId, int conduct, long classId) {
		int start = 0;
		int end = countStudentsConductByS_C_C(
				courses, semester, companyId, groupId, conduct, classId);
		try {
			return TYStudentConductLocalServiceUtil.getStudentsConductByS_C_C(
				courses, semester, companyId, groupId, conduct, classId, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
		
	public static int countStudentsConductByS_C_C(int courses, int semester,
			long companyId, long groupId, int conduct, long classId) {
		try {
			return TYStudentConductLocalServiceUtil.countStudentsConductByS_C_C(
				courses, semester, companyId, groupId, conduct, classId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	/**
	 * 
	 * Student-Point
	 * 
	*/
	
	public static TYStudentPoint getStudentAVGPointByFactor(int courses, int semester, 
			long studentId, long subjectId, int pointFactor) {
		try {
			return TYStudentPointLocalServiceUtil.getStudentAVGPointsByFactor(
					courses, semester, studentId, subjectId, pointFactor);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean isFullPoint(int courses, int semester, long studentId, 
			long subjectId) {
		boolean full = true;
		
		TYStudentPoint studentPoint = getStudentAVGPointByFactor(
				courses, semester, studentId, subjectId, 3);
		
		if(studentPoint == null || studentPoint.getPoint() == 0) {
			full = false;
		}
		
		return full;
	}
	
	public static TYStudentPoint getStudentAVGPointBySubject(
			int courses, int semester, long studentId, long subjectId) {
		try {
			return TYStudentPointLocalServiceUtil.getStudentAVGPointsBySubject(
					courses, semester, studentId, subjectId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<TYStudentPoint> getStudentsPointsByC_S(int courses, 
			int semester, long companyId, long groupId, float from, float to) {
		List<TYStudentPoint> results = Collections.emptyList();
		try {
			int end = countStudentsPointsByC_S(courses, semester, 
					companyId, groupId, from, to);
			if(end > 0) {
				results = TYStudentPointLocalServiceUtil.getStudentsPointsByC_S(
					courses, semester, companyId, groupId, from, to, 0, end);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static int countStudentsPointsByC_S(int courses, 
			int semester, long companyId, long groupId, float from, float to) {
		try {
			return TYStudentPointLocalServiceUtil.countStudentsPointsByC_S(
					courses, semester, companyId, groupId, from, to);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static Map<Long, TYStudentPoint> getMapStudentsPointByC_S(int courses, 
			int semester, long companyId, long groupId, float from , float to) {
		Map<Long, TYStudentPoint> results = new HashMap<Long, TYStudentPoint>();
		List<TYStudentPoint> studentsPoints = getStudentsPointsByC_S(
				courses, semester, companyId, groupId, from, to);
		if(studentsPoints != null) {
			for(TYStudentPoint temp : studentsPoints) {
				results.put(temp.getStudentId(), temp);
			}
		}
		
		return results;
	}
	
	public static List<TYStudentPoint> getStudentsPointByCourse(int courses, 
			long companyId, long groupId, float from, float to) {
		List<TYStudentPoint> results = new ArrayList<TYStudentPoint>();
		
		Map<Long, TYStudentPoint> m1 = getMapStudentsPointByC_S(
				courses, 1, companyId, groupId, from, to);
		Map<Long, TYStudentPoint> m2 = getMapStudentsPointByC_S(
				courses, 2, companyId, groupId, from, to);
		List<Long> studentIds = new ArrayList<Long>(m1.keySet());
		if(m1 != null && m2 != null) {
			for(Long studentId : studentIds) {
				double point = m1.get(studentId).getPoint() + 
						2*(m2.get(studentId).getPoint());
				point = point/3.0;
				TYStudentPoint studentPoint = new TYStudentPointImpl();
				studentPoint.setStudentId(studentId);
				studentPoint.setPoint(point);
				results.add(studentPoint);
			}
		}
		
		return results;
		
	}
	
	public static int coutStudentsPointByCourse(int courses, long companyId, long groupId, 
			float from, float to) {
		List<TYStudentPoint> studentPoints = getStudentsPointByCourse(
				courses, companyId, groupId, from, to);
		if(studentPoints != null) {
			return studentPoints.size();
		}
		
		return 0;
	}
	
	public static List<TYStudentPoint> getStudentsPointByC_S_Class(int courses, 
			int semester, long companyId, long groupId, long classId, 
				float from, float to) {
		try {
			int end = countStudentsPointsByC_S_Class(courses, semester, 
					companyId, groupId, classId, from, to);
			if(end > 0) {
				return TYStudentPointLocalServiceUtil.getStudentsPointsByC_S_Class(
					courses, semester, companyId, groupId, classId, from, to, 0, end);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int countStudentsPointsByC_S_Class(int courses, 
			int semester, long companyId, long groupId, long classId, 
				float from, float to) {
		try {
			return TYStudentPointLocalServiceUtil.countStudentsPointsByC_S_Class(
					courses, semester, companyId, groupId, classId, from, to);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static Map<Long, TYStudentPoint> getMapStudentsPointByC_S_Class(int courses, 
			int semester, long companyId, long groupId, long classId, float from , float to) {
		Map<Long, TYStudentPoint> results = new HashMap<Long, TYStudentPoint>();
		List<TYStudentPoint> studentsPoints = getStudentsPointByC_S_Class(
				courses, semester, companyId, groupId, classId, from, to);
		if(studentsPoints != null) {
			for(TYStudentPoint temp : studentsPoints) {
					results.put(temp.getStudentId(), temp);
			}
		}
		
		return results;
	}
	
	public static List<TYStudentPoint> getStudentsPointByCourse_Class(int courses, 
			long companyId, long groupId, long classId, float from, float to) {
		List<TYStudentPoint> results = new ArrayList<TYStudentPoint>();
		
		Map<Long, TYStudentPoint> m1 = getMapStudentsPointByC_S_Class(
				courses, 1, companyId, groupId, classId, from, to);
		Map<Long, TYStudentPoint> m2 = getMapStudentsPointByC_S_Class(
				courses, 2, companyId, groupId, classId, from, to);
		List<Long> studentIds = new ArrayList<Long>(m1.keySet());
		if(m1 != null && m2 != null) {
			for(Long studentId : studentIds) {
				double point = 0;
				if(m1.get(studentId) != null && m2.get(studentId) != null) {
				point = m1.get(studentId).getPoint() + 
						2*(m2.get(studentId).getPoint());
				point = point/3.0;
				TYStudentPoint studentPoint = new TYStudentPointImpl();
				studentPoint.setStudentId(studentId);
				studentPoint.setPoint(point);
				results.add(studentPoint);
				}
			}
		}
		
		return results;
		
	}
	
	public static int countStudentsPointsByCourse_Class(int courses, 
			int semester, long companyId, long groupId, long classId, 
				float from, float to) {
		return getStudentsPointByCourse_Class(
				courses, companyId, groupId, classId, from, to).size();
	}
	
	public static TYStudentPoint getStudentAVGPoint(int courses, int semester, 
			long studentId) {
		try {
			return TYStudentPointLocalServiceUtil.getStudentAVGPoints(
					courses, semester, studentId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static TYStudent getStudentById(long studentId) {
		try {
			return TYStudentLocalServiceUtil.getTYStudent(studentId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return new TYStudentImpl();
		
	}
	
	public static float[] getPointStudentByPTPF(int courses, int semester, 
			long studentId, long subjectId, int pointType, int pointFactor) {
		float results[] = new float[0];
		try {
			List<TYStudentPoint> studentPoints = TYStudentPointLocalServiceUtil.getStudentPointsByPTPF(
					courses, semester, studentId, subjectId, pointType, pointFactor);
			if(studentPoints.size() > 0) {
				results = new float[studentPoints.size()];
				for(int i = 0 ; i < studentPoints.size() ; i++) {
					float result = (float)studentPoints.get(i).getPoint();
					results[i] = result;
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static List<TYStudentPoint> getPointsStudentsByPTPF(int courses, int semester, 
			long studentId, long subjectId, int pointType, int pointFactor) {
		List<TYStudentPoint> studentPoints = Collections.emptyList();
		try {
			studentPoints = TYStudentPointLocalServiceUtil.getStudentPointsByPTPF(
					courses, semester, studentId, subjectId, pointType, pointFactor);
			
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return studentPoints;
	}
	
	public static int getCountOfPointByPTPF (int courses, int semester, 
			long studentId, long subjectId, int pointType, int pointFactor) {
		int result = 0;
		try {
			List<TYStudentPoint> studentPoints = 
					TYStudentPointLocalServiceUtil.getStudentPointsByPTPF(
					courses, semester, studentId, subjectId, pointType, pointFactor);
			result = studentPoints.size();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	/**
	 * Number-Util
	*/
	
	public static String floatsToPointString(float points[]) {
		String result = "";
		if(points != null) {
			for(int i = 0 ; i < points.length ; i++) {
				if(points[i] - (int)points[i] != 0) {
					result = result + points[i] + " ";
				} else {
					result = result + (int)points[i] + " ";
				}
					
			}
			result = result.trim();
		}
		return result;
	}
	
	public static boolean isPointString(String str) {
		if(str.equals("") || str == null) {
			return false;
		}
		char ch[] = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++) {
			if(!((ch[i] >= '0' && ch[i] <= '9') || (ch[i] == '.') || (ch[i] == ' '))) {
				return false;
			}
		}
		
		String[] strs = new String[0];
		str = standardizedPointString(str);
		strs = str.split(" ");
		for(int i = 0 ; i < strs.length ; i++) {
			float result = Float.parseFloat(strs[i]);
			if(result < 0 || result > 10) 
				return false;
		}
		
		return true;
	}
	
	public static float[] getFloatsFromString(String str) {
		if(!isPointString(str)) {
			return new float[0];
		}
		String[] strs = new String[0];
		str = standardizedPointString(str);
		strs = str.split(" ");
		float results[] = new float[strs.length];
		for(int i = 0 ; i < strs.length ; i++) {
			float result = Float.parseFloat(strs[i]);
			results[i] = result;
		}
		
		return results;
	}
	
	public static float[] standardizedFloat(float[] points) {
		int n = 0;
		for(int i = 0 ; i < points.length ; i++) {
			if(points[i] != 0) {
				n++;
			}
		}
		
		float temps[] = new float[n];
		n = 0;
		for(int i = 0 ; i < points.length ; i++) {
			if(points[i] != 0) {
				temps[n++] = points[i];
			}
		}
		
		return temps;
	}
	
	public static String standardizedPointString(String str) {
		char chs[] = str.trim().toCharArray();
		char tems[] = new char[chs.length];
		int k = 0;
		for( int i = 0 ; i < chs.length ; i++) {
			if(!(chs[i] == ' ' && chs[i + 1] == ' ')) {
				tems[k++] = chs[i];
			}
		}
		
		chs = new char[k];
		for(int i = 0 ; i < k ; i++) {
			chs[i] = tems[i];
		}
		
		return new String(chs).trim();
	}
	
	public static float getCutFloat(double number, int k) {
		for(int i = 0 ; i < k ; i++) {
			number = number * 10;
		}
		number = (float) Math.round(number);
		
		for(int i = 0 ; i < k ; i++) {
			number = number / 10;
		}
		
		return (float)number;
	}
	
	public static List<Object> copyList(List<Object> oldList) {
		List<Object> listCopy = new ArrayList<Object>();
		for( int i = 0 ; i < oldList.size() ; i++) {
			listCopy.add(listCopy.get(i));
		}
		return listCopy;
	}
	
	public static List<TYClass> setListClassFullName(List<TYClass> before) {
		List<TYClass> after = new ArrayList<TYClass>(before);
		for(int i = 0 ; i < after.size() ; i++) {
			after.get(i).setClassFullName(
					after.get(i).getClassGroup() + after.get(i).getClassName());
		}
		
		return after;
	}
	
	public static List<TYStudent> getAllStudents(long companyId, long groupId) {
		List<TYStudent> students = Collections.emptyList();
		try {
			students = 
					TYStudentLocalServiceUtil.getAllStudentsByGroup(companyId, groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return students;
	}
	
	public static void main(String args[]) {
		/*String str = "3  4";
		if(isPointString(str)) {
			float results[] = getFloatsFromString(str);
			for(int i = 0 ; i < results.length ; i++) 
				System.out.print(results[i] + " ");
		}
		Float f = getCutFloat((float)7.35, 1);
		System.out.println(f);*/
		String s = standardizedPointString("  1   2  3 4.555 4.5  6.8  9  ");
		System.out.println(s);
		//System.out.println(getCurrentDate().getDate());
		Date d1 = new Date();
		Map<String, String> m1 = new HashMap<String, String>();
		for(int i = 0 ; i < 50000 ; i++) {
			m1.put(String.valueOf(i), String.valueOf(i));
		}
		
		Map<String, String> m2 = new HashMap<String, String>();
		for(int i = 0 ; i < 50000 ; i++) {
			m2.put(String.valueOf(i), String.valueOf(i));
		}
		
		Map<String, String> m3 = new HashMap<String, String>();
		
		for(int i = 0 ; i< 50000 ; i++) {
			m3.put(String.valueOf(i), m1.get(String.valueOf(i)) + m2.get(String.valueOf(i)));
		}
		
		Date d2 = new Date();
		
		System.out.println(d2.getTime() - d1.getTime());
		
	}
	
}
