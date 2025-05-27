package com.alekvalek.consecutivepractices.listWithDetails.data.repository

import com.alekvalek.consecutivepractices.listWithDetails.data.mock.MoviesData

class MoviesRepository {
    fun getList(q: String = "") = MoviesData.moviesShort.filter { it.name.contains(q, ignoreCase = true) }

    fun getById(id: String) = MoviesData.moviesFull.find { it.id == id }
}