package pk.com.aafaq.gitrends.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TrendingResponse(
    @SerialName("total_count")
    val totalCount: Int? = null,

    @SerialName("incomplete_results")
    val incompleteResults: Boolean? = null,

    @SerialName("items")
    val items: List<Item> = listOf()
)