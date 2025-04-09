package com.example.productcatlogsaga.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.productcatlogsaga.presentation.productlist.ProductListScreen
import com.example.productcatlogsaga.presentation.productlist.ProductListViewModel
import com.example.productcatlogsaga.presentation.productdetail.ProductDetailScreen
import com.example.productcatlogsaga.presentation.productdetail.ProductDetailViewModel
import androidx.compose.runtime.remember


@Composable
fun AppNavHost(
    navController: NavHostController,
    productListViewModel: ProductListViewModel,
    provideDetailViewModel: (Int) -> ProductDetailViewModel
) {
    NavHost(navController = navController, startDestination = "productList") {
        composable("productList") {
            ProductListScreen(
                viewModel = productListViewModel,
                onProductClick = { productId ->
                    navController.navigate("productDetail/$productId")
                }
            )
        }

        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toInt() ?: 0
            val detailViewModel = remember(productId) {
                provideDetailViewModel(productId)
            }
            ProductDetailScreen(
                viewModel = detailViewModel,
                productId = productId
            )
        }
    }
}
