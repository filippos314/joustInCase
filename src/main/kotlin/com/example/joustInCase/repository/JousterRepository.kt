package com.example.joustInCase.repository

import com.example.joustInCase.model.Jouster
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JousterRepository : JpaRepository<Jouster, Long> {

    fun findByName(jousterName: String): Jouster
}