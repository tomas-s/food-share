package sk.hilo.database.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import sk.hilo.database.entity.User

@Repository
interface UserRepository:CrudRepository<User, Long>