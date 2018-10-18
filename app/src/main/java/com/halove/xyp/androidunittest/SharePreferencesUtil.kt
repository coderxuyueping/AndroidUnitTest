package com.halove.xyp.androidunittest

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/18.
 */
class SharePreferencesUtil(var context: Context, var name: String = "share") {

    private val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(name, MODE_PRIVATE)
    }

    companion object {
        fun init(context: Context, name: String = "share") = SharePreferencesUtil(context, name)
    }


    fun setString(key: String, value: String){
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String, default: String): String? = sharedPreferences.getString(key, default)
}