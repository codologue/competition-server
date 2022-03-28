package com.codologue.competitionserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CompetitionServerApplication

fun main(args: Array<String>) {
    runApplication<CompetitionServerApplication>(*args)
}
