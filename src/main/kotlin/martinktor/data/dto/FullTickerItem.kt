package martinktor.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class FullTickerItem(
    val beta_value: Double? = 0.0,
    val circulating_supply: Double? = 0.0,
    val first_data_at: String? = "",
    val id: String? = "",
    val last_updated: String? = "",
    val max_supply: Double? = 0.0,
    val name: String? = "",
    val quotes: QuotesX? = QuotesX(),
    val rank: Int? = 0,
    val symbol: String? = "",
    val total_supply: Double? = 0.0
)