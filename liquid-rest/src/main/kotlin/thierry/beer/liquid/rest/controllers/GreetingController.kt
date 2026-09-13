package thierry.beer.liquid.rest.controllers

import jakarta.annotation.security.PermitAll
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import thierry.beer.liquid.api.services.GreetingService

@RestController
@PermitAll
@RequestMapping("/api/greetings")
class GreetingController(
    private val greetingService: GreetingService,
) {

    @GetMapping
    fun greet(@RequestParam(defaultValue = "world") name: String): String =
        greetingService.greet(name)
}
