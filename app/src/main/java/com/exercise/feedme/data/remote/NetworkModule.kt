package com.exercise.feedme.data.remote

import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
object NetworkModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideNutritionService(retrofit: Retrofit): NutritionService {
        return retrofit.create(NutritionService::class.java)
    }

    @Singleton
    @Provides
    @JvmStatic
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://api.edamam.com/api/")
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    @JvmStatic
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .addInterceptor(ApiInterceptor())
            .build()
    }

    private class ApiInterceptor : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response {
            val request = chain.request()
            val urlBuilder = request.url().newBuilder()


            val newUrl = urlBuilder
                .addQueryParameter("app_id", "eff08d01")
                .addQueryParameter("app_key", "77727a2e8b3568cd23e183a67c22a936")
                .build()

            val newRequest = request.newBuilder()
                .url(newUrl)
                .build()

            return chain.proceed(newRequest)
        }
    }
}

