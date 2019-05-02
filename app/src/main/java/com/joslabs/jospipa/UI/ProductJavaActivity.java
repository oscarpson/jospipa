package com.joslabs.jospipa.UI;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.joslabs.jospipa.Mylivemodel;
import com.joslabs.jospipa.R;

import com.joslabs.jospipa.adapter.ProductAdapter;
import com.joslabs.jospipa.model.ProductVModel;
import com.joslabs.jospipa.viewmodel.ProductCallbackJava;
import com.joslabs.jospipa.viewmodel.ProductRepository;
import com.joslabs.jospipa.viewmodel.ProductViewModelJava;
import com.joslabs.jospipa.viewmodel.RetrofitViewmodel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductJavaActivity extends AppCompatActivity {
    Mylivemodel modelJava;
    ProductViewModelJava viewModelJava;
    RetrofitViewmodel kotlinModel;
    ProductAdapter productAdapter;


    @BindView(R.id.rcv_product)
    RecyclerView rcvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_java);
        ButterKnife.bind(this);
     modelJava= ViewModelProviders.of(this).get(Mylivemodel.class);
     viewModelJava= ViewModelProviders.of(this).get(ProductViewModelJava.class);
      final  RetrofitViewmodel kotlinModel=ViewModelProviders.of(this).get(RetrofitViewmodel.class);
       /*  mymodel= ViewModelProviders.of(this).get(Mylivemodel::class.java)
        mymodel.mystring.observe(this, Observer { t-> Log.e("testlive",t) })*/
       //SETTING RECYCLERVIEW
        SetRecyclerView();
        Observer<String>testString= s -> Log.e("mymodel",s);
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                Log.e("testmodel",newName);
            }
        };
        modelJava.getMyString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.e("testmodel",s);
            }
        });
        modelJava.setMyString("new good string");
        ProductRepository repo=new ProductRepository();
        try {
            LiveData<ProductCallbackJava> data = ProductRepository.getInstance().productData();
           // String test = repo.productData().getValue().getPlist().get(0).getItemName() + "Empty data";new
            data.observe(this, new Observer<ProductCallbackJava>() {
                @Override
                public void onChanged(ProductCallbackJava productCallbackJava) {
                    Log.e("testrepo", productCallbackJava.getPlist().get(0).getItemName());
                }
            });

        }catch (Exception e){
            Log.e("exception",e.getMessage());
        }

        //TODO CHECK WHY JAVA VIEWMODELS NOT WORKING
        /*viewModelJava.getCallback().observe(this, new Observer<ProductCallbackJava>() {
            @Override
            public void onChanged(ProductCallbackJava productCallbackJava) {
                Log.e("testrepo2", productCallbackJava.getPlist().get(0).getItemName());
            }
        });*/

        kotlinModel.getCallback().observe(this, new Observer<ProductCallbackJava>() {
            @Override
            public void onChanged(ProductCallbackJava productCallbackJava) {
                Log.e("testrepo2", productCallbackJava.getPlist().get(0).getItemName());
                productAdapter=new ProductAdapter(productCallbackJava.getPlist(),getApplicationContext());
                rcvProduct.setAdapter(productAdapter);
            }
        });
    }

    private void SetRecyclerView() {
        rcvProduct.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //rcvProduct.setAdapter(null);

    }
}
