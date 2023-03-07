package com.example.composebasics

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeBasicAppWithImage(stringResource(R.string.tutorial_text), stringResource(R.string.paragraph_i), stringResource(R.string.paragraph_ii))
                }
            }
        }
    }
}

@Composable
fun ComposeBasicAppWithImage (tutorial: String, paragraphI: String, paragraphII: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    // Creating column so that text doesn't overlap
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
            ){
    Text(
        text = tutorial,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 117.dp)
    )
        Text(
            text = paragraphI,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp)
        )
        Text(
            text = paragraphII,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeBasicApp() {
    ComposeBasicsTheme {
        ComposeBasicAppWithImage(stringResource(R.string.tutorial_text), stringResource(R.string.paragraph_i), stringResource(R.string.paragraph_ii))
    }
}