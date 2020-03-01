package com.e.myfirstkotlinapp.ui

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.myfirstkotlinapp.R
import com.e.myfirstkotlinapp.model.MockModel
import com.e.myfirstkotlinapp.model.Purchases
import kotlinx.android.synthetic.main.activity_second.view.*
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.item_third_layout.*
import java.text.FieldPosition
import java.time.LocalDateTime
import java.util.*

class ThirdActivity : AppCompatActivity() {

    private val purchases = mutableListOf<Purchases>()

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        recyclerViewBuilder()
        initViews()
        dateFormat()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun initViews() {
        tv_addressAmount.text = "ул.Боконбаева - пр.Мира"
        val totalAmount: TextView = findViewById(R.id.tv_totalAmount)
        val discountAmount: TextView = findViewById(R.id.tv_discountAmount)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun dateFormat () {
        val sdf = SimpleDateFormat("HH:mm dd.MM.yyyy")
        val currentDate = sdf.format(Date())
        tv_dateAmount.text = currentDate.toString()
    }

    @SuppressLint("WrongConstant")
    fun recyclerViewBuilder() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        purchases.add(Purchases(1,"Juice", 9.0, 2))
        purchases.add(Purchases(2,"Juice", 6.0, 3))
        purchases.add(Purchases(3,"Juice", 3.0, 2))
        purchases.add(Purchases(4,"Juice", 3.3, 4))
        purchases.add(Purchases(5,"Juice", 6.6, 2))
        purchases.add(Purchases(6,"Juice", 1.2, 1))
        purchases.add(Purchases(7,"Juice", 1.2, 2))
        purchases.add(Purchases(8,"Juice", 1.2, 5))
        purchases.add(Purchases(9,"Juice", 1.2, 2))
        purchases.add(Purchases(3,"Juice", 1.2, 2))
        purchases.add(Purchases(3,"Juice", 1.2, 7))
        purchases.add(Purchases(3,"Juice", 1.2, 2))
        purchases.add(Purchases(3,"Juice", 1.2, 9))
        purchases.add(Purchases(3,"Juice", 1.2, 2))
        purchases.add(Purchases(3,"Juice", 1.2, 4))
        purchases.add(Purchases(3,"Juice", 1.2, 2))

        val adapter = com.e.myfirstkotlinapp.ui.recycler.Adapter(purchases)
        recyclerView.adapter = adapter
    }
}
/*
    Необходимо создать модель, замокать её данными, после создать recyclerView,
    добавить TextView address_txt, date_txt, recycler_view,
    и заполнить их данными, сделать всё по дизайну.
    Доп задание: сделать отображение amount_txt, discount_amount_txt и кто сможет менять цвет через ячейку
*/
