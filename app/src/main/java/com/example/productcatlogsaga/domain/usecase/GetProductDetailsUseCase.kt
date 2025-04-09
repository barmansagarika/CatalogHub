package com.example.productcatlogsaga.domain.usecase

import com.example.productcatlogsaga.domain.repository.ProductRepository

class GetProductDetailsUseCase(private val repository: ProductRepository) {
    suspend operator fun invoke(id: Int) = repository.getProductById(id)
}
