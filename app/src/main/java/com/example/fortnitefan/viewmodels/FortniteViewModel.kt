package com.example.fortnitefan.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fortnitefan.data.mapmodel.Images
import com.example.fortnitefan.data.newsmodel.Motd
import com.example.fortnitefan.data.newsmodel.NewsList
import com.example.fortnitefan.repository.FortniteRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class FortniteViewModel @Inject constructor(
    val repository: FortniteRepo
)  : ViewModel(){

    private val _newsList: MutableLiveData<List<Motd?>> = MutableLiveData()
    private val _Map: MutableLiveData<Images> = MutableLiveData()


    fun getNews(): MutableLiveData<List<Motd?>> {
        viewModelScope.launch(Dispatchers.IO) {
            val newsList = repository.getNews(  )
            _newsList.postValue(newsList)
        }
        return _newsList
    }

    fun getMap():MutableLiveData<Images>{
        viewModelScope.launch(Dispatchers.IO) {
            val map = repository.getMap()
            _Map.postValue(map)
        }
        return _Map
    }



}