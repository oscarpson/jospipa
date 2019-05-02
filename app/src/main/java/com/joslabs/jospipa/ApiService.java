package com.joslabs.jospipa;



import com.joslabs.jospipa.viewmodel.ProductCallbackJava;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("all_products")
    Call<ProductCallbackJava>user_list();
   /* @FormUrlEncoded
    @POST("add_user/reg_user")
    Call<ResponseCallback> add_user(
            @Field("custId") String custId,
            @Field("cname") String cname,
            @Field("cphone") String cphone,
            @Field("cemail") String cemail,
            @Field("ctype") String ctype,
            @Field("czone") String czone,
            @Field("meterId") String meterId,
            @Field("clocation") String clocation);
    @FormUrlEncoded
    @POST("add_readings/add_meter_readings")
    Call<ResponseCallback> add_reading(
            @Field("custId") String custId,
            @Field("creading") String creading,
            @Field("consumed") String consumed,
            @Field("unitp") String unitp,
            @Field("amount") String amount,
            @Field("previous") String previous
    );




    @GET("all_products")
    Call<MpesaCallback>mpesa_list();

  *//*  @GET("all_details")
    Call<DetailsList>details_list();*/






}
