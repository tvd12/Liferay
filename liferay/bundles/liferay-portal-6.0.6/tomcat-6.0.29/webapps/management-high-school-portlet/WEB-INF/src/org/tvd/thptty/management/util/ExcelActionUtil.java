package org.tvd.thptty.management.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;

import org.tvd.exel.model.TVDCell;
import org.tvd.exel.model.TVDRow;
import org.tvd.exel.model.TVDSheet;
import org.tvd.thptty.management.temporary.Column;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.impl.TYClassStudentImpl;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.service.TYClassStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentLocalServiceUtil;
import org.tvd.thptty.service.TYStudentPointLocalServiceUtil;
import org.tvd.util.Validator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

public class ExcelActionUtil {
	public static void addStudents(ActionRequest request, TVDSheet sheet) {
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long classId = ParamUtil.getLong(request, "classId");
		int courses = TYServiceUtil.getCurrentCourse();
		Map<String, Integer> columns = sheet.getColumns();
		int index = columns.get(Column.fullName);
		for(int i = 1 ; i < sheet.getRows().size() ; i++) {
			TVDRow tvdRow = sheet.getRows().get(i);
			TVDCell tvdCell = tvdRow.getCells().get(index);
			if(Validator.isUnicodeName(tvdCell.getCellName())) {
				String[] fullName = spilitFullName(tvdCell.getCellName());
				TYStudent student = new TYStudentImpl();
				student.setCompanyId(companyId);
				student.setGroupId(groupId);
				student.setStudentFirstName(fullName[0]);
				student.setStudentLastName(fullName[1]);
				TYClassStudent tyClassStudent = new TYClassStudentImpl();
				tyClassStudent.setCourses(courses);
				tyClassStudent.setClassId(classId);
				try {
					student = TYStudentLocalServiceUtil.addStudent(student);
					tyClassStudent.setStudentId(student.getStudentId());
					TYClassStudentLocalServiceUtil.addStudentIntoClass(tyClassStudent);
					//System.out.println(i + " " + tvdCell.getCellName());
				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static boolean importPoints(ActionRequest request, TVDSheet sheet, List<String> errors) {
		long subjectId = ParamUtil.getLong(request, "subjectId");
		int courses = TYServiceUtil.getCurrentCourse();
		ThemeDisplay themeDisplay = 
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		int semester = TYServiceUtil.getCurrentSemester(companyId, groupId);
		Map<String, Integer> columns = sheet.getColumns();
		int indexStudentId = columns.get(Column.studentId);
		int speakPoint = columns.get(Column.SPEAK_POINT);
		int write15Point = columns.get(Column.WRITE_15_POINT);
		int write45Point = columns.get(Column.WRITE_45_POINT);
		int write90Point = columns.get(Column.WRITE_90_POINT);
		
		List<TYStudentPoint> studentPoints = new ArrayList<TYStudentPoint>();
		
		for(int i = 1 ; i < sheet.getRows().size() ; i++) {
			TVDRow tvdRow = sheet.getRows().get(i);
			TVDCell studentIdCell = tvdRow.getCells().get(indexStudentId);
			TVDCell speakCell = tvdRow.getCells().get(speakPoint);
			TVDCell write15Cell = tvdRow.getCells().get(write15Point);
			TVDCell write45Cell = tvdRow.getCells().get(write45Point);
			TVDCell write90Cell = tvdRow.getCells().get(write90Point);
			
			if(!com.liferay.portal.kernel.util.Validator.isNumber(
					studentIdCell.getCellName())) {
				errors.add("error-column-1");
				return false;
			}
			long studentId = Long.parseLong(studentIdCell.getCellName());
			
			if(speakCell != null && TYServiceUtil.isPointString(speakCell.getCellName())) {
				float[] points = TYServiceUtil.getFloatsFromString(speakCell.getCellName());
				int indexPoint = TYServiceUtil.getCountOfPointByPTPF(courses, 
						semester, studentId, subjectId, 2, 1);	
				for(int k = 0 ; k < points.length ; k++) {
					TYStudentPoint studentPoint = new TYStudentPointImpl();
					studentPoint.setCourses(courses);
					studentPoint.setSemester(semester);
					studentPoint.setStudentId(studentId);
					studentPoint.setSubjectId(subjectId);
					studentPoint.setPointType(2);
					studentPoint.setPointIndex(indexPoint + k + 1);
					studentPoint.setPointFactor(1);
					studentPoint.setPoint(points[k]);
					studentPoint.setUserId(userId);
					studentPoint.setModifiedDate(new Date());
					
					studentPoints.add(studentPoint);
				}
			} else {
				if( (speakCell != null) && (!TYServiceUtil.isPointString(speakCell.getCellName())) ) {
					errors.add("error-column-2");
					return false;
				}
			}
			
			if(write15Cell != null && TYServiceUtil.isPointString(write15Cell.getCellName())) {
				float[] points = TYServiceUtil.getFloatsFromString(write15Cell.getCellName());
				int indexPoint = TYServiceUtil.getCountOfPointByPTPF(courses, 
						semester, studentId, subjectId, 1, 1);	
				for(int k = 0 ; k < points.length ; k++) {
					TYStudentPoint studentPoint = new TYStudentPointImpl();
					studentPoint.setCourses(courses);
					studentPoint.setSemester(semester);
					studentPoint.setStudentId(studentId);
					studentPoint.setSubjectId(subjectId);
					studentPoint.setPointType(1);
					studentPoint.setPointIndex(indexPoint + k + 1);
					studentPoint.setPointFactor(1);
					studentPoint.setPoint(points[k]);
					studentPoint.setUserId(userId);
					studentPoint.setModifiedDate(new Date());
					
					studentPoints.add(studentPoint);
				}
			} else {
				if( (write15Cell != null) && (!TYServiceUtil.isPointString(write15Cell.getCellName())) ) {
					errors.add("error-column-3");
					return false;
				}
			}
			
			if(write45Cell != null && TYServiceUtil.isPointString(write45Cell.getCellName())) {
				float[] points = TYServiceUtil.getFloatsFromString(write45Cell.getCellName());
				int indexPoint = TYServiceUtil.getCountOfPointByPTPF(courses, 
						semester, studentId, subjectId, 1, 2);	
				for(int k = 0 ; k < points.length ; k++) {
					TYStudentPoint studentPoint = new TYStudentPointImpl();
					studentPoint.setCourses(courses);
					studentPoint.setSemester(semester);
					studentPoint.setStudentId(studentId);
					studentPoint.setSubjectId(subjectId);
					studentPoint.setPointType(1);
					studentPoint.setPointIndex(indexPoint + k + 1);
					studentPoint.setPointFactor(2);
					studentPoint.setPoint(points[k]);
					studentPoint.setUserId(userId);
					studentPoint.setModifiedDate(new Date());
					
					studentPoints.add(studentPoint);
				}
			} else {
				if( (write45Cell != null) && (!TYServiceUtil.isPointString(write45Cell.getCellName())) ) {
					errors.add("error-column-4");
					return false;
				}
			}
			
			if(write90Cell != null  && TYServiceUtil.isPointString(write90Cell.getCellName())) {
				float[] points = TYServiceUtil.getFloatsFromString(write90Cell.getCellName());
				int indexPoint = TYServiceUtil.getCountOfPointByPTPF(courses, 
						semester, studentId, subjectId, 1, 3);	
				for(int k = 0 ; k < points.length ; k++) {
					TYStudentPoint studentPoint = new TYStudentPointImpl();
					studentPoint.setCourses(courses);
					studentPoint.setSemester(semester);
					studentPoint.setStudentId(studentId);
					studentPoint.setSubjectId(subjectId);
					studentPoint.setPointType(1);
					studentPoint.setPointIndex(indexPoint + k + 1);
					studentPoint.setPointFactor(3);
					studentPoint.setPoint(points[k]);
					studentPoint.setUserId(userId);
					studentPoint.setModifiedDate(new Date());
					
					studentPoints.add(studentPoint);
				}
			} else {
				if( (write90Cell != null)  && (!TYServiceUtil.isPointString(write90Cell.getCellName())) ) {
					errors.add("error-column-5");
					return false;
				}
			}
				
		}
		
		for(TYStudentPoint item : studentPoints) {
			try {
				TYStudentPointLocalServiceUtil.addStudentPoint(item);
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		return true;
		
	}
	
	public static String[] spilitFullName(String fullName) {
		String[] temp = fullName.split(" ");
		String result[] = new String[2];
		result[0] = new String();
		result[1] = new String();
		for(int i = 0 ; i < temp.length - 1 ; i++) {
			result[0] = result[0] + " " + temp[i];
		}
		result[0].trim();
		result[1] = temp[temp.length - 1].trim();
		
		return result;
	}
	
	public static void main(String args[]) {
		if(Validator.isUnicodeName("Ta van dung")) {
			System.out.println("adf");
		}
	}
}
