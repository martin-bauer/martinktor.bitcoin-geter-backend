package martinktor.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class Quotes(
    val USD: USD = USD()
)