package com.exercise.feedme.presentation.main

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivityComponent::class])
abstract class MainModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjector(factory: MainActivityComponent.Factory): AndroidInjector.Factory<*>?
}