package com.example.movies.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.R
import com.example.moviesapp.adapters.MovieAdapter
import com.example.moviesapp.ui.movies.MoviesViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class MovieFragment : Fragment() {

    private lateinit var moviesViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelFactory = MoviesViewModelFactory(requireContext())
        moviesViewModel = ViewModelProvider(this, viewModelFactory).get(MovieViewModel::class.java)

        var textField = view.findViewById<EditText>(R.id.editQuery)
        var searchButton = view.findViewById<Button>(R.id.search_button)
        var listOfItems = view.findViewById<RecyclerView>(R.id.list)

        var adapter : MovieAdapter = MovieAdapter()
        listOfItems.layoutManager = GridLayoutManager(context,3)
        listOfItems.adapter = adapter

        moviesViewModel.getMovieLiveData().observe(viewLifecycleOwner){
            adapter.updateMovies(it)
        }

        searchButton.setOnClickListener{
            var query = textField.text.toString()
            if(!query.isEmpty())
                moviesViewModel.search(query)
        }

        moviesViewModel.listAll()

    }
}