package pk.com.aafaq.gitrends

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform