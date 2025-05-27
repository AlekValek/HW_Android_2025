package com.alekvalek.consecutivepractices.listWithDetails.domain.entity

import androidx.annotation.StringRes
import com.alekvalek.consecutivepractices.R
class MovieShortEntity (
    val id: String,
    val name: String,
    val year: String,
    val type: MovieType,
    val rating: MovieRating,
    val posterPreviewUrl: String
)

enum class MovieType(@StringRes val stringRes: Int) {
    MOVIE(R.string.movie),
    TV_SERIES(R.string.tv_series),
    ANIME(R.string.anime)
}
