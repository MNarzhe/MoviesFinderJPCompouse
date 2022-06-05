package com.example.moviesfinderjpcompouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.moviesfinderjpcompouse.navigation.SetupNavHost
import com.example.moviesfinderjpcompouse.ui.theme.MoviesFinderJPCompouseTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesFinderJPCompouseTheme {
                //1. Добавляем navController. 2. Инициализируем SetupNavHost(создаем новый файл)
            val navController = rememberNavController()
                //6. добавляем SetupNavHost. 7. затем создаем новый пакет screens с файлами трех экранов
                SetupNavHost(navController = navController)
            }
        }
    }
}




//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MoviesFinderJPCompouseTheme {
//        Greeting("Android")
//    }
//}