package pk.com.aafaq.gitrends.domain.usecases

import org.koin.core.component.KoinComponent
import pk.com.aafaq.gitrends.data.datasource.local.cache.TrendingRepository
import pk.com.aafaq.gitrends.data.repository.DataRepositoryImp
import pk.com.aafaq.gitrends.domain.model.TrendingItem

class DataUseCases(
    private val repository: DataRepositoryImp
): KoinComponent {

    suspend fun getRepositories(forceReload: Boolean = false): List<TrendingRepository>{
        return repository.getRepositories(forceReload)
    }

    fun deleteAllTrendingItems(){
        repository.deleteAllTrendingItems()
    }
    fun updateRepositories(trendingRepositories: List<TrendingRepository>){
        repository.updateRepositories(trendingRepositories)
    }
    fun getLastSync(): Long{
        return repository.getLastSync()
    }
}