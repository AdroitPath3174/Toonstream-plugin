package com.toonstream

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class ToonStreamPlugin: Plugin() {
    override fun load(context: Context) {
        // Register the provider class created in step 3
        registerMainAPI(ToonStreamProvider())
    }
}
