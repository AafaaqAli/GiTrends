package pk.com.aafaq.gitrends.di

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module
import pk.com.aafaq.gitrends.data.datasource.local.cache.IOSDatabaseDriverFactory
import pk.com.aafaq.gitrends.data.datasource.remote.TrendingApi
import pk.com.aafaq.gitrends.data.repository.DataRepositoryImp
import pk.com.aafaq.gitrends.domain.model.TrendingItem
import pk.com.aafaq.gitrends.domain.usecases.DataUseCases

class KoinHelper : KoinComponent {
    private val useCases: DataUseCases by inject<DataUseCases>()

    fun initKoin() {
        startKoin {
            modules(module {
                single<TrendingApi> { TrendingApi() }
                single<IOSDatabaseDriverFactory> { IOSDatabaseDriverFactory() }
                single<DataRepositoryImp> {
                    DataRepositoryImp(databaseDriverFactory = get(), api = get())
                }

                single<DataUseCases> {
                    DataUseCases(repository = get())
                }
            })
        }
    }


    suspend fun getTrendingRepositories(forceReload: Boolean): List<TrendingItem> {
        return useCases.getRepositories(forceReload)
    }
}
