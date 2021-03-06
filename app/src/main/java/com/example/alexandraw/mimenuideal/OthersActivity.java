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

public class OthersActivity extends AppCompatActivity {

    CharSequence[] items = {"Pan de Bono", "Almohabana", "Buñuelos", "Pastel de Pollo"};
    boolean[] itemsCheked = new boolean[items.length];

    CharSequence[] items2 = {"Empanadas", "Papa Rellena", "Tamales"};
    boolean[] itemsCheked2 = new boolean[items2.length];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);


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
                        .setTitle("Elegir el producto de panaderia")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(OthersActivity.this, MainActivity.class);
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
                        .setTitle("Elegir el producto tipico")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getBaseContext(),
                                                "Buena eleccion", Toast.LENGTH_SHORT)
                                                .show();
                                        Intent intent = new Intent(OthersActivity.this, MainActivity.class);
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


        }
        return null;

    }


    public void pan(View view) {
        showDialog(0);
    }



    public void tipico(View view) {
        showDialog(1);

    }
}
