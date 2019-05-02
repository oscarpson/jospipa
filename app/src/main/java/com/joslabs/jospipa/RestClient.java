package com.joslabs.jospipa;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    public static ApiService apiService;
    static {setRetrofitClient();}

    private static void setRetrofitClient() {
       /* OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();

                Request.Builder builder = originalRequest.newBuilder().header("Authorization",
                        Credentials.basic("aUsername", "aPassword"));

                Request newRequest = builder.build();
                return chain.proceed(newRequest);
            }
        }).build();*/
        Gson gson= new Gson();
        Retrofit retrofit=new Retrofit.Builder()
              //  .client(okHttpClient)
                .baseUrl("http://joslabs.com/acaciaApi/public/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        String authtoken= Credentials.basic("username","password");
        apiService=retrofit.create(ApiService.class);



    }

    public static ApiService getApiService(){return apiService;}
}
