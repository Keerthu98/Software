package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;

public class maintain extends AppCompatActivity {
    EditText cname,cardno,mm,yy,cvv;
    MaterialEditText maintain_atm,maintain_phone,maintain_mail,maintain_upi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintain);
        cardno = (EditText)findViewById(R.id.cardno);
        cname = (EditText)findViewById(R.id.cname);
        mm = (EditText)findViewById(R.id.mm);
        yy = (EditText)findViewById(R.id.yy);
        cvv = (EditText)findViewById(R.id.cvv);
        maintain_atm = (MaterialEditText)findViewById(R.id.maintain_atm);
        maintain_phone = (MaterialEditText)findViewById(R.id.maintain_phone);
        maintain_mail = (MaterialEditText)findViewById(R.id.maintain_mail);
        maintain_upi = (MaterialEditText)findViewById(R.id.maintain_upi);

    }

    public void validatecard(View view){
        String cno = cardno.getText().toString();
        String cn = cname.getText().toString();
        String m = mm.getText().toString();
        String y =yy.getText().toString();
        String cv = cvv.getText().toString();
        int m1,y1,cv1;
        if(y.matches("")){
                y1=0;
        }else {
             y1 = Integer.parseInt(m);
        }
        if(m.matches("")){
            m1=0;
        }else {
            m1 = Integer.parseInt(m);
        }
        if(cv.matches("")){
            cv1=0;
        }else {
            cv1=Integer.parseInt(cv);
        }
        int flag =0;
        if(cno.length()<16){
            Toast.makeText(this, "Invalid card Number", Toast.LENGTH_SHORT).show();
        }else{
            flag = flag+1;
        }
        if(cn.length()<1){
            Toast.makeText(this, "Invalid Name", Toast.LENGTH_SHORT).show();
        }else{
            flag = flag+1;
        }
        if(m1>12 || m.equals("")){
            Toast.makeText(this, "Invalid Month", Toast.LENGTH_SHORT).show();
        }else{
            flag = flag+1;
        }
        if(y1>99 || y.equals("")){
            Toast.makeText(this, "Invalid year", Toast.LENGTH_SHORT).show();
        }else{
            flag = flag+1;
        }
        if(cv1>999 || cv.equals("")){
            Toast.makeText(this, "Invalid CVV", Toast.LENGTH_SHORT).show();
        }else {
            flag = flag+1;
        }

        if(flag==5){
            Toast.makeText(this, "Card accepted / added", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Card Denied", Toast.LENGTH_SHORT).show();
        }

    }

    public void validate_details(View view){

        int flag=0,pin1;
        String pin = maintain_atm.getText().toString();
        String mail=maintain_mail.getText().toString();
        String phone = maintain_phone.getText().toString();
        String upi = maintain_upi.getText().toString();
        if(pin.matches("")){
            pin1=0;
        }else {
            pin1 = Integer.parseInt(pin);
        }
        if(pin1>9999){
            Toast.makeText(this, "Invalid ATM-PIN", Toast.LENGTH_SHORT).show();
        }else {
            flag = flag+1;
        }
        if (mail_check(mail)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid MAIN-ID", Toast.LENGTH_SHORT).show();
        }
        if (phone_check(phone)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid PHONE-NUMBER", Toast.LENGTH_SHORT).show();
        }
        if (upi_check(upi)){
            flag = flag+1;
        }else {
            Toast.makeText(this, "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
        }
        if (flag==4){
            Toast.makeText(this, "Details Added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Denied", Toast.LENGTH_SHORT).show();
        }

    }

    public static boolean mail_check(String mail){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+(\\.[a-z]+)+";
        return (mail.matches(emailPattern));
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
