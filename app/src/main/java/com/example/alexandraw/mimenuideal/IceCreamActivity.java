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

public class IceCreamActivity extends AppCompatActivity {

    CharSequence[] items = {"Papaya", "Melon", "Mango", "Banano", "Helado", "Queso", "Coco", "Chantilli", "Masmelos", "Galleta"};
    boolean[] itemsCheked = new boolean[items.length];

    CharSequence[] items2 = {"Banano", "Chantilli", "Pasas", "Mani", "Helado", "Galleta", "Chocolate"};
    boolean[] itemsCheked2 = new boolean[items2.length];

    CharSequence[] items3 = {"Chantilli", "Queso","Helado", "Galleta"};
    boolean[] itemsCheked3 = new boolean[items3.length];

    CharSequence[] items4 = {"Fresas", "Helado", "Chantilli", "Glaciado"};
    boolean[] itemsCheked4 = new boolean[items4.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream);
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
                        .setIcon(R.mipmap.ic_frutas)
                        .setTitle("Ingredientes de la Ensalada de Frutas")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(IceCreamActivity.this, MainActivity.class);
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
                        .setIcon(R.mipmap.ic_split)
                        .setTitle("Ingredientes de la Banana Split")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(IceCreamActivity.this, MainActivity.class);
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
                        .setIcon(R.mipmap.ic_copa)
                        .setTitle("Ingredientes de la Copa de Helado")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(IceCreamActivity.this, MainActivity.class);
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
                        .setIcon(R.mipmap.ic_fresas)
                        .setTitle("Ingredientes de las Fresas con Helado")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(IceCreamActivity.this, MainActivity.class);
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


    public void frutas(View view) {
        showDialog(0);
    }

    public void split(View view) {
        showDialog(1);
    }

    public void copa(View view) {
        showDialog(2);
    }

    public void fresas(View view) {
        showDialog(3);
    }
}
