package pk.com.aafaq.gitrends.data.datasource.local

import pk.com.aafaq.gitrends.cache.AppDatabase
import pk.com.aafaq.gitrends.data.datasource.local.cache.DatabaseDriverFactory
import pk.com.aafaq.gitrends.data.datasource.local.cache.TrendingRepository

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

    internal fun getAllTrendingRepositories(): List<TrendingRepository> {
        return dbQuery.selectAllTrendingRepositories(::mapTrendingRepository).executeAsList()
    }

    private fun mapTrendingRepository(
        itemID: Long,
        repositoryStars: Long,
        forksCount: Long,
        isItemExpanded: Boolean?,
        avatarURL: String,
        itemHeadingUserName: String,
        itemSubHeadingRepositoryName: String,
        itemDescription: String,
        repositoryLanguage: String,
        userURLPage: String,
        repositoryURLPage: String
    ): TrendingRepository {
        return TrendingRepository(
            itemID = itemID,
            repositoryStars = repositoryStars,
            forksCount = forksCount,
            isItemExpanded = isItemExpanded,
            avatarURL = avatarURL,
            itemHeadingUserName = itemHeadingUserName,
            itemSubHeadingRepositoryName = itemSubHeadingRepositoryName,
            itemDescription = itemDescription,
            repositoryLanguage = repositoryLanguage,
            userURLPage = userURLPage,
            repositoryURLPage = repositoryURLPage
        )
    }

    internal fun updateRepositories(trendingRepositories: List<TrendingRepository>) {
        dbQuery.transaction {
            dbQuery.removeAllTrendingRepositories()
            trendingRepositories.forEach { repository ->
                dbQuery.insertTrendingRepository(
                    itemID = repository.itemID,
                    repositoryStars = repository.repositoryStars,
                    forksCount = repository.forksCount,
                    isItemExpanded = repository.isItemExpanded,
                    avatarURL = repository.avatarURL,
                    itemHeadingUserName = repository.itemHeadingUserName,
                    itemSubHeadingRepositoryName = repository.itemSubHeadingRepositoryName,
                    itemDescription = repository.itemDescription,
                    repositoryLanguage = repository.repositoryLanguage,
                    userURLPage = repository.userURLPage,
                    repositoryURLPage = repository.repositoryURLPage
                )
            }
        }
    }

    internal fun removeAllRepositories(){
        dbQuery.transaction {
            dbQuery.removeAllTrendingRepositories()
        }
    }
}

