package com.tracking.smartpoint.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {
    fun generateBCrypt(password: String): String {
        return BCryptPasswordEncoder().encode(password)
    }


}