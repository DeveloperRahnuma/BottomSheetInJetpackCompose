package com.jc.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun landscapeLayout(){
    Row(modifier = Modifier.fillMaxSize()){
        LazyColumn(modifier = Modifier.weight(1f)){
            items(10){
                Text("items $it", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                    modifier = Modifier.background(Color.Cyan).fillMaxWidth().padding(16.dp)
                )
            }
        }

        LazyColumn(modifier = Modifier.weight(1f)){
            items(10){
                Text("items $it", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                    modifier = Modifier.background(Color.Green).fillMaxWidth().padding(16.dp)
                )
            }
        }
    }
}