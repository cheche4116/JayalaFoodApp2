package com.example.jayalafoodapp.feature.home.mock

import com.example.jayalafoodapp.data.model.Food

object FoodsMock {
    val items = listOf(
        Food(
            id = "food_whopper",
            name = "Whopper",
            imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png",
            rating = 4.5,
            price = 99.8,
            restaurantId = "res_bk",
            categoryIds = listOf("cat_fast")
        ),
        Food(
            id = "food_chicken_fries",
            name = "Chicken Fries",
            imageUrl = "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/product_detail_chickenfries_2.png",
            rating = 4.3,
            price = 59.8,
            restaurantId = "res_bk",
            categoryIds = listOf("cat_fast")
        ),
        Food(
            id = "food_pizza",
            name = "Pizza Margherita",
            imageUrl = "https://media.elgourmet.com/recetas/cover/Fm5utL5Ga4fRKIMETODOS2WoqKu8CWS2apF.png",
            rating = 4.6,
            price = 120.0,
            restaurantId = "res_kfc",
            categoryIds = listOf("cat_ita")
        ),
        Food(
            id = "food_noodles",
            name = "Noodles",
            imageUrl = "https://tiffycooks.com/wp-content/uploads/2021/09/Screen-Shot-2021-09-21-at-5.21.37-PM.png",
            rating = 4.2,
            price = 75.0,
            restaurantId = "res_sub",
            categoryIds = listOf("cat_chi")
        ),
        Food(
            id = "food_salad",
            name = "Green Salad",
            imageUrl = "https://kristineskitchenblog.com/wp-content/uploads/2024/03/salad-recipe-10-2-500x375.jpg",
            rating = 4.1,
            price = 48.0,
            restaurantId = "res_stb",
            categoryIds = listOf("cat_hea")
        ),
        Food(
            id = "food_icecream",
            name = "Ice Cream",
            imageUrl = "https://icecreamfromscratch.com/wp-content/uploads/2022/02/Oreo-Ice-Cream-1.2-735x1103.jpg",
            rating = 4.7,
            price = 35.0,
            restaurantId = "res_mcd",
            categoryIds = listOf("cat_des")
        )
    )
}
