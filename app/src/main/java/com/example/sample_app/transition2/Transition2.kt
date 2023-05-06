//package com.example.sample_app
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
//import com.example.sample_app.transition2.FirstScreen2
//import com.example.sample_app.transition2.SecondScreen2
//import com.example.sample_app.transition2.ThirdScreen2
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "first") {
//                composable("first") {
//                    FirstScreen2(
//                        onNavigateToFriends = { navController.navigate("second") },
//                        onTabBack = { navController.popBackStack() },
//                    )
//                }
//                composable("second") {
//                    SecondScreen2(
//                        onNavigateToFriends = { navController.navigate("third") },
//                        onTabBack = { navController.popBackStack() },
//                    )
//                }
//                composable("third") {
//                    ThirdScreen2(
//                        onNavigateToFriends = { navController.navigate("first") },
//                        onTabBack = { navController.popBackStack() },
//                    )
//                }
//            }
//        }
//    }
//}