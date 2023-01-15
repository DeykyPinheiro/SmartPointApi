package com.tracking.smartpoint.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Company(

        @Id
        val id: String? = null,

        val businessName: String,

        val cnpj: String
)