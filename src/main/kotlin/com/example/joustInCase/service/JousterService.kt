package com.example.joustInCase.service

import com.example.joustInCase.model.Jouster
import com.example.joustInCase.repository.JousterRepository
import org.springframework.stereotype.Service

@Service
class JousterService(
        private val jousterRepository: JousterRepository
) {

    fun getAllJousters(): List<Jouster> {
        return jousterRepository.findAll()
    }
}