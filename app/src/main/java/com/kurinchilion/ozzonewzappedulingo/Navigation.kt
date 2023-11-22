package com.kurinchilion.ozzonewzappedulingo

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kurinchilion.ozzonewzappedulingo.ui.RSSFeedScreen
import com.kurinchilion.ozzonewzappedulingo.ui.WelcomeScreen



@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "First") {
        composable("First") {
            WelcomeScreen(navController)
        }
        composable("Second") {
                RSSFeedScreen()
            }
        }
    }
