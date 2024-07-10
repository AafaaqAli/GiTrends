package pk.com.aafaq.gitrends.core.utils

import kotlinx.datetime.Clock

object AppUtils {
    const val SHOULD_SYNC_IN = 3600000 * 3 // 3 hours

    fun needRefresh(lastSync: Long): Boolean {
        val currentTime = Clock.System.now().epochSeconds

        val elapsedTime = currentTime - lastSync
        return elapsedTime > SHOULD_SYNC_IN
    }
}