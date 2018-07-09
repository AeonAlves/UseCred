package com.example.sys4web.usecred;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.microsoft.windowsazure.mobileservices.*;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.table.MobileServiceTable;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import static android.R.attr.id;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    private ConsultaFrag consultafrag;
    private SobreFrag sobrefrag;
    private HomeFrag homefrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        homefrag = new HomeFrag();
        consultafrag = new ConsultaFrag();
        sobrefrag = new SobreFrag();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.container, homefrag);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId())
        {
            case R.id.consulta:

                getSupportFragmentManager().beginTransaction().replace(R.id.container, consultafrag).addToBackStack(null).commit();
                return true;

            case R.id.sobre:

                getSupportFragmentManager().beginTransaction().replace(R.id.container, sobrefrag).addToBackStack(null).commit();
                return true;

            case R.id.saldo:
                Intent intent = new Intent(MainActivity.this, SaldoActivity.class);
                startActivity(intent);
                return true;

            case R.id.home:

                if(homefrag.isVisible()==false) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homefrag).addToBackStack(null).commit();
                }
                return true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }
}
