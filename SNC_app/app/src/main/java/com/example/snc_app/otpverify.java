package com.example.snc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class otpverify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverify);
    }

    public void verifyClicked(View view){

        Intent signupScreen = new Intent(this, signup.class);
        startActivity(signupScreen);

    }
}
