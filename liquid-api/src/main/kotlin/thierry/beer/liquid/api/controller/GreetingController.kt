package thierry.beer.liquid.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import thierry.beer.liquid.core.GreetingService

@RestController
@RequestMapping("/api/greetings")
class GreetingController(
    private val greetingService: GreetingService,
) {

    @GetMapping
    fun greet(@RequestParam(defaultValue = "world") name: String): String =
        greetingService.greet(name)
}