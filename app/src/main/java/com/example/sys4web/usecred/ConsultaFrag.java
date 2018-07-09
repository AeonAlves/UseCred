package com.example.sys4web.usecred;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ConsultaFrag extends Fragment {

    private Button btCnome=null;
    private Button btCbairro=null;
    private Button btCcat=null;
    private Button btCpers=null;

    public ConsultaFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_consulta, container, false);

        btCnome = (Button) v.findViewById(R.id.btCnome);
        btCcat = (Button) v.findViewById(R.id.btCcat);


        btCnome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CNomeActivity.class);
                startActivity(intent);
            }
        });

        btCcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CCatActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
