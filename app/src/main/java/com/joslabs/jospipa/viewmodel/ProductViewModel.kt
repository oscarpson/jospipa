package com.joslabs.jospipa.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joslabs.jospipa.model.productModel

class ProductViewModel : ViewModel() {
    var itemId=MutableLiveData<String>()
    var  itemName=MutableLiveData<String>()
    var type =MutableLiveData<String>()
    var quantity=MutableLiveData<String>()
    var plist= MutableLiveData<LiveData<productModel>>()
   // var List<productModel>plist=MutableLiveData<List>()

}