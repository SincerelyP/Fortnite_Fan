package com.example.fortnitefan.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.example.fortnitefan.data.mapmodel.Images

@Composable
fun MapPage(forniteMap: Images) {
    Box(
        modifier = Modifier
            .width(650.dp)
            .height(650.dp),
        contentAlignment = Alignment.Center
    ) {
        SubcomposeAsyncImage(
            model = forniteMap.pois,
            loading = {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp)
                )
            },
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )


    }
}

@Preview
@Composable
fun Prev() {

}