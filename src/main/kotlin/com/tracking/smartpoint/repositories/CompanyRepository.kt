package com.tracking.smartpoint.repositories

import com.tracking.smartpoint.documents.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {

    fun findByCnpj(cnpj: String): Company?
}