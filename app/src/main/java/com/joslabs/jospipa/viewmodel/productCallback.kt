package com.joslabs.jospipa.viewmodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.joslabs.jospipa.model.productModel

class productCallback {
    @SerializedName("error")
    @Expose
    var error: String ?=null

    @SerializedName("message")
    @Expose
    var message: String ?=null

    @SerializedName("allproducts")
    @Expose
    var allproducts: List<productModel> ?=null


}