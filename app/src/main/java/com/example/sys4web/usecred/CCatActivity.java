package com.example.sys4web.usecred;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class CCatActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView lv;
    private ArrayList<Lista> listaArray = null;
    private ArrayAdapter<Lista> adapterLista = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccat);

        spinner = (Spinner) findViewById(R.id.spinner);
        lv = (ListView) findViewById(R.id.lvCat);

        ArrayList<String> arrayCat = new ArrayList<String>();
        ArrayAdapter<String> adapterCat = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayCat);
        adapterCat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterCat);

        listaArray = new ArrayList<Lista>();

        adapterLista = new MyAdapter(this, R.layout.layout_lista, listaArray);

        adapterLista.notifyDataSetChanged();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
