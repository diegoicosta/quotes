package quotes

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by diegoicosta on 02/08/16.
 */


@RestController
class RestService {

    @RequestMapping("/hello")
    fun goHome(): Greeting {
        return Greeting(1, "Ola ... como vai ?")
    }
}


data class Greeting(val id: Long, val content: String)