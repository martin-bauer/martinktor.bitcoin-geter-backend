package martinktor.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.util.pipeline.*
import martinktor.data.GetService
import java.io.File

private val client = GetService.getService()

fun Route.getReadMe() {
    get("/") {
        call.respondText(File("readme.md").readText())
    }
}

fun Route.health() {
    get("/health") {
        healthyResponse()
    }
    get("/v1/health") {
        healthyResponse()
    }
}

private suspend fun PipelineContext<Unit, ApplicationCall>.healthyResponse() {
    call.respondText("I'm a healthy server 200")
}

fun Route.getCoins() {
    get("/v1/getcoins") {
        call.respond(
            HttpStatusCode.OK,
            client.getAllCoinIds()
        )
    }
    get("/v1/getcoinids") {
        call.respond(
            HttpStatusCode.OK,
            client.getAllCoinIds()
        )
    }
}

fun Route.getCoin() {
    get("/v1/getcoin/{coin}") {
        val coin = call.parameters["coin"]!!
        call.respond(
            HttpStatusCode.OK,
            client.getOneCoin(coin)
        )
    }
}