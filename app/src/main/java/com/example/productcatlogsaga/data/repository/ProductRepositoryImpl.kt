package com.example.productcatlogsaga.data.repository

import com.example.productcatlogsaga.data.model.Product
import com.example.productcatlogsaga.data.remote.ApiService
import com.example.productcatlogsaga.domain.repository.ProductRepository

class ProductRepositoryImpl(private val apiService: ApiService) : ProductRepository {
    override suspend fun getAllProducts(): List<Product> {
        return apiService.getProducts().products
    }

    override suspend fun getProductById(id: Int): Product {
        return apiService.getProduct(id)
    }
}
