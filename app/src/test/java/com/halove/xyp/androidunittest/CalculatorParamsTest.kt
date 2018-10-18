package com.halove.xyp.androidunittest

import com.halove.xyp.androidunittest.test.Calculator
import junit.framework.Assert.assertEquals
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 * 参数化测试，允许使用不同的值反复允许同一个测试
 *
 * 需要有一個提供多组参数的静态方法，需要一个构造函数接收参数
 */
@RunWith(Parameterized::class)
class CalculatorParamsTest(private val a: Int, private val b: Int, private val expected: Int) {

    companion object {
        //创建并返回测试数据
        @Parameterized.Parameters
        @JvmStatic fun params() = Arrays.asList(arrayOf(0, 0, 0), arrayOf(0, 1, 1), arrayOf(2, 2, 4))
    }

    @Test
    fun sumTest(){
        val calculator = Calculator()
        System.out.println("a:$a,b:$b")
//        assertEquals(calculator.sum(a, b), expected)
        MatcherAssert.assertThat(calculator.sum(a, b), `is`(expected))
    }



    //时间测试，如果一个测试用例执行的时间比指定的要长，那么失败
    @Test(timeout = 1000)
    fun timeTest(){
        System.out.println("test timeout")
        Thread.sleep(2000)
    }

    //异常测试，如果指定该方法抛出一个预期的异常，执行成功
    @Test(expected = ArithmeticException::class)
    fun expectedTest(){
        val a = 0
        val b = 1/a
    }

}