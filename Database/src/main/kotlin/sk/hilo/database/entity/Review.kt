package sk.hilo.database.entity

import javax.persistence.*

@Entity
data class Review(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        var stars: Number,
        var description: String = ""
)