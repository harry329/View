package com.example.viewcompose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.viewcompose.ui.theme.ViewComposeTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import network.QuotesApi
import network.RetrofitHelper
import java.lang.reflect.Modifier
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MessagingTile("Android", this)
                }
            }
        }
    }
}

@Composable
fun MessagingTile(name: String, context: Context) {
    Row (modifier = androidx.compose.ui.Modifier.padding(20.dp)){
        Image(painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Contact profile picture",
            modifier = androidx.compose.ui.Modifier
                .size(40.dp)
                .clip(CircleShape).border(1.5.dp, MaterialTheme.colors.primary, CircleShape)

        )
        Spacer(modifier = androidx.compose.ui.Modifier.size(10.dp))
        Column {
            Text(text = "Hello Harry!",fontSize = 12.sp ,
                textAlign = TextAlign.Center, style = MaterialTheme.typography.caption)
            Text(text = "How are you doing?",fontSize = 12.sp , textAlign = TextAlign.Center)
        }

        Button(onClick = { fetchQuotesFromNetwork()}) {
            Text("Click Me to go next Screen")
        }
    }
}

fun launchActivity2(context : Context) {
    val intent = Intent(context, Activity2::class.java).apply {
        putExtra("MSG", "Val 1")
    }
    context.startActivity(intent)

}

fun fetchQuotesFromNetwork() {
    val quoteApi = RetrofitHelper.createInterface().create(QuotesApi::class.java)
    GlobalScope.launch {
        val result = quoteApi.getQuotes()
        Log.d("harry: ", result.body().toString())
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ViewComposeTheme {
//        MessagingTile("Android", this)
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreviewDarkTheme() {
//    ViewComposeTheme(darkTheme = true) {
//        MessagingTile("Android")
//    }
//}