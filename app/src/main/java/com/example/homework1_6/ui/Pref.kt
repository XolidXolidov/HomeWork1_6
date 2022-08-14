package com.example.homework1_6.ui

import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.example.lesson41.ext.Const.PREF_NAME

class Pref(private val context: Context) {

    fun saveShown() {
        context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit().putBoolean("isShown", true)
            .commit()
    }

    fun isShown(): Boolean {
        return context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).getBoolean("isShown", false)
    }

    fun saveName(name: String) {
        context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).edit().putString("saveText", name)
            .commit()
    }

    fun getName(): String {
        return context.getSharedPreferences(PREF_NAME, MODE_PRIVATE).getString("saveText", "")
            .toString()
    }

}