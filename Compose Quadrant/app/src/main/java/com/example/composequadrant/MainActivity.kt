package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp(stringResource(R.string.Title1), stringResource(R.string.TextComposable), stringResource(R.string.Title2),
                        stringResource(R.string.ImageComposable), stringResource(R.string.Title3),
                        stringResource(R.string.RowComposable), stringResource(R.string.Title4),
                        stringResource(R.string.ColumnComposable))
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp(Title1: String, TextComposable: String, Title2: String, ImageComposable: String, Title3: String, RowComposable: String,
                       Title4: String, ColumnComposable: String, modifier: Modifier = Modifier) {
    Box (
        modifier = Modifier.fillMaxSize()
            ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = Title1)
            Text(
                text = TextComposable)
            Text(
                text = Title2)
            Text(
                text = ImageComposable)
            Text(
                text = Title3)
            Text(
                text = RowComposable)
            Text(
                text = Title4)
            Text(
                text = ColumnComposable
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp(stringResource(R.string.Title1), stringResource(R.string.TextComposable), stringResource(R.string.Title2),
            stringResource(R.string.ImageComposable), stringResource(R.string.Title3),
            stringResource(R.string.RowComposable), stringResource(R.string.Title4),
            stringResource(R.string.ColumnComposable))
    }
}