package pk.com.aafaq.gitrends.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LanguageColorItem(
    @SerialName("language_colors" ) val languageColors : List<LanguageColors> = listOf()

)
