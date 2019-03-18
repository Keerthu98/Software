package com.example.vicky.e_coin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class signup extends AppCompatActivity {
    Button loginrt,signuprt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        loginrt = (Button)findViewById(R.id.loginrt);
        signuprt = (Button)findViewById(R.id.signuprt);
    }


}
