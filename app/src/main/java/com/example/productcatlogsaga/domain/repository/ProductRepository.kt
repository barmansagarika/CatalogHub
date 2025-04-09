package com.example.productcatlogsaga.domain.repository

import com.example.productcatlogsaga.data.model.Product

interface ProductRepository {
    suspend fun getAllProducts(): List<Product>
    suspend fun getProductById(id: Int): Product
}
