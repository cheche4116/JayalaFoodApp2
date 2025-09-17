package com.example.jayalafoodapp.feature.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeaderSection(userName: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = "Perfil",
                modifier = Modifier.size(28.dp)
            )
            Text(
                text = "Hola, $userName",
                style = MaterialTheme.typography.headlineSmall
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Rounded.ExitToApp,
                contentDescription = "Cerrar sesión",
                modifier = Modifier.size(28.dp)
            )
        }
    }
}
