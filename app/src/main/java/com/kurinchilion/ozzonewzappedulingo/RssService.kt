package com.kurinchilion.ozzonewzappedulingo

import com.kurinchilion.ozzonewzappedulingo.data.RssFeed
import retrofit2.http.GET

interface RssService {
    @GET("news/rss")
    suspend fun getRssFeed(): RssFeed
}
