package com.example.fortnitefan.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fortnitefan.Composables.AboutPage
import com.example.fortnitefan.Composables.MapPage
import com.example.fortnitefan.Composables.NewsPage
import com.example.fortnitefan.Composables.Navigation.Screens
import com.example.fortnitefan.data.mapmodel.Images
import com.example.fortnitefan.data.newsmodel.Motd

@Composable
fun BottomNavHost (navHostController: NavHostController,
                   motdList: List<Motd>, forniteMap: Images

){
    NavHost(
        navController = navHostController,
        startDestination =  Screens. News.route
    ){
        composable( route = Screens.News.route){
            NewsPage(motdList)
        }


        composable( route = Screens.Map.route){
            MapPage(forniteMap)
        }

        composable( route = Screens.About.route){
            AboutPage()
        }

    }
}