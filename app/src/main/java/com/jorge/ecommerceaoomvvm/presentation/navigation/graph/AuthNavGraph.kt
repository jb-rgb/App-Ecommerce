package com.jorge.ecommerceaoomvvm.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jorge.ecommerceaoomvvm.presentation.navigation.Graph
import com.jorge.ecommerceaoomvvm.presentation.navigation.screen.AuthScreen
import com.jorge.ecommerceaoomvvm.presentation.screens.auth.login.LoginScreen
import com.jorge.ecommerceaoomvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navCrontroller: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController = navCrontroller)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen()
        }
    }
}