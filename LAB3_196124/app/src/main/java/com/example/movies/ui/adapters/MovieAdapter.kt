package com.example.moviesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.model.Movie
import com.example.moviesapp.adapters.MovieAdapter.MovieViewHolder

class MovieAdapter(private val movies: ArrayList<Movie> = ArrayList<Movie>()):RecyclerView.Adapter<MovieViewHolder>() {

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){
        private var imageView: ImageView = view.findViewById(R.id.movie_image)
        private var titleText: TextView = view.findViewById(R.id.movie_title)

        fun bind(movie: Movie){
            Glide
                .with(imageView)
                .load(movie.Poster)
                .centerCrop()
                .placeholder(R.drawable.baseline_movie_24)
                .error(R.drawable.baseline_error_24)
                .into(imageView)

            titleText.text = movie.Title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
       return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    fun updateMovies(newMovies: List<Movie>){
        movies.clear()
        movies.addAll(newMovies)
        notifyDataSetChanged()
    }

}