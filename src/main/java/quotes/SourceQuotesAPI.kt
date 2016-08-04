package quotes

import feign.Feign
import feign.Param
import feign.RequestLine
import feign.gson.GsonDecoder

/**
 * Created by diegoicosta on 03/08/16.
 */
interface SourceQuotesAPI {

    @RequestLine("GET /{term}%20c:{category}/en/1/no/1f1a0129-e1d9-43fa-97db-e13557b9986e")
    fun quotes(@Param("term") term: String, @Param("category") category: String): Result
}

data class Result(val total: Int, val total_result: Int, val results: Array<Quote>)
data class Quote(val phrase: String, val author: String, val dates: String, val activities: String)

class QuotesApi {

    val quotes: SourceQuotesAPI

    init {
        quotes = Feign.builder()
                .decoder(GsonDecoder())
                .target(SourceQuotesAPI::class.java, "http://fraze.it/api/famous")
    }

    fun quote(category: String, term: String): Result {
        return quotes.quotes(term, category)
    }

}