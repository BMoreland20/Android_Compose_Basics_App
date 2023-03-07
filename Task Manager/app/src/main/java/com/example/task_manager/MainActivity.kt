package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task_manager.ui.theme.Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_ManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManagerAppWithImage(stringResource(R.string.all_comp), stringResource(R.string.nice_work))
                }
            }
        }
    }
}

@Composable
fun TaskManagerAppWithImage(all_comp: String, nice_work: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    // Creating column so that text doesn't overlap
    Box (
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = all_comp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = nice_work,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun TaskManagerApp() {
    Task_ManagerTheme {
        TaskManagerAppWithImage(stringResource(R.string.all_comp), stringResource(R.string.nice_work))
    }
}