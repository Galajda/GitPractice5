package com.cogimag.michalg.gitpractice5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val logTag = "git practice 5"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sayHello() {
        Log.i(logTag, "hello")
    }
}
