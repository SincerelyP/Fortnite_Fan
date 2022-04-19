package com.example.fortnitefan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.fortnitefan.ui.theme.FortniteFanTheme
import com.example.fortnitefan.viewmodels.FortniteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FortniteFanTheme {
                // A surface container using the 'background' color from the theme
                val viewModel = hiltViewModel<FortniteViewModel>()
                MainScreen(viewModel)
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FortniteFanTheme {
        Greeting("Android")
    }
}