package com.exercise.feedme.presentation.application

import android.content.Context
import com.exercise.feedme.data.remote.NetworkModule
import com.exercise.feedme.domain.nutrition.NutritionModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, NutritionModule::class])
interface FeedMeApplicationComponent : AndroidInjector<FeedMeApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): FeedMeApplicationComponent
    }

    override fun inject(instance: FeedMeApplication?)
}