package com.example.a6rivertest.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestHelper {


    companion object {
        val BASE_URL = "http://worldclockapi.com"
        val restHelper = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}