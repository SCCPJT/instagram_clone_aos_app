package com.cookandroid.instagramclone

import android.graphics.Bitmap
import retrofit2.Call
import retrofit2.http.*

interface ProfileController{
    @Headers("accpet: text/plain",
        "content-type: application/json")
    @GET("/member/posts")
    fun getUserPosts(
        @Query("lastPostId") lastPostId: Long
    ): Call<ArrayList<UserPostData>>


    @Headers("accpet: text/plain",
        "content-type: application/json")
    @GET("/members/{displayId}/posts")
    fun getUserPosts(
        @Path("displayId") displayId: String,
        @Query("lastPostId") lastPostId: Long
    ): Call<ArrayList<UserPostData>>

    @Headers("accpet: text/plain",
        "content-type: application/json")
    @GET("/members/{displayId}")
    fun getUserProfile(
        @Path("displayId") displayId: String
    ): Call<ProfileResponse>
}

