package org.tvd.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.tvd.thptty.management.temporary.Key;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EncryptUtils {
	static BASE64Encoder enc=new BASE64Encoder();
	static BASE64Decoder dec=new BASE64Decoder();

	public static String base64encode(String text){
		try {
			text = xorMessage(text, Key.KEY);
			String rez = enc.encode( text.getBytes( Encoding.DEFAULT_ENCODING ) );
			return rez;         
		}
		catch ( UnsupportedEncodingException e ) {
			return null;
		}
	}//base64encode
	
	public static String base64decode(String text){
	
		try {
			String tem = new String(dec.decodeBuffer( text ), Encoding.DEFAULT_ENCODING);
			return xorMessage(tem, Key.KEY);
		}
		catch ( IOException e ) {
			return null;
		}
		
	}//base64decode
	
	public static void main(String[] args){
		String txt="some text to be encrypted" ;
		
		String encode = base64encode(txt);
		String decode = base64decode(encode);
		
		System.out.println(encode);
		System.out.println(decode);
		
		if(decode.equals(txt)) 
			System.out.print("dung");
	
	}
	
	public static String xorMessage(String message, String key){
		try {
			if (message==null || key==null ) return null;
			
			char[] keys=key.toCharArray();
			char[] mesg=message.toCharArray();
			
			int ml=mesg.length;
			int kl=keys.length;
			char[] newmsg=new char[ml];
			
			for (int i=0; i<ml; i++){
				newmsg[i]=(char)( mesg[i]^keys[i%kl] );
			}//for i
			
			mesg=null; keys=null;
			return new String(newmsg);
		} catch ( Exception e ) {
			return null;
		}  
	}//xorMessage

}//class