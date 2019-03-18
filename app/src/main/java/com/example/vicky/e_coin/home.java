package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class home extends AppCompatActivity {
    Button moneytrans,maintain,ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        moneytrans = (Button)findViewById(R.id.moneytrans);
        maintain = (Button)findViewById(R.id.maintain);
        ticket = (Button)findViewById(R.id.ticket);
    }

    public void moneytrans(View view){
        Intent moneytransint = new Intent(view.getContext(),moneytrans.class);
        startActivity(moneytransint);
    }
    public void maintain(View view){
        Intent maintainint = new Intent(view.getContext(),maintain.class);
        startActivity(maintainint);
    }
    public void ticket(View view){
        Intent ticketint = new Intent(view.getContext(),ticket.class);
        startActivity(ticketint);
    }
}
