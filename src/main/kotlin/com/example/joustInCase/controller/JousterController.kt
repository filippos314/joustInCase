package com.example.joustInCase.controller

import com.example.joustInCase.model.Jouster
import com.example.joustInCase.service.JousterService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class JousterController(private val jousterService: JousterService) {

    @GetMapping(value = ["/jousters"])
    fun getJousters(): ResponseEntity<List<Jouster>> {
        return ResponseEntity.ok(jousterService.getAllJousters())
    }

    @PostMapping(value = ["/jousters"])
    fun saveJouster(
            @RequestParam("name") newJousterName: String
    ): ResponseEntity<Jouster> {
        return ResponseEntity.ok(jousterService.saveJouster(newJousterName))
    }

    @DeleteMapping(value = ["/jousters/{id}"])
    fun deleteJouster(@PathVariable id: Long
    ): ResponseEntity<Unit> {
        return ResponseEntity.ok(jousterService.deleteJouster(id))
    }

    @PutMapping(value = ["/jousters"])
    fun updateJouster(
            @RequestBody newJouster: Jouster
    ): ResponseEntity<Jouster> {
        return ResponseEntity.ok(jousterService.updateJouster(newJouster))
    }


    @PutMapping(value = ["/jousters/score"])
    fun addScore(
            @RequestBody jouster1: Jouster,
            @RequestBody jouster1Score: Int,
            @RequestBody jouster2: Jouster,
            @RequestBody jouster2Score: Int
    ): ResponseEntity.BodyBuilder {
        return ResponseEntity.ok()
    }
}