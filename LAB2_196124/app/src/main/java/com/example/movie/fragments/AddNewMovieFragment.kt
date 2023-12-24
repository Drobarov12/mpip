package com.example.movie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.movie.R
import com.example.movie.models.Movie
import com.example.movie.viewModels.MovieViewModel


class AddNewMovieFragment : Fragment(R.layout.fragment_add_new_movie) {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireActivity()).get(MovieViewModel::class.java)
        val btnSubmit = view.findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val filmName = view.findViewById<EditText>(R.id.editMovieName).text.toString()
            val description = view.findViewById<EditText>(R.id.editDescription).text.toString()
            val director = view.findViewById<EditText>(R.id.editDirector).text.toString()
            val features = view.findViewById<EditText>(R.id.editFeatures).text.toString().split(",")

            val movie = Movie(viewModel.getData().size ,filmName, description, director, features)

            viewModel.addMovie(movie)

            parentFragmentManager.commit {
                replace(R.id.fragment_container_view, MovieListFragment())
                setReorderingAllowed(true)
//                addToBackStack(null)
            }
        }

    }
}