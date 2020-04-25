package com.exercise.feedme.presentation.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.exercise.feedme.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var mainViewModelFactory: MainViewModel.Factory

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, mainViewModelFactory).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
