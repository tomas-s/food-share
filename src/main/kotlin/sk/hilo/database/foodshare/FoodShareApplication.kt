package sk.hilo.database.foodshare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodShareApplication

fun main(args: Array<String>) {
	runApplication<FoodShareApplication>(*args)
}
