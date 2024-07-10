package pk.com.aafaq.gitrends.data.datasource.cache

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import pk.com.aafaq.gitrends.cache.AppDatabase
import pk.com.aafaq.gitrends.data.datasource.local.cache.DatabaseDriverFactory

class AndroidDatabaseDriverFactory(private val context: Context) : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(AppDatabase.Schema, context, "launch.db")
    }
}