package com.example.vicky.e_coin.Retrofit;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Observable;

public interface IMyservices {
    @POST("register")
    @FormUrlEncoded
    io.reactivex.Observable <String> registerUser(@Field("email") String email,
                                         @Field("name") String name,
                                         @Field("password") String password);

    @POST("login")
    @FormUrlEncoded
    io.reactivex.Observable <String> loginUser(@Field("email") String email,
                                         @Field("password") String password);

    @POST("storedata")
    @FormUrlEncoded
    io.reactivex.Observable <String> storedata(@Field("mobile_number") String mobile_number,
                                               @Field("upi_id") String upi_id,
                                               @Field("balance") String balance,
                                               @Field("pin") String pin,
                                               @Field("email") String email);


    @POST("retrieve_upi")
    @FormUrlEncoded
    io.reactivex.Observable <String> retrieve_upi(@Field("upi_id") String upi_id);

}
