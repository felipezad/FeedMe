package com.exercise.feedme.domain.nutrition

import com.exercise.feedme.data.remote.NutritionService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object NutritionModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideNutritionRepository(nutritionService: NutritionService): NutritionRepository {
        return NutritionRepository(nutritionService)
    }
}