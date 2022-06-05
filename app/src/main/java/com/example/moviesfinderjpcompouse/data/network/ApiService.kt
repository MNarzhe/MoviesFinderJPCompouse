package com.example.moviesfinderjpcompouse.data.network

import com.example.moviesfinderjpcompouse.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    //9. после того как создали json file в пекедже models, переходим к созданию suspend функции через создание ApiInterface, которая "вернет" нам список файлов
    suspend fun getAllMovies(): Response<List<Movies>>
}