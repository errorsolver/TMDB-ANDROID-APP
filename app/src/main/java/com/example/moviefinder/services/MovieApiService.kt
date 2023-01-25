package com.example.moviefinder.services

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MovieApiService {
    companion object{
        private const val BASE_URL = "https://api.themoviedb.org/3/"
        private  var retrofit : Retrofit? = null

        fun getInstance() : Retrofit{
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                Log.d("getInstance: ","Built")
            }
            Log.d("return retrofit: ", retrofit.toString())
            return retrofit!!
        }
    }
}