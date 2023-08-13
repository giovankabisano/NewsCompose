package com.giovanka.newscompose.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.giovanka.newscompose.screens.DashboardScreen

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.DASHBOARD
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.DASHBOARD) {
            DashboardScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val DASHBOARD = "dashboard_graph"
    const val DETAILS = "details_graph"
}