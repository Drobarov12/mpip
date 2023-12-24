package com.example.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.models.Movie

class MovieAdapter(private val movies: MutableList<Movie>, private val clickListener: (Movie) -> Unit) : RecyclerView.Adapter<MovieAdapter.FilmViewHolder>() {

    private var _movies: MutableList<Movie> = movies
    class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idTextView: TextView = view.findViewById(R.id.idTextView)
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val directorTextView: TextView = view.findViewById(R.id.directorTextView)
    }

    fun updateMovies(newFilms: MutableList<Movie>) {
        _movies = newFilms
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val movie = _movies[position]
        holder.idTextView.text = movie.id.toString()
        holder.nameTextView.text = movie.name
        holder.directorTextView.text = movie.director
        holder.itemView.setOnClickListener { clickListener(movie) }
    }

    override fun getItemCount() = movies.size
}
