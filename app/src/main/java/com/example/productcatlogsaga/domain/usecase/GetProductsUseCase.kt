package com.example.productcatlogsaga.domain.usecase

import com.example.productcatlogsaga.domain.repository.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {
    suspend operator fun invoke() = repository.getAllProducts()
}
