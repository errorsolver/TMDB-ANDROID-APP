package com.example.moviefinder.services

import com.example.moviefinder.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("movie/popular?api_key=2687b1e38c449c31c16ae0f7f801fd75")
    fun getMovieList(): Call<MovieResponse>
}