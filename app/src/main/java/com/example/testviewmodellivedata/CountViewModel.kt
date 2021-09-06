package com.example.testviewmodellivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var number = 0

    val count : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

}