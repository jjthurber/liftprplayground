package com.sonatype.liftprplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiftprplaygroundApplication

fun main(args: Array<String>) {
	runApplication<LiftprplaygroundApplication>(*args)

	throw RuntimeException("Introducing another bug for the squirrel")
}
