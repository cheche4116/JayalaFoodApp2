package com.example.jayalafoodapp.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jayalafoodapp.feature.home.components.CategoryItem
import com.example.jayalafoodapp.feature.home.components.HeaderSection
import com.example.jayalafoodapp.feature.home.components.RestaurantItem
import com.example.jayalafoodapp.feature.home.mock.CategoriesMock
import com.example.jayalafoodapp.feature.home.mock.RestaurantsMock
import com.example.jayalafoodapp.ui.theme.JayalaFoodAppTheme

@Composable
fun HomeScreen() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            HeaderSection(userName = "Daniel")
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Nuestras categorías",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(CategoriesMock.items) { category ->
                    CategoryItem(category = category)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Busca los mejores restaurantes",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(RestaurantsMock.items) { restaurant ->
                    RestaurantItem(restaurant = restaurant)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Nuestras mejores comidas",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    JayalaFoodAppTheme {
        HomeScreen()
    }
}
