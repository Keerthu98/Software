package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class moneytrans extends AppCompatActivity {
    Button pay;
    EditText amount,regmobile,recipient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneytrans);
        pay = (Button)findViewById(R.id.pay);
        amount = (EditText)findViewById(R.id.amount);
        regmobile = (EditText)findViewById(R.id.regmobile);
        recipient = (EditText)findViewById(R.id.recipient);
    }

    public void payment(View view){String amt = amount.getText().toString();
        String upi_regex = "([\\w.-]*[@][\\w]*)";
        String phone = regmobile.getText().toString();
        String upi = recipient.getText().toString();
        int flag=0,amt1;
        if(amt.matches("")){
            amt1=0;
        }else
        {
            amt1 = Integer.parseInt(amt);
        }
        if(amt1<0){
            Toast.makeText(this, "Invalid Amount", Toast.LENGTH_SHORT).show();
        }else {
            flag = flag+1;
        }
        if (phone_check(phone)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid Phone", Toast.LENGTH_SHORT).show();
        }
        if (upi_check(upi)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
        }
        if(flag==3){
        Intent gateway = new Intent(view.getContext(),Gateway_otp.class);
        gateway.putExtra("regmobile",phone);
        startActivity(gateway);}
        else {
            Toast.makeText(this, "Payment Denied due to invalid fields", Toast.LENGTH_SHORT).show();
        }
    }
    public static boolean phone_check(String phone){
        String phone_regex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phone_regex));
    }

    public static boolean upi_check(String upi){
        String upi_regex = "([\\w.-]+[@][\\w]+)";
        return (upi.matches(upi_regex));
    }
}