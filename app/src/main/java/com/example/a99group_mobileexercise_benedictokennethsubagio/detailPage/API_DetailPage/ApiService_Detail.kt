package com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.API_DetailPage

import com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.ResponseDetailPage
import retrofit2.Call
import retrofit2.http.GET

interface ApiService_Detail {
    @GET("0.json")
    fun getDetail(): Call<ResponseDetailPage>
}