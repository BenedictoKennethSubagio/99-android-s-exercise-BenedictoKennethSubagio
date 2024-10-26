package com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.API_DetailPage

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig_Detail {
    const val baseUrl = "https://ninetyninedotco-b7299.asia-southeast1.firebasedatabase.app/details/"
    fun getRetrofit(): Retrofit{
        return  Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    fun getService(): ApiService_Detail{
        return getRetrofit().create(ApiService_Detail::class.java)
    }

}