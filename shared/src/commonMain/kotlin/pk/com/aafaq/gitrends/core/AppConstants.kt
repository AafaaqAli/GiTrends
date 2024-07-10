package pk.com.aafaq.gitrends.core

object AppConstants {
    const val BASE_URL: String = "https://api.github.com/"
    const val RELATIVE_URL: String = "search/repositories?q=language=+sort:stars"

    /**
     * Database/Table name & Version
     * */
    const val DATABASE_NAME: String = "trending_repositories"
    const val TABLE_NAME: String = "trending_item"
    const val DATABASE_VERSION: Int = 1

    /**
     * preference keys
     */
    const val IS_APP_FIRST_RUN = "is_first_run_store_key"
    const val LAST_SYNC_DATE_TIME = "trending_repositories_last_sync_time_store_key"

    /**
     * Language File Constants
     * */
    const val LANGUAGE_COLOR_INFO_FILE_LOCATION: String = "github_language_color_code.json"

    /**
     * Sync time to see if time has been spent or not
     * */
    const val SYNC_TIME_IN_HOURS: Int = 4

    /**
     * General Messages
     * */
    const val GENERAL_ERROR: String = "Something went wrong while loading data..."
    const val GENERAL_LOADING_IN_PROGRESS: String = "Loading..."
}