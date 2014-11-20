package org.tvd.exel.util;

import java.util.Calendar;
import java.util.Date;

public class DateToStringConvertor {
	
	public static String convert(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);
		
		return day +"/" + month + "/" + year;
	}
	
	public static String converToTimeString(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);
		int h = calendar.get(Calendar.HOUR);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		return day +"_" + month + "_" + year + "_" + h + "_" + m + "_" + s;
	}
	
}
