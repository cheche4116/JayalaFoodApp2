package com.example.jayalafoodapp.feature.home.mock

import com.example.jayalafoodapp.data.model.Category

object CategoriesMock {
    val items = listOf(
        Category("cat_fast", "Fast Food", "https://picsum.photos/id/1080/200/200"),
        Category("cat_chi", "Chinese", "https://picsum.photos/id/292/200/200"),
        Category("cat_ita", "Italian", "https://picsum.photos/id/1067/200/200"),
        Category("cat_des", "Desserts", "https://picsum.photos/id/1081/200/200"),
        Category("cat_hea", "Healthy", "https://picsum.photos/id/433/200/200"),
        Category("cat_mex", "Mexican", "https://picsum.photos/id/1025/200/200")
    )
}
