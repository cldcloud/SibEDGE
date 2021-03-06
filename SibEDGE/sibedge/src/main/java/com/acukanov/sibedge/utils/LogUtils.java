package com.acukanov.sibedge.utils;


import android.util.Log;

import com.acukanov.sibedge.BuildConfig;

public class LogUtils {
    private static final String LOG_PREFIX = "SibEDGE_";
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();
    private static final int MAX_LOG_TAG_LENGTH = 23;

    private LogUtils() {
    }

    public static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }
        return LOG_PREFIX + str;
    }

    /**
     * Don't use this when obfuscating class names!
     */
    public static String makeLogTag(Class aClass) {
        return makeLogTag(aClass.getSimpleName());
    }

    public static void debug(final String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message);
        }
    }

    public static void debug(final String tag, String message, Throwable cause) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message, cause);
        }
    }

    public static void verbose(final String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, message);
        }
    }

    public static void verbose(final String tag, String message, Throwable cause) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, message, cause);
        }
    }

    public static void info(final String tag, String message) {
        Log.i(tag, message);
    }

    public static void info(final String tag, String message, Throwable cause) {
        Log.i(tag, message, cause);
    }

    public static void warning(final String tag, String message) {
        Log.w(tag, message);
    }

    public static void warning(final String tag, String message, Throwable cause) {
        Log.w(tag, message, cause);
    }

    public static void error(final String tag, String message) {
        Log.e(tag, message);
    }

    public static void error(final String tag, String message, Throwable cause) {
        Log.e(tag, message, cause);
    }
}
