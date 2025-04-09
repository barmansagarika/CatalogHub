package com.example.productcatlogsaga.presentation.productdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productcatlogsaga.data.model.Product
import com.example.productcatlogsaga.domain.repository.ProductRepository
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ProductDetailViewModel(
    private val repository: ProductRepository
) : ViewModel() {

    var product by mutableStateOf<Product?>(null)
        private set

    fun loadProduct(id: Int) {
        viewModelScope.launch {
            product = repository.getProductById(id)
        }
    }
}
