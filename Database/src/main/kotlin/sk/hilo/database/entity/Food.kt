package sk.hilo.database.entity

import javax.persistence.*

@Entity
data class Food(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id:Long,
        var name: String,
        var description: String="")