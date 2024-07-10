package pk.com.aafaq.gitrends.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import pk.com.aafaq.gitrends.android.presentation.styling.AppTheme
import pk.com.aafaq.gitrends.data.datasource.remote.TrendingApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //HomeScreen(this)

                    GetDataButton(this)
                }
            }
        }
    }
}

@Composable
fun GetDataButton(mainActivity: MainActivity) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp, vertical = 8.dp)
    ) {
        Button(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .align(Alignment.BottomCenter),
            onClick = {
                mainActivity.lifecycleScope.launch {
                    val job = async {

                    }.await()


                   /* Toast.makeText(
                        mainActivity,
                        "Total: ${job.items.size} fetched.",
                        Toast.LENGTH_LONG
                    ).show()*/
                }
            }) {
            Text(text = "Test API")
        }
    }
}
