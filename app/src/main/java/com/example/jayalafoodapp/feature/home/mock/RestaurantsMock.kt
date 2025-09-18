package com.example.jayalafoodapp.feature.home.mock

import com.example.jayalafoodapp.data.model.Restaurant

object RestaurantsMock {
    val items = listOf(
        Restaurant("res_bk", "Burger King", "https://picsum.photos/id/870/300/300"),
        Restaurant("res_mcd", "McDonald's", "https://picsum.photos/id/1059/300/300"),
        Restaurant("res_kfc", "KFC", "https://picsum.photos/id/102/300/300"),
        Restaurant("res_sub", "Subway", "https://picsum.photos/id/292/300/300"),
        Restaurant("res_stb", "Starbucks", "https://picsum.photos/id/1060/300/300")
    )
}
