package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.thanhnn16.com_tam_xth.R
import com.thanhnn16.com_tam_xth.ui.theme.Pink40
import com.thanhnn16.com_tam_xth.ui.theme.backRound
import com.thanhnn16.com_tam_xth.ui.theme.greenColor
import com.thanhnn16.com_tam_xth.ui.theme.greenLightColor
import kotlinx.coroutines.launch


data class Product(
    val name: String,
    val imageResId: Int, // Change this to store the drawable ID
    val rate: Float,
    val vote: Int,
)

val otherFruitsList = listOf(
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$20.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$30.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$40.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$50.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$60.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$70.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$80.00"),
    OtherFruit("Salmon Salad", R.drawable.imgmiy, "$90.00"),
)

data class OtherFruit(val name: String, val image: Int, val price: String)

val products = listOf(
    Product(
        "Product 1", R.drawable.pizza, // Use the drawable ID directly
        4.5f, 100
    ),
    Product(
        "Product 2", R.drawable.pizza, // Use the drawable ID directly
        1.5f, 150
    ),
    Product(
        "Product 3", R.drawable.pizza, // Use the drawable ID directly
        2.5f, 250
    ),
    Product(
        "Product 4", R.drawable.pizza, // Use the drawable ID directly
        3.5f, 80
    ),
    Product(
        "Product 5", R.drawable.pizza, // Use the drawable ID directly
        3.0f, 160
    ),
    Product(
        "Product 6", R.drawable.pizza, // Use the drawable ID directly
        2.5f, 130
    ),
    Product(
        "Product 1", R.drawable.pizza, // Use the drawable ID directly
        1.5f, 50
    ),
    Product(
        "Product 7", R.drawable.pizza, // Use the drawable ID directly
        3.5f, 200
    ),

    // Repeat for other products...
)

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun Favorite() {
    val pagerState = com.google.accompanist.pager.rememberPagerState(pageCount = 3)
    Column(modifier = Modifier.background(Color.White)) {
        TopAppBar(backgroundColor = greenColor) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Your Favorite",
                    style = TextStyle(color = Color(0xFFFF7400)),
                    fontWeight = FontWeight.Bold,
                    fontSize = TextUnit(18F, TextUnitType.Sp),
                    modifier = Modifier.padding(all = Dp(5F)),
                    textAlign = TextAlign.Center
                )
            }
        }
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)
    }
}

@Composable
fun RenderProductItem(product: Product) {
    val painter = rememberAsyncImagePainter(model = product.imageResId) // Use the drawable ID here
    val isHeartFilled = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(greenLightColor)
            .border(
                border = BorderStroke(0.dp, color = Color.Black), shape = RoundedCornerShape(15.dp)
            )
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(145.dp)
                    .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                    .background(Pink40) // Move this line here
                    .border(BorderStroke(0.dp, Color.White), RoundedCornerShape(16.dp))
                    .paint(
                        painter = painter, contentScale = ContentScale.Crop
                    ),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 12.dp)
                        .align(Alignment.TopEnd),
                    verticalAlignment = Alignment.Top,
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 10.dp, horizontal = 12.dp),
                        horizontalArrangement = Arrangement.End,
                    ) {
                        Row(
                            modifier = Modifier
                                .size(30.dp)
                                .background(Color.White, shape = RoundedCornerShape(14.dp)),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = if (isHeartFilled.value) R.drawable.heart_line else R.drawable.heart_or),
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                                    .clickable {
                                        isHeartFilled.value = !isHeartFilled.value
                                    }, // Add this line to handle click event
                                contentDescription = ""
                            )
                        }
                    }
                }

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "Chicken Hawaiian",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 12.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Ut enim ad minim veniam, quis nostrud ",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 12.dp, end = 20.dp, top = 0.dp),
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp, top = 20.dp, bottom = 0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp)
            ) {
                Row(
                    modifier = Modifier.background(Color.White, shape = RoundedCornerShape(16.dp)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "4.5",
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        modifier = Modifier.padding(7.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(width = 13.dp, height = 9.dp)
                            .padding(top = 0.dp, end = 0.dp)
                    )
                    Text(
                        text = "25+",
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        modifier = Modifier.padding(7.dp)
                    )
                }
            }

        }
    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun Tabs(pagerState: com.google.accompanist.pager.PagerState) {
    val list = listOf(
        "Restaurants" to Pair(
            R.drawable.uni_1, R.drawable.union
        ), // Replace with your image resources
        "Dishes" to Pair(
            R.drawable.uni, R.drawable.uni_2
        ), // Replace with your image resources
    )
    val scope = rememberCoroutineScope()
    TabRow(selectedTabIndex = pagerState.currentPage,
        backgroundColor = greenColor,
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = if (pagerState.currentPage == pagerState.currentPage) Color(
                    0xFFFF7400
                ) else Color.White // Change color based on selected tab
            )
        }) {
        list.forEachIndexed { index, pair ->
            Tab(modifier = Modifier.padding(12.dp),
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = if (pagerState.currentPage == index) pair.second.second else pair.second.first),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp), // Set fixed size for Image
                    )
                    Text(
                        pair.first,
                        color = if (pagerState.currentPage == index) Color(0xFFFF7400) else Color.LightGray, // Change color based on selected tab
                        modifier = Modifier.padding(start = 4.dp),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}


@Composable
fun RestaurantsContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp, vertical = 15.dp)
    ) {
        LazyColumn {
            items(products.size) { index ->
                RenderProductItem(products[index])
                Spacer(modifier = Modifier.size(20.dp)) // Increase the size here
            }
        }
    }
}


@Composable
fun DishesContent() {
    Column(
        modifier = Modifier.background(backRound),
    ) {
        LazyColumn {
            items(otherFruitsList.chunked(2)) { rowItems ->
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    rowItems.forEach { item ->
                        RenderProductItemWithRating(item)
                    }
                }
            }
        }
    }
}

@Composable
fun RenderProductItemWithRating(item: OtherFruit) {
    val painter = rememberAsyncImagePainter(model = item.image) // Use the drawable ID here
    val isHeartFilled = remember { mutableStateOf(false) }

    Column(
        Modifier
            .padding(10.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
            .clickable { /* Handle click event here */ },
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(modifier = Modifier
            .clickable { /* Handle click event here */ }
            .background(Color.LightGray, shape = RoundedCornerShape(20.dp))) {
            Image(
                modifier = Modifier.size(154.43.dp, 147.36.dp),
                contentScale = ContentScale.Crop,
                painter = painter,
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .width(58.54.dp)
                    .height(28.26.dp)
                    .padding(top = 10.dp, start = 10.dp)
                    .background(Color.White, shape = RoundedCornerShape(14.dp))
                    .align(Alignment.TopStart),
            ) {
                Text(
                    text = item.price,
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.align(Alignment.Center),
                    fontWeight = FontWeight.Bold
                )

            }
            Box(
                modifier = Modifier
                    .width(28.26.dp)
                    .height(28.26.dp)
                    .padding(top = 10.dp, end = 10.dp)
                    .background(Color.White, shape = RoundedCornerShape(14.dp))
                    .align(Alignment.TopEnd), contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.heart_or), // Replace with your heart icon
                    contentDescription = "Heart Icon", modifier = Modifier.size(10.dp)
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(y = 15.dp) // A
                    .padding(start = 10.dp)// dd this line
            ) {
                Row(
                    modifier = Modifier.background(Color.White, shape = RoundedCornerShape(16.dp)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "4.5",
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        modifier = Modifier.padding(7.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(width = 13.dp, height = 9.dp)
                            .padding(top = 0.dp, end = 0.dp)
                    )
                    Text(
                        text = "25+",
                        fontSize = 12.sp,
                        lineHeight = 12.sp,
                        modifier = Modifier.padding(7.dp)
                    )
                }
            }
        }
        Column(modifier = Modifier
            .align(Alignment.Start)
            .clickable { /* Handle click event here */ }) {
            Box(
                modifier = Modifier.padding(start = 15.dp, top = 10.dp)
            ) {
                Text(
                    style = TextStyle(
                        fontSize = 14.sp, letterSpacing = 1.sp, fontWeight = FontWeight.Bold
                    ),
                    text = item.name,
                )
            }
            Box() {
                Row(
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.clock),
                        contentDescription = "Heart Icon",
                        modifier = Modifier
                            .size(15.dp)
                            .padding(top = 0.dp, end = 0.dp)
                    )
                    Text(
                        style = TextStyle(
                            fontSize = 14.sp, letterSpacing = 1.sp, fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(top = 0.dp, end = 0.dp, start = 5.dp),
                        text = "10-15 mins",
                    )
                }
            }
        }

    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun TabsContent(pagerState: com.google.accompanist.pager.PagerState) {
    com.google.accompanist.pager.HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> RestaurantsContent()
            1 -> DishesContent()
        }
    }
}

@Preview
@Composable
fun PreviewFavorite() {
    Favorite()
}



