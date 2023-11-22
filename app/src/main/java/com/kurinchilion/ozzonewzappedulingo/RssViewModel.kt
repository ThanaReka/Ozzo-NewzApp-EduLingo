package com.kurinchilion.ozzonewzappedulingo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kurinchilion.ozzonewzappedulingo.data.RssFeed
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RssViewModel : ViewModel() {
    private val _rssFeed = MutableStateFlow<RssFeed?>(null)
    val rssFeed: StateFlow<RssFeed?> = _rssFeed

    private val rssService = NetworkModule.provideRssService()

    fun fetchRssFeed() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = rssService.getRssFeed()
                _rssFeed.value = response
            } catch (e: Exception) {
                // Handle network errors
                e.printStackTrace()
            }
        }
    }
}
