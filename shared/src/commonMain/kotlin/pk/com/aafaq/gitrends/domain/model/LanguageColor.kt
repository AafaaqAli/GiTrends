package pk.com.aafaq.gitrends.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LanguageColors(
    @SerialName("name") val name: String? = null,
    @SerialName("value") val value: String? = null
)