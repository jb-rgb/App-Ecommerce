package com.jorge.ecommerceappmvvm.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jorge.ecommerceappmvvm.presentation.navigation.Graph
import com.jorge.ecommerceappmvvm.presentation.navigation.screen.AuthScreen
import com.jorge.ecommerceappmvvm.presentation.screens.auth.login.LoginScreen
import com.jorge.ecommerceappmvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navCrontroller: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController = navCrontroller)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navController = navCrontroller)
        }
    }
}