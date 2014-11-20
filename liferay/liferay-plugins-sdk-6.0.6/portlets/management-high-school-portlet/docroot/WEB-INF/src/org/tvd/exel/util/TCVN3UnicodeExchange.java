package org.tvd.exel.util;

import org.tvd.util.Validator;

public class TCVN3UnicodeExchange {
	
	private static char TCVN3[] = {
		    'A','a','¸','¸','µ','µ','¶','¶','·','·','¹','¹',
		    '¢','©','Ê','Ê','Ç','Ç','È','È','É','É','Ë','Ë',
		    '¡','¨','¾','¾','»','»','¼','¼','½','½','Æ','Æ',
		    'B','b','C','c','D','d',
		    '§','®',
		    'E','e','Ð','Ð','Ì','Ì','Î','Î','Ï','Ï','Ñ','Ñ',
		    '£','ª','Õ','Õ','Ò','Ò','Ó','Ó','Ô','Ô','Ö','Ö',
		    'F','f','G','g','H','h',
		    'I','i','Ý','Ý','×','×','Ø','Ø','Ü','Ü','Þ','Þ',
		    'J','j','K','k','L','l','M','m','N','n',
		    'O','o','ã','ã','ß','ß','á','á','â','â','ä','ä',
		    '¤','«','è','è','å','å','æ','æ','ç','ç','é','é',
		    '¥','¬','í','í','ê','ê','ë','ë','ì','ì','î','î',
		    'P','p','Q','q','R','r','S','s','T','t',
		    'U','u','ó','ó','ï','ï','ñ','ñ','ò','ò','ô','ô',
		    '¦','­','ø','ø','õ','õ','ö','ö','÷','÷','ù','ù',
		    'V','v','W','w','X','x',
		    'Y','y','ý','ý','ú','ú','û','û','ü','ü','þ','þ',
		    'Z','z',
		    0x80, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88,
		    0x89, 0x8A, 0x8B, 0x8C, 0x8E, 0x91, 0x92, 0x93,
		    0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 0x9A, 0x9B,
		    0x9C, 0x9E, 0x9F
		};


		private static char unicode[] = {
		    'A','a','á','á','à','à','ả','ả','ã','ã','ạ','ạ',
		    'Â','â','ấ','ấ','ầ','ầ','ẩ','ẩ','ẫ','ẫ','ậ','ậ',
		    'Ă','ă','ắ','ắ','ằ','ằ','ẳ','ẳ','ẵ','ẵ','ặ','ặ',
		    'B','b','C','c','D','d',
		    'Đ','đ',
		    'E','e','é','é','è','è','ẻ','ẻ','ẽ','ẽ','ẹ','ẹ',
		    'Ê','ê','ế','ế','ề','ề','ể','ể','ễ','ễ','ệ','ệ',
		    'F','f','G','g','H','h',
		    'I','i','í','í','ì','ì','ỉ','ỉ','ĩ','ĩ','ị','ị',
		    'J','j','K','k','L','l','M','m','N','n',
		    'O','o','ó','ó','ò','ò','ỏ','ỏ','õ','õ','ọ','ọ',
		    'Ô','ô','ố','ố','ồ','ồ','ổ','ổ','ỗ','ỗ','ộ','ộ',
		    'Ơ','ơ','ớ','ớ','ờ','ờ','ở','ở','ỡ','ỡ','ợ','ợ',
		    'P','p','Q','q','R','r','S','s','T','t',
		    'U','u','ú','ú','ù','ù','ủ','ủ','ũ','ũ','ụ','ụ',
		    'Ư','ư','ứ','ứ','ừ','ừ','ử','ử','ữ','ữ','ự','ự',
		    'V','v','W','w','X','x',
		    'Y','y','ý','ý','ỳ','ỳ','ỷ','ỷ','ỹ','ỹ','ỵ','ỵ',
		    'Z','z',
		    0x20AC, 0x20A1, 0x0192, 0x201E, 0x2026, 0x2020, 0x2021, 0x02C6,
		    0x2030, 0x0160, 0x2039, 0x0152, 0x017D, 0x2018, 0x2019, 0x201C,
		    0x201D, 0x2022, 0x2013, 0x2014, 0x02DC, 0x2122, 0x0161, 0x203A,
		    0x0153, 0x017E, 0x0178
		};


		public static char convertCharToUnicode(char ch) {
		    for(int i=0;i<213;i++)
		        if (ch==TCVN3[i]) return unicode[i];
		    return ch;        
		}
		public static char convertCharTCVN3(char ch) {
		    for(int i=0;i<213;i++)
		        if (ch==unicode[i]) return TCVN3[i];
		    return ch;   
		}
		
		public static String convertToUnicode(String org) {
		    int i;
		    char orgs[] = org.toCharArray();
		    char trs[] = new char[orgs.length];
		    for ( i = 0 ; i < orgs.length ; i++ )
		        trs[i] = convertCharToUnicode(orgs[i]);
		    
		    return new String(trs);
		}
		
		public static String convertToTCVN3(String org) {
		    int i;
		    char orgs[] = org.toCharArray();
		    char trs[] = new char[orgs.length];
		    for ( i = 0 ; i < orgs.length ; i++ )
		        trs[i] = convertCharTCVN3(orgs[i]);
		    
		    return new String(trs);
		}
		
		public static void main(String args[]) {
			if(Validator.isUnicodeName("Ta van dung".toLowerCase())) {
				System.out.println("afd");
			}
		}
}
