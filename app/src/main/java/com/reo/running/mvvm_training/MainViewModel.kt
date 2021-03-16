package com.reo.running.mvvm_training

import androidx.databinding.ObservableField

class MainViewModel {
    var message = ObservableField("thanks")

    fun buttonClicked() {
        message.set("thanks a lot")
    }
}