package com.example.joustInCase.controller

import com.example.joustInCase.model.Jouster
import com.example.joustInCase.service.JousterService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JousterController(private val jousterService: JousterService) {

    @GetMapping(value = ["/jousters"])
    fun getJousters(): ResponseEntity<List<Jouster>> {
        return ResponseEntity.ok(jousterService.getAllJousters())
    }
}