package com.temitope.secondbasiccodelab.sections

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.temitope.secondbasiccodelab.screens.HomeScreen
import com.temitope.secondbasiccodelab.ui.theme.SecondBasicCodeLabTheme

@Composable
fun CodeLabAppLandScape(){
    SecondBasicCodeLabTheme {
       Surface (
           color = MaterialTheme.colorScheme.background
       ) {
           Row {
               CodeLabBottomNavigationRail()
               HomeScreen()
           }
       }
    }
}

@Composable
@Preview
fun CodeLabAppLandScapePreview(){
    CodeLabAppLandScape()

}