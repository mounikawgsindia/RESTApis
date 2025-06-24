package com.example.dank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DankApplication

fun main(args: Array<String>) {
	runApplication<DankApplication>(*args)
}
