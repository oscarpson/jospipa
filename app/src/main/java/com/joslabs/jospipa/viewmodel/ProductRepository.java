package com.joslabs.jospipa.viewmodel;

import android.app.ProgressDialog;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.joslabs.jospipa.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductRepository {
    List<ProductViewModel> plist;
    RestClient restClient;
    private static class SingletonHelper
    {

        private static final ProductRepository INSTANCE = new ProductRepository();
    }
    public static ProductRepository getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
    public LiveData<ProductCallbackJava>productData(){
        //final ProgressDialog loading = ProgressDialog.show(this, "Fetching...", "Please wait...", false, false);
        final MutableLiveData<ProductCallbackJava> data =new MutableLiveData<>();
        RestClient.getApiService().user_list().enqueue(new Callback<ProductCallbackJava>() {
            @Override
            public void onResponse(Call<ProductCallbackJava> call, Response<ProductCallbackJava> response) {
                //data.setValue((ProductCallbackJava) response.body())
                Log.e("retrofitdata",response.body().message+"if empty"+response.body().getPlist().get(0).getItemName());
               // data.setValue(response.body());
                data.postValue(response.body());
            }


            @Override
            public void onFailure(Call<ProductCallbackJava> call, Throwable t) {
        Log.e("retrofiterror",t.getMessage()+"true erro");
            }
        });
        return data;
    }


}
