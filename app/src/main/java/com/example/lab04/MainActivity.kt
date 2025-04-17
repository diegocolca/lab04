package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {


            }
        }
    }
}

@Composable
fun LazyColumnEjem() {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        items(10){ index ->
            Text(
                text = "Item $index",
                fontSize =20.sp,
                color = Color.Blue,
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(8.dp)

                )
        }

    }

}

@Composable
fun LazyRowEjem() {
    LazyRow (
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items( 10){ index ->
            Text(text = "Item $index")

        }
    }
}
@Composable
fun GridEjem(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        items(10){ index ->
            Box(
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(16.dp)
            ){
                Text(
                    text = "Item $index",
                    fontSize = 18.sp,
                    color = Color.White
                    )

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Lab04Theme {
        LazyColumnEjem()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        LazyRowEjem()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Lab04Theme {
        GridEjem()
    }
}
