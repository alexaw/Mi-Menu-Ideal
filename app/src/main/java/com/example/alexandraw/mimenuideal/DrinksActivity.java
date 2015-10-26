package com.example.alexandraw.mimenuideal;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DrinksActivity extends AppCompatActivity {

    CharSequence[] items = {"Mora", "Lulo","Fresa", "Maracuyá"};
    boolean[] itemsCheked = new boolean[items.length];

    CharSequence[] items2 = {"350ml", "700ml", "1 litro", "Litro 1/4",};
    boolean[] itemsCheked2 = new boolean[items2.length];

    CharSequence[] items3 = {"Naranja", "Limón","Maracuyá", "Manadarina"};
    boolean[] itemsCheked3 = new boolean[items3.length];

    CharSequence[] items4 = {"Fresa", "Vainilla", "Arequipe", "Ron con Pasas"};
    boolean[] itemsCheked4 = new boolean[items4.length];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drinks, menu);
        return true;
    }


    @Override
    protected Dialog onCreateDialog(int id){
        switch (id){
            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_jugo)
                        .setTitle("Elegir el jugo de preferencia")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Cancelado",
                                                Toast.LENGTH_SHORT).show();

                                    }
                                })
                        .setMultiChoiceItems(items, itemsCheked,
                                new DialogInterface.OnMultiChoiceClickListener(){
                                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                        Toast.makeText(getBaseContext(),
                                                items[which]
                                                        + (isChecked ? " !"
                                                        : " !"),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }).create();



            case 1:
                return new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_gas)
                        .setTitle("Elegir gaseosa de preferencia")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Cancelado",
                                                Toast.LENGTH_SHORT).show();


                                    }
                                })
                        .setMultiChoiceItems(items2, itemsCheked2,
                                new DialogInterface.OnMultiChoiceClickListener(){
                                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                        Toast.makeText(getBaseContext(),
                                                items2[which]
                                                        + (isChecked ? " !"
                                                        : " !"),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }).create();

            case 2:
                return new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_gran)
                        .setTitle("Elegir granizado de preferencia")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Cancelado",
                                                Toast.LENGTH_SHORT).show();


                                    }
                                })
                        .setMultiChoiceItems(items3, itemsCheked3,
                                new DialogInterface.OnMultiChoiceClickListener(){
                                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                        Toast.makeText(getBaseContext(),
                                                items3[which]
                                                        + (isChecked ? " !"
                                                        : " !"),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }).create();

            case 3:
                return new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_mal)
                        .setTitle("Elegir malteada de preferencia")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener(){
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Cancelado",
                                                Toast.LENGTH_SHORT).show();

                                    }
                                })
                        .setMultiChoiceItems(items4, itemsCheked4,
                                new DialogInterface.OnMultiChoiceClickListener(){
                                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                        Toast.makeText(getBaseContext(),
                                                items4[which]
                                                        + (isChecked ? " !"
                                                        : " !"),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }).create();

        }
        return null;

    }



    public void jugo(View view) {
        showDialog(0);
    }

    public void gaseosa(View view) {
        showDialog(1);
    }

    public void granizado(View view) {
        showDialog(2);
    }

    public void malteada(View view) {
        showDialog(3);
    }


}
