package com.thanhnn16.com_tam_xth.ui.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.thanhnn16.com_tam_xth.R


@Composable
fun HeaderHome(navController: NavController) {
    Box {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier.size(50.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                HeaderTextBold(text = "Lebbury Restaurant")
            }

            Box(
                modifier = Modifier.size(50.dp).clickable {  }
            ) {
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(12.dp)
                        .clickable { navController.navigate("Cart") },
                    painter = painterResource(id = R.drawable.banhmi),
                    contentDescription = "Cart"
                )
            }
        }
    }
}

@Composable
fun HeaderRestaurant(
    title: String,
    rightIcon: Int,
    rightIconClickable: () -> Unit
) {
    Box {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier.size(50.dp)
            ) 

            HeaderTextRegular(text = title)

            Box(
                modifier = Modifier.size(50.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .padding(15.dp)
                        .clickable { rightIconClickable() },
                    painter = painterResource(id = rightIcon),
                    contentDescription = null
                )
            }

        }
    }
}

//@Preview(
//    showBackground = true
//)
//@Composable
//fun HeaderHomePreview() {
//    HeaderHome(navController = NavController(
//        context = androidx.compose.ui.platform.LocalContext.current))
//}
