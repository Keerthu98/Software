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


public class prepaid extends Fragment {
    Button prepidonclick;
    MaterialEditText number_pre,carrier_pre,amount_pre;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_prepaid, container, false);
        number_pre = (MaterialEditText)view.findViewById(R.id.prepaid_number);
        carrier_pre = (MaterialEditText)view.findViewById(R.id.carrier_pre);
        amount_pre = (MaterialEditText)view.findViewById(R.id.amount_pre);
        prepidonclick = (Button)view.findViewById(R.id.prepaidonclick);
        prepidonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String phone_regex = "^[2-9]{2}[0-9]{8}$";
                if (number_pre.getText().toString().matches(phone_regex)&&carrier_pre.length()>0&& Integer.parseInt(amount_pre.getText().toString())>=0){
                    Intent pre_gateway = new Intent(v.getContext(),Gateway_otp.class);
                    startActivity(pre_gateway);
                }else
                {Toast.makeText(getActivity(),"Invalid Fields",Toast.LENGTH_SHORT).show();}
            }
        });
        return view;
    }

}
