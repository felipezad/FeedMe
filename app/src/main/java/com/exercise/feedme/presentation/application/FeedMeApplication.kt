package com.exercise.feedme.presentation.application

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class FeedMeApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerFeedMeApplicationComponent.factory().create(this)
    }
}