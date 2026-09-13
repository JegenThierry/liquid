package thierry.beer.liquid.core.services

import org.springframework.stereotype.Service
import thierry.beer.liquid.api.services.GreetingService

@Service
class GreetingServiceImpl : GreetingService {
    override fun greet(name: String): String = "Hello, $name!"
}
