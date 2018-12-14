package com.example.shreysindher.aura_design;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.transitionseverywhere.Slide;
import com.transitionseverywhere.TransitionManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CombinedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined);

        final ViewGroup transitionsContainer = findViewById(R.id.VG1);
        final ConstraintLayout constraintLayout1 = findViewById(R.id.VG2);
        final ConstraintLayout constraintLayout2 = findViewById(R.id.VG3);
        final Button help_button = findViewById(R.id.btn_help);
        final Button sendOtp_button = findViewById(R.id.btn_sendOtp);

        help_button.setOnClickListener(new View.OnClickListener() {

            boolean visible = true;

            @Override
            public void onClick(View view) {
               /* TransitionManager.beginDelayedTransition(transitionsContainer);
                help_button.setVisibility(visible ? View.GONE : View.VISIBLE);*/

                TransitionManager.beginDelayedTransition(transitionsContainer, new Slide(Gravity.END));
                constraintLayout1.setVisibility(visible ? View.VISIBLE : View.GONE);
                help_button.setVisibility(visible ? View.GONE : View.VISIBLE);
            }
        });

        sendOtp_button.setOnClickListener(new View.OnClickListener() {

            boolean visible = true;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(transitionsContainer, new Slide(Gravity.END));
                constraintLayout2.setVisibility(visible ? View.VISIBLE : View.GONE);
                constraintLayout1.setVisibility(visible ? View.GONE : View.VISIBLE);
            }
        });
    }
}
