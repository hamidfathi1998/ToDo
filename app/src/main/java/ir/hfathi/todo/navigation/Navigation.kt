package ir.hfathi.todo.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import ir.hfathi.todo.navigation.destinations.listComposable
import ir.hfathi.todo.navigation.destinations.splashComposable
import ir.hfathi.todo.navigation.destinations.taskComposable
import ir.hfathi.todo.ui.viewModels.SharedViewModel
import ir.hfathi.todo.utils.Constants.SPLASH_SCREEN

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navHostController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    AnimatedNavHost(
        navController = navHostController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )

        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )

        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}