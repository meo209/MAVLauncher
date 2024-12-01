package com.github.meo209.mavlauncher

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Instance(val name: String)

@Composable
@Preview
fun App() {
    val instances = listOf(Instance("1.21.1"), Instance("1.0"))

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Minecraft Instances",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyColumn {
                items(instances) { instance ->
                    InstanceCard(instance)
                }
            }
        }
    }
}

@Composable
fun InstanceCard(instance: Instance) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { /* Handle click event */ },
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Text(
                text = instance.name,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Row {
                Button(
                    onClick = { /* Handle launch action */ },
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Text("Launch")
                }

                Button(
                    onClick = { /* Handle delete action */ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                ) {
                    Text("Delete")
                }
            }
        }
    }
}