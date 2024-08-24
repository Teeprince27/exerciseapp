package com.temitope.secondbasiccodelab.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.temitope.secondbasiccodelab.R

@Composable
fun CodeLabBottomNavigationRail(
    modifier: Modifier = Modifier
){
    NavigationRail(
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier.padding(start = 8.dp, end = 8.dp)
    ) {
        Column (
            modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            NavigationRailItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Spa,
                        contentDescription = null)
                },
                label = {
                    Text(
                        text = stringResource(R.string.inversion)
                    )
                },
                selected = false,
                onClick = {}
            )
            Spacer(modifier = Modifier.height(8.dp))

            NavigationRailItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null)
                },
                label = {
                    Text(
                        text = stringResource(R.string.Stretching)
                    )
                },
                selected = true,
                onClick = {}
            )
        }
    }
}

@Composable
@Preview
fun CodeLabBottomNavigationRailPreview(){
    CodeLabBottomNavigation()
}