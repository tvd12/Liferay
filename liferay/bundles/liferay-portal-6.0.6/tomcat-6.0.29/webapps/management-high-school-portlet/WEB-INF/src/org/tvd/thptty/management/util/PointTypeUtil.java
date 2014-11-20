package org.tvd.thptty.management.util;

import java.util.HashMap;
import java.util.Map;

public class PointTypeUtil {
	
	private int pointFactor;
	private int pointType;
	
	public PointTypeUtil(int pointFactor, int pointType) {
		this.pointFactor = pointFactor;
		this.pointType = pointType;
	}
	
	public static Map<String, PointTypeUtil> getInstance() {
		Map<String, PointTypeUtil> instace = new HashMap<String, PointTypeUtil>();
		instace.put("point-speak", new PointTypeUtil(1, 2));
		instace.put("point-15", new PointTypeUtil(1, 1));
		instace.put("point-45", new PointTypeUtil(2, 1));
		instace.put("point-90", new PointTypeUtil(3, 1));
		
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

	public int getPointFactor() {
		return pointFactor;
	}

	public int getPointType() {
		return pointType;
	}
	
	
}
