package com.example.vicky.e_coin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.rengwuxian.materialedittext.MaterialEditText;


public class mail_trans extends Fragment {
    Button mailtrans,cancel_mail;
    MaterialEditText value_mail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mail_trans, container, false);

        mailtrans =(Button)view.findViewById(R.id.mailtransonclick);
        cancel_mail = (Button)view.findViewById(R.id.cancel_mail);
        value_mail = (MaterialEditText)view.findViewById(R.id.mailtrans);


        mailtrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=value_mail.getText().toString();
                if(mail_check(mail)){
                Intent tomailgateway = new Intent(getActivity(),moneytrans.class);
                startActivity(tomailgateway);}else {
                    Toast.makeText(getActivity(), "Invalid Mail-ID", Toast.LENGTH_SHORT).show();
                }
            }

        });
        cancel_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_mail = new Intent(getActivity(),recycler.class);
                startActivity(home_mail);
            }
        });

        return view;
    }
    public static boolean mail_check(String mail){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+(\\.[a-z]+)+";
        return (mail.matches(emailPattern)&& mail.length()>0);
    }


}
