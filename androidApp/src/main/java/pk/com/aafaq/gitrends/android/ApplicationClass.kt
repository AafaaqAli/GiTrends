package pk.com.aafaq.gitrends.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pk.com.aafaq.gitrends.di.appModule

class ApplicationClass: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ApplicationClass)
            modules(appModule)
        }
    }
}