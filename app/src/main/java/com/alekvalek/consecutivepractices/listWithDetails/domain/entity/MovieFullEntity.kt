package com.alekvalek.consecutivepractices.listWithDetails.domain.entity

class MovieFullEntity(
    val id: String,
    val name: String,
    val alternativeName: String?,
    val type: MovieType,
    val year: String,
    val description: String?,
    val shortDescription: String?,
    val status: String?,
    val rating: MovieRating,
    val movieLength: String?,
    val totalSeriesLength: String?,
    val seriesLength: String?,
    val ratingMpaa: String?,
    val ageRating: String?,
    val posterUrl: String,
    val posterPreviewUrl: String,
    val genres: List<String>,
    val countries: List<String>,
    val releaseYears: String
) {
}


