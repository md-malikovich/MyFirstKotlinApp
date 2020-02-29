package com.e.myfirstkotlinapp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.myfirstkotlinapp.R
import com.e.myfirstkotlinapp.model.MockModel
import com.e.myfirstkotlinapp.model.Purchases

class ThirdActivity : AppCompatActivity() {

    private val purchases = mutableListOf<Purchases>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        recyclerViewBuilder()
    }

    @SuppressLint("WrongConstant")
    fun recyclerViewBuilder() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        purchases.add(Purchases(1,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(2,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(3,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(4,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(5,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(6,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(8,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(9,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))
        purchases.add(Purchases(7,"Juice", 1.5, 2, 1.0, 0.5))

        val adapter = com.e.myfirstkotlinapp.ui.recycler.Adapter(purchases)
        recyclerView.adapter = adapter //TODO:
    }
}
/*
    Необходимо создать модель, замокать её данными, после создать recyclerView,
    добавить TextView address_txt, date_txt, recycler_view,
    и заполнить их данными, сделать всё по дизайну.
    Доп задание: сделать отображение amount_txt, discount_amount_txt и кто сможет менять цвет через ячейку
*/
