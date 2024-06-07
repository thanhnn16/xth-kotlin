package com.thanhnn16.com_tam_xth.ui.screens

import android.content.ContentValues.TAG
import android.graphics.fonts.Font
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.R

@Composable
fun ForgotPassword() {
    val roboto_regula = FontFamily



    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Enter your email address and we will send you a reset instructions. ")
        }

    }
    val logo = R.drawable.send
    val scan = R.drawable.fingerscan

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 18.dp, top = 15.dp, end = 18.dp)
                .width(224.dp)
                .height(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Forgot Password",
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                fontSize = 36.sp,
                modifier = Modifier.padding(bottom = 20.dp),
                fontWeight = FontWeight(900),
                textAlign = TextAlign.Start
            )
            Text(
                text = text,
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
        }
    }
    val email = remember {
        mutableStateOf("")
    }

    val enter = remember {
        mutableStateOf("")
    }



    Log.d(TAG, "RegisterCard: $email, $enter  ")



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .offset(y= -110.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(3.dp),
            colors = CardDefaults.cardColors(Color(android.graphics.Color.parseColor("#263238")))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(android.graphics.Color.parseColor("#263238"))),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                val emailInteractionSource = remember { MutableInteractionSource() }
                val enterInteractionSource = remember { MutableInteractionSource() }



                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = email.value,
                    onValueChange = { email.value = it },
                    placeholder = {
                        Text(
                            text = "Your email",
                            fontSize = 10.sp,
                            color = if (emailInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = logo),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp))
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = emailInteractionSource,
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = enter.value,
                    onValueChange = { enter.value = it },
                    placeholder = {
                        Text(
                            text = "Email confirm code",
                            fontSize = 10.sp,
                            color = if (enterInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = scan),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp))
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = enterInteractionSource,
                )

                Spacer(modifier = Modifier.height(20.dp))
                TextButton(
                    onClick = {
//

                    },
                    modifier = Modifier.width(312.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(android.graphics.Color.parseColor("#FF7400")))
                )
                {
                    Text(
                        text = "Confirm",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )


                }
            }
        }
    }


}


@Composable
fun ConfirmOwner() {
    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Great, it is you. Now let create new password before you forget it. ")
        }
    }
    val scan = R.drawable.fingerscan
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 18.dp, top = 15.dp, end = 18.dp)
                .width(224.dp)
                .height(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Confirm Owner",
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                fontSize = 36.sp,
                modifier = Modifier.padding(bottom = 20.dp),
                fontWeight = FontWeight(900),
                textAlign = TextAlign.Start
            )
            Text(
                text = text,
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
        }
    }
    val email = remember {
        mutableStateOf("")
    }

    val enter = remember {
        mutableStateOf("")
    }



    Log.d(TAG, "RegisterCard: $email, $enter  ")



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .offset(y= -110.dp)

                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(3.dp),
            colors = CardDefaults.cardColors(Color(android.graphics.Color.parseColor("#263238")))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(android.graphics.Color.parseColor("#263238"))),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                val emailInteractionSource = remember { MutableInteractionSource() }
                val enterInteractionSource = remember { MutableInteractionSource() }




                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = email.value,
                    onValueChange = { email.value = it },
                    placeholder = {
                        Text(
                            text = "Your new password",
                            fontSize = 10.sp,
                            color = if (emailInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = scan),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp))
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = emailInteractionSource,
                )
                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = enter.value,
                    onValueChange = { enter.value = it },
                    placeholder = {
                        Text(
                            text = "Confirm password",
                            fontSize = 10.sp,
                            color = if (enterInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = scan),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp))
                    },

                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = enterInteractionSource,
                )

                Spacer(modifier = Modifier.height(20.dp))
                TextButton(
                    onClick = {
//

                    },
                    modifier = Modifier.width(312.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(android.graphics.Color.parseColor("#FF7400")))
                )
                {
                    Text(
                        text = "Confirm",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )


                }
            }
        }
    }

}

@Composable
fun Congrats() {

    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Your new Password is ready !\n" +
                    "Let’s go !! ")
        }

    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),

        contentAlignment = Alignment.Center,

    ) {
        Column(
            modifier = Modifier

                .padding(start = 18.dp, top = 15.dp, end = 18.dp)
                .width(250.dp)
                .height(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally




        ) {
            Text(
                text = "Congratulation",
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                fontSize = 36.sp,
                modifier = Modifier.padding(bottom = 20.dp),
                fontWeight = FontWeight(900),
                textAlign = TextAlign.Start


            )
            Text(
                text = text,
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center



            )
            Spacer(modifier = Modifier.height(20.dp))
            TextButton(
                onClick = {
//

                },
                modifier = Modifier.width(312.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(android.graphics.Color.parseColor("#FF7400")))
            )
            {
                Text(
                    text = "Log in",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

            }


        }
    }

}


@Preview(
    group = "forgot_password",
    name = "forgot_password",
    showBackground = true
)
@Composable
fun ForgotPasswordPreview() {
    ForgotPassword()
}

@Preview(
    group = "forgot_password",
    name = "confirm_owner",
    showBackground = true
)

@Composable
fun ConfirmOwnerPreview() {
    ConfirmOwner()
}

@Preview(
    group = "forgot_password",
    name = "congrats",
    showBackground = true
)
@Composable
fun CongratsPreview() {
    Congrats()
}