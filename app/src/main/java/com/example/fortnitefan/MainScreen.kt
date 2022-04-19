package com.example.fortnitefan

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fortnitefan.Composables.Navigation.Screens
import com.example.fortnitefan.data.mapmodel.Images
import com.example.fortnitefan.data.newsmodel.Motd
import com.example.fortnitefan.ui.theme.BottomNavHost
import com.example.fortnitefan.viewmodels.FortniteViewModel

@Composable
fun MainScreen(  viewModel:  FortniteViewModel= hiltViewModel()){
    val navController = rememberNavController()
    val newsFeed by viewModel.getNews().observeAsState(initial = emptyList())
    val map by viewModel.getMap().observeAsState(initial = null)
    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ) {

        map?.let { it1 ->
            BottomNavHost(navHostController = navController,
                motdList = newsFeed as List<Motd>,
                forniteMap = it1
            )
        }

    }
}

@Composable
fun BottomBar(navController: NavHostController){
    val pages = listOf(
        Screens.News,
        Screens.Map,
        Screens.About
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        pages.forEach { page ->
            BottomNavigationItem(
                selected = currentDestination?.hierarchy?.any { it.route == page.route } == true,
                onClick = { navController.navigate(page.route) },
                label = { Text(text = page.title)},
                icon = { Icon(imageVector = page.icon, contentDescription = null)}
            ) 
                

        }
        
    }

}