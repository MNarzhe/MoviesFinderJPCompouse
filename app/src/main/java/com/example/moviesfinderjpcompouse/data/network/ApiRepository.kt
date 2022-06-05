package com.example.moviesfinderjpcompouse.data.network

import javax.inject.Inject

//10. создаем ApiRepository
class ApiRepository @Inject constructor(private val apiService: ApiService) {

//11. получаем все наши фильмы
    suspend fun getAllMovies() = apiService.getAllMovies()

}