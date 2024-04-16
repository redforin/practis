package com.example.practis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    private String text = "";
    private char[] textChar = new char[text.length()];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText email = (EditText)findViewById(R.id.edit);
        email.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text = email.getText().toString();
                textChar = text.toCharArray();
            }

        });
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