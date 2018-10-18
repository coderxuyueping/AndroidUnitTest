package com.halove.xyp.androidunittest

import android.content.Context
import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.filters.MediumTest
import androidx.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/18.
 * 测试startService
 */
@MediumTest
@RunWith(AndroidJUnit4::class)
class StartServiceTest {
    private lateinit var context: Context

    @Before
    fun setUp(){
        //获取测试环境的上下文
        context = InstrumentationRegistry.getTargetContext()
    }

    @Test
    fun testStartService(){
        val intent = Intent(context, MyService::class.java)
        context.startService(intent)
    }


}