package com.mirego.csmapapplication.service

import com.mirego.csmapapplication.model.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("mapping.json")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>
}