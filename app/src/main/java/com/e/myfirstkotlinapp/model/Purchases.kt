package com.e.myfirstkotlinapp.model

data class Purchases(
    val number: Int,
    val purchasesName: String,
    val price: Double,
    val discount: Double,
    val result: Double = price - discount
)