package martinktor.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class QuotesX(
    val USD: USDX? = USDX()
)