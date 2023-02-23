package com.example.mvvmcleanarchitecture.presentation.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMovieBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMovieBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)
  }
}