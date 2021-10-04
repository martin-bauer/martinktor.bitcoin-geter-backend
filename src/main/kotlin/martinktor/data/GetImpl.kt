package martinktor.data

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import martinktor.data.dto.CoinTicker
import martinktor.data.dto.FullTickerItem
import martinktor.data.dto.toCoin
import martinktor.data.model.Coin
import martinktor.routes.HttpRoutes

class GetImpl(
    private val client: HttpClient
) : GetService {
    override suspend fun getAllCoinIds(): List<String?> {

        val coinTicker: List<FullTickerItem> = client.get {
            url(HttpRoutes.GETTCOIN)
            contentType(ContentType.Application.Json)
        }
        return coinTicker.map { it.id }
    }

    override suspend fun getOneCoin(coin: String): Coin {
        val coinTicker: CoinTicker = client.get {
            url(HttpRoutes.GETTCOIN + coin)
            contentType(ContentType.Application.Json)
        }
        return coinTicker.toCoin(coinTicker.quotes.USD.price.toString())
    }
}