package com.temitope.secondbasiccodelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.temitope.secondbasiccodelab.R
import com.temitope.secondbasiccodelab.sections.AlignYourBodyRow
import com.temitope.secondbasiccodelab.sections.FavoriteCollectionsGrid
import com.temitope.secondbasiccodelab.sections.HomeSection
import com.temitope.secondbasiccodelab.sections.SearchBar
import com.temitope.secondbasiccodelab.ui.theme.SecondBasicCodeLabTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){

    Column (modifier
        .verticalScroll(rememberScrollState())
    ){
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.Stretching) {
            AlignYourBodyRow()
        }

        HomeSection(title = R.string.meditation) {
            FavoriteCollectionsGrid()
            
        }
        Spacer(Modifier.height(16.dp))
    }

}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 480 )
fun HomeScreenPreview(){
    SecondBasicCodeLabTheme {
        HomeScreen()
    }
}