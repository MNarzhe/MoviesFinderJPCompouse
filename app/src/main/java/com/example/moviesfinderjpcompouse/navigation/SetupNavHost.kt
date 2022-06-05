package com.example.moviesfinderjpcompouse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviesfinderjpcompouse.screens.MainScreen
import com.example.moviesfinderjpcompouse.screens.SplashScreen
import com.example.moviesfinderjpcompouse.utils.Constants


//4. Создаем sealed class с объектами наших экранов, по количеству экранов в новом пекедже с файлом Constants (там содержатся все экраны)
sealed class Screens(val route:String){
    object Splash: Screens(route = Constants.Screens.SPLASH_SCREEN)
    object Main: Screens(route = Constants.Screens.MAIN_SCREEN)
    object Details: Screens(route = Constants.Screens.DETAILS_SCREEN)
}



    //2. Инициализируем SetupNavHost
@Composable
        //2.1. SetupNAvHost принимает в конструктор NavController
fun SetupNavHost(navController: NavHostController) {
        //3. Инициализиуем NavHost
        NavHost(
            navController = navController,
        //5. в startDestination указываем какой экран будет первым
            startDestination = Screens.Splash.route
            ){
            composable(Screens.Splash.route)
            {
            // добавляем экраны
            SplashScreen(navController = navController)
            }
            composable(Screens.Main.route)
            {
            MainScreen()
            }
            composable(Screens.Details.route){
            }
        }
}
