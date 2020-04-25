package com.exercise.feedme.presentation.main

import androidx.lifecycle.*
import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import com.exercise.feedme.domain.NutritionRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val nutritionRepository: NutritionRepository) :
    ViewModel() {

    private var _mutableFoodAnalyse: MutableLiveData<FoodAnalysisResponse> = MutableLiveData()

    val liveDataFoodAnalysis: LiveData<FoodAnalysisResponse> = _mutableFoodAnalyse

    fun getFoodAnalysisResponse(food: String) {
        viewModelScope.launch {
            nutritionRepository.foodAnalysisFlow(food).collect { foodAnalysisResponse ->
                _mutableFoodAnalyse = MutableLiveData(foodAnalysisResponse)
            }
        }
    }

    class Factory(private val nutritionRepository: NutritionRepository) : ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return modelClass
                .getConstructor(NutritionRepository::class.java)
                .newInstance(nutritionRepository)
        }
    }
}