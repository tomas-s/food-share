package sk.hilo.database.entity

import javax.persistence.*

@Entity
data class Consumer(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        @Column(name = "first_name")
        var firstName: String,
        @Column(name = "sur_name")
        var surName: String,
        var description: String
)