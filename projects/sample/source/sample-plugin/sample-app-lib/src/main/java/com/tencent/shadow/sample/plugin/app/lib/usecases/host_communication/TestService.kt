package com.tencent.shadow.sample.plugin.app.lib.usecases.host_communication

/**
 * SimpleDes:
 * Creator: Sindi
 * Date: 2021-06-04
 * UseDes:
 */
interface TestService {

    /*TODO比如像这个拿第三方注解，怎么拿*/
    @GET("app/auth?")
    suspend fun login(
            @Query("username") account: String,
            @Query("password") password: String,
    ): String

}