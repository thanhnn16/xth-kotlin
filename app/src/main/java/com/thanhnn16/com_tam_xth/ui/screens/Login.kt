package com.thanhnn16.com_tam_xth.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.thanhnn16.com_tam_xth.R

@Composable
fun Login(navController: NavHostController) {

    val roboto_regula = FontFamily(
        Font(R.font.roboto_regula)
    )

    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Enter your Email and Password to login, or ")
        }
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#FF7400")))) {
            append(" Create new account.")
        }
    }

    val pass = R.drawable.key

    val email = R.drawable.sms

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
    ) {
        // Canvas elements
        Canvas(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = (-46).dp, y = (-21).dp)
                .height(96.dp)
                .width(96.dp)
        ) {
            drawCircle(
                color = Color(android.graphics.Color.parseColor("#FE724C"))
            )
        }
        Canvas(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = (-5).dp, y = (-99).dp)
                .height(165.dp)
                .width(165.dp)
        ) {
            drawCircle(
                color = Color(android.graphics.Color.parseColor("#FFECE7"))
            )
        }
        Canvas(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(x = 98.dp, y = (-109).dp)
                .height(181.dp)
                .width(181.dp)
        ) {
            drawCircle(
                color = Color(android.graphics.Color.parseColor("#FE724C"))
            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Column(
                    modifier = Modifier
                        .padding(start = 34.dp, top = 8.dp, end = 18.dp)
                        .width(224.dp)
                        .height(165.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "well hello there !".uppercase(),
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        fontSize = 36.sp,
                        lineHeight = 40.sp,
                        fontFamily = roboto_regula,
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = text,
                        fontSize = 14.sp,
                        fontFamily = roboto_regula,
                        modifier = Modifier
                            .padding(bottom = 12.dp)
                            .clickable {
                                navController.navigate("createAccount")
                            },
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )
                }

                val emailValue = remember {
                    mutableStateOf("")
                }

                val password = remember {
                    mutableStateOf("")
                }


                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Card(
                        modifier = Modifier
                            .offset(y = (-70).dp)
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(36.dp),
                        colors = CardDefaults.cardColors(Color(android.graphics.Color.parseColor("#263238")))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(android.graphics.Color.parseColor("#263238"))),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ) {

                            val mailInteractionSource = remember { MutableInteractionSource() }
                            val passInteractionSource = remember { MutableInteractionSource() }

                            Spacer(modifier = Modifier.height(20.dp))

                            OutlinedTextField(
                                modifier = Modifier.width(312.dp),
                                value = emailValue.value,
                                onValueChange = { emailValue.value = it },
                                placeholder = {
                                    Text(
                                        text = "Enter Your Mail",
                                        fontSize = 10.sp,
                                        color = if (mailInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                                    )
                                },
                                trailingIcon = {
                                    Image(
                                        painter = painterResource(id = email),
                                        contentDescription = null
                                    )
                                },
                                shape = RoundedCornerShape(15.dp),
                                colors = TextFieldDefaults.colors(
                                    unfocusedContainerColor = Color.White,
                                ),
                                interactionSource = mailInteractionSource,
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            OutlinedTextField(
                                modifier = Modifier.width(312.dp),
                                value = password.value,
                                onValueChange = { password.value = it },
                                placeholder = {
                                    Text(
                                        text = "Enter Your Password",
                                        fontSize = 10.sp,
                                        color = if (passInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                                    )
                                },
                                trailingIcon = {
                                    Image(
                                        painter = painterResource(id = pass),
                                        contentDescription = null
                                    )
                                },
                                shape = RoundedCornerShape(15.dp),
                                colors = TextFieldDefaults.colors(
                                    unfocusedContainerColor = Color.White,
                                ),
                                interactionSource = passInteractionSource,
                                visualTransformation = PasswordVisualTransformation(), // Che dấu mật khẩu
                            )

                            TextButton(
                                onClick = {
                                    navController.navigate("forgotPassword")
                                },
                            ) {
                                Text(
                                    text = "Forgot Password ? ",
                                    fontSize = 10.sp,
                                    fontFamily = roboto_regula,
                                    color = Color(android.graphics.Color.parseColor("#4285F4")),
                                    textAlign = TextAlign.Start
                                )
                            }

                            TextButton(
                                onClick = {
                                    navController.navigate("homeScreen")
                                    //                            if (name.value.isNotEmpty() && emailValue.value.isNotEmpty() && password.value.isNotEmpty()) {
                                    //                                Toast.makeText(
                                    //                                    navController.context,
                                    //                                    "Đăng nhập thành công!!!",
                                    //                                    Toast.LENGTH_SHORT
                                    //                                ).show()
                                    //                            } else {
                                    //                                Toast.makeText(
                                    //                                    navController.context,
                                    //                                    "Vui lòng điền đầy đủ thông tin!!!!",
                                    //                                    Toast.LENGTH_SHORT
                                    //                                ).show()
                                    //                            }
                                    //                            navController.navigate("Home")
                                },
                                modifier = Modifier.width(312.dp),
                                shape = RoundedCornerShape(15.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        if (
                                            emailValue.value.isNotEmpty() &&
                                            password.value.isNotEmpty()
                                        )
                                            android.graphics.Color.parseColor("#FF7400")
                                        else
                                            android.graphics.Color.parseColor("#C0C0C0")
                                    )
                                )
                            ) {
                                Text(
                                    text = "Sign Up",
                                    fontSize = 16.sp,
                                    fontFamily = roboto_regula,
                                    modifier = Modifier.padding(bottom = 8.dp),
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Start
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
