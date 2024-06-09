package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.R
import com.thanhnn16.com_tam_xth.ui.components.HeaderRestaurant
import com.thanhnn16.com_tam_xth.ui.components.HeaderTextBold
import com.thanhnn16.com_tam_xth.ui.components.gelasioBold

data class Dish(val name: String, val description: String, val imageResId: Int)

val dishes = listOf(
    Dish(name = "Salmon Salad", description = "10 15 min ", imageResId = R.drawable.imgmiy),
    Dish(name = "Salmon Salad", description = "10 15 min ", imageResId = R.drawable.imgmiy),
    Dish(name = "Salmon Salad", description = "10 15 min ", imageResId = R.drawable.imgmiy),
    Dish(name = "Salmon Salad", description = "10 15 min ", imageResId = R.drawable.imgmiy),
    // Add more dishes here
)

@Composable
fun Restaurant() {
    Column {
        HeaderRestaurant(
            title = "Lebbury Restaurant",
            rightIcon = R.drawable.banhmi
        ) {

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card {
                Image(
                    painter = painterResource(id = R.drawable.imgfood), contentDescription = null,
                    modifier = Modifier
                        .width(312.dp)
                        .height(185.dp)
                        .clip(
                            RoundedCornerShape(0.dp)
                        )
                )

            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.star), contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Text(
                        text = "Rating: 4.5",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 8.dp, end = 150.dp)
                    )
                    Text(text = "320", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.banhsinhnhat),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Text(
                        text = "Dishes: 3.8",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 8.dp, end = 150.dp)
                    )
                    Text(text = "48", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.document),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Text(
                        text = "Your Order",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 8.dp, end = 155.dp)
                    )
                    Text(text = "60", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
                }

            }
        }
        //
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {
                Row {
                    Text(
                        text = "Your Feature Items",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(start = 8.dp, end = 150.dp)
                    )
                    Text(
                        text = "See All",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 7.dp, end = 4.dp),
                        color = Color.Green
                    )
                }
                LazyRow {
                    items(dishes.size) { index ->
                        DishCard(dish = dishes[index])
                    }
                }

            }

        }

    }

}

@Composable
fun DishCard(dish: Dish) {
    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = dish.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .height(216.dp)
                    .width(154.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = dish.name,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = dish.description,
                fontSize = 14.sp,
                modifier = Modifier.padding(8.dp)
            )
            // Add more information about the dish here
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantPreview() {
    Restaurant()

}



