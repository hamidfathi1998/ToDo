package ir.hfathi.todo.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import ir.hfathi.todo.R
import ir.hfathi.todo.data.models.Priority
import ir.hfathi.todo.ui.theme.PRIORITY_DROP_DOWN_BORDER_WIDTH
import ir.hfathi.todo.ui.theme.PRIORITY_DROP_DOWN_HEIGHT
import ir.hfathi.todo.ui.theme.PRIORITY_INDICATOR_SIZE

@Composable
fun PriorityDropDown(
    priority: Priority,
    onPrioritySelected: (Priority) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val angle by animateFloatAsState(targetValue = if (expanded) 180f else 0f)

    var parentSize by remember { mutableStateOf(IntSize.Zero) }

    Row(modifier = Modifier
        .fillMaxWidth()
        .onGloballyPositioned { layoutCoordinates ->
            parentSize = layoutCoordinates.size
        }
        .background(MaterialTheme.colors.background)
        .height(PRIORITY_DROP_DOWN_HEIGHT)
        .clickable { expanded = true }
        .border(
            width = PRIORITY_DROP_DOWN_BORDER_WIDTH,
            color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
            shape = MaterialTheme.shapes.small
        ),
        verticalAlignment = Alignment.CenterVertically) {
        Canvas(
            modifier = Modifier
                .size(PRIORITY_INDICATOR_SIZE)
                .weight(1f)
        ) {
            drawCircle(color = priority.color)
        }
        Text(
            modifier = Modifier
                .weight(8f),
            text = priority.name,
            style = MaterialTheme.typography.subtitle2
        )
        IconButton(
            modifier = Modifier
                .alpha(alpha = ContentAlpha.medium)
                .rotate(degrees = angle)
                .weight(weight = 1.5f),
            onClick = { expanded = true }
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = stringResource(id = R.string.drop_down_arrow)
            )
        }
        DropdownMenu(
            modifier = Modifier.width(with(LocalDensity.current) { parentSize.width.toDp() }),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            Priority.values().slice(0..2).forEach { priority ->
                DropdownMenuItem(onClick = {
                    expanded = false
                    onPrioritySelected(priority)
                }) {
                    PriorityItem(priority = priority)
                }
            }
        }
    }
}

@Composable
@Preview
private fun PriorityDropDownPreview() {
    PriorityDropDown(priority = Priority.LOW, onPrioritySelected = {})
}