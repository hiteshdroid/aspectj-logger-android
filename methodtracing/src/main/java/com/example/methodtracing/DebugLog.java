package com.example.methodtracing;

import android.util.Log;

public class DebugLog {

    private DebugLog() {}

    public static void log(String tag, String message) {
        Log.d(tag, message);
    }
}
