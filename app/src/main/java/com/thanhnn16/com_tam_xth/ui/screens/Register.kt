package com.thanhnn16.com_tam_xth.ui.screens

import android.content.ContentValues
import android.content.ContentValues.TAG
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanhnn16.com_tam_xth.R

@Composable
fun CreateAccount() {

    val roboto_regula = FontFamily(
        Font(R.font.roboto_regula)
    )

    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Enter your Email and Password to sign up. ")
        }
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#FF7400")))) {
            append("Already have an account?.")
        }
    }

    val img = R.drawable.selfie_bro_1

    val user = R.drawable.user_square

    val pass = R.drawable.key

    val email = R.drawable.sms

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 18.dp, top = 8.dp, end = 18.dp)
                .width(224.dp)
                .height(165.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Create Account",
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                fontSize = 36.sp,
                fontFamily = roboto_regula,
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight(900),
                textAlign = TextAlign.Start
            )
            Text(
                text = text,
                fontSize = 12.sp,
                fontFamily = roboto_regula,
                modifier = Modifier.padding(bottom = 12.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
        }

        val name = remember {
            mutableStateOf("")
        }

        val emailValue = remember {
            mutableStateOf("")
        }

        val password = remember {
            mutableStateOf("")
        }

        Log.d(TAG, "RegisterCard: $name, $emailValue, $password  ")

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.padding(top = 8.dp),
                painter = painterResource(id = img),
                contentDescription = "selfie",
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(36.dp),
                colors = CardDefaults.cardColors(Color(android.graphics.Color.parseColor("#263238")))
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(android.graphics.Color.parseColor("#263238"))),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    val nameInteractionSource = remember { MutableInteractionSource() }
                    val mailInteractionSource = remember { MutableInteractionSource() }
                    val passInteractionSource = remember { MutableInteractionSource() }


                    OutlinedTextField(
                        modifier = Modifier.width(312.dp),
                        value = name.value,
                        onValueChange = { name.value = it },
                        placeholder = {
                            Text(
                                text = "Enter Your Name",
                                fontSize = 10.sp,
                                color = if (mailInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                            )
                        },
                        trailingIcon = {
                            Image(
                                painter = painterResource(id = user),
                                contentDescription = null
                            )
                        },
                        shape = RoundedCornerShape(15.dp),
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                        ),
                        interactionSource = nameInteractionSource,
                    )

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

                    Spacer(modifier = Modifier.height(20.dp))

                    TextButton(
                        onClick = {
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
                                    name.value.isNotEmpty() &&
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

@Composable
fun UpdateInformation() {
    val roboto_regula = FontFamily(
        Font(R.font.roboto_regula)
    )

    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color(android.graphics.Color.parseColor("#C0C0C0")))) {
            append("Your account is ready, we only need a little bit more informations to help you have a better experience. ")
        }
    }

    val city = R.drawable.city

    val state = R.drawable.state

    val routing = R.drawable.routing

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#263238"))),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 18.dp, top = 75.dp, end = 18.dp)
                .width(224.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Well done! ",
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                fontSize = 36.sp,
                fontFamily = roboto_regula,
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight(900),
                textAlign = TextAlign.Start
            )
            Text(
                text = text,
                fontSize = 14.sp,
                fontFamily = roboto_regula,
                modifier = Modifier.padding(top = 8.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
        }

        val cityValue = remember {
            mutableStateOf("")
        }

        val stateValue = remember {
            mutableStateOf("")
        }

        val addressValue = remember {
            mutableStateOf("")
        }

        Log.d(ContentValues.TAG, "RegisterCard: $cityValue, $stateValue, $addressValue  ")

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopEnd,
        ) {
            TextButton(
                onClick = {
//                    navController.navigate("Register")
                },
                modifier = Modifier
                    .width(63.dp),
//                    .height(27.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(android.graphics.Color.parseColor("#ffffff"))
                )
            ) {
                Text(
                    text = "Skip",
                    fontSize = 16.sp,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    fontFamily = roboto_regula,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(36.dp),
            colors = CardDefaults.cardColors(Color(android.graphics.Color.parseColor("#263238")))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(android.graphics.Color.parseColor("#263238"))),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                val cityInteractionSource = remember { MutableInteractionSource() }
                val stateInteractionSource = remember { MutableInteractionSource() }
                val addressInteractionSource = remember { MutableInteractionSource() }



                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = cityValue.value,
                    onValueChange = { cityValue.value = it },
                    label = {
                        Text(
                            text = "Your city",
                            fontSize = 10.sp,
                            color = if (cityInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = city),
                            contentDescription = null
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = cityInteractionSource,
                )

                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = stateValue.value,
                    onValueChange = { stateValue.value = it },
                    label = {
                        Text(
                            text = "Your state",
                            fontSize = 10.sp,
                            color = if (stateInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = state),
                            contentDescription = null
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = stateInteractionSource,
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    modifier = Modifier.width(312.dp),
                    value = addressValue.value,
                    onValueChange = { addressValue.value = it },
                    label = {
                        Text(
                            text = "Your address",
                            fontSize = 10.sp,
                            color = if (addressInteractionSource.collectIsFocusedAsState().value) Color.White else Color.Gray
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = routing),
                            contentDescription = null
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                    ),
                    interactionSource = addressInteractionSource,
                )
                Spacer(modifier = Modifier.height(20.dp))

                TextButton(
                    onClick = {
//                        navController.navigate("EnterMail")
                    },
                    modifier = Modifier.width(312.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(android.graphics.Color.parseColor("#FF7400"))
                    )
                ) {
                    Text(
                        text = "Let's go!",
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





@Preview(
    group = "create_account",
    name = "create_account",
    showBackground = true
)
@Composable
fun CreateAccountPreview() {
    CreateAccount()
}

@Preview(
    group = "create_account",
    name = "update_information",
    showBackground = true
)
@Composable
fun UpdateInformationPreview() {
    UpdateInformation()
}