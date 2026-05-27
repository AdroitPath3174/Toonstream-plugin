plugins {
    id("com.lagradost.cloudstream3.gradle") version "1.0.0"
}

cloudstream {
    language = "en"
    description = "Toonstream Plugin"
    authors = listOf("Sunil")

    status = 1
    tvTypes = listOf(
        "Anime",
        "Cartoon"
    )

    iconUrl = "https://www.google.com/favicon.ico"
}
