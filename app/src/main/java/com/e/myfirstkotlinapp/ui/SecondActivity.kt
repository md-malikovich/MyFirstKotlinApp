package com.e.myfirstkotlinapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.myfirstkotlinapp.R
import com.e.myfirstkotlinapp.utils.UIManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("userName")
        val password = intent.getStringExtra("password")

        val message = "userName: $userName \n password: $password"
        text.text = message

        UIManager.showToast("Hello its class from java", this)
    }
}