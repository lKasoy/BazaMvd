package com.example.bazamvd.carInfo;

import android.os.AsyncTask;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyAsyncTask extends AsyncTask {

    private CarInfoResult carInfoResult;
    private String vendor;
    private String model;
    private String year;

    @Override
    protected Object doInBackground(Object[] objects) {

        RetrofitInstance.getInstance()
                .getApiInterface()
                .getCarInfo()
                .enqueue(new Callback<CarInfoResult>() {
                    @Override
                    public void onResponse(Call<CarInfoResult> call, Response<CarInfoResult> response) {

                        if (response.isSuccessful()) {

                            CarInfoResult carInfoResult = response.body();

                            if(carInfoResult !=null)
                            {
                                Log.d("MyApp", "good" + String.valueOf(carInfoResult.getDigits()));
                                Log.d("MyApp",  String.valueOf(carInfoResult.getModel()));
                                Log.d("MyApp",  String.valueOf(carInfoResult.getVendor()));
                                Log.d("MyApp",  String.valueOf(carInfoResult.getYear()));

                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<CarInfoResult> call, Throwable t) {

                        Log.d("MyApp","Error" + t.getMessage());

                    }
                });

        return carInfoResult;
    }
}
