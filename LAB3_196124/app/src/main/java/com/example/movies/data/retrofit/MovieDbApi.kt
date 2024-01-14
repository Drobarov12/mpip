package com.example.movies.data.retrofit

import com.example.movies.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDbApi {
    @GET("/")
    suspend fun searchMovies(@Query("s")query: String): Response<MovieResponse>
}