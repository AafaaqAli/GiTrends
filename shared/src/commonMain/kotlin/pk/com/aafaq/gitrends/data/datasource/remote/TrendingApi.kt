package pk.com.aafaq.gitrends.data.datasource.remote

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import pk.com.aafaq.gitrends.core.AppConstants
import pk.com.aafaq.gitrends.data.datasource.local.cache.TrendingRepository
import pk.com.aafaq.gitrends.domain.model.TrendingResponse

class TrendingApi {
    private val httpClient by lazy {
        HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                    coerceInputValues = true
                    allowStructuredMapKeys = true
                    ignoreUnknownKeys = true
                })
            }
        }
    }
    @Throws(Exception::class)
    suspend fun getAllTrendingRepositories():  List<TrendingRepository> {
        val response = Json.decodeFromString<TrendingResponse>(
            httpClient.get(AppConstants.BASE_URL + AppConstants.RELATIVE_URL).body()
        )
        return parseResponse(response)
    }

    private fun parseResponse(response: TrendingResponse): List<TrendingRepository>{
        val repositories: List<TrendingRepository> = emptyList()

        response.items.forEachIndexed { index, item ->
            repositories[index].copy(
                itemID  = item.id?.toLong() ?: 0,
                repositoryStars = item.stargazersCount?.toLong() ?: 0,
                forksCount = item.forksCount?.toLong() ?: 0,
                isItemExpanded = false,
                avatarURL = item.url ?: "",
                itemHeadingUserName = item.fullName ?: "",
                itemSubHeadingRepositoryName = "",
                itemDescription = item.fullName ?: "",
                repositoryLanguage = item.language ?: "",
                userURLPage = item.url ?: "",
                repositoryURLPage = item.url ?: ""
            )
        }

        return repositories
    }
}