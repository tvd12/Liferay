package com.tdgc.dragonpoker.notification.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;

/**
 * Servlet implementation class GCMBroadcast
 */
public class GCMBroadcast {
	public static String REG_ID = "APA91bH5zhx9GxQ-u_4hhCG29SyeT5LsQ0jSzKnmMZTBAgOqZYa_7l7iHKGf1cs65vrnPAyufMu_Flqi1mkegkFm9Fasa_qeLTZIPhHPK8Rpc1-L2jKBcWvS91k9YF5jJ-Jdl8v7fSh86mGjmr3aIhm09Fs6Yf4mnp1Ush9R6mAaO-0Lxt_Q31M"; 
	
	// The SENDER_ID here is the "Browser Key" that was generated when I
	// created the API keys for my Google APIs project.
	private static final String SENDER_ID = "AIzaSyB0zhgVm4ffgVvfcpOAZEM0y7C7heJzgQk";
	
	// This is a *cheat*  It is a hard-coded registration ID from an Android device
	// that registered itself with GCM using the same project id shown above.
	private static final String ANDROID_DEVICE = "APA91bH5zhx9GxQ-u_4hhCG29SyeT5LsQ0jSzKnmMZTBAgOqZYa_7l7iHKGf1cs65vrnPAyufMu_Flqi1mkegkFm9Fasa_qeLTZIPhHPK8Rpc1-L2jKBcWvS91k9YF5jJ-Jdl8v7fSh86mGjmr3aIhm09Fs6Yf4mnp1Ush9R6mAaO-0Lxt_Q31M";
		
	// This array will hold all the registration ids used to broadcast a message.
	// for this demo, it will only have the ANDROID_DEVICE id that was captured 
	// when we ran the Android client app through Eclipse.
	private static List<String> androidTargets = new ArrayList<String>();
       
    /**
     * pretend constructor 
     */
    private GCMBroadcast() {
    	
        super();

        // we'll only add the hard-coded *cheat* target device registration id 
        // for this demo.
        if(REG_ID != null && !REG_ID.equals("")) {
        	androidTargets.add(REG_ID);
        } else {
        	androidTargets.add(ANDROID_DEVICE);
        }
        
    }
    
    /**
     * this function use to send a message to android client
     * @param regId:		the token represent android client			
     * @param collapseKey 	@see #collapseKey
     * @param message:		message to send to Android client
     */
    
	public static void sSendMessage(String regId, String collapseKey, String message) {
		
		// We'll collect the "CollapseKey" and "Message" values from our JSP page
		// Please custom those fields to send Message to Android client
		androidTargets.add(regId);
		
		// Instance of com.android.gcm.server.Sender, that does the
		// transmission of a Message to the Google Cloud Messaging service.
		Sender sender = new Sender(SENDER_ID);
		
		// This Message object will hold the data that is being transmitted
		// to the Android client devices.  For this demo, it is a simple text
		// string, but could certainly be a JSON object.
		
		//<p id="collapseKey">
		// If multiple messages are sent using the same .collapseKey()
		// the android target device, if it was offline during earlier message
		// transmissions, will only receive the latest message for that key when
		// it goes back on-line.</p>			
		Message messageObject = new Message.Builder()
			.collapseKey(collapseKey)
			.timeToLive(30)
			.delayWhileIdle(true)
			.addData("message", message)
			.build();
		
		try {
			// use this for multicast messages.  The second parameter
			// of sender.send() will need to be an array of register ids.
			MulticastResult result = sender.send(messageObject, androidTargets, 1);
			
			if (result.getResults() != null) {
				int canonicalRegId = result.getCanonicalIds();
				if (canonicalRegId != 0) {
					
				}
			} else {
				int error = result.getFailure();
				System.out.println("Broadcast failure: " + error);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void sSendMessage(String regId, String message) {
		sSendMessage(regId, Calendar.getInstance().getTime().toString(), message);
	}
	

	
}
