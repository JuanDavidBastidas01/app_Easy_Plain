package com.example.app_easy_plain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app_easy_plain.R.layout.activity_register

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_register)

        val btn_done_register: Button = findViewById(R.id.btn_registro)
        btn_done_register.setOnClickListener {
            val intent: Intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}