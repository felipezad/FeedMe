package com.exercise.feedme.presentation.main

import android.os.Bundle
import com.exercise.feedme.R
import dagger.android.DaggerActivity

class MainActivity : DaggerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
