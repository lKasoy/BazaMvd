package com.example.bazamvd.carInfo;

import com.example.bazamvd.MainActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface CarInfoAPI {

    @Headers("Accept: application/json")
    @GET("ap6197cx")
    public Call <CarInfoResult> getCarInfo();

    @Headers("Accept: application/json")
    @GET("{number}")
    public Call <CarInfoResult> getCarByNumber(@Path("number") String number);


}
