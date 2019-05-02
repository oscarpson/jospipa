package com.joslabs.jospipa

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mylivemodel : ViewModel() {
    var mystring= MutableLiveData<String>()
    fun setMyString(mystrigHolder:String){
        mystring.value=mystrigHolder
    }

    fun getMyString():LiveData<String>{
        return  mystring
    }
}