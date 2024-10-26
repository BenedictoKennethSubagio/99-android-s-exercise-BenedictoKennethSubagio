package com.example.a99group_mobileexercise_benedictokennethsubagio.API

//import com.example.a99group_mobileexercise_benedictokennethsubagio.Response99Group
import com.example.a99group_mobileexercise_benedictokennethsubagio.Response99GroupItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("listings.json")
    fun getApart(): Call<List<Response99GroupItem>>
}