package com.nasplus.intentexample01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOtherApp.setOnClickListener {
//            toast.makeText(this, "다른 페이지로 이동", toast.LENGTH_SHORT).show()
        }
    }
}