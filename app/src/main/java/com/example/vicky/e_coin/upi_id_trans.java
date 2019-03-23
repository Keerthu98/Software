package com.example.vicky.e_coin;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.rengwuxian.materialedittext.MaterialEditText;

public class upi_id_trans extends Fragment {

    Button upitrans,cancel_upi;
    MaterialEditText value_upi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upi_id_trans, container, false);

        upitrans = (Button)view.findViewById(R.id.upitransonclick);
        cancel_upi = (Button)view.findViewById(R.id.cancel_upi);
        value_upi = (MaterialEditText)view.findViewById(R.id.upitrans);
        upitrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(upi_check(value_upi.getText().toString())){
                Intent toupigateway = new Intent(getActivity(),moneytrans.class);
                startActivity(toupigateway);}else {
                    Toast.makeText(getActivity(), "Invalid UPI-ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel_upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_upi = new Intent(getActivity(),recycler.class);
                startActivity(home_upi);
            }
        });
        return view;
    }

    public static boolean upi_check(String upi){
        String upi_regex = "([\\w.-]+[@][\\w]+)";
        return (upi.matches(upi_regex));
    }

}
