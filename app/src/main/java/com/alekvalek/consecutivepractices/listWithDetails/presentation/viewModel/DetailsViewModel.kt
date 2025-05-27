package com.alekvalek.consecutivepractices.listWithDetails.presentation.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.github.terrakok.modo.stack.StackNavContainer
import com.github.terrakok.modo.stack.back
import com.alekvalek.consecutivepractices.listWithDetails.data.repository.MoviesRepository
import com.alekvalek.consecutivepractices.listWithDetails.domain.entity.MovieFullEntity
import com.alekvalek.consecutivepractices.listWithDetails.presentation.state.MovieDetailState

class DetailsViewModel(
    private val repository: MoviesRepository,
    private val navigation: StackNavContainer,
    private val id: String
) : ViewModel() {

    private val mutableState = MutableDetailsState()
    val viewState = mutableState as MovieDetailState

    init {
        mutableState.movie = repository.getById(id)
    }

    fun back() {
        navigation.back()
    }

    private class MutableDetailsState : MovieDetailState {
        override var movie: MovieFullEntity? by mutableStateOf(null)
        override var rating: Float by mutableFloatStateOf(0f)
    }
}