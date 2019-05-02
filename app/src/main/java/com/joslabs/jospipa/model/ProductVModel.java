package com.joslabs.jospipa.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductVModel extends ViewModel {
    public MutableLiveData<String> getMyteststring() {
        return myteststring;
    }

    public void setMyteststring(MutableLiveData<String> myteststring) {
        this.myteststring = myteststring;
        myteststring.setValue("you new string");
    }

    public MutableLiveData<String>myteststring;

   public MutableLiveData<String> getTestString(){
       //if (myteststring == null){
           myteststring=new MutableLiveData<>();
    //   }
       return myteststring;
   }
}
