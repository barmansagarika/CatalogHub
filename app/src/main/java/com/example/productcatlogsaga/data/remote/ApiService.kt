package com.example.productcatlogsaga.data.remote

import com.example.productcatlogsaga.data.model.Product
import com.example.productcatlogsaga.data.model.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("products")
    suspend fun getProducts(): ProductResponse

    @GET("products/{id}")
    suspend fun getProduct(@Path("id") id: Int): Product
}
