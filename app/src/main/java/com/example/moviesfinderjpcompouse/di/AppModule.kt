package com.example.moviesfinderjpcompouse.di

import com.example.moviesfinderjpcompouse.data.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


// 12. App модуль в котором создаем Retrofit
@Module
//13. @InstallIn(SingletonComponent::class) - говорит, что объект AppModule будет создат в единсвенном экземпляре
@InstallIn(SingletonComponent::class)
object AppModule {

    //14. константа с базовым Url
    const val BASE_URL = "https://api.tvmaze.com/"

    //15. Провайдер Ретрофита. Ретрофит будет возвращать ApiService
    @Provides
    @Singleton
    fun provideRetrofit() : ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
}