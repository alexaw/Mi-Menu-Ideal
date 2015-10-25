package com.example.alexandraw.mimenuideal.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexandraw.mimenuideal.R;
import com.example.alexandraw.mimenuideal.models.Category;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by JUAN DAVID YP on 25/10/2015.
 */
public class CategoryAdapter extends BaseAdapter {

    Context context;
    List<Category> data;

    public CategoryAdapter(Context context, List<Category> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    //Retorna el numero de elementos de la lista
    public int getCount() {
        return data.size();
    }

    @Override
    //retorna el objeto de acuerdo a la posicion
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    //recuperamos de la base de datos
    public long getItemId(int position) {
        return position;
    }

    @Override
    //de acuerdo a una posicion le aplica el template y lo retorna
    public View getView(int position, View convertView, ViewGroup parent) {
        //Donde lleva el view
        View v = null;

        //Para que lo haga por primera vez el inflate sino se asigna view
        if(convertView == null){
            v = View.inflate(context, R.layout.template_category,null);
        }else {
            //cuando no sea nulo
            v = convertView;
        }

        //Recupero el objeto
        Category c = (Category) getItem(position);

        //Para llenar los datos
        TextView txt = (TextView) v.findViewById(R.id.tittleCate);
        txt.setText(c.getCategory());

        //Reemplazo el contenido se coloca vacio para convertirlo a texto
        txt = (TextView) v.findViewById(R.id.txt_start);
        txt.setText(c.getStart()+"");

        //Se recupera la imagen
        ImageView imgcate = (ImageView) v.findViewById(R.id.imgcate);

        //Picasso ayuda a escalar la imagen y la guarda en el cache
        Picasso.with(context)
                .load(Uri.parse(c.getImgUrl()))
                .into(imgcate);


        return v;
    }
}
