package com.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlyIoPgApplication

fun main(args: Array<String>) {
    runApplication<FlyIoPgApplication>(*args)
}
