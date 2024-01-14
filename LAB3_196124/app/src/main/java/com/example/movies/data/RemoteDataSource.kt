package com.example.movies.data

import com.example.movies.model.Movie

interface RemoteDataSource {
    suspend fun search(query: String): List<Movie>
}