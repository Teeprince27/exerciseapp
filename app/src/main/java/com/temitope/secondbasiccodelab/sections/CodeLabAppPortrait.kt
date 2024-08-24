package com.temitope.secondbasiccodelab.sections

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.temitope.secondbasiccodelab.screens.HomeScreen
import com.temitope.secondbasiccodelab.ui.theme.SecondBasicCodeLabTheme

@Composable
fun  CodeLabAppPortrait(){
    SecondBasicCodeLabTheme {
        Scaffold (
            bottomBar = {
                CodeLabBottomNavigation()
            }
        ){padding ->
            HomeScreen(Modifier.padding(padding))

        }
    }

}

@Composable
@Preview
fun CodeLabAppPortraitPreview(){
    CodeLabAppPortrait()
}