package com.e.myfirstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
    }

    private val nameList = mutableListOf("name", "hello", "text", "Meder")
    private val passList = mutableListOf("123", "123456", "qwerty")

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            UIManager.showToast("$userName $password", this)
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {

        if (userName == "Meder" && password == "qwerty")
            UIManager.showToast("Hello, Meder", this)
        else if (nameList.contains(userName) && passList.contains(password))
                startActivity(
                    Intent(this, SecondActivity::class.java)
                        .putExtra("userName", userName)
                        .putExtra("password", password))
        else UIManager.showToast("ERROR", this)
    }
}