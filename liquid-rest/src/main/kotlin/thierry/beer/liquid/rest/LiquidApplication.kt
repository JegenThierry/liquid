package thierry.beer.liquid.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["thierry.beer.liquid"])
class LiquidApplication

fun main(args: Array<String>) {
    runApplication<LiquidApplication>(*args)
}
