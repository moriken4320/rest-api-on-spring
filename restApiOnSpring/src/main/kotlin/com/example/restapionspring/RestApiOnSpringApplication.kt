package com.example.restapionspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RestApiOnSpringApplication {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(RestApiOnSpringApplication::class.java, *args)
		}
	}
}


