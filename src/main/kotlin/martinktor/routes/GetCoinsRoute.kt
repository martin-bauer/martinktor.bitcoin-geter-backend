package martinktor.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import martinktor.data.GetService
import martinktor.data.model.Coin

private const val BASE_URL = "https://192.168.178.24:8100"
//private const val BASE_URL ="https://localhost:8100"
private val client= GetService.get()

private val coins = listOf(
    Coin("1", "Bitcoin", "50.000"),
    Coin("1", "Etherum", "4.000"),
    Coin("1", "Monero", "500"),
)


fun Route.getCoins() {
    get("/v1/getcoins") {
        call.respond(
            HttpStatusCode.OK,
            client.getCoin()
//            coins.random()
        )
    }

}