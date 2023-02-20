package ir.hfathi.todo.data.models

import androidx.compose.ui.graphics.Color
import ir.hfathi.todo.ui.theme.HighPriorityColor
import ir.hfathi.todo.ui.theme.LowPriorityColor
import ir.hfathi.todo.ui.theme.MediumPriorityColor
import ir.hfathi.todo.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}