package com.e.myfirstkotlinapp.model

import java.util.*

data class MockModel(
    val storeName: String,
    val date: Date,
    val list: List<Purchases>
)
