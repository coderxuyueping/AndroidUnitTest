package com.halove.xyp.androidunittest

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_service.*

/**
 * Copyright 杭州九爱科技有限公司. All rights reserved
 * Created by xyp on 2018/10/18.
 */
class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        val params = intent.getStringExtra("params")
        tv.text = params

        start_service.setOnClickListener { startService(Intent(this, MyService::class.java)) }

        bind_service.setOnClickListener {
            bindService(Intent(this, MyService::class.java), object : ServiceConnection{
                override fun onServiceDisconnected(name: ComponentName?) {
                }

                override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                }

            }, Service.BIND_AUTO_CREATE)
        }
    }
}