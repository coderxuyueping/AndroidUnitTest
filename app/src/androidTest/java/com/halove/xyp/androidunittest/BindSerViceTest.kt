package com.halove.xyp.androidunittest

import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.filters.MediumTest
import androidx.test.rule.ServiceTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/18.
 */
@MediumTest
@RunWith(AndroidJUnit4::class)
class BindSerViceTest {
    @get:Rule
    val mServiceRule = ServiceTestRule()

    @Test
    fun testBind(){
        val intent = Intent(InstrumentationRegistry.getTargetContext(), MyService::class.java)
        intent.putExtra("params", 24)
        val binder = mServiceRule.bindService(intent)
        val service = (binder as MyService.MyBinder).getService()
        assertThat(service.getInt(), `is`(24))
    }
}