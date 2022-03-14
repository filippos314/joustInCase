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

    fun saveJouster(newJousterName: String): Jouster {
        val newJouster = Jouster(newJousterName)
        return jousterRepository.save(newJouster)
    }

    fun deleteJouster(id: Long) {
        return jousterRepository.deleteById(id)
    }

    fun updateJouster(newJouster: Jouster): Jouster? {
        TODO("Not yet implemented")
    }

//    fun calculateJousterScore()

}