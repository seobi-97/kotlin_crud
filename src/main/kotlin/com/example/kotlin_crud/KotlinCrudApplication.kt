package com.example.kotlin_crud

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCrudApplication

fun main(args: Array<String>) {
    val dotenv = Dotenv.configure().load()
    System.setProperty("DB_USERNAME",dotenv["DB_USERNAME"])
    System.setProperty("DB_PASSWORD",dotenv["DB_PASSWORD"])
    runApplication<KotlinCrudApplication>(*args)
}
