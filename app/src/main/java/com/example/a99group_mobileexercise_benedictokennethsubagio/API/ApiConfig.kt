package com.example.a99group_mobileexercise_benedictokennethsubagio.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseUrl = "https://ninetyninedotco-b7299.asia-southeast1.firebasedatabase.app/"
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService(): ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}