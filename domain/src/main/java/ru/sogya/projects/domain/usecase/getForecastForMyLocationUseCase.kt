package ru.sogya.projects.domain.usecase

import ru.sogya.projects.domain.repositories.ForecastRepository

class getForecastForMyLocationUseCase(private val forecastRepository: ForecastRepository) {
    suspend operator fun invoke() = forecastRepository.getForecastForMyLocation()
}