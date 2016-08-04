package quotes

import feign.Headers
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by diegoicosta on 02/08/16.
 */


@RestController
class RestService {

    var quotes = QuotesApi()

    data class Greeting(val id: Long, val content: String)


    @RequestMapping("/hello")
    fun hello(): Greeting {
        return Greeting(1, "Ola ... como vai ?")
    }

    @RequestMapping("/categories")
    fun categories(): ResponseEntity<String> {
        return ResponseEntity.ok("")
    }

    @RequestMapping("/quote/{category}/{term}")
    @Headers("Accept: application/json")
    fun quote(@PathVariable category: String, @PathVariable term: String): Result {
        return quotes.quote(category, term)
    }
}


