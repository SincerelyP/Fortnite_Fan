package com.example.fortnitefan.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.example.fortnitefan.R
import com.example.fortnitefan.data.newsmodel.Motd
import com.example.fortnitefan.luckiestGuy
import com.example.fortnitefan.mavenpro

@Composable
fun NewsPage(motdList: List<Motd>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {


        // Fornite Logo
        Card(
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
             elevation = 0.dp

        ) {

            Image(
                painter = painterResource(id = R.drawable.fortnitelogo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
            )

        }
        

        //Fornite News Heading
        Text(
            text = "Latest Fortnite News",
            fontSize = 30.sp,
            fontFamily = luckiestGuy,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))


        // Fortnite News Items
        LazyColumn{
            items(motdList){item ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)

                    ,
                    elevation = 10.dp,
                    backgroundColor = Color.LightGray


                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                        ,
                        horizontalArrangement = Arrangement.SpaceAround,




                        ) {
                        Box(
                            modifier = Modifier
                                .width(110.dp)
                                .padding(start = 6.dp, top = 2.5.dp, end = 6.dp, bottom = 2.5.dp)
                                .height(110.dp),
                            contentAlignment = Alignment.Center


                        ) {
                            SubcomposeAsyncImage(
                                model = item.image,
                                loading = {
                                    CircularProgressIndicator(
                                        modifier = Modifier.size(5.dp)
                                    )
                                },
                                contentDescription = null,
                                contentScale = ContentScale.FillBounds
                            )


                        }

                        Column(

                            modifier = Modifier
                                .fillMaxWidth()


                        ) {
                            Text(
                                text = item.title,
                                fontSize = 22.5.sp,
                                fontFamily = luckiestGuy,
                                fontWeight = FontWeight.Normal,
                            )

                            Spacer(modifier = Modifier.height(7.dp))

                            Text(
                                text = item.body,
                                fontSize = 15.sp,
                                fontFamily = mavenpro,
                                fontWeight = FontWeight.SemiBold,

                                )

                        }

                    }

                }

            }

        }
        





    }
}


@Preview
@Composable
fun newsPage() {
}