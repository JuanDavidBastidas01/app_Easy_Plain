package com.example.app_easy_plain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app_easy_plain.R.layout.activity_main_login
import com.example.app_easy_plain.openApp.homeUser_EasyPlan

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main_login)

        val btn_login: Button = findViewById(R.id.btn_ingreso)
        btn_login.setOnClickListener {
            val intent: Intent = Intent(this,homeUser_EasyPlan::class.java)
            startActivity(intent)


        }
        val btn_form_r: Button = findViewById(R.id.btn_form_r)
        btn_form_r.setOnClickListener {
            val intent: Intent = Intent(this,register::class.java)
            startActivity(intent)
        }
    }
}