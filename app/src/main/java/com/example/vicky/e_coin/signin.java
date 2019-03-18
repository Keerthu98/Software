package com.example.vicky.e_coin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    Button signin,signup;
    EditText mail,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        signin = (Button)findViewById(R.id.signin);
        signup = (Button)findViewById(R.id.signup);
        mail = (EditText)findViewById(R.id.mail);
        pass = (EditText)findViewById(R.id.pass);
    }

    public void signup(View view){
        Intent sgint = new Intent(view.getContext(),signup.class);
        startActivity(sgint);
    }

    public void authenticate(View view){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(view.getId()==R.id.signin){
            String mailrt = mail.getText().toString();
            if(mailrt.matches(emailPattern)&&mailrt.length()>0){
                if (pass.getText().toString().matches("admin") && mailrt.matches("02vicky98@gmail.com"))
                Toast.makeText(this, "Valid", Toast.LENGTH_SHORT).show();
                Intent homeint = new Intent(view.getContext(),home.class);
                startActivity(homeint);
            }else {
                Toast.makeText(this, "invalid", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
