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

public class atm_trans extends Fragment {
Button atmtrans,cancel_atm;
MaterialEditText atm_pin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_atm_trans, container, false);
        atmtrans = (Button)view.findViewById(R.id.atmtransonclick);
        cancel_atm  =(Button)view.findViewById(R.id.cancel_atm);
        atm_pin = (MaterialEditText)view.findViewById(R.id.atmtrans);
        atmtrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value_atm = Integer.parseInt(atm_pin.getText().toString());
                if (pin_check(value_atm)){
                    Toast.makeText(getActivity(), "Invalid Pin", Toast.LENGTH_SHORT).show();
                }else
                {Intent toatmgateway = new Intent(getActivity(),moneytrans.class);
                startActivity(toatmgateway);}
            }
        });

        cancel_atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_atm = new Intent(getActivity(),recycler.class);
                startActivity(home_atm);
            }
        });
        return view;
    }
    public static boolean pin_check(int value){
        return (value>9999);
    }
}
