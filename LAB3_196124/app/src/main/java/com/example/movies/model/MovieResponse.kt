package com.example.movies.model

import com.google.gson.annotations.SerializedName

data class MovieResponse( @SerializedName("Search"       ) var Search       : ArrayList<Movie> = arrayListOf(),
                          @SerializedName("totalResults" ) var totalResults : String?           = null,
                          @SerializedName("Response"     ) var Response     : String?           = null)
