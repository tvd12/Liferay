package org.tvd.util;

public class CompareStringVietnamese {
	protected static char vietnameseLetters[] = {97, 224, 225, 7843, 227, 
			7841, 259, 7857, 7855, 7859, 7861, 7863, 226, 7847, 7845, 
			7849, 7851, 7853, 98, 99, 100, 273, 101, 232, 233, 7867, 
			7869, 7865, 234, 7873, 7871, 7875, 7877, 7879, 103, 104, 
			105, 236, 237, 7881, 297, 7883, 107, 108, 109, 110, 111, 242, 
			243, 7887, 245, 7885, 244, 7891, 7889, 7893, 7895, 7897, 417, 7901, 
			7899, 7903, 7905, 7907, 112, 113, 114, 115, 116, 117, 249, 250, 7911,
			361, 7909, 432, 7915, 7913, 7917, 7919, 7921, 118, 120, 121, 7923, 253, 
			7927, 7929, 7925};
	
	public static int compare(String str1, String str2) {
		char c1[] = str1.toLowerCase().toCharArray();
		char c2[] = str2.toLowerCase().toCharArray();
		
		int len = c1.length;
		if(len > c2.length)
			len = c2.length;
		for(int i = 0 ; i < len ; i++) {
			int p1 = -1, p2 = -1;
			for(int j = 0 ; j < vietnameseLetters.length ; j++) {
				if(c1[i] == vietnameseLetters[j])
					p1 = j;
				if(c2[i] == vietnameseLetters[j])
					p2 = j;
				if(p1 > -1 && p2 > -1)
					break;
			}
			if(p1 != p2)
				return p1 - p2;
		}
		return c1.length - c2.length;
	}
	
}
