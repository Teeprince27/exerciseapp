package com.temitope.secondbasiccodelab.sections


import android.util.Log
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CodeLabApp(windowSize: WindowSizeClass){
    when(windowSize.widthSizeClass){
        WindowWidthSizeClass.Compact -> {
            CodeLabAppPortrait()
        }
        else -> CodeLabAppLandScape()
    }

}

@Composable
@Preview
fun CodeLabAppPreview(){

}