package sk.hilo.database.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sk.hilo.database.entity.Chef
import sk.hilo.database.entity.Review

@Repository
interface ChefRepository: JpaRepository<Chef, Long>