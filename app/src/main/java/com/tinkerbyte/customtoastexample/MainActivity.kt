package com.tinkerbyte.customtoastexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showToastFun(view: View):Unit{
        val layout = findViewById<LinearLayout>(R.id.myLayout)
        val toast = Toast(this)
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.BOTTOM,0,0)
        toast.view = layoutInflater.inflate(R.layout.toast_layout,layout as? ViewGroup)
        toast.show()
    }
}
