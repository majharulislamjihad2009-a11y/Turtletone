package com.turtletone.innertube.pages

import com.turtletone.innertube.models.YTItem

data class LibraryContinuationPage(
    val items: List<YTItem>,
    val continuation: String?,
)
