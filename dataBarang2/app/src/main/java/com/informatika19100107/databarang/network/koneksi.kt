package com.informatika19100107.databarang.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class koneksi {
    companion object
    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: ApiService = retrofit.create<ApiService>(ApiService::class.java)
}