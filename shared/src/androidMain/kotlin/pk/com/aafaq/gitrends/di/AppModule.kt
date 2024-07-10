package pk.com.aafaq.gitrends.di

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import pk.com.aafaq.gitrends.data.datasource.cache.AndroidDatabaseDriverFactory
import pk.com.aafaq.gitrends.data.datasource.remote.TrendingApi
import pk.com.aafaq.gitrends.data.repository.DataRepositoryImp
import pk.com.aafaq.gitrends.domain.usecases.DataUseCases

val appModule = module {
    single<TrendingApi> { TrendingApi() }
    single<AndroidDatabaseDriverFactory> { AndroidDatabaseDriverFactory(androidContext()) }
    single<DataRepositoryImp> {
        DataRepositoryImp(databaseDriverFactory = get(), api = get())
    }

    single<DataUseCases> {
        DataUseCases(repository = get())
    }
}