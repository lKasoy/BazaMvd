package com.example.bazamvd.carInfo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static RetrofitInstance retrofitInstance;

    private Retrofit retrofit;

    private RetrofitInstance()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://baza-gai.com.ua/nomer/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }

    public static RetrofitInstance getInstance()
    {
        if(retrofitInstance == null)
        {
            retrofitInstance = new RetrofitInstance();
        }

        return retrofitInstance;
    }

    public CarInfoAPI getApiInterface(){

        return retrofit.create(CarInfoAPI.class);
    }

}
