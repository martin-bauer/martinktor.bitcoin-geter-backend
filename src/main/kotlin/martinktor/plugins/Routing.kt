package martinktor.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import martinktor.routes.getCoins

fun Application.configureRouting() {
    routing {
        getCoins()
//        get("/") {
//                call.respondText("Hello World!")
//            }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}