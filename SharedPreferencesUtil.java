package com.df.testproject;

import android.content.Context;

/**
 * Created by Tanishq Satsangi on 20/04/21.
 */
public class SharedPreferencesUtil {

    public static final String fileName = "fileName";
    public static final String key = "key";
    public static final String highScoreSP = "HighScore";

    public static SharedPreferenceManager getSPManager(Context context, String fileName) {
        SharedPreferenceManager manager = new SharedPreferenceManager(context, fileName);
        return manager;
    }

}
