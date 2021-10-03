package martinktor.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinTicker(
    val beta_value: Double = 0.0,
    val circulating_supply: Int = 0,
    val first_data_at: String = "",
    val id: String = "",
    val last_updated: String = "",
    val max_supply: Int = 0,
    val name: String = "",
    val quotes: Quotes = Quotes(),
    val rank: Int = 0,
    val symbol: String = "",
    val total_supply: Int = 0
)