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

public class FastFoodActivity extends AppCompatActivity {

    CharSequence[] items = {"Pan", "Salchicha","Salsas"};
    boolean[] itemsCheked = new boolean[items.length];

    CharSequence[] items2 = {"Pan", "Carne","Pollo", "Tomate", "Cebolla", "Lechuga", "Jamón"};
    boolean[] itemsCheked2 = new boolean[items2.length];

    CharSequence[] items3 = {"Pan", "Carne","Pollo", "Tomate", "Cebolla", "Lechuga", "Jamón"};
    boolean[] itemsCheked3 = new boolean[items3.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fast_food, menu);
        return true;
    }


    public void perros(View view) {
        showDialog(0);
    }

    @Override
    protected Dialog onCreateDialog(int id){
        switch (id){
            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_dog)
                        .setTitle("Ingredientes del Perro Caliente")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(FastFoodActivity.this, MainActivity.class);
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
                        .setIcon(R.mipmap.ic_burger)
                        .setTitle("Ingredientes de la Hamburguesa")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(FastFoodActivity.this, MainActivity.class);
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
                        .setIcon(R.mipmap.ic_san)
                        .setTitle("Ingredientes del Sandwich")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(FastFoodActivity.this, MainActivity.class);
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

        }
        return null;

    }

    public void hamburguesas(View view) {
        showDialog(1);
    }


    public void sandwiches(View view) {
        showDialog(2);
    }

}
