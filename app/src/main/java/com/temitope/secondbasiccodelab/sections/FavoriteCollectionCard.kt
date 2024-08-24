package com.temitope.secondbasiccodelab.sections

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.temitope.secondbasiccodelab.R


@Composable
fun FavoriteCollectionCard(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
){
    Surface(
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier,
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(255.dp),

        ){
            Image(painter = painterResource(drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
            )
            Text(
                text = stringResource(text),
                modifier = Modifier.padding(
                    horizontal =  16.dp),
                style = MaterialTheme.typography.titleMedium
            )

        }
    }

}

@Composable
@Preview
fun FavoriteCollectionCardPreview(){
    FavoriteCollectionCard(
        text = R.string.meditation,
        drawable = R.drawable.meditation,
        modifier = Modifier.padding(1.dp)
    )
}