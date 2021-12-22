package com.informatika19100107.databarang.network

import retrofit2.Retrofit

interface ApiService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
}