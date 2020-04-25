package com.exercise.feedme.presentation.main

import androidx.lifecycle.ViewModelProviders
import com.exercise.feedme.domain.nutrition.NutritionRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class], includes = [MainModule::class])
abstract class ActivityMainModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjector(factory: MainActivityComponent.Factory): AndroidInjector.Factory<*>
}

@Module
object MainModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideMainViewModelFactory(nutritionRepository: NutritionRepository): MainViewModel.Factory {
        return MainViewModel.Factory(nutritionRepository)
    }

    @Provides
    @JvmStatic
    fun provideMainViewModel(
        viewModelFactory: MainViewModel.Factory,
        mainActivity: MainActivity
    ): MainViewModel {
        return ViewModelProviders.of(mainActivity, viewModelFactory)
            .get(MainViewModel::class.java)
    }
}