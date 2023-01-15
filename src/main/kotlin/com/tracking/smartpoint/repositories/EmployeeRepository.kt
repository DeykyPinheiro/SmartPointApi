package com.tracking.smartpoint.repositories

import com.tracking.smartpoint.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {

    fun findByEmail(email: String): Employee?

    fun findByCpf(cpf: String): Employee?

}