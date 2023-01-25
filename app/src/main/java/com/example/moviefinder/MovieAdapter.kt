package com.example.moviefinder

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviefinder.databinding.MovieItemBinding
import com.example.moviefinder.model.Movie

class MovieAdapter (
    private val movies:List<Movie>
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){
        private lateinit var binding: MovieItemBinding
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"

        fun bindMovie(movie: Movie){
            binding = MovieItemBinding.bind(itemView)
//            val view = binding.root
//            setContentView(view)
            binding.movieTitle.text = movie.title
            binding.movieReleaseDate.text = movie.release
            Log.d("!bindmovietitle: ", binding.movieTitle.text.toString())
            Glide.with(itemView)
                .load(IMAGE_BASE+movie.poster)
                .into(binding.moviePoster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size
}