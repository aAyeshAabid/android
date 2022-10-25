package com.example.api_imp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUser {
    private  static final  String BASE_URL = "https://gorest.co.in/public/v2";
    private  static Retrofit retrofit = null;
    public  static ApiInterface getRetrofitUser(){
        if ( retrofit== null){
            retrofit = new  Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit.create(ApiInterface.class);
    }
}
