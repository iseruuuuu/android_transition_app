package com.example.sample_app.transition1//package com.example.sample_app
//
//import com.example.sample_app.transition1.FirstScreen
//import com.example.sample_app.transition1.SecondScreen
//import com.example.sample_app.transition1.ThirdScreen
//import androidx.navigation.compose.composable
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "first") {
//                composable("first") {
//                    com.example.sample_app.transition1.FirstScreen(navController)
//                }
//                composable("second") {
//                    com.example.sample_app.transition1.SecondScreen(navController)
//                }
//                composable("third") {
//                    com.example.sample_app.transition1.ThirdScreen(navController)
//                }
//            }
//        }
//    }
//}