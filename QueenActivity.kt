package com.example.app_trans

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_trans.ui.theme.App_TransTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

class QueenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Registration()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun Registration() {
    var firstName by mutableStateOf(TextFieldValue(""))
    var secondName by mutableStateOf(TextFieldValue(""))
    var lastName by mutableStateOf(TextFieldValue(""))
    var admissionNumber by mutableStateOf(TextFieldValue(""))
    var courseType by mutableStateOf(TextFieldValue(""))
    var intakePeriod by mutableStateOf(TextFieldValue(""))


    TopAppBar(
        title = {
            Text(text = "Add your clients details")
        }
    )

    Column(
        modifier = Modifier.padding(16.dp)
            .fillMaxSize()


    ) {
        TextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text("First Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = secondName,
            onValueChange = { secondName = it },
            label = { Text("Second Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text("Last Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))


        TextField(
            value = admissionNumber,
            onValueChange = { admissionNumber = it },
            label = { Text("Admission Number") },
            modifier = Modifier.fillMaxWidth()
        )


        Spacer(modifier = Modifier.height(20.dp))


        TextField(
            value = courseType,
            onValueChange = { courseType = it },
            label = { Text("Course Type") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))


        TextField(
            value = intakePeriod,
            onValueChange = { intakePeriod = it },
            label = { Text("Intake Period") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(40.dp))




        Button(
            onClick = {
                // Perform desired action with the entered data
                val enteredFirstName = firstName.text
                val enteredSecondName = secondName.text
                val enteredLastName = lastName.text
                val enteredAdmissionNumber = admissionNumber.text
                val enteredCourseType = courseType.text
                val enteredIntakePeriod = intakePeriod.text

                // Do something with the entered data
                println("First Name: $enteredFirstName")
                println("Second Name: $enteredSecondName")
                println("Last Name: $enteredLastName")
                println("Admission Number: $enteredAdmissionNumber")
                println("Course Type: $enteredCourseType")
                println("Intake Period: $enteredIntakePeriod")
            },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Submit")
        }
    }



























}