package com.e.myfirstkotlinapp.model

data class Purchases(
    val number: Int,
    val purchasesName: String,
    val price: Double,
    val quantity: Int,
    val discount: Double = (price / 100) * 3,
    val result: Double = (quantity * price) - discount
)