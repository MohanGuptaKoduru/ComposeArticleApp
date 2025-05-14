package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposearticleTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposearticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color=MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun ComposeArticle(modifier: Modifier=Modifier) {
    val image= painterResource(R.drawable.bg_compose_background)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier=Modifier
                .padding(16.dp)
        )
        Text(
            text= stringResource(R.string.second_paragraph),
            textAlign = TextAlign.Justify,
            modifier=Modifier
                .padding(start=16.dp,end=16.dp)

        )
        Text(
            text= stringResource(R.string.third_parapgraph),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all=16.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposearticleTheme {
        ComposeArticle()
    }
}