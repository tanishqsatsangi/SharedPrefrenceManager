package com.df.testproject;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;
import java.util.Set;

/**
 * Created by Tanishq Satsangi on 18/04/21.
 */
public class SharedPreferenceManager {

    private Context context;
    private String fileName;
    private SharedPreferences mSPref;
    private SharedPreferences.Editor editor;

    public SharedPreferenceManager(Context context, String fileName) {
        this.context = context;
        this.fileName = fileName;
        mSPref = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        editor = mSPref.edit();
    }


    private void storeIntegerToSP(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    private void storeLongToSP(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    private void storeStringToSP(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    private void storeBooleanToSP(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    private void storeFloatToSP(String key, float value) {
        editor.putFloat(key, value);
        editor.commit();
    }

    private void storeStringSetToSP(String key, Set<String> value) {
        editor.putStringSet(key, value);
        editor.commit();
    }

    private int getIntegerFromSP(String key, int defValue) {
        return mSPref.getInt(key, defValue);
    }

    private long getLongFromSP(String key, long defValue) {
        return mSPref.getLong(key, defValue);
    }

    private String getStringFromSP(String key, String defValue) {
        return mSPref.getString(key, defValue);
    }

    private boolean getBooleanFromSP(String key, boolean defValue) {
        return mSPref.getBoolean(key, defValue);
    }

    private float getFloatFromSP(String key, float defValue) {
        return mSPref.getFloat(key, defValue);
    }

    private Map<String, ?> getAllFromSP() {
        return mSPref.getAll();
    }

    private boolean isContains(String key) {
        return mSPref.contains(key);
    }

}
