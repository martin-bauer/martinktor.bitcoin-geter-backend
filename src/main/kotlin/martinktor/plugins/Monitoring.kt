package martinktor.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.request.*
import org.slf4j.event.Level

fun Application.configureMonitoring() {

    install(CallLogging) {
        level = Level.INFO
        filter { call ->
            call.request.path().startsWith("/")
        }
        format { call ->
            val status = call.response.status()
            val info = call.request.path()
            val httpMethod = call.request.httpMethod.value
            val userAgent = call.request.headers["User-Agent"]
            "Status: $status, Path: $info, HTTP method: $httpMethod, User agent: $userAgent"
        }
    }

}
