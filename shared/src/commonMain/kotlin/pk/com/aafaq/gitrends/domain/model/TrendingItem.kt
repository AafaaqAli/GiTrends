package pk.com.aafaq.gitrends.domain.model

data class TrendingItem(
    val itemID: Long,
    val repositoryStars: Long,
    val forksCount: Long,

    val isItemExpanded: Boolean,
    val avatarURL: String,
    val itemHeadingUserName: String,
    val itemSubHeadingRepositoryName: String,
    val itemDescription: String,
    val repositoryLanguage: String,

    /**
     * Extras: maybe used in future implementations i.e open user/repository profile
     * */
    val userURLPage: String,
    val repositoryURLPage: String
)
