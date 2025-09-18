package com.example.jayalafoodapp.data.model

data class Food(
    val id: String,
    val name: String,
    val imageUrl: String,
    val rating: Double,
    val price: Double,
    val restaurantId: String,
    val categoryIds: List<String>
)
