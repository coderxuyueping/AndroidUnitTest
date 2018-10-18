package com.halove.xyp.androidunittest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 官方单元测试地址：https://github.com/googlesamples/android-testing
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            tv.text = et.text.toString()
            et.text.clear()
        }

        val intent = Intent(this, ServiceActivity::class.java)
        intent.putExtra("params", "params")
        dump_to_service.setOnClickListener { startActivity(intent) }
    }
}
