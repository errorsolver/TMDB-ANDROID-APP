package com.example.moviefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviefinder.model.Movie
import com.example.moviefinder.model.MovieResponse
import com.example.moviefinder.services.MovieApiInterface
import com.example.moviefinder.services.MovieApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.moviefinder.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.rvMoviesList.layoutManager = LinearLayoutManager(this)
        binding.rvMoviesList.setHasFixedSize(true)
        getMovieData{movies:List<Movie> ->
            binding.rvMoviesList.adapter = MovieAdapter(movies)
        }
    }

    private fun getMovieData(callback: (List<Movie>) -> Unit) {
        Log.d("getMovieData: ","Going")
        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object: Callback<MovieResponse>{
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                Log.d("!response: ",response.toString())
                Log.d("!call: ",call.toString())
                Log.d("!getMovieList: ","Succeed")
                Log.d("!return callback: ",response.body()!!.movies.toString())
                return callback(response.body()!!.movies)
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.d("getMovieList: ","Failed")
            }
        })
    }
}











