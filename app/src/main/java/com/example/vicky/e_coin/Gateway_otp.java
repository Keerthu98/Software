package com.example.vicky.e_coin;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Random;

public class Gateway_otp extends AppCompatActivity {
        private static final int REQUEST_READ_PHONE_STATE = 1;
        final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
        TextView mobile;
        Button sendotp;
        MaterialEditText otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gateway_otp);
        if(checkPermission(Manifest.permission.SEND_SMS)){

        }else{
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_PERMISSION_REQUEST_CODE);
        }
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_READ_PHONE_STATE);
        } else {
            //TODO
        }
        Random n = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int count = 0; count<=5;count++){
            stringBuilder.append(n.nextInt(10));
        }
        final String value_n = stringBuilder.toString();
        mobile = (TextView) findViewById(R.id.mobile);
        sendotp = (Button)findViewById(R.id.otpsend);
        otp = (MaterialEditText)findViewById(R.id.otp);
        Bundle b =getIntent().getExtras();
        String regmobile = b.getString("regmobile");
        mobile.setText("Mobile:XXXXXXXX"+regmobile.substring(regmobile.length()-2));
        if(checkPermission(Manifest.permission.SEND_SMS)){
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(regmobile, null, "OTP for this transaction is"+value_n, null, null);
            //Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show();
        }else{
            //Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
        }

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value_otp = otp.getText().toString();
                if (value_otp.equals(value_n)){
                    Toast.makeText(Gateway_otp.this, "Connection TO Gateway", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Gateway_otp.this, "Invalid OTP entered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_READ_PHONE_STATE:
                if ((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    //TODO
                }
                break;

            default:
                break;
        }
    }


    public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}
