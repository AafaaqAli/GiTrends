package pk.com.aafaq.gitrends.data.repository
import pk.com.aafaq.gitrends.core.utils.AppUtils
import pk.com.aafaq.gitrends.data.datasource.local.Database
import pk.com.aafaq.gitrends.data.datasource.local.cache.DatabaseDriverFactory
import pk.com.aafaq.gitrends.data.datasource.local.cache.TrendingRepository
import pk.com.aafaq.gitrends.data.datasource.remote.TrendingApi
import pk.com.aafaq.gitrends.domain.model.TrendingItem
import pk.com.aafaq.gitrends.domain.repository.DataRepository

class DataRepositoryImp(
    val databaseDriverFactory: DatabaseDriverFactory,
    val api: TrendingApi
): DataRepository{
    private val database = Database(databaseDriverFactory)

    override suspend fun getRepositories(forceReload: Boolean): List<TrendingRepository> {
        val needRefresh = AppUtils.needRefresh(getLastSync())

        val repositories = if(forceReload || needRefresh){
            api.getAllTrendingRepositories()
        }else{
           database.getAllTrendingRepositories()
        }


        return repositories
    }

    override fun deleteAllTrendingItems() {
        database.removeAllRepositories()
    }

    override fun updateRepositories(trendingRepositories: List<TrendingRepository>) {
        database.updateRepositories(trendingRepositories)
    }

    override fun getLastSync(): Long {
        return 234
    }
}