package com.example.bazamvd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import com.example.bazamvd.carInfo.CarInfoResult;
import com.example.bazamvd.carInfo.MyAsyncTask;
import com.example.bazamvd.carInfo.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtEditCarNumber;

    private TextView txtVendor;
    private TextView txtInfoVendor;
    private TextView txtModel;
    private TextView txtInfoModel;
    private TextView txtYear;
    private TextView txtInfoYear;

    private Button btnGetInfoCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {

        txtEditCarNumber = findViewById(R.id.txtEditCarNumber);
        txtVendor = findViewById(R.id.txtVendor);
        txtInfoVendor = findViewById(R.id.txtInfoVendor);
        btnGetInfoCar = findViewById(R.id.btnGetInfoCar);
        btnGetInfoCar.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnGetInfoCar:
            {
                startMyAsyncTask();

            }
        }
    }

    private void startMyAsyncTask() {

        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();

    }


}