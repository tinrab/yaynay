package com.moybl.yaynay;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import android.util.Log;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

	private static final String TAG = "MyFMService";

	@Override
	public void onMessageReceived(RemoteMessage remoteMessage) {
		// Handle data payload of FCM messages.
		Log.d(TAG, "FCM Message Id: " + remoteMessage.getMessageId());
		Log.d(TAG, "FCM Notification Message: " +
				remoteMessage.getNotification());
		Log.d(TAG, "FCM Data Message: " + remoteMessage.getData());
	}
}