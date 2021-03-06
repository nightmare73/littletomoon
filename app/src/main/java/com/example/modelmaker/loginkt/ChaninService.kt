package com.example.modelmaker.loginkt

import com.example.modelmaker.loginkt.dataClasses.UserInfo
import retrofit2.Call
import retrofit2.http.*

data class SignupResponseData(var msg : String)

data class SigninResponseData(var msg : String, var email : String?, var token : String?)

data class UserInfoResponseData(var msg : String, var userInfo : UserInfo?, var flag : Boolean)

interface ChaninService {

    @FormUrlEncoded
    @POST("/LetMeNow/user/createAccount")
    fun signupRequest(@Field("mEmail") mEmail: String,
                    @Field("mPass") mPass: String,
                    @Field("mName")mName: String): Call<SignupResponseData>

    @FormUrlEncoded
    @POST("/LetMeNow/user/login")
    fun signinRequest(@Field("email") id: String,
                    @Field("password") password: String): Call<SigninResponseData>

    @FormUrlEncoded
    @POST("/LetMeNow/user/myInfo")
    fun userInfoRequest(@Field("token") token: String): Call<UserInfoResponseData>


}