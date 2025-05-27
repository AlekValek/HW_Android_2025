package com.alekvalek.consecutivepractices.listWithDetails.presentation.state

import com.alekvalek.consecutivepractices.listWithDetails.domain.entity.MovieFullEntity

interface MovieDetailState {
    val movie: MovieFullEntity?
    val rating: Float
}