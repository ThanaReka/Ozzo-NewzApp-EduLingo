package com.kurinchilion.ozzonewzappedulingo

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object NetworkModule {
    private const val BASE_URL = "https://news.google.com/"

    fun provideRssService(): RssService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()

        return retrofit.create(RssService::class.java)
    }
}