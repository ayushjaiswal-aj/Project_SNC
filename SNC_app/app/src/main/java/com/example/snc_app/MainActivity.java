package com.example.snc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void continueClicked(View view){

        Intent otpScreen = new Intent(this, otpverify.class);
            startActivity(otpScreen);

    }





}
