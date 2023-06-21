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
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class HomeActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun HomePage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Homepage") },
                actions = {
                    IconButton(onClick = { /* Handle settings button press */ }) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings")
                    }
                    IconButton(onClick = { /* Handle account button press */ }) {
                        Icon(Icons.Default.AccountCircle, contentDescription = "Account")
                    }
                    IconButton(onClick = { /* Handle logout button press */ }) {
                        Icon(Icons.Default.Add, contentDescription = "Logout")
                    }
                    IconButton(onClick = { /* Handle fee button press */ }) {
                        Icon(Icons.Default.Info, contentDescription = "Fee")
                    }
                }
            )
        },
        content = {


            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    LazyRow(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        item {
                            RoundedImageWithIcon(
                                imageVector = Icons.Default.Home,
                                label = "Home",
                                onClick = { /* Handle home button press */ }
                            )
                        }
                        item {
                            RoundedImageWithIcon(
                                imageVector = Icons.Default.Person,
                                label = "Users",
                                onClick = { /* Handle users button press */ }
                            )
                        }
                    }
                }
                // Add more LazyRows or other content here
            }
        }
    )
}

@Composable
fun RoundedImageWithIcon(
    imageVector: ImageVector,
    label: String,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(end = 16.dp)
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .padding(4.dp),
            contentAlignment = Alignment.Center,
            content = {
                Image(
                    painter = painterResource(id = R.drawable.rounded_image_placeholder),
                    contentDescription = label,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(4.dp)
                )
            }
        )
        Text(text = label)
    }
}

