package martinktor.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import martinktor.data.GetService
import martinktor.data.model.Coin

private val client= GetService.get()

fun Route.getCoins() {
    get("/v1/getcoins") {
        call.respond(
            HttpStatusCode.OK,
            client.getCoin()
        )
    }

}