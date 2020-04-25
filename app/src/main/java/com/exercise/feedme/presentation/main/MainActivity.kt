package com.exercise.feedme.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.exercise.feedme.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel.liveDataFoodAnalysis.observe(this, Observer { food ->
            Log.d("Food answer", food.uri)
        })
        mainViewModel.getFoodAnalysisResponse("egg")
    }
}
