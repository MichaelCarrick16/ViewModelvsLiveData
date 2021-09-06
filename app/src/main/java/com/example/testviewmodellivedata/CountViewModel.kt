package com.example.testviewmodellivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var count : MutableLiveData<Int> = MutableLiveData()
    init {
        count.value = 0
    }
}