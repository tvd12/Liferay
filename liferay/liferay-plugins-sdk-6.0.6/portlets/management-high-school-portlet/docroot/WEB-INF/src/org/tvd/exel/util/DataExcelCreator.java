package org.tvd.exel.util;

import java.util.ArrayList;
import java.util.List;

import org.tvd.exel.model.TVDCell;
import org.tvd.exel.model.TVDRow;
import org.tvd.exel.model.TVDSheet;
import org.tvd.thptty.management.temporary.Column;
import org.tvd.thptty.management.util.ActionUtil;
import org.tvd.thptty.management.util.TYServiceUtil;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYSubject;

public class DataExcelCreator {
	public static TVDSheet createByC_S(long classId, TYSubject subject) {

		int courses = TYServiceUtil.getCurrentCourse();
		List<TYStudent> students = ActionUtil.getStudentsInClass(courses, classId);
		TYClass tyClass = null;
		tyClass = ActionUtil.getTYClassById(classId);
		tyClass.setClassFullName(tyClass.getClassGroup() + tyClass.getClassName());
		
		TVDRow idRow = new TVDRow();
		List<TVDCell> cells = new ArrayList<TVDCell>();
		cells.add(new TVDCell("Lop: " + tyClass.getClassFullName()));
		idRow.setListCells(cells);
		
		TVDRow header = new TVDRow();
		cells = new ArrayList<TVDCell>();
		cells.add(new TVDCell("Stt"));
		cells.add(new TVDCell(Column.studentId));
		cells.add(new TVDCell(Column.fullName));
		cells.add(new TVDCell(Column.SPEAK_POINT));
		cells.add(new TVDCell(Column.WRITE_15_POINT));
		cells.add(new TVDCell(Column.WRITE_45_POINT));
		cells.add(new TVDCell(Column.WRITE_90_POINT));
		header.setListCells(cells);
		
		List<TVDRow> rows = new ArrayList<TVDRow>();
		rows.add(idRow);
		rows.add(header);
		
		for(int i = 0 ; students != null && i < students.size() ; i++) {
			TYStudent student = students.get(i);
			TVDRow row = new TVDRow();
			cells = new ArrayList<TVDCell>();
			cells.add(new TVDCell(String.valueOf(i + 1)));
			cells.add(new TVDCell(String.valueOf(student.getStudentId())));
			cells.add(new TVDCell(student.getStudentFirstName() + " " + 
					student.getStudentLastName()));
			cells.add(new TVDCell(" "));
			cells.add(new TVDCell(" "));
			cells.add(new TVDCell(" "));
			cells.add(new TVDCell(" "));
			
			row.setListCells(cells);
			rows.add(row);
			
		}
		
		TVDSheet sheet = new TVDSheet();
		sheet.setSheetName(subject.getSubjectName());
		sheet.setRows(rows);
		
		return sheet;
	}
}
