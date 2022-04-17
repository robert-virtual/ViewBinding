package com.example.viewbinding

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    var count = 0
    fun increase(){
        count++
    }

}