package thierry.beer.liquid.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiquidApplication

fun main(args: Array<String>) {
    runApplication<LiquidApplication>(*args)
}