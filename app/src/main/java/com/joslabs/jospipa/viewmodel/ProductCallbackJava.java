package com.joslabs.jospipa.viewmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.joslabs.jospipa.model.ProductModelJava;
import com.joslabs.jospipa.model.productModel;

import java.util.List;

public class ProductCallbackJava {
    @SerializedName("error")
    @Expose
    String error;
    @SerializedName("message")
    @Expose
    String message;
    @SerializedName("allproducts")
    @Expose
    List<ProductModelJava>plist;

    public ProductCallbackJava() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ProductModelJava> getPlist() {
        return plist;
    }

    public void setPlist(List<ProductModelJava> plist) {
        this.plist = plist;
    }
}
