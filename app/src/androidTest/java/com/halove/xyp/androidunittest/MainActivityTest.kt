package com.halove.xyp.androidunittest

import androidx.test.InstrumentationRegistry
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 * UI测试
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext()
    private lateinit var INPUT_TEXT: String

    //需要加上JvmField，不然会报must public错误
    @Rule @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp(){
        INPUT_TEXT = "test_ui"
    }


    @Test
    fun changeTextView(){
        //第一步，点击输入框，输入文字,onView是根据id来查找控件的，如果没有id的可以用onData进行获取
        onView(withId(R.id.et))//找个输入框控件
                .perform(typeText(INPUT_TEXT), closeSoftKeyboard())//perform模拟特定的用户动作，typeText点击控件并输入内容

        //第二步，点击Button
        onView(withId(R.id.btn)).perform(click())

        //第三步，测试TextView显示的内容是否正确
        onView(withId(R.id.tv)).check(matches(withText(INPUT_TEXT)))
    }
}