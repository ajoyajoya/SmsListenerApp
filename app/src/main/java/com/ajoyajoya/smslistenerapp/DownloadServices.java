package com.ajoyajoya.smslistenerapp;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class DownloadServices extends IntentService {
    public static final String TAG = "DownloadService";
    public DownloadServices() {
        super("DownloadService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "Download Service dijalankan");
        if (intent != null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent notifyFinishIntent = new Intent(MainActivity.ACTION_DOWNLOAD_STATUS);
            sendBroadcast(notifyFinishIntent);
        }
    }
}