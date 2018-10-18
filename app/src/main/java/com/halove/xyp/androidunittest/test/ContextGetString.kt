package com.halove.xyp.androidunittest.test

import android.content.Context
import com.halove.xyp.androidunittest.R

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 */
class ContextGetString {
    fun getString(context: Context) = context.getString(R.string.hello_word)
}