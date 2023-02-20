package ir.hfathi.todo.navigation

import androidx.navigation.NavHostController
import ir.hfathi.todo.utils.Action
import ir.hfathi.todo.utils.Constants.LIST_SCREEN
import ir.hfathi.todo.utils.Constants.SPLASH_SCREEN

class Screens(navHostController: NavHostController) {
    val splash: () -> Unit = {
        navHostController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navHostController.navigate(route = "task/$taskId")
    }

    val task: (Action) -> Unit = { action ->
        navHostController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}