package com.adrianedilao.imagecardcomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adrianedilao.imagecardcomposables.ui.theme.ImageCardComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.babaje_laying_down)
            val description = "Babaje laying down"
            val title = "Babaje is laying down"

            val painter1 = painterResource(id = R.drawable.adriane_terrorist)
            val description1 = "Adriane being a terrorist"
            val title1 = "Adriane is a terrorist"

            val painter2 = painterResource(id = R.drawable.jude_happy)
            val description2 = "Tong is happy"
            val title2 = "Tong is happy"

            val painter3 = painterResource(id = R.drawable.vince_smiling_after_eating)
            val description3 = "Happy Vince after eating ice cream"
            val title3 = "Happy Vince after eating ice cream"

            val painter4 = painterResource(id = R.drawable.xavier_on_suit)
            val description4 = "Peaky Xavier"
            val title4 = "Peaky Xavier"

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Start){

                    Box(modifier = Modifier
                        .fillMaxWidth(0.48f)
                        .padding(5.dp)) {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title)
                    }

                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        ImageCard(
                            painter = painter1,
                            contentDescription = description1,
                            title = title1)
                    }

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Start){

                    Box(modifier = Modifier
                        .fillMaxWidth(0.48f)
                        .padding(5.dp)) {
                        ImageCard(
                            painter = painter2,
                            contentDescription = description2,
                            title = title2)
                    }

                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        ImageCard(
                            painter = painter3,
                            contentDescription = description3,
                            title = title3)
                    }

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Start){

                    Box(modifier = Modifier
                        .fillMaxWidth(0.48f)
                        .padding(5.dp)) {
                        ImageCard(
                            painter = painter4,
                            contentDescription = description4,
                            title = title4)
                    }

                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                ))
            Text(
                title,
                style = TextStyle(color = Color.White, fontSize = 16.sp),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp)
            )
        }
    }
}