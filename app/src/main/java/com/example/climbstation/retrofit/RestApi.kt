package com.example.climbstation.retrofit

import com.example.climbstation.ConnectionInfo
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {
    @Headers("Content-Type: application/json")
    @POST("login")
    fun login(@Body connectionData: ConnectionInfo): Call<ConnectionInfo>
}