package me.cybersteve.kotlin_pr3

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CViewModel : ViewModel() {
    private val _string = MutableLiveData<String>()

    val string: LiveData<String> = _string

    fun set_string(str: String){
        _string.value = str
        Log.d("string_set", "New string value: ${string.value}")
    }
}