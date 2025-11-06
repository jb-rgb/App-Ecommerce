package com.jorge.ecommerceappmvvm.presentation.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel() {
    var state by mutableStateOf(RegisterState())
        private set
    var errorMessage by mutableStateOf("")
        private set

    fun onNameInput(name: String) {
        state = state.copy(name = name)
    }

    fun onLastNameInput(lastName: String) {
        state = state.copy(lastName = lastName)
    }

    fun onEmailInput(email: String) {
        state = state.copy(email = email)
    }

    fun onPhoneInput(phone: String) {
        state = state.copy(phone = phone)
    }

    fun onPasswordInput(password: String) {
        state = state.copy(password = password)
    }

    fun onConfirmPasswordInput(confirmPassword: String) {
        state = state.copy(confirmPassword = confirmPassword)
    }

    fun validateForm() = viewModelScope.launch {
        if (state.name == "") {
            errorMessage = "Names is required"
        } else if (state.lastName == "") {
            errorMessage = "Last Names is required"
        } else if (state.email == "") {
            errorMessage = "Email is required"
        } else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "Invalid email address"
        } else if (state.phone == "") {
            errorMessage = "Phone is required"
        } else if (state.password == "") {
            errorMessage = "Password is required"
        } else if (state.password.length < 6) {
            errorMessage = "Password must be at least 6 characters"
        } else if (state.confirmPassword == "") {
            errorMessage = "Confirm Password is required"
        } else if (state.password != state.confirmPassword) {
            errorMessage = "Passwords do not match"
        }
        delay(3000)
        errorMessage = ""
    }
}