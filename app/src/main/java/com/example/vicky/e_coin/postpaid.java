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


public class postpaid extends Fragment {

    Button postpaidonclick;
    MaterialEditText number_pos,carrier,bill_no;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_postpaid, container, false);
        number_pos = (MaterialEditText)view.findViewById(R.id.postpaid_number);
        carrier = (MaterialEditText)view.findViewById(R.id.carrier);
        bill_no = (MaterialEditText)view.findViewById(R.id.bill_no);
        postpaidonclick = (Button)view.findViewById(R.id.postpaidonclick);
        postpaidonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(entry_ok(number_pos.getText().toString(),carrier.toString(),bill_no.toString())){
                    Intent pos_gateway = new Intent(v.getContext(),Gateway_otp.class);
                    startActivity(pos_gateway);
                }else
                {Toast.makeText(getActivity(), "Invalid Entries", Toast.LENGTH_SHORT).show();}
            }
        });
        return view;
    }

    public static boolean entry_ok(String phone,String carrier, String bill){
        String phone_regex = "^[2-9]{2}[0-9]{8}$";
        return (phone.matches(phone_regex)&&carrier.length()>0&&bill.length()>0);
    }

}
