package com.example.fortnitefan.Composables.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val title: String, val icon: ImageVector, val route: String){

    object News: Screens(
        title = "News",
        icon = Icons.Default.Home,
        route = "news"
    )



    object Map: Screens(
        title = "Map",
        icon = Icons.Default.LocationOn,
        route = "map"
    )

    object About: Screens(
        title = "About",
        icon = Icons.Default.Info,
        route = "about"
    )

}
