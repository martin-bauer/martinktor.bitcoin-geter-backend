package martinktor.data

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import martinktor.data.dto.*
import martinktor.data.model.Coin
import martinktor.routes.HttpRoutes

class GetImpl(
    private val client: HttpClient
) : GetService {
    override suspend fun getCoin(): Coin {

        val coinDTO: CoinDTO = client.get {
            url(HttpRoutes.GET)
            contentType(ContentType.Application.Json)
        }
        val coinTicker: CoinTicker = client.get {
            url(HttpRoutes.GETTICKER)
            contentType(ContentType.Application.Json)
        }

        return coinDTO.toCoin(coinTicker.quotes.USD.price.toString())
    }
}