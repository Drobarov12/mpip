package com.example.movie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.commit
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.MovieAdapter
import com.example.movie.R
import com.example.movie.models.Movie
import com.example.movie.viewModels.MovieViewModel

class MovieListFragment : Fragment(R.layout.fragment_movie_list) {
    private lateinit var btnAddMovie: Button

    private lateinit var viewModel: MovieViewModel
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MovieViewModel::class.java)
        val recyclerView = view.findViewById<RecyclerView>(R.id.moviesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = MovieAdapter(viewModel.getData()){movie ->
            onMovieClicked(movie)
        }
        recyclerView.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner) {
            adapter.updateMovies(it)
        }

        btnAddMovie = view.findViewById(R.id.btnAddMovie)
        btnAddMovie.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_container_view, AddNewMovieFragment())
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }
    }

    private fun onMovieClicked(movie: Movie) {
        parentFragmentManager.commit {
                replace(R.id.fragment_container_view, MovieDetailsFragment(movie))
                setReorderingAllowed(true)
                addToBackStack(null)
            }
    }
}