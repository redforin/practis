package com.example.practis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void onNext(View view){
        Intent intent = new Intent(LogIn.this, ForgotPassword.class);
        startActivity(intent);
    }

    public void onNexts(View view){
        Intent intent = new Intent(LogIn.this, SingUp.class);
        startActivity(intent);
    }
}