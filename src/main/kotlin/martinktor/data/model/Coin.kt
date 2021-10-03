package martinktor.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Coin(
     val id: String,
     val name: String,
     val symbol: String
)