package com.example.joustInCase.model

import javax.persistence.*

@Entity
@Table(name = "Jouster")
class Jouster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column(name="Name")
    lateinit var name: String

}