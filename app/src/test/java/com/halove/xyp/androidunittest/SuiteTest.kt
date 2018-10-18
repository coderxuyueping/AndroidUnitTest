package com.halove.xyp.androidunittest

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 * 测试套件，将这两个测试类一直运行测试
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(CalculatorTest1::class, CalculatorTest2::class)//被测试类
class SuiteTest