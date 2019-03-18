package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class welcome extends AppCompatActivity {
    Button welocme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welocme = (Button)findViewById(R.id.welcome);
    }

    public void intent1(View view){
        Intent wint = new Intent(view.getContext(),signin.class);
        startActivity(wint);
    }
}
