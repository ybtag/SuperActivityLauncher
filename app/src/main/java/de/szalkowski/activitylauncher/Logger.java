package de.szalkowski.activitylauncher;

import android.util.Log;

public class Logger {
    public final static String TAG = "ParcelExpDemo";

    public static void debug(String s) {
        Log.d(TAG, s);
    }
}
