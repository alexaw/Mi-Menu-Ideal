package com.example.alexandraw.mimenuideal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.alexandraw.mimenuideal.adapters.CategoryAdapter;
import com.example.alexandraw.mimenuideal.models.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list, list2;
    TextView cate;
    String data2[];
    //ArrayAdapter<String> adapter;

    //declaro la lista de objetos
    List<Category> data;
    CategoryAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        list2 = (ListView) findViewById(R.id.list);


        cate = (TextView) findViewById(R.id.cate);


        data2 = getResources().getStringArray(R.array.categorias_completo);
        list2.setOnItemClickListener(this);

        //1. se fijan los datos funciona como si tuviera en el layaout
        //android:entries="@array/ingredientes"

        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        //2. Adapter con template
        //adapter = new ArrayAdapter<String>(this, R.layout.template_item,R.id.catName,data);


        //Implemento la lista vacia de tipo category
        data = new ArrayList<>();
        adapter = new CategoryAdapter(this,data);

        //Para fijar el adapter en la lista
        list.setAdapter(adapter);
        
        loadData();
    }


    //se fijan los datos
    private void loadData() {
        String category[] = getResources().getStringArray(R.array.categorias_completo);

        for(int i=0; i<category.length;i++){
            //separo la informacion con split: metodo que corta la cadena de acuerdo a un toquen
            String categorys[] = category[i].split(",");

            //Se llenan de los objetos
            Category c = new Category();
            c.setCategory(categorys[0]);
            c.setStart(Float.parseFloat(categorys[1]));
            c.setImgUrl(categorys[2]);

            //agrega los objetos
            data.add(c);
        }
        //Al final del for la data esta llena de la informacion
        //notificar que el conjunto de datos cambió
        //renderiza los visibles en pantalla
        adapter.notifyDataSetChanged();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Agrega 4 metodos de entrada
        //cate.setText(data[position]);

        //Para ver el nombre de lo selecionado

        //cate.setText(data.get(position)getCategoty());



        switch (position){
            case 0:
                Intent intent = new Intent(this, FastFoodActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, DrinksActivity.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, IceCreamActivity.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, OthersActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
