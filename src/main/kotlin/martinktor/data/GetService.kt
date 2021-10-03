package martinktor.data

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import martinktor.data.model.Coin

interface GetService {
    suspend fun getCoin(): Coin

    companion object {
        fun get(): GetService {
            return GetImpl(
                client = HttpClient(CIO) {
                    install(JsonFeature) {
                        serializer = KotlinxSerializer()
                    }
                }
            )
        }
    }
}