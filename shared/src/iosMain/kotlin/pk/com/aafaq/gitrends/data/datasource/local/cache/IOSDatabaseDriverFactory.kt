package pk.com.aafaq.gitrends.data.datasource.local.cache

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import pk.com.aafaq.gitrends.cache.AppDatabase

class IOSDatabaseDriverFactory : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        return NativeSqliteDriver(AppDatabase.Schema, "launch.db")
    }
}