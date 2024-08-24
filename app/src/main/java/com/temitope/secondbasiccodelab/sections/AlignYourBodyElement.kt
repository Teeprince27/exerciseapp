package com.temitope.secondbasiccodelab.sections

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
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
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
){
    Surface (

    ) {

        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(painter = painterResource(drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape)
            )
            Text(
                text = stringResource(text),
                modifier = Modifier.paddingFromBaseline(
                    top = 24.dp, bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )

        }
    }
}

@Composable
@Preview
fun AlignYourBodyElementReview(){
    AlignYourBodyElement(
        text = R.string.inversion,
        drawable = R.drawable.inversion,
        modifier = Modifier.padding(8.dp)
    )
}

