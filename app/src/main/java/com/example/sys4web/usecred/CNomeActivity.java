package com.example.sys4web.usecred;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CNomeActivity extends AppCompatActivity {

    private EditText et;
    private Button bt;
    private ListView lv = null;
    private ArrayList<Lista> listaArray = null;
    private ArrayAdapter<Lista> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnome);

        et = (EditText) findViewById(R.id.etPesqNome);
        bt = (Button) findViewById(R.id.btPesqNome);
        lv = (ListView) findViewById(R.id.lvResultNome);

        listaArray = new ArrayList<Lista>();

        adapter = new MyAdapter(this, R.layout.layout_lista, listaArray);

        adapter.notifyDataSetChanged();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CriaBanco criar = new CriaBanco(getBaseContext());
                SQLiteDatabase db = criar.getReadableDatabase();
                String valor = et.getText().toString();
                Lista l = new Lista();
                lv.setAdapter(adapter);
                Cursor cursor = db.rawQuery("SELECT nome, bairro, endereco FROM estabelecimentos where nome like '%" + valor + "%'", null);
                if(cursor != null) {
                    cursor.moveToFirst();
                    while (cursor.isAfterLast() == false) {
                        l.setNome(cursor.getString(cursor.getColumnIndex("nome")));
                        l.setBairro(cursor.getString(cursor.getColumnIndex("bairro")));
                        l.setEndereco(cursor.getString(cursor.getColumnIndex("endereco")));
                        listaArray.add(l);
                        cursor.moveToNext();
                    }
                } else {
                    Toast.makeText(CNomeActivity.this, "Não existe estabelecimento cadastrado com esse nome!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
