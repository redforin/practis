package com.example.practis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

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

    public void onNextst(View view){
        Intent intent = new Intent(LogIn.this, Home.class);
        startActivity(intent);
    }
}