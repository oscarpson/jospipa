package com.joslabs.jospipa.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RetrofitViewmodel:ViewModel (){
    var repos=MutableLiveData<ProductCallbackJava>()
    fun getCallback():LiveData<ProductCallbackJava>{
        repos= ProductRepository.getInstance().productData() as MutableLiveData<ProductCallbackJava>
        return repos
    }
}