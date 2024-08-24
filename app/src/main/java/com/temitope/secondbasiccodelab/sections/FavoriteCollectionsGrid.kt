package com.temitope.secondbasiccodelab.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.temitope.secondbasiccodelab.R
import com.temitope.secondbasiccodelab.data.FavoriteCollectionsData

val favoriteCollectionsData = listOf(
    FavoriteCollectionsData(
        text = R.string.meditation,
        drawable = R.drawable.balance
    ),

    FavoriteCollectionsData(
        text = R.string.inversion,
        drawable = R.drawable.inversion
    ),
    FavoriteCollectionsData(
        text = R.string.Stretching,
        drawable = R.drawable.meditation
    ),
    FavoriteCollectionsData(
        text = R.string.Stretching,
        drawable = R.drawable.asana
    ),

    FavoriteCollectionsData(
        text = R.string.Stretching,
        drawable = R.drawable.asana
    )
)
@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(favoriteCollectionsData)
        { item ->
            FavoriteCollectionCard(item.drawable, item.text, Modifier.height(80.dp))
        }
    }
    
}


@Composable
@Preview
fun FavoriteCollectionsGridPreview(){
   FavoriteCollectionsGrid()
}

