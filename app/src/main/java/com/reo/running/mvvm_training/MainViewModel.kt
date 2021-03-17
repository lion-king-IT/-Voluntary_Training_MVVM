package com.reo.running.mvvm_training

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _message: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "thanks"
        }
    val message: LiveData<String>
    get() = _message

    fun buttonClicked() {
        _message.value = "thanks a lot"
    }
}