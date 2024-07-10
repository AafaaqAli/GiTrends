package pk.com.aafaq.gitrends.android.presentation.home

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.style.LineHeightStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    context: Context

) {
    val appName: String = context.applicationInfo.name ?: "GitTrend"
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.wrapContentSize(),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(appName)
                },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Red)
        ){

            Text(
                text = "Hello world",
                color = Color.White
            )
        }
    }
}
