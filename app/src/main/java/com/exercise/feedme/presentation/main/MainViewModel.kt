package com.exercise.feedme.presentation.main

import android.util.Log
import androidx.lifecycle.*
import com.exercise.feedme.data.remote.model.FoodAnalysisResponse
import com.exercise.feedme.domain.nutrition.NutritionRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val nutritionRepository: NutritionRepository) :
    ViewModel() {

    private var _mutableFoodAnalyse: MutableLiveData<FoodAnalysisResponse> = MutableLiveData()

    val liveDataFoodAnalysis: LiveData<FoodAnalysisResponse> = _mutableFoodAnalyse

    fun getFoodAnalysisResponse(ingredient: String) {
        viewModelScope.launch {
            nutritionRepository.foodAnalysisFlow(ingredient).collect { it ->
                Log.d("FOOD", it.uri)
//                _mutableFoodAnalyse = MutableLiveData(it)
            }
        }
    }

    class Factory(private val nutritionRepository: NutritionRepository) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return modelClass
                .getConstructor(NutritionRepository::class.java)
                .newInstance(nutritionRepository)
        }
    }
}