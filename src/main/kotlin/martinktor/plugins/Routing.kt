package martinktor.plugins

import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*
import martinktor.routes.getCoin
import martinktor.routes.getCoins
import martinktor.routes.getReadMe
import martinktor.routes.health

fun Application.configureRouting() {
    routing {
        getCoins()
        health()
        getReadMe()
        getCoin()
        static {
            resources("static")
        }
    }
}