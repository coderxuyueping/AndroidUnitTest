package com.halove.xyp.androidunittest

import com.halove.xyp.androidunittest.test.Calculator
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 */
class CalculatorTest1 {

    private lateinit var calculator: Calculator

    @Before
    fun setUp(){
        calculator = Calculator()
    }

    @Test
    fun sumTest(){
        assertEquals(calculator.sum(2,3),5)
    }
}