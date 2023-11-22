package com.kurinchilion.ozzonewzappedulingo.data

data class RssFeed(val channel: RssChannel)

data class RssChannel(val items: List<RssItem>)

data class RssItem(val title: String, val link: String, val description: String)

