package com.example.moviesapp.domain.movie.retrofit

import com.example.movies.data.RemoteDataSource
import com.example.movies.data.retrofit.MovieDbApi
import com.example.movies.model.Movie

class RetrofitMovieDataSource(private val movieDbApi: MovieDbApi): RemoteDataSource {
    override suspend fun search(query: String): List<Movie> {
        val movieResponse = movieDbApi.searchMovies(query)
        val responseBody = movieResponse.body()
        if(movieResponse.isSuccessful && responseBody != null) {
           return responseBody.Search
        }
        throw Exception("Error searching movies")
    }
}