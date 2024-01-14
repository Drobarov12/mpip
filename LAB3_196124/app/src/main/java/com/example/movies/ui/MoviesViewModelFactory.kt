package com.example.moviesapp.ui.movies

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movies.ui.MovieViewModel
import com.example.moviesapp.domain.movie.repository.MovieRepository
import com.example.moviesapp.domain.movie.retrofit.MovieDbApiProvider
import com.example.moviesapp.domain.movie.retrofit.RetrofitMovieDataSource

class MoviesViewModelFactory(private val context: Context): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
            var movieProvider = MovieDbApiProvider.getMovieDbApi()
            var retrofit = RetrofitMovieDataSource(movieProvider)
            var repo = MovieRepository(retrofit)
            return MovieViewModel(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}