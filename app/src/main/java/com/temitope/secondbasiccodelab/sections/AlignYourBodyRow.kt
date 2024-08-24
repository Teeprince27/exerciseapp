package com.temitope.secondbasiccodelab.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.temitope.secondbasiccodelab.R
import com.temitope.secondbasiccodelab.data.AlignYourBodyData

val alignYourBodyData = listOf(
    AlignYourBodyData(
        text = R.string.inversion,
        drawable = R.drawable.inversion
    ),
    AlignYourBodyData(
        text = R.string.meditation,
        drawable = R.drawable.meditation
    ),
    AlignYourBodyData(
        text = R.string.inversion,
        drawable = R.drawable.inversion
    ),
    AlignYourBodyData(
        text = R.string.meditation,
        drawable = R.drawable.meditation
    )
)


@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
){
    LazyRow (
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ){
        items(alignYourBodyData){ item ->
            AlignYourBodyElement(item.drawable, item.text, Modifier.padding(10.dp))
        }
    }

}

@Composable
@Preview
fun AlignYourBodyRowPreview(){
    AlignYourBodyRow()
}