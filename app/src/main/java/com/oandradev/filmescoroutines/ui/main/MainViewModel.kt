package com.oandradev.filmescoroutines.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val repository: MainRepository) : ViewModel() {

    val filmesLiveData = MutableLiveData<List<Filme>>()

    fun getFilmesCoroutines() {
        CoroutineScope(Dispatchers.Main).launch {
            val filmes = withContext(Dispatchers.Default) {
                repository.getFilmesCoroutines()
            }

            filmesLiveData.value = filmes
        }
    }

}