package com.example.app_trans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_trans.ui.theme.App_TransTheme

class RecieptActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingPreview22()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview22() {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Background image
            Image(
                painter = painterResource(R.drawable.imaagges),
                contentDescription = "Background Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            // Rest of your UI components
            Column(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(text = "Fee App Manager " ,
                color = Color.White,
                    modifier = Modifier.padding(16.dp),
                    fontSize = 38.sp
                    )

                Spacer(modifier = Modifier.height(20.dp))


                Text(text = "Manages all your fees details " ,
                    color = Color.White,
                    modifier = Modifier.padding(16.dp),
                    fontSize = 28.sp
                    )

                Spacer(modifier = Modifier.height(20.dp))


                Text(text = "All in one App" ,
                    color = Color.White,
                    modifier = Modifier.padding(16.dp),
                    fontSize = 26.sp


                    )


                    Button(
                        onClick = { /* Handle next button click here */ },
                        modifier = Modifier.padding(16.dp)
                            .size(width = 200.dp, height = 60.dp)
                    ) {
                        Text(text = "Next",
                            modifier = Modifier.padding(16.dp),
                            fontSize = 20.sp
                        )
                    }





            }}





























}