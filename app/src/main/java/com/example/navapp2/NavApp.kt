package com.example.navapp2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavApp () {

    val navControlla = rememberNavController ()

    NavHost(
        navController = navControlla,
        startDestination = "homescreen"
    ) {

        composable("homescreen") {
            HomeScreen(
                gotosecondscreen = {
                    navControlla.navigate ("secondscreen")
                }
            )
        }

        composable("secondscreen") {
            SecondScreen(
                gotothirdscreen = {
                    navControlla.popBackStack() // ca fera en sorte de retourner au screenA en sautant le screenB
                    navControlla.navigate("thirdscreen")

                }
            )
        }

        composable("thirdscreen") {
            ThirdScreen(
                gotolastscreen = {
                    navControlla.popBackStack() // ca fera en sorte de retourner au screenA en sautant le screenC
                    navControlla.navigate ("lastscreen")
                }
            )
        }

        composable ("lastscreen") {
            LastScreen(
                goback = {
                    navControlla.popBackStack()
                }
            )
        }
    }

}