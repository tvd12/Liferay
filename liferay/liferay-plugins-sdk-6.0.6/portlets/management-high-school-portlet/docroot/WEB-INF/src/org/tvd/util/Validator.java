package org.tvd.util;

public class Validator {
	public static boolean isUnicodeName(String name) {
		if(name == null || name.split("").length < 2) {
			return false;
		}
		name = name.toLowerCase();
		char[] tem = name.toCharArray();
		char[] vn = CompareStringVietnamese.vietnameseLetters;
		
		for(int i = 0 ; i < tem.length ; i++) {
			boolean has = false;
			for(int k = 0 ; k < vn.length ; k++) {
				if(tem[i] == vn[k] || tem[i] == ' ') {
					has = true;
					break;
				}
			}
			if(!has) {
				return false;
			}
		}
		
		return true;
	}
}
