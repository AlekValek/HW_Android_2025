package com.alekvalek.consecutivepractices.listWithDetails.presentation.state

import com.alekvalek.consecutivepractices.listWithDetails.domain.entity.MovieShortEntity

interface MoviesListState {
    val items: List<MovieShortEntity>
    val query: String
    val isEmpty: Boolean
}