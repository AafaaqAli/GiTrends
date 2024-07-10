package pk.com.aafaq.gitrends.domain.repository

import pk.com.aafaq.gitrends.data.datasource.local.cache.TrendingRepository

interface DataRepository {
    suspend fun getRepositories(forceReload: Boolean = false): List<TrendingRepository>
    fun deleteAllTrendingItems()
    fun updateRepositories(trendingRepositories: List<TrendingRepository>)
    fun getLastSync(): Long
}