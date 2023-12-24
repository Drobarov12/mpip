package com.example.movie.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movie.models.Movie
import com.example.movie.models.getAll

class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<MutableList<Movie>>()
    val movies: LiveData<MutableList<Movie>> = _movies
    private var data: MutableList<Movie> = getAll() as MutableList<Movie>

    fun getData() = data

    fun setData(movies :MutableList<Movie>){
        data = movies
    }

    fun addMovie(movie: Movie){
        data.add(movie)
        _movies.value = data
    }
}