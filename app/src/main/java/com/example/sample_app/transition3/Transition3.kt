//package com.example.sample_app
//
//import androidx.navigation.compose.composable
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
//import com.example.sample_app.transition3.FirstScreen3
//import com.example.sample_app.transition3.SecondScreen3
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "first") {
//                composable("first") {
//                    //textとidを引数に受け取る。
//                    FirstScreen3 { text, id ->
//                        navController.navigate("screen2/$text/$id")
//                    }
//                }
//                composable(
//                    //routeを定義する(画面遷移時に、値が渡される)
//                    route = "screen2/{text}/{id}",
//                    //routeの引数を定義している
//                    arguments = listOf(
//                        //navArgumentを使用して、引数を定義している。
//                        navArgument("text") { type = NavType.StringType },
//                        navArgument("id") { type = NavType.IntType },
//                    )
//                ) { backStackEntry ->
//                    //もし引数がなかったら、""が入る
//                    val text = backStackEntry.arguments?.getString("text") ?: ""
//                    val id = backStackEntry.arguments?.getInt("id") ?: 0
//                    SecondScreen3(text, id) {
//                        //ディープリンクを使用して現在の目的地に到着した場合のみ、動作が異なる
//
//                        //アプリを離れて、アプリ内のディープ リンクに移動したアプリに戻ります。
//                        //navController.navigateUp()
//                        navController.popBackStack()
//                    }
//                }
//            }
//
//        }
//    }
//}