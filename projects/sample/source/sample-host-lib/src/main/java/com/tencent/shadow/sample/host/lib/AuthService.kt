package com.tencent.shadow.sample.host.lib

import retrofit2.http.GET
import retrofit2.http.Query



interface AuthService {
    @GET("app/auth?")
    suspend fun login(
        @Query("username") account: String,
        @Query("password") password: String,
    ): String
}