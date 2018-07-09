package com.example.sys4web.usecred;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SYS4WEB on 24/11/2017.
 */

public class MyAdapter extends ArrayAdapter<Lista> {

    private ArrayList<Lista> listaArray;
    private Context context;

    public MyAdapter(Context context, int resource, ArrayList<Lista> listaArray){
        super(context, resource, listaArray);

        this.context = context;
        this.listaArray = listaArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if(convertView==null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.layout_lista, parent, false);
            //view = LayoutInflater.from(context).inflate(R.layout.layout_lista, parent, false);
            holder = new ViewHolder();
            holder.nome = (TextView) convertView.findViewById(R.id.tvNome);
            holder.bairro = (TextView) convertView.findViewById(R.id.tvBai);
            holder.endereco  = (TextView) convertView.findViewById(R.id.tvEnd);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        Lista l = (Lista) getItem(position);
        holder.nome.setText(l.getNome());
        holder.bairro.setText(l.getBairro());
        holder.endereco.setText(l.getEndereco());

        return convertView;
    }

    private static class ViewHolder {
        TextView nome;
        TextView bairro;
        TextView endereco;
    }
}
