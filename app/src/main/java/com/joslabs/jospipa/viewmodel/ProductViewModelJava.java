package com.joslabs.jospipa.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ProductViewModelJava extends ViewModel {
    private  LiveData<ProductCallbackJava> mydata;

    public void setMydata(){
       mydata= ProductRepository.getInstance().productData();
    }


    public LiveData<ProductCallbackJava>getCallback(){
        return  mydata;
    }
}
