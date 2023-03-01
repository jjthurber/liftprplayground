package com.sonatype.liftprplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiftprplaygroundApplication

fun main(args: Array<String>) {
	runApplication<LiftprplaygroundApplication>(*args)

	throw RuntimeException("Not yet implemented, not to lift does not like RuntimeException")

	throw RuntimeException("Introducing another for the squirrel")
	
	throw RuntimeException("Introducing another for the squl")
}
