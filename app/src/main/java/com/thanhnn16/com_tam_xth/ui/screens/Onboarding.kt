package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//import com.google.accompanist.pager.ExperimentalPagerApi
//import com.google.accompanist.pager.HorizontalPager
//import com.google.accompanist.pager.rememberPagerState
import com.thanhnn16.com_tam_xth.R

@OptIn( ExperimentalFoundationApi::class)
@Composable
fun Onboarding(navController: NavController) {

    val roboto_regula = FontFamily(
        Font(R.font.roboto_regula)
    )

    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#FFFFFF")))) {
            append("Welcome to ")
        }
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#FF7400")))) {
            append("Orangic")
        }
    }

    val pagerState = rememberPagerState(pageCount = { 3 })
    val imageIds = listOf(R.drawable.walk1, R.drawable.walk2, R.drawable.walk3, R.drawable.walk4)
    var textId1s by remember { mutableStateOf("Text 1") }
    var textId1Small by remember { mutableStateOf("Small Text 1") }

    LaunchedEffect(pagerState.currentPage) {
        when (pagerState.currentPage) {
            0 -> {
                textId1s = "Easy to Order"
                textId1Small = "Experience seamless convenience with our fast and user-friendly food delivery app, making ordering your favorite meals a breeze!"
            }
            1 -> {
                textId1s = "Has the most delicious food"
                textId1Small = "Enjoy dishes expertly prepared by experienced chefs for a wonderful dining experience!"
            }
            2 -> {
                textId1s = "Schedule your own meals"
                textId1Small = "Take charge of your health with scheduled, nutritious meals tailored just for you."
            }
            3 -> {
                textId1s = "What are you waiting for ?"
                textId1Small = "Explore a world of culinary delights – place your order now and discover a variety of tempting dishes waiting just for you!"
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(90.dp)
                    .width(177.dp),
contentAlignment = Alignment.Center

            ) {
                Text(
                    text = text,
                    fontSize = 36.sp,
                    fontFamily = roboto_regula,
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
            }
            Box(
                modifier = Modifier
//                    .padding(20.dp)
                    .height(35.dp)
                    .width(224.dp),
            ) {
                Text(
                    text = "Your favourite foods delivered fast at your door.",
                    fontSize = 14.sp,
                    fontFamily = roboto_regula,
                    textAlign = TextAlign.Start,
                    color = Color(android.graphics.Color.parseColor("#C0C0C0"))
                )

            }
        }



        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .width(312.dp)
                .height(450.dp)
        ) { page ->
            Image(
                painter = painterResource(id = imageIds[page]),
                contentDescription = "Image $page",
                contentScale = ContentScale.Fit
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = textId1s,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = textId1Small,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            repeat(imageIds.size) { page ->
                val color = if (pagerState.currentPage == page) Color(android.graphics.Color.parseColor("#FF7400")) else Color(android.graphics.Color.parseColor("#979797"))
                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .padding(bottom = 20.dp)
                        .size(width = 8.dp, height = 5.dp)
                        .background(color, shape = RoundedCornerShape(50)) // Adjusted shape
                )
            }
        }

        Button(
            onClick = { navController.navigate("EnterMail") },
            modifier = Modifier
                .width(312.dp)
                .padding(bottom = 20.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#FF7400"))
            )
        ) {
            Text(
                text = "Get Started",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun WalkActivityPreview() {
    Onboarding(navController = rememberNavController())
}
