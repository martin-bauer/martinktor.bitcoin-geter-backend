package martinktor.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class LinksExtended(
    val stats: Stats? =null,
    val type: String,
    val url: String
)