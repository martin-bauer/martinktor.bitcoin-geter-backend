package martinktor.routes

object HttpRoutes {
    private const val BASE_URL = "https://api.coinpaprika.com/"
    const val GET = BASE_URL + "v1/coins/btc-bitcoin"
    const val GETTICKER = BASE_URL + "v1/tickers/btc-bitcoin"
}