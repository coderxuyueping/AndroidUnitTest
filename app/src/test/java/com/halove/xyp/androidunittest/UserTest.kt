package com.halove.xyp.androidunittest

import com.halove.xyp.androidunittest.test.User
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/17.
 *
 * 这里有一个大坑，如果你mock的对象是一个final，在kotlin没有open修饰的话，会报 final class错误，需要在
 * test/resources中添加mockito-extensions文件夹中添加org.mockito.plugins.MockMaker文件，里面就mock-maker-inline一句
 */
//需要mock对象加上该注解
@RunWith(MockitoJUnitRunner::class)
class UserTest {
    @Mock
    private lateinit var mockUser: User

    private lateinit var user: User


    //在调用测试方法前执行，一般用来初始化
    @Before
    fun setUp(){
        //当调用mock对象获取age时return24
        `when`(mockUser.age).thenReturn(24)

        //创建一个测试对象
        user = User(24, "xudaha")
    }


    //在测试方法结束后执行，一般用来释放资源
    @After
    fun tearDown(){

    }

    //测试两个对象的年龄是否相同
    @Test
    fun checkAge(){
        //断言他们相同，如果不同测试不通过，报异常
        assertEquals(mockUser.age, user.age)
    }
}