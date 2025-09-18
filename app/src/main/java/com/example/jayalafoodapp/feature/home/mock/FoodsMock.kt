package com.example.jayalafoodapp.feature.home.mock

import com.example.jayalafoodapp.data.model.Food

object FoodsMock {
    val items = listOf(
        Food(
            id = "food_whopper",
            name = "Whopper",
            imageUrl = "",
            rating = 4.5,
            price = 99.8,
            restaurantId = "res_bk",
            categoryIds = listOf("cat_fast")
        ),
        Food(
            id = "food_chicken_fries",
            name = "Chicken Fries",
            imageUrl = "",
            rating = 4.3,
            price = 59.8,
            restaurantId = "res_bk",
            categoryIds = listOf("cat_fast")
        ),
        Food(
            id = "food_pizza",
            name = "Pizza Margherita",
            imageUrl = "",
            rating = 4.6,
            price = 120.0,
            restaurantId = "res_kfc",
            categoryIds = listOf("cat_ita")
        ),
        Food(
            id = "food_noodles",
            name = "Noodles",
            imageUrl = "",
            rating = 4.2,
            price = 75.0,
            restaurantId = "res_sub",
            categoryIds = listOf("cat_chi")
        ),
        Food(
            id = "food_salad",
            name = "Green Salad",
            imageUrl = "",
            rating = 4.1,
            price = 48.0,
            restaurantId = "res_stb",
            categoryIds = listOf("cat_hea")
        ),
        Food(
            id = "food_icecream",
            name = "Ice Cream",
            imageUrl = "",
            rating = 4.7,
            price = 35.0,
            restaurantId = "res_mcd",
            categoryIds = listOf("cat_des")
        )
    )
}
