package com.turtletone.innertube.pages

import com.turtletone.innertube.models.SongItem

data class PlaylistContinuationPage(
    val songs: List<SongItem>,
    val continuation: String?,
)
