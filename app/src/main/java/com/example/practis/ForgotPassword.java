package com.example.practis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void onNext(View view){
        Intent intent = new Intent(ForgotPassword.this, SingUp.class);
        startActivity(intent);
    }

    public void onNexts(View view){
        Intent intent = new Intent(ForgotPassword.this, OTP.class);
        startActivity(intent);
    }
}