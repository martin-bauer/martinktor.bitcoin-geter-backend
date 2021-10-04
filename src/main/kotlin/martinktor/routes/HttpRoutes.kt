package martinktor.routes

object HttpRoutes {
    private const val BASE_URL = "https://api.coinpaprika.com/"
    const val GETBTCTICKER = BASE_URL + "v1/tickers/btc-bitcoin"
    const val GETTCOIN = BASE_URL + "v1/tickers/"
}