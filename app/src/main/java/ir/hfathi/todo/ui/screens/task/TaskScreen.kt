package ir.hfathi.todo.ui.screens.task

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import ir.hfathi.todo.data.models.Priority
import ir.hfathi.todo.data.models.ToDoTask
import ir.hfathi.todo.ui.viewModels.SharedViewModel
import ir.hfathi.todo.utils.Action

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit,
    sharedViewModel: SharedViewModel,
    selectedTask: ToDoTask?
) {
    val title: String = sharedViewModel.title
    val description: String = sharedViewModel.description
    val priority: Priority = sharedViewModel.priority
    val context = LocalContext.current

    BackHandler {
        navigateToListScreen(Action.NO_ACTION)
    }

    Scaffold(
        topBar = {
            TaskAppBar(
                navigateToListScreen = { action ->
                    if (action == Action.NO_ACTION) {
                        navigateToListScreen(action)
                    } else {
                        if (sharedViewModel.validateFields()) {
                            navigateToListScreen(action)
                        } else {
                            displayToast(context = context)
                        }
                    }
                },
                selectedTask = selectedTask
            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = { title ->
                    sharedViewModel.updateTitle(newTitle = title)
                },
                description = description,
                onDescriptionChange = { description ->
                    sharedViewModel.updateDescription(newDescription = description)
                },
                priority = priority,
                onPrioritySelected = { priority ->
                    sharedViewModel.updatePriority(newPriority = priority)
                }
            )
        }
    )
}

fun displayToast(context: Context) {
//    stringResource(id = R.string.fields_empty)
    Toast.makeText(context, "Fields Empty.", Toast.LENGTH_SHORT).show()
}
