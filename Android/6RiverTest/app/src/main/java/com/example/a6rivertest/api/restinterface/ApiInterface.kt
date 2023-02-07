package com.example.a6rivertest.api.restinterface

import com.example.a6rivertest.TimeModelResponse
import retrofit2.http.GET

interface ApiInterface {

    @GET("/api/json/utc/now")
    suspend fun getTimeZone() : TimeModelResponse
}