package com.example.productcatlogsaga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.productcatlogsaga.data.remote.RetrofitClient
import com.example.productcatlogsaga.data.repository.ProductRepositoryImpl
import com.example.productcatlogsaga.domain.repository.ProductRepository
import com.example.productcatlogsaga.presentation.navigation.AppNavHost
import com.example.productcatlogsaga.presentation.productdetail.ProductDetailViewModel
import com.example.productcatlogsaga.presentation.productlist.ProductListViewModel
import com.example.productcatlogsaga.ui.theme.SampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val api = RetrofitClient.apiService
        val repository: ProductRepository = ProductRepositoryImpl(api)
        val productListViewModel = ProductListViewModel(repository)

        setContent {
            SampleAppTheme {
                AppNavHost(
                    navController = rememberNavController(),
                    productListViewModel = productListViewModel,
                    provideDetailViewModel = { id ->
                        ProductDetailViewModel(repository)
                    }
                )
            }
        }
    }
}
