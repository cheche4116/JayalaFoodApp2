package com.example.jayalafoodapp.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jayalafoodapp.feature.home.components.CategoryItem
import com.example.jayalafoodapp.feature.home.components.FoodCard
import com.example.jayalafoodapp.feature.home.components.HeaderSection
import com.example.jayalafoodapp.feature.home.components.RestaurantItem
import com.example.jayalafoodapp.feature.home.mock.CategoriesMock
import com.example.jayalafoodapp.feature.home.mock.FoodsMock
import com.example.jayalafoodapp.feature.home.mock.RestaurantsMock
import com.example.jayalafoodapp.ui.theme.JayalaFoodAppTheme

@Composable
fun HomeScreen() {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                HeaderSection(userName = "Daniel")
            }
            item {
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
            }
            item {
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
            }
            item {
                Text(
                    text = "Nuestras mejores comidas",
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(12.dp))
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.height(600.dp)
                ) {
                    items(FoodsMock.items) { food ->
                        FoodCard(food = food)
                    }
                }
            }
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
