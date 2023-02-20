package ir.hfathi.todo.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ir.hfathi.todo.R
import ir.hfathi.todo.ui.theme.EMPTY_CONTENT_ICON
import ir.hfathi.todo.ui.theme.MediumGray

@Composable
fun EmptyContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier.size(EMPTY_CONTENT_ICON),
            painter = painterResource(id = R.drawable.ic_sad_face),
            contentDescription = stringResource(
                id = R.string.sad_face
            ),
            tint = MediumGray
        )
        Text(
            text = stringResource(id = R.string.not_task_found),
            color = MediumGray,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
    }
}

@Composable
@Preview
fun EmptyContentPreview(){
    EmptyContent()
}