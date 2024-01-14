package com.example.movies.model

import com.google.gson.annotations.SerializedName

data class Movie(@SerializedName("Title"  ) var Title  : String? = null,
                 @SerializedName("Year"   ) var Year   : String? = null,
                 @SerializedName("imdbID" ) var imdbID : String? = null,
                 @SerializedName("Type"   ) var Type   : String? = null,
                 @SerializedName("Poster" ) var Poster : String? = null
)
