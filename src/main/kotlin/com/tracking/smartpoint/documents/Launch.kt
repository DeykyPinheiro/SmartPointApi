package com.tracking.smartpoint.documents

import com.tracking.smartpoint.enums.TypeEnum
import org.springframework.data.annotation.Id
import java.util.Date

data class Launch(
        @Id
        val id: String? = null,

        val date: Date,

        val type: TypeEnum,

        val employee: String,

        val description: String = "",

        val localization: String = ""
)