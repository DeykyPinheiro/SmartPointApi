package com.tracking.smartpoint.documents

import com.tracking.smartpoint.enums.PermissionEnum
import org.springframework.data.annotation.Id
import java.math.BigDecimal

data class Employee(
        @Id
        val id: String? = null,

        val fullName: String,

        val email: String,

        val password: String,

        val cpf: String,

        val permissionEnum: PermissionEnum,

        val idCompany: String,

        val hourValue: BigDecimal,

        val workedHoursDay: Float? = 0.0f,

        val amountHoursLunch: Float? = 0.0f

)