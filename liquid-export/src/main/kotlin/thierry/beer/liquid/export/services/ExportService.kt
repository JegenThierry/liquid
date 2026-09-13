package thierry.beer.liquid.export.services

import org.springframework.stereotype.Service

@Service
class ExportService {
    fun csv(content: String): String = "name,value\n${content.replace(",", ";")}"
}
