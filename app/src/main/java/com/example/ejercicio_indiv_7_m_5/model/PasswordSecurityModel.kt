package com.example.ejercicio_indiv_7_m_5.model


object PasswordSecurityModel {
    fun checkLevelPassword(password: String): String {
        return when {
            password.length < 5 -> "Débil"                    // Contraseña con menos de 5 caracteres
            password.none { it.isUpperCase() } -> "Media"     // Contraseña sin mayúsculas
            else -> "Fuerte"                                  // Contraseña con mayúsculas
        }
    }
}
