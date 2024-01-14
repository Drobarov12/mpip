package com.example.movies.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movies.model.Movie
import com.example.moviesapp.domain.movie.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel(private val movieRepository: MovieRepository): ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    fun getMovieLiveData(): LiveData<List<Movie>> = _movies

    fun search(query: String){
        viewModelScope.launch(Dispatchers.IO) {
            val movies = movieRepository.queryMovies(query)
            _movies.postValue(movies)
        }
    }

    fun listAll() {
        viewModelScope.launch(Dispatchers.IO) {
            val movies = movieRepository.listMovies()
            _movies.postValue(movies)
        }
    }
}