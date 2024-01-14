package com.example.moviesapp.domain.movie.repository

import com.example.movies.data.RemoteDataSource
import com.example.movies.model.Movie
class MovieRepository(private val remoteMovieDataSource: RemoteDataSource) {

    suspend fun queryMovies(query: String): List<Movie> {
            return remoteMovieDataSource.search(query)
    }

    suspend fun listMovies(): List<Movie> {
        return emptyList()
    }
}