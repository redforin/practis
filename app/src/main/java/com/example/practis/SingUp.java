package com.example.practis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }

    public void onNext(View view){
        Intent intent = new Intent(SingUp.this, LogIn.class);
        startActivity(intent);
    }

    public void onNexts(View view){
        Intent intent = new Intent(SingUp.this, Home.class);
        startActivity(intent);
    }

}