package com.e.myfirstkotlinapp.model

import java.util.*

data class MockModel(
    val storeAddress: String,
    val date: Date,
    val total: Double,
    val discount: Double,
    val list: List<Purchases>
)
