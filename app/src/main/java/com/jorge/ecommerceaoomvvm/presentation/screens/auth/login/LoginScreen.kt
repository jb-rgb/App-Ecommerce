package com.jorge.ecommerceaoomvvm.presentation.screens.auth.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jorge.ecommerceaoomvvm.presentation.screens.auth.login.components.LoginContent
import com.jorge.ecommerceaoomvvm.ui.theme.KotlinEcommerceMVVMTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold() { paddingValues ->
        LoginContent(navCrontroller = navController, paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    KotlinEcommerceMVVMTheme {
        LoginScreen(rememberNavController())
    }
}