package com.sonatype.liftprplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiftprplaygroundApplication

fun main(args: Array<String>) {
	runApplication<LiftprplaygroundApplication>(*args)

	throw RuntimeException("Not yet implemented, not to mention lift does not like RuntimeException")

	throw RuntimeException("Introducing another bug for the squirrel")
	
	throw RuntimeException("Introducing another bug fo the squirrel")
	
	throw RuntimeException("Introducing anothe bug for the squirrel")


}
