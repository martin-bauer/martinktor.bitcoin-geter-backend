package martinktor.data

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import martinktor.data.dto.CoinDTO
import martinktor.routes.HttpRoutes

class GetImpl(
    private val client: HttpClient
) : GetService {
    override suspend fun getCoin(): CoinDTO {
        return client.get {
            url(HttpRoutes.GET)
            contentType(ContentType.Application.Json)
        }
    }
}