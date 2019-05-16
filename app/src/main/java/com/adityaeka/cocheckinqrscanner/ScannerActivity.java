package com.adityaeka.cocheckinqrscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScannerActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {


    ZXingScannerView scannerView;
    private CheckinService checkinService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        scannerView = new ZXingScannerView(this);
        setContentView(scannerView);

        checkinService = ServiceGenerator.createService(CheckinService.class);
    }

    @Override
    public void handleResult(Result rawResult) {
//        Toast.makeText(getApplicationContext(), ""+rawResult.getText(), Toast.LENGTH_SHORT).show();
        Call<MessageRes> setdone = checkinService.setDone(rawResult.getText());
        setdone.enqueue(new Callback<MessageRes>() {
            @Override
            public void onResponse(Call<MessageRes> call, Response<MessageRes> response) {
                MessageRes okRes = response.body();
                String message = okRes.getMessage();
                Toast.makeText(getApplicationContext(), ""+message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<MessageRes> call, Throwable t) {

            }
        });


//        MainActivity.userInfo = new UserInfo()
        onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        scannerView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();

        scannerView.setResultHandler(this);
        scannerView.startCamera();
    }
}
