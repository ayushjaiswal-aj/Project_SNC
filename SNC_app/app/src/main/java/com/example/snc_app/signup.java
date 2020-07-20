package com.example.snc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void submitClicked(View view){
        Intent profileSubmit = new Intent(this, SignIn.class);
        startActivity(profileSubmit);
    }
}
