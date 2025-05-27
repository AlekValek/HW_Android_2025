package com.alekvalek.consecutivepractices.di

import com.alekvalek.consecutivepractices.listWithDetails.data.repository.MoviesRepository
import com.alekvalek.consecutivepractices.listWithDetails.presentation.viewModel.DetailsViewModel
import com.alekvalek.consecutivepractices.listWithDetails.presentation.viewModel.ListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val rootModule = module {
    single<MoviesRepository> { MoviesRepository() }

    viewModel { ListViewModel(get(), it.get()) }
    viewModel { DetailsViewModel(get(), it.get(), it.get()) }
}