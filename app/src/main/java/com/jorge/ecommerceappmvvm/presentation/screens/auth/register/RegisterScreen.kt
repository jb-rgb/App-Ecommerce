package com.jorge.ecommerceappmvvm.presentation.screens.auth.register

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jorge.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.jorge.ecommerceappmvvm.presentation.screens.auth.register.components.RegisterContent
import com.jorge.ecommerceappmvvm.ui.theme.KotlinEcommerceMVVMTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Register",
                upAvailable = true,
                navController = navController
            )
        }
    ) { paddingValues ->
        RegisterContent(paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    KotlinEcommerceMVVMTheme {
        RegisterScreen(rememberNavController())
    }
}