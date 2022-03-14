package com.example.joustInCase.model

import javax.persistence.*

@Entity
@Table(name = "Jouster")
class Jouster(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(name = "Name")
        var name: String,

        @Column(name = "Points")
        var points: Int = 0

) {
    constructor(newJousterName: String) : this(
            id = null,
            name = newJousterName,
            points = 0
    )
}