package com.example.productcatlogsaga.presentation.productlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productcatlogsaga.data.model.Product
import com.example.productcatlogsaga.domain.repository.ProductRepository
import kotlinx.coroutines.launch
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class ProductListViewModel(
    private val repository: ProductRepository
) : ViewModel() {

    private var allProducts: List<Product> = emptyList()

    var productList by mutableStateOf<List<Product>>(emptyList())
        private set

    var searchQuery by mutableStateOf("")
        private set

    init {
        loadProducts()
    }

    private fun loadProducts() {
        viewModelScope.launch {
            allProducts = repository.getAllProducts()
            productList = allProducts
        }
    }

    fun onSearchQueryChange(query: String) {
        searchQuery = query
        productList = if (query.isBlank()) {
            allProducts
        } else {
            allProducts.filter {
                it.title.contains(query, ignoreCase = true)
            }
        }
    }
}
