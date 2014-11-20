package org.tvd.thptty.management.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.PageContext;

import org.tvd.thptty.management.temporary.TYActionKeys;

import com.liferay.portal.kernel.language.LanguageUtil;

public class ConvertorUtil {
	
	private int pointFactor;
	private int pointType;
	
	public ConvertorUtil(int pointFactor, int pointType) {
		this.pointFactor = pointFactor;
		this.pointType = pointType;
	}
	
	public static Map<String, ConvertorUtil> getInstance() {
		Map<String, ConvertorUtil> instace = new HashMap<String, ConvertorUtil>();
		instace.put("point-speak", new ConvertorUtil(1, 2));
		instace.put("point-15", new ConvertorUtil(1, 1));
		instace.put("point-45", new ConvertorUtil(2, 1));
		instace.put("point-90", new ConvertorUtil(3, 1));
		
		return instace;
	}
	
	public static String getString(int pointFactor, int pointType) {
		String result = null;
		if(pointFactor == 1 && pointType == 2) {
			result = "point-speak";
		} else if(pointFactor == 1 && pointType == 1) {
			result = "point-15";
		} else if(pointFactor == 2 && pointType == 1) {
			result = "point-45";
		} else if(pointFactor == 3 && pointType == 1) {
			result = "point-90";
		}
		
		return result;
	}
	
	public static String getString(long actionId) {
		String result = new String();
		if(actionId == TYActionKeys.M_ADD_CLASS) {
			result = "add-class";
		} else if(actionId == TYActionKeys.M_ADD_STUDENT) {
			result = "add-student";
		} else if(actionId == TYActionKeys.M_ADD_SUBJECT) {
			result = "add-subject";
		} else if(actionId == TYActionKeys.M_DELETE_CLASS) {
			result = "delete-class";
		} else if(actionId == TYActionKeys.M_DELETE_CONDUCT) {
			result = "delete-conduct";
		} else if(actionId == TYActionKeys.M_DELETE_POINT) {
			result = "delete-point";
		} else if(actionId == TYActionKeys.M_DELETE_STUDENT) {
			result = "delete-student";
		} else if(actionId == TYActionKeys.M_DELETE_SUBJECT) {
			result = "delete-subject";
		} else if(actionId == TYActionKeys.M_EDIT_CLASS) {
			result = "edit-class";
		} else if(actionId == TYActionKeys.M_EDIT_CONDUCT) {
			result = "edit-conduct";
		} else if(actionId == TYActionKeys.M_EDIT_POINT) {
			result = "edit-point";
		} else if(actionId == TYActionKeys.M_EDIT_STUDENT) {
			result = "edit-student";
		} else if(actionId == TYActionKeys.M_EDIT_SUBJECT) {
			result = "edit-subject";
		} else if(actionId == TYActionKeys.M_INPUT_CONDUCT) {
			result = "type-conduct";
		} else if(actionId == TYActionKeys.M_INPUT_POINT) {
			result = "type-point";
		}
		
		return result;
		
	}
	
	public static String getString(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR, calendar.get(
				Calendar.HOUR_OF_DAY) + 7);
		int dateInt = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1; 
		int year = calendar.get(Calendar.YEAR);
		
		int s = calendar.get(Calendar.SECOND);
		int m = calendar.get(Calendar.MINUTE);
		int h = calendar.get(Calendar.HOUR);
		
		return dateInt + "/" + month + "/" + year + 
				" " + h + "h" + m + "\"" + s + "'";
	}
	
	public static String getDateString(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR_OF_DAY) + 7);
		int dateInt = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1; 
		int year = calendar.get(Calendar.YEAR);
		
		int s = calendar.get(Calendar.SECOND);
		int m = calendar.get(Calendar.MINUTE);
		int h = calendar.get(Calendar.HOUR);
		
		return dateInt + "_" + month + "_" + year + 
				"_" + h + "h" + m + "p" + s + "s";
	}
	
	public static String[] getStringsByKeys(PageContext pageContext, 
			String[] keys) {
		String[] results = new String[keys.length]; 
		for(int i = 0 ; i < keys.length ; i++) {
			results[i] = LanguageUtil.get(pageContext, keys[i]);
		}
		
		return results;
	}
	public int getPointFactor() {
		return pointFactor;
	}

	public int getPointType() {
		return pointType;
	}
	
	public static void main(String agrs[]) {
		System.out.println((new Date()));
	}
	
	
}
