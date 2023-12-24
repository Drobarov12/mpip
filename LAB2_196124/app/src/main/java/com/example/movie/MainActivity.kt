package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.movie.fragments.MovieListFragment
import com.example.movie.viewModels.MovieViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)

        if(savedInstanceState == null){
            supportFragmentManager.commit {
                replace(R.id.fragment_container_view, MovieListFragment())
                setReorderingAllowed(true)
//                addToBackStack(null)
            }
        }
    }
}