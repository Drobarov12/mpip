package com.example.movie.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.movie.R
import com.example.movie.models.Movie


class MovieDetailsFragment(movie: Movie) : Fragment(R.layout.fragment_movie_details) {
    private var movie: Movie = movie
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvDirector: TextView
    private lateinit var tvListOfFeatures: TextView
//    private var _binding =
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvName = view.findViewById(R.id.tvName)
        tvDescription = view.findViewById(R.id.tvDescription)
        tvDirector = view.findViewById(R.id.tvDirector)
        tvListOfFeatures = view.findViewById(R.id.tvFeatures)

        tvName.text = movie.name
        tvDescription.text = movie.description
        tvDirector.text = movie.director
//        private val features: String
//
        movie.listOfFeatures.forEach{feature ->
            tvListOfFeatures.append(feature)
            tvListOfFeatures.append("\n")
        }
    }


}