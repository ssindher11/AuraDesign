package com.example.shreysindher.aura_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mukesh.OnOtpCompletionListener;
import com.mukesh.OtpView;

public class OtpActivity extends AppCompatActivity {

    private OtpView otpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otpView = findViewById(R.id.otp_view);
        otpView.setOtpCompletionListener(new OnOtpCompletionListener() {
            @Override public void onOtpCompleted(String otp) {

                Toast.makeText(OtpActivity.this, otp, Toast.LENGTH_SHORT).show();
                // do Stuff
                Log.d("onOtpCompleted=>", otp);
            }
        });
    }
}
