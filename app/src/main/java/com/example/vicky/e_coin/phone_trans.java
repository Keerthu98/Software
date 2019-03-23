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


public class phone_trans extends Fragment {

    Button phonetrans,cancel_phone;
    MaterialEditText value_phone;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phone_trans, container, false);
        phonetrans = (Button)view.findViewById(R.id.phonetransonclick);
        cancel_phone = (Button)view.findViewById(R.id.cancel_phone);
        value_phone = (MaterialEditText)view.findViewById(R.id.phonetrans);
        phonetrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phone_check(value_phone.getText().toString())){
                Intent tophonegateway = new Intent(getActivity(),moneytrans.class);
                startActivity(tophonegateway);}else {
                    Toast.makeText(getActivity(),"Invalid Phone Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_phone = new Intent(getActivity(),recycler.class);
                startActivity(home_phone);
            }
        });
        return view;
    }
    public static boolean phone_check(String phone){
        String phone_regex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phone_regex));
    }

}
