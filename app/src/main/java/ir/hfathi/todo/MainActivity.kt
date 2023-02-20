package ir.hfathi.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint
import ir.hfathi.todo.navigation.SetupNavigation
import ir.hfathi.todo.ui.theme.MyApplicationTheme
import ir.hfathi.todo.ui.viewModels.SharedViewModel


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                navHostController = rememberAnimatedNavController()
                SetupNavigation(
                    navHostController = navHostController,
                    sharedViewModel = sharedViewModel
                )
            }
        }
    }
}