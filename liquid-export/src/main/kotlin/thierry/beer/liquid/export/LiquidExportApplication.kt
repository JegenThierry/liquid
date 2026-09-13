package thierry.beer.liquid.export

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiquidExportApplication

fun main(args: Array<String>) {
    runApplication<LiquidExportApplication>(*args)
}
