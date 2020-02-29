package com.e.myfirstkotlinapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e.myfirstkotlinapp.R
import com.e.myfirstkotlinapp.utils.UIManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val nameList = mutableListOf("name", "hello", "text")
    private val passList = mutableListOf("123", "123456")

    private val namePList = mutableListOf("444", "333", "111", "M")
    private val passPList = mutableListOf("444", "333", "111", "q")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainClick()
    }

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            UIManager.showToast("$userName $password", this)
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (namePList.contains(userName) && passPList.contains(password)) {
            startActivity(
                Intent(this, ThirdActivity::class.java)
                    .putExtra("condition", userName)
            )
        } else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password)
            )
        else UIManager.showToast(
            "ERROR",
            this
        )
    }
}

