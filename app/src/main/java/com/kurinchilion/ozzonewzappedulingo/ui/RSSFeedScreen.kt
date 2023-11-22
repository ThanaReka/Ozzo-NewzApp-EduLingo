package com.kurinchilion.ozzonewzappedulingo.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kurinchilion.ozzonewzappedulingo.data.RssFeed


@Composable
    fun RSSFeedScreen(titles: List<String> = List(100){"Article Heading"}) {
        val context = LocalContext.current
        LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
            items(items = titles) { name ->
                RssItemCard(title = name, description = "A little summary about the article") {
                    Toast.makeText(context, it, Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    @Composable
    fun RssItemCard(title: String, description: String, onClick: (msg: String) -> Unit) {

        val heading = "$title"
        val subtitle = "$description"

        Card(
//            backgroundColor = MaterialTheme.colors.primary,
            modifier = Modifier
                .padding(vertical = 4.dp, horizontal = 8.dp)
                .clickable { onClick(heading) }
        )
        {
            Column {
                Text(text = heading,
                     modifier = Modifier.padding(16.dp),
                     style = MaterialTheme.typography.headlineLarge
                )
                Row(modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()) {

                    Text(text = description)
                }
            }

        }
            }


    @Preview(showBackground = true, widthDp = 320, heightDp = 320)
    @Composable
    fun GreetingListPreview() {
        MaterialTheme {
            RSSFeedScreen()
        }
    }



