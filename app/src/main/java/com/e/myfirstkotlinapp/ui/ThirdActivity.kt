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
import com.e.myfirstkotlinapp.model.Purchases
import kotlinx.android.synthetic.main.activity_second.view.*
import kotlinx.android.synthetic.main.activity_third.*
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

        purchases.add(Purchases(1,"Juice", 1.2, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.2, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.3, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.6, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))
        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0))

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
