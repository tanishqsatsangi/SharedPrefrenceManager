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


    public void storeIntegerToSP(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public void storeLongToSP(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public void storeStringToSP(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void storeBooleanToSP(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void storeFloatToSP(String key, float value) {
        editor.putFloat(key, value);
        editor.commit();
    }

    public void storeStringSetToSP(String key, Set<String> value) {
        editor.putStringSet(key, value);
        editor.commit();
    }

    public int getIntegerFromSP(String key, int defValue) {
        return mSPref.getInt(key, defValue);
    }

    public long getLongFromSP(String key, long defValue) {
        return mSPref.getLong(key, defValue);
    }

    public String getStringFromSP(String key, String defValue) {
        return mSPref.getString(key, defValue);
    }

    public boolean getBooleanFromSP(String key, boolean defValue) {
        return mSPref.getBoolean(key, defValue);
    }

    public float getFloatFromSP(String key, float defValue) {
        return mSPref.getFloat(key, defValue);
    }

    public Map<String, ?> getAllFromSP() {
        return mSPref.getAll();
    }

    public boolean isContains(String key) {
        return mSPref.contains(key);
    }

    public void clearSP() {
        editor.clear();
        editor.commit();
    }

    public SharedPreferences.Editor getEditor() {
        if (editor == null && mSPref != null) {
            return mSPref.edit();
        }
        return editor;
    }

}
