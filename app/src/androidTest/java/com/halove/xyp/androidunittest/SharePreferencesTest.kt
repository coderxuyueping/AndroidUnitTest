package com.halove.xyp.androidunittest

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/18.
 */
@RunWith(AndroidJUnit4::class)
class SharePreferencesTest {

    @Test
    fun test(){
        SharePreferencesUtil.init(InstrumentationRegistry.getTargetContext()).setString("name", "xudaha")

        val value = SharePreferencesUtil.init(InstrumentationRegistry.getTargetContext()).getString("name", "error")

        assertThat(value, `is`("xudaha"))
    }
}