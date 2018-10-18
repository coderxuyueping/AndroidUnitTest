package com.halove.xyp.androidunittest

import android.content.Context
import com.halove.xyp.androidunittest.test.ContextGetString
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 */
@RunWith(MockitoJUnitRunner::class)
class ContextGetStringTest {

    //Context也可以通过本地Mock模拟出来，不需要跑在设备环境上
    @Mock
    private lateinit var mockContext: Context

    private lateinit var contextGetString: ContextGetString

    val RESULT: String = "hello_word"

    @Before
    fun setUp(){
        `when`(mockContext.getString(R.string.hello_word)).thenReturn(RESULT)
        contextGetString = ContextGetString()
    }

    @Test
    fun getStringTest(){
        //断言是否匹配，is是匹配的对象
        assertThat(contextGetString.getString(mockContext), `is`(RESULT))
    }
}