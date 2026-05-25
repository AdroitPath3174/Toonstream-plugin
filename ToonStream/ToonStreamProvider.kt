package com.toonstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.SubtitleFile

class ToonStreamProvider : MainAPI() {

    override var mainUrl = "https://toonstream.vip"

    override var name = "ToonStream"

    override val hasMainPage = true

    override var lang = "en"

    override val supportedTypes = setOf(
        TvType.Anime
    )

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse {
        return newAnimeLoadResponse(
            "ToonStream",
            url,
            TvType.Anime
        ) {
            plot = "ToonStream Extension"
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return false
    }
}
