package org.tvd.thptty.management.util;

import java.util.HashMap;
import java.util.Map;

import org.tvd.thptty.model.TYStudent;

public class SessionUtil {
	private static Map<String, Long> session = new HashMap<String, Long>();
	
	public static void put(String sessionId, Long studentId) {
		session.put(sessionId, studentId);
	}
	
	public static TYStudent get(String sessionId) {
		if(session.get(sessionId) != null) {
			return ActionUtil.getStudentById(session.get(sessionId));
		} 
		return null;
	}
	
	public static void remove(String sessionId) {
		session.remove(sessionId);
	}
	
	public static boolean isUsing(long studentId) {
		return session.containsValue(studentId);
	}
	
	public static void main(String args[]) {
		System.out.println("\n" + session.size() + "\n");
	}
	
}
